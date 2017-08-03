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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/planesAccionesNovedadesAccidentes")
@CrossOrigin
public class PlanesAccionesNovedadesAccidentesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/planesAccionesNovedadesAccidentes/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VPlanesAccionesNovedadesAccidentes> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VPlanesAccionesNovedadesAccidentes[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VPlanesAccionesNovedadesAccidentes> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VPlanesAccionesNovedadesAccidentes[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPlanesAccionesNovedadesAccidentes findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VPlanesAccionesNovedadesAccidentes.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroNovedad/{id}")
    List<VPlanesAccionesNovedadesAccidentes> findByIdGrupoDotacion(@PathVariable Integer id, HttpServletRequest request) {
        String token = UtilitiesController.extractToken(request); //Extraccion del Token desde el Request
        String businessServiceURL = businessUrl + "/api/"; //Composicion de BaseURL para Servicios de Logica
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token); //Encabezados para Request con Autenticación de Logica
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        Collection<?> userRoles = jwtTokenUtil.getAuthorities(); //Extraccion de Nombres de ROLE_ Asignados
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token); //Id de Usuario Conectado
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders); //Entidad de Solicitud Autentica (HeaderOnly)
        Long idTercero = restTemplate.exchange(businessServiceURL + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity).getBody().getIdTercero();
        List<VPlanesAccionesNovedadesAccidentes> prefilter = Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroNovedad/" + id, VPlanesAccionesNovedadesAccidentes[].class));
        String ADMACC = UtilitiesController.findConstant("ADMACC").getValor();
        Roles roles = restTemplate.exchange(businessServiceURL + "roles/rol/" + ADMACC, HttpMethod.GET, requestEntity, Roles.class, requestEntity).getBody();
        VTercerosNovedades vTercerosNovedades = restTemplate.getForObject(businessServiceURL + "tercerosNovedades/" + id, VTercerosNovedades.class);
        boolean isManager = userRoles.stream().anyMatch(r -> roles.getRol().equals(r.toString())) || vTercerosNovedades.getIdTerceroReporta().equals(idTercero);
        if (!isManager) {
            return prefilter.stream().filter(t -> t.getIdEncargado().equals(idTercero) || t.getIdResponsable().equals(idTercero)).collect(Collectors.toList());
        } else {
            return prefilter;
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    PlanesAccionesNovedadesAccidentes create(@RequestBody PlanesAccionesNovedadesAccidentes o) {
        o.setIdEstadoPlanAccion(UtilitiesController.findListItem("ListasEstadosPlanesAccion", "PEND").getIdLista());
        return restTemplate.postForObject(serviceUrl, o, PlanesAccionesNovedadesAccidentes.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody PlanesAccionesNovedadesAccidentes o) {
        if(o.getIndicadorVerficar()!=null && o.getIndicadorVerficar()){
            o.setIdEstadoPlanAccion(UtilitiesController.findListItem("ListasEstadosPlanesAccion", "VERF").getIdLista());
        }else{
            o.setIdEstadoPlanAccion(UtilitiesController.findListItem("ListasEstadosPlanesAccion", "REAL").getIdLista());
        }
        restTemplate.put(serviceUrl, o);
    }

}
