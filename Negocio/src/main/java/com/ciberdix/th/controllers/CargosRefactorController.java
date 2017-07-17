package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import com.ciberdix.th.security.JwtTokenUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargos")
@Api(value = "cargos", description = "Cargos")
public class CargosRefactorController {

    @Value("${business.url}")
    String businessURL;

    @Value("${domain.url}")
    String domainURL;
    RestTemplate restTemplate;
    private String serviceUrl;

    @PostConstruct
    void init() {
        serviceUrl = domainURL + "/api/cargos";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VCargos> findAll() {
        VCargos[] parametros = restTemplate.getForObject(serviceUrl, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + "/" + id, VCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCargos> findEnabled() {
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/wildcard/{query}")
    List<VCargos> findByWildCard(@PathVariable String query) {
        RestTemplate restTemplate = new RestTemplate();
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/wildcard/" + query, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/wildcardFiltered/{query}")
    List<VCargos> findByWildCard(@PathVariable String query, HttpServletRequest request) {
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        String token = UtilitiesController.extractToken(request);
        String businessServiceURL = businessURL + "/api/";
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        String roleCodes = UtilitiesController.findConstant("ROLARB").getValor();
        String[] rolesCodes = roleCodes.split(",");
        StringBuilder sb = new StringBuilder();
        for (String str : rolesCodes) {
            sb.append(restTemplate.exchange(businessServiceURL + "roles/rol/" + str, HttpMethod.GET, requestEntity, Roles.class, requestEntity).getBody().getRol());
            sb.append(",");
        }
        String resultRoles = sb.toString();
        boolean isManager = userRoles.stream().anyMatch(r -> resultRoles.contains(r.toString()));
        List<VCargos> todosCargos = Arrays.asList(restTemplate.getForObject(serviceUrl + "/wildcard/" + query, VCargos[].class));
        List<VCargos> returnList;
        if (isManager) {
            returnList = todosCargos;
        } else {
            Long idTercero = restTemplate.exchange(businessServiceURL + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity).getBody().getIdTercero();
            Integer idEstructuraOrganizacionalCargo = restTemplate.exchange(businessServiceURL + "tercerosCargos/tercero/" + idTercero, HttpMethod.GET, requestEntity, TercerosCargos.class, requestEntity).getBody().getIdEstructuraOrganizacionalCargo();
            Integer idCargo = restTemplate.exchange(businessServiceURL + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity).getBody().getIdCargo();
            returnList = UtilitiesController.jobRecursiveCascade(idCargo, todosCargos);
        }

        return returnList;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/search/{query}/{idEstructuraOrganizacional}")
    List<VCargos> queryByIdEstructuraOrganizacional(@PathVariable String query, @PathVariable Integer idEstructuraOrganizacional) {
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/search/" + query + "/" + idEstructuraOrganizacional, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Cargos create(@RequestBody Cargos obj) {
        return restTemplate.postForObject(serviceUrl, obj, Cargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cargos obj) {
        restTemplate.put(serviceUrl, obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab1")
    void updateTab1(@RequestBody Cargos obj) {
        restTemplate.put(serviceUrl + "/tab1", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab2")
    void updateTab2(@RequestBody Cargos obj, HttpServletRequest request) {
        RequerimientosAccionesRefactorController requerimientosAccionesRefactorController = new RequerimientosAccionesRefactorController();
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        Integer c = UtilitiesController.findListItem("ListasEstadosCargos", "CONST").getIdLista();
        Integer a = UtilitiesController.findListItem("ListasEstadosCargos", "APROB").getIdLista();
        Integer n = UtilitiesController.findListItem("ListasEstadosCargos", "NOAPR").getIdLista();
        Integer tipoSol = UtilitiesController.findListItem("ListasTiposSolicitudes", "CRGNVO").getIdLista();
        Requerimientos requerimientos = restTemplate.getForObject(domainURL + "/api/requerimientos/byIdCargo/" + obj.getIdCargo() + "/" + tipoSol, Requerimientos.class);
        if ((estadoActual.getIdEstado().equals(c) || estadoActual.getIdEstado().equals(n)) && obj.getIdEstado().equals(a) && (requerimientos != null && requerimientos.getIdRequerimiento() != null)) {
            RequerimientosAcciones requerimientosAcciones = new RequerimientosAcciones();
            requerimientosAcciones.setIdRequerimiento(requerimientos.getIdRequerimiento());
            requerimientosAcciones.setAuditoriaUsuario(obj.getAuditoriaUsuario());
            requerimientosAcciones.setObservacion("Cargo Creado Satisfactoriamente");
            Integer idAccion = UtilitiesController.findListItem("ListasRequerimientosAcciones", "APRPER").getIdLista();
            requerimientosAcciones.setIdAccion(idAccion);
            requerimientosAccionesRefactorController.create(requerimientosAcciones);
            Integer reqEstado = UtilitiesController.findListItem("ListasEstadosRequerimientos", "APRB").getIdLista();
            requerimientos.setIdEstado(reqEstado);
            
            String token = UtilitiesController.extractToken(request);
            HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
            HttpEntity<Object> requestEntity = new HttpEntity<>(requerimientos, httpHeaders);
            restTemplate.exchange(businessURL + "api/requerimientos", HttpMethod.PUT, requestEntity, Requerimientos.class);
        }
        restTemplate.put(serviceUrl + "/tab2", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab3")
    void updateTab3(@RequestBody Cargos obj) {
        restTemplate.put(serviceUrl + "/tab3", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab4")
    void updateTab4(@RequestBody Cargos obj) {
        restTemplate.put(serviceUrl + "/tab4", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab5")
    void updateTab5(@RequestBody Cargos obj) {
        restTemplate.put(serviceUrl + "/tab5", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab6")
    void updateTab6(@RequestBody Cargos obj) {
        restTemplate.put(serviceUrl + "/tab6", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab7")
    void updateTab7(@RequestBody Cargos obj) {
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        if (estadoActual.getPaso().equals(15) && obj.getPaso().equals(16)) {
            String recipients = UtilitiesController.findConstant("CORAUT").getValor();
            String token = UtilitiesController.generateURLToken("/positions/update/" + obj.getIdCargo());
            String body = "Se ha creado un nuevo cargo que requiere su aprobación. haga click en el siguiente boton para acceder a la información: <p style=\"align:center;\"><a href=\"" + UtilitiesController.readParameter("front.url") + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a></p>";
            UtilitiesController.sendMail(recipients, "Aprobación Cargo", body);
        }
        restTemplate.put(serviceUrl + "/tab7", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/disabled/{idCargo}")
    void disabled(@PathVariable Integer idCargo) {
        restTemplate.put(serviceUrl + "/disabled/" + idCargo, VCargos.class);
    }
}
