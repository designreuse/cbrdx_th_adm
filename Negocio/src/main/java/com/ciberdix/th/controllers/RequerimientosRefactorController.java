package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import com.ciberdix.th.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Danny on 15/05/2017.
 */

@RestController
@RequestMapping("/api/requerimientos")
@CrossOrigin
public class RequerimientosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/requerimientos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientos> findAll(HttpServletRequest request) {
        String token = UtilitiesController.extractToken(request); //Extraccion del Token desde el Request
        String businessServiceURL = businessUrl + "/api/"; //Composicion de BaseURL para Servicios de Logica
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token); //Encabezados para Request con Autenticación de Logica
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        Collection<?> userRoles = jwtTokenUtil.getAuthorities(); //Extraccion de Nombres de ROLE_ Asignados
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token); //Id de Usuario Conectado
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders); //Entidad de Solicitud Autentica (HeaderOnly)
        String roleCodes = UtilitiesController.findConstant("ROLPRO").getValor();
        String[] rolesCodes = roleCodes.split(",");
        StringBuilder sb = new StringBuilder();
        for (String str : rolesCodes) {
            sb.append(restTemplate.exchange(businessServiceURL + "roles/rol/" + str, HttpMethod.GET, requestEntity, Roles.class, requestEntity).getBody().getRol());
            sb.append(",");
        }
        String resultRoles = sb.toString();
        boolean isManager = userRoles.stream().anyMatch(r -> resultRoles.contains(r.toString()));
        List<VRequerimientos> parametros = Arrays.asList(restTemplate.getForObject(serviceUrl, VRequerimientos[].class));
        List<VRequerimientos> returnList;
        if (isManager) {
            returnList = parametros;
        } else {
            Long idTercero = restTemplate.exchange(businessServiceURL + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity).getBody().getIdTercero();
            TercerosCargos currentJob = restTemplate.exchange(businessServiceURL + "tercerosCargos/tercero/" + idTercero, HttpMethod.GET, requestEntity, TercerosCargos.class, requestEntity).getBody();
            if (currentJob != null) {
                Integer idEstructuraOrganizacionalCargo = currentJob.getIdEstructuraOrganizacionalCargo();
                Integer idEstructuraOrganizacional = restTemplate.exchange(businessServiceURL + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity).getBody().getIdEstructuraOrganizacional();
                Integer idCargo = restTemplate.exchange(businessServiceURL + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity).getBody().getIdCargo();
                List<VCargos> todosCargos = Arrays.asList(restTemplate.getForObject(businessServiceURL + "cargos/enabled", VCargos[].class));
                List<VEstructuraOrganizacional> organizationalFullList = Arrays.asList(restTemplate.exchange(businessServiceURL + "estructuraOrganizacional/enabled/", HttpMethod.GET, requestEntity, VEstructuraOrganizacional[].class, requestEntity).getBody());
                List<VEstructuraOrganizacionalCargos> todosEOC = Arrays.asList(restTemplate.getForObject(serviceUrl + "/buscarCargo/" + idEstructuraOrganizacional, VEstructuraOrganizacionalCargos[].class));
                List<VCargos> tempJobs = UtilitiesController.jobCascade(idCargo, todosCargos);
                List<VEstructuraOrganizacional> tempEO = UtilitiesController.organizationalStructureCascade(idEstructuraOrganizacional, organizationalFullList);
                todosEOC = todosEOC.stream().filter(t -> tempJobs.stream().anyMatch(f -> f.getIdCargo().equals(t.getIdCargo()))).collect(Collectors.toList());
                List<VEstructuraOrganizacionalCargos> tempEOC = todosEOC.stream().filter(t -> tempEO.stream().anyMatch(f -> f.getIdEstructuraOrganizacional().equals(t.getIdEstructuraOrganizacional()))).collect(Collectors.toList());
                List<VTercerosCargos> vTercerosCargosList = Arrays.stream(restTemplate.getForObject(businessServiceURL + "tercerosCargos", VTercerosCargos[].class)).filter(t -> tempEOC.stream().anyMatch(f -> f.getIdEstructuraOrganizacionalCargo().equals(t.getIdEstructuraOrganizacionalCargo()))).collect(Collectors.toList()).stream().filter(VTercerosCargos::getIndicadorHabilitado).collect(Collectors.toList());
                List<Usuarios> temUsers = Arrays.asList(restTemplate.exchange(businessServiceURL + "usuarios/", HttpMethod.GET, requestEntity, Usuarios[].class, requestEntity).getBody());
                List<Usuarios> tempUsers = temUsers.stream().filter(t -> vTercerosCargosList.stream().anyMatch(f -> f.getIdTercero().equals(t.getIdTercero()))).collect(Collectors.toList());
                returnList = parametros.stream().filter(t -> tempUsers.stream().anyMatch(f -> f.getIdUsuario().equals(t.getIdSolicitante()))).collect(Collectors.toList());
            } else {
                returnList = new ArrayList<>();
            }
        }
        return returnList;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idRequerimientos}")
    VRequerimientos findOne(@PathVariable Integer idRequerimientos) {
        return restTemplate.getForObject(serviceUrl + idRequerimientos, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimientosHistoricos/{idRequerimientoHistorico}")
    VRequerimientos findRequerimientoHistoricoOne(@PathVariable Integer idRequerimientoHistorico) {
        return restTemplate.getForObject(serviceUrl + idRequerimientoHistorico, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/estado/{idEstado}")
    List<VRequerimientos> findByIdEstado(@PathVariable Integer idEstado) {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "estado/" + idEstado, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byUser/{idUsuario}")
    List<VRequerimientos> findByIdSolicitante(@PathVariable Integer idUsuario) {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "byUser/" + idUsuario, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/fecha/{fechaInicio}/{fechaFin}")
    List<VRequerimientos> findByFecha(@PathVariable String fechaInicio, @PathVariable String fechaFin) {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "fecha/" + fechaInicio + "/" + fechaFin, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/filtroReq/{idEstado}/{idResponsableSeleccion}")
    List<VRequerimientos> findIdEstadoAndIdRespSelec(@PathVariable Integer idEstado, @PathVariable Integer idResponsableSeleccion, HttpServletRequest request) {
        return findAll(request).stream().filter(t -> t.getIdEstado().equals(idEstado) && t.getIdResponsableSeleccion().equals(idResponsableSeleccion)).collect(Collectors.toList());
        //VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "filtroReq/" + idEstado + "/" + idResponsableSeleccion, VRequerimientos[].class);
        //return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/filtroReq2/{idEstado}/{idTipoSolicitud}")
    List<VRequerimientos> findIdEstadoAndIdTipoSoli(@PathVariable Integer idEstado, @PathVariable Integer idTipoSolicitud) {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "filtroReq2/" + idEstado + "/" + idTipoSolicitud, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacion/{idPublicacion}")
    VRequerimientos findByIdPublicacion(@PathVariable Integer idPublicacion) {
        return restTemplate.getForObject(serviceUrl + "publicacion/" + idPublicacion, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byResponsable/{idResponsableSeleccion}")
    List<VRequerimientos> findAllByIdResponsableSeleccion(@PathVariable Integer idResponsableSeleccion) {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "byResponsable/" + idResponsableSeleccion, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacionFechas/todasActivas")
    List<VRequerimientos> queryAllByFechaActual() {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "publicacionFechas/todasActivas", VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacionFechas/cantidadN/{cantidad}")
    List<VRequerimientos> queryAllByFechaActualCantN(@PathVariable Integer cantidad) {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "publicacionFechas/cantidadN/" + cantidad, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byIdCargo/{idCargo}/{idTipoSolicitud}")
    VRequerimientos findByIdCargo(@PathVariable Integer idCargo, @PathVariable Integer idTipoSolicitud) {
        return restTemplate.getForObject(serviceUrl + "byIdCargo/" + idCargo + "/" + idTipoSolicitud, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/internaMixta")
    List<VRequerimientos> findIntMix() {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "internaMixta", VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/externaMixta")
    List<VRequerimientos> findExtMix() {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "externaMixta", VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/divisionPolitica/{idDivisionPolitica}")
    List<VRequerimientos> findByDivisionPolitica(@PathVariable Integer idDivisionPolitica) {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "divisionPolitica/" + idDivisionPolitica, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byTercero/{idTercero}")
    List<VRequerimientos> findAllByIdTercero(@PathVariable Long idTercero) {
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + "byTercero/" + idTercero, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Requerimientos create(@RequestBody Requerimientos requerimientos) {
        return restTemplate.postForObject(serviceUrl, requerimientos, Requerimientos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Requerimientos requerimientos) {
        updateTR(requerimientos);
    }

    public void update(VRequerimientos requerimientos) {
        updateTR(requerimientos);
    }

    private void updateTR(Object requ) {
        Requerimientos requerimientos = (Requerimientos) requ;
        String dominio = UtilitiesController.readParameter("domain.url");
        String serviceUrl = dominio + "/api/requerimientos/";
        Requerimientos req = restTemplate.getForObject(serviceUrl + requerimientos.getIdRequerimiento(), Requerimientos.class);
        ListasItems EstadoAnterior = restTemplate.getForObject(dominio + "/api/ListasEstadosRequerimientos/" + req.getIdEstado(), ListasItems.class);
        ListasItems EstadoActual = restTemplate.getForObject(dominio + "/api/ListasEstadosRequerimientos/" + requerimientos.getIdEstado(), ListasItems.class);
        if (EstadoActual.getCodigo().compareTo("SOLICITADO") == 0) {
            if (EstadoAnterior.getCodigo().compareTo("PRCREQ") == 0 || EstadoAnterior.getCodigo().compareTo("DVLT") == 0) {
                RequerimientosHistoricos requerimientosHistoricos = new RequerimientosHistoricos(req);
                restTemplate.postForObject(dominio + "/api/requerimientosHistoricos", requerimientosHistoricos, RequerimientosHistoricos.class);
            }
        }
        restTemplate.put(serviceUrl, requerimientos);
    }
}
