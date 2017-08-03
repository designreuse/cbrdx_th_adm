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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tercerosNovedades")
@CrossOrigin
public class TercerosNovedadesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosNovedades/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosNovedades> findAll(HttpServletRequest request) {
        String token = UtilitiesController.extractToken(request); //Extraccion del Token desde el Request
        String businessServiceURL = businessUrl + "/api/"; //Composicion de BaseURL para Servicios de Logica
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token); //Encabezados para Request con Autenticación de Logica
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        Collection<?> userRoles = jwtTokenUtil.getAuthorities(); //Extraccion de Nombres de ROLE_ Asignados
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token); //Id de Usuario Conectado
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders); //Entidad de Solicitud Autentica (HeaderOnly)
        Long idTercero = restTemplate.exchange(businessServiceURL + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity).getBody().getIdTercero();
        TercerosCargos currentJob = restTemplate.exchange(businessServiceURL + "tercerosCargos/tercero/" + idTercero, HttpMethod.GET, requestEntity, TercerosCargos.class, requestEntity).getBody();
        List<VTercerosCargos> myEmployees;
        if (currentJob != null) {
            Integer idEstructuraOrganizacionalCargo = currentJob.getIdEstructuraOrganizacionalCargo();
            Integer idEstructuraOrganizacional = restTemplate.exchange(businessServiceURL + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity).getBody().getIdEstructuraOrganizacional();
            myEmployees = Arrays.asList(restTemplate.exchange(businessServiceURL + "tercerosCargos/buscarEstructura/" + idEstructuraOrganizacional, HttpMethod.GET, requestEntity, VTercerosCargos[].class, requestEntity).getBody());
        } else {
            myEmployees = new ArrayList<>();
        }

        List<VTercerosNovedades> prefilter = Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosNovedades[].class));
        List<VTercerosNovedades> roleFilter = prefilter.stream().filter(t -> userRoles.stream().anyMatch(f -> t.getRol() != null && t.getRol().equals(f.toString()))).collect(Collectors.toList());
        //List<VTercerosNovedades> myFilter = prefilter.stream().filter(t -> !t.getIdTercero().equals(t.getIdTerceroReporta()) && t.getIdTerceroReporta().equals(idTercero)).collect(Collectors.toList());
        List<VTercerosNovedades> employeesFilter = prefilter.stream().filter(t -> myEmployees.stream().anyMatch(f -> f.getIndicadorHabilitado() && f.getIdTercero().equals(t.getIdTercero()))).collect(Collectors.toList());
        prefilter = prefilter.stream().filter(t -> roleFilter.stream().anyMatch(f -> f.getIdTerceroNovedad().equals(t.getIdTerceroNovedad()))
                //|| myFilter.stream().anyMatch(f -> f.getIdTerceroNovedad().equals(t.getIdTerceroNovedad()))
                || employeesFilter.stream().anyMatch(f -> f.getIdTerceroNovedad().equals(t.getIdTerceroNovedad()))).collect(Collectors.toList());
        return prefilter;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosNovedades findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosNovedades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosNovedades> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedad/{id}")
    List<VTercerosNovedades> findByIdNovedad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "novedad/" + id, VTercerosNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{id}")
    List<VTercerosNovedades> findByIdTercero(@PathVariable Long id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "tercero/" + id, VTercerosNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/incidentesAccidentes")
    List<VTercerosNovedades> findIncidentesAccidentes(HttpServletRequest request) {
        String token = UtilitiesController.extractToken(request); //Extraccion del Token desde el Request
        String businessServiceURL = businessUrl + "/api/"; //Composicion de BaseURL para Servicios de Logica
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token); //Encabezados para Request con Autenticación de Logica
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        Collection<?> userRoles = jwtTokenUtil.getAuthorities(); //Extraccion de Nombres de ROLE_ Asignados
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token); //Id de Usuario Conectado
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders); //Entidad de Solicitud Autentica (HeaderOnly)
        String ADMACC = UtilitiesController.findConstant("ADMACC").getValor();
        Roles roles = restTemplate.exchange(businessServiceURL + "roles/rol/" + ADMACC, HttpMethod.GET, requestEntity, Roles.class, requestEntity).getBody();
        boolean isManager = userRoles.stream().anyMatch(r -> roles.getRol().equals(r.toString()));
        List<VNovedades> n = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/novedades/incidentesAccidentes", VNovedades[].class));
        List<VTercerosNovedades> tn = Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosNovedades[].class));
        tn = tn.stream().filter(t -> n.stream().anyMatch(f -> t.getIdNovedad().equals(f.getIdNovedad()))).collect(Collectors.toList());
        Integer idEstadoNovedad = UtilitiesController.findListItem("ListasEstadosNovedades", "TRAMIT").getIdLista();
        Long idTercero = restTemplate.exchange(businessServiceURL + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity).getBody().getIdTercero();
        for (VTercerosNovedades vtn : tn) {
            if (vtn.getIdEstadoNovedad().equals(idEstadoNovedad)) {
                vtn.setActividades(2);
            } else {
                List<VPlanesAccionesNovedadesAccidentes> pana = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/planesAccionesNovedadesAccidentes/terceroNovedad/" + vtn.getIdTerceroNovedad(), VPlanesAccionesNovedadesAccidentes[].class));
                if (pana.size() > 0) {
                    Integer idEstadoAccion = UtilitiesController.findListItem("ListasEstadosPlanesAccion", "VERF").getIdLista();
                    List<VPlanesAccionesNovedadesAccidentes> panaF = pana.stream().filter(t -> pana.stream().anyMatch(f -> t.getIdEstadoPlanAccion().equals(idEstadoAccion))).collect(Collectors.toList());
                    if (pana.size() == panaF.size()) {
                        vtn.setActividades(3);
                    } else {
                        vtn.setActividades(4);
                    }
                } else {
                    vtn.setActividades(1);
                }
            }
        }
        if (isManager) {
            return tn;
        } else {
            List<VTercerosNovedades> tempReporta = tn.stream().filter(t -> t.getIdTerceroReporta().equals(idTercero)).collect(Collectors.toList());
            List<VTercerosNovedades> tempAcciones = new ArrayList<>();
            for (VTercerosNovedades vtn : tn) {
                if (!tempReporta.contains(vtn)) {
                    List<VPlanesAccionesNovedadesAccidentes> pana = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/planesAccionesNovedadesAccidentes/terceroNovedad/" + vtn.getIdTerceroNovedad(), VPlanesAccionesNovedadesAccidentes[].class));
                    if (pana.stream().anyMatch(t -> (t.getIdResponsable() != null && t.getIdResponsable().equals(idTercero)) || (t.getIdEncargado() != null && t.getIdEncargado().equals(idTercero)))) {
                        tempAcciones.add(vtn);
                    }
                }
            }
            return tn.stream().filter(t -> tempReporta.stream().anyMatch(f -> t.getIdTerceroNovedad().equals(f.getIdTerceroNovedad()))
                    || tempAcciones.stream().anyMatch(f -> t.getIdTerceroNovedad().equals(f.getIdTerceroNovedad()))).collect(Collectors.toList());
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroAccidentes/{idTercero}")
    List<VTercerosNovedades> findIncidentesAccidentesByIdTercero(@PathVariable Integer idTercero) {
        List<VNovedades> n = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/novedades/incidentesAccidentes", VNovedades[].class));
        List<VTercerosNovedades> tn = Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosNovedades[].class));
        return tn.stream().filter(t -> n.stream().anyMatch(f -> t.getIdNovedad().equals(f.getIdNovedad()) && t.getIdTercero().equals(idTercero))).collect(Collectors.toList());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedades")
    List<VTercerosNovedades> findNovedades() {
        List<VNovedades> n = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/novedades/incidentesAccidentes", VNovedades[].class));
        List<VTercerosNovedades> tn = Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosNovedades[].class));
        return tn.stream().filter(t -> n.stream().noneMatch(f -> t.getIdNovedad().equals(f.getIdNovedad()))).collect(Collectors.toList());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/filtroFechas/{FechaInicio}/{FechaFin}")
    List<VTercerosNovedades> findByFechaReporteBetween(@PathVariable String FechaInicio, @PathVariable String FechaFin, HttpServletRequest request) {
        assert FechaInicio != null;
        assert FechaFin != null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<VTercerosNovedades> vTercerosNovedades = findAll(request);
        if (!FechaInicio.isEmpty() && !FechaFin.isEmpty()) {
            return vTercerosNovedades.stream().filter(t -> {
                try {
                    return t.getFechaReporte() != null && t.getFechaReporte().compareTo(dateFormat.parse(FechaInicio)) >= 0 && t.getFechaReporte().compareTo(dateFormat.parse(FechaFin)) <= 0;
                } catch (ParseException e) {
                    return false;
                }
            }).collect(Collectors.toList());
        } else {
            return vTercerosNovedades;
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosNovedades create(@RequestBody TercerosNovedades o) {
        VTercerosCargos vTercerosCargos = restTemplate.getForObject(baseUrl + "/api/tercerosCargos/tercero/" + o.getIdTercero(), VTercerosCargos.class);
        VCargos vCargos = restTemplate.getForObject(baseUrl + "/api/cargos/" + vTercerosCargos.getIdCargo(), VCargos.class);
        if (vCargos.getIdCargoJefe() != null) {
            List<VTercerosCargos> jefes = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/tercerosCargos/buscarCargo/" + vCargos.getIdCargoJefe(), VTercerosCargos[].class));
            VNovedades novedad = restTemplate.getForObject(baseUrl + "/api/novedades/" + o.getIdNovedad(), VNovedades.class);
            if (!jefes.isEmpty()) {
                List<VTercerosCargos> tempAnalisis;
                Integer IdEstructuraOrganizacional = vTercerosCargos.getIdEstructuraOrganizacional();
                do {
                    VEstructuraOrganizacional vEstructuraOrganizacional = restTemplate.getForObject(baseUrl + "/api/estructuraOrganizacional/" + IdEstructuraOrganizacional, VEstructuraOrganizacional.class);
                    tempAnalisis = jefes.stream().filter(t -> t.getIdEstructuraOrganizacional().equals(vEstructuraOrganizacional.getIdEstructuraOrganizacional())).collect(Collectors.toList());
                    IdEstructuraOrganizacional = vEstructuraOrganizacional.getIdPadre();
                    if (IdEstructuraOrganizacional == null || IdEstructuraOrganizacional.equals(0)) {
                        break;
                    }
                } while (tempAnalisis.isEmpty());
                if (!tempAnalisis.isEmpty()) {
                    List<VTercerosCargos> analisis = tempAnalisis;
                    List<Terceros> todosTerceros = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/terceros", Terceros[].class));
                    List<Terceros> tercerosJefes = todosTerceros.stream().filter(t -> analisis.stream().anyMatch(f -> t.getIdTercero().equals(f.getIdTercero()))).collect(Collectors.toList());
                    String correos = "";
                    for (Terceros t : tercerosJefes) {
                        correos = correos + t.getCorreoElectronico() + ";";
                    }
                    Terceros terceros = restTemplate.getForObject(baseUrl + "/api/terceros/" + vTercerosCargos.getIdTercero(), Terceros.class);
                    String body = "<p>El colaborador " + terceros.getPrimerNombre() + " " + terceros.getPrimerApellido() + " ha reportado  la siguiente novedad:" +
                            "<ol>" +
                            "<li>Tipo de novedad:" + novedad.getTipoNovedad() + "</li>" +
                            "<li>Novedad:" + novedad.getNovedad() + "</li>" +
                            "<li>Fecha Inicio:" + o.getFechaInicio() + "</li>" +
                            "<li>Fecha fin:" + o.getFechaFin() + "</li>" +
                            "<li>Descripción:" + o.getDescripcion() + "</li>" +
                            "</ol>" +
                            "Tenga en cuenta esta información de su colaborador para los procesos que desarrolla actualmente en su área.</p>";
                    if (novedad.getIndicadorAutorizaJefe() != null && novedad.getIndicadorAutorizaJefe()) {
                        UtilitiesController.sendMail(correos, "Aprobación Novedad", body + "<p>Dicha Novedad debe ser autorizada por usted mediante el sistema</p>");
                    }
                    if (novedad.getIndicadorNotificaJefe() != null && novedad.getIndicadorNotificaJefe()) {
                        UtilitiesController.sendMail(correos, "Gestion Novedad", body);
                    }
                }
            }
            Terceros terceros = restTemplate.getForObject(baseUrl + "/api/terceros/" + vTercerosCargos.getIdTercero(), Terceros.class);
            String body = "<p>El colaborador " + terceros.getPrimerNombre() + " " + terceros.getPrimerApellido() + " ha reportado  la siguiente novedad:" +
                    "<ol>" +
                    "<li>Tipo de novedad:" + novedad.getTipoNovedad() + "</li>" +
                    "<li>Novedad:" + novedad.getNovedad() + "</li>" +
                    "<li>Fecha Inicio:" + o.getFechaInicio() + "</li>" +
                    "<li>Fecha fin:" + o.getFechaFin() + "</li>" +
                    "<li>Descripción:" + o.getDescripcion() + "</li>" +
                    "</ol>" +
                    "Tenga en cuenta esta información de su colaborador para los procesos que desarrolla actualmente en su área.</p>";
            if (novedad.getIndicadorAreasApoyo() != null && novedad.getIndicadorAreasApoyo()) {
                UtilitiesController.sendMail(UtilitiesController.findConstant("NONOAA").getValor(), "Gestion Novedad", "<p>Buen día Areas de apoyo</p>" + body);
            }
        }
        return restTemplate.postForObject(serviceUrl, o, TercerosNovedades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosNovedades o) {
        VTercerosNovedades TN = findOne(o.getIdTerceroNovedad());
        o.setFechaReporte(TN.getFechaReporte());
        o.setIdTerceroReporta(TN.getIdTerceroReporta());
        restTemplate.put(serviceUrl, o);
    }

}
