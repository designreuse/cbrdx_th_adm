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
        Integer idEstructuraOrganizacionalCargo = currentJob.getIdEstructuraOrganizacionalCargo();
        Integer idEstructuraOrganizacional = restTemplate.exchange(businessServiceURL + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity).getBody().getIdEstructuraOrganizacional();
        List<VTercerosCargos> myEmployees = Arrays.asList(restTemplate.exchange(businessServiceURL + "tercerosCargos/buscarEstructura/" + idEstructuraOrganizacional, HttpMethod.GET, requestEntity, VTercerosCargos[].class, requestEntity).getBody());

        List<VTercerosNovedades> prefilter = Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosNovedades[].class));
        List<VTercerosNovedades> roleFilter = prefilter.stream().filter(t -> userRoles.stream().anyMatch(f -> t.getRol() != null && t.getRol().equals(f.toString()))).collect(Collectors.toList());
        List<VTercerosNovedades> myFilter = prefilter.stream().filter(t -> !t.getIdTercero().equals(t.getIdTerceroReporta()) && t.getIdTerceroReporta().equals(idTercero)).collect(Collectors.toList());
        List<VTercerosNovedades> employeesFilter = prefilter.stream().filter(t -> myEmployees.stream().anyMatch(f -> f.getIndicadorHabilitado() && f.getIdTercero().equals(t.getIdTercero()))).collect(Collectors.toList());
        prefilter = prefilter.stream().filter(t -> roleFilter.stream().anyMatch(f -> f.getIdTerceroNovedad().equals(t.getIdTerceroNovedad()))
                || myFilter.stream().anyMatch(f -> f.getIdTerceroNovedad().equals(t.getIdTerceroNovedad()))
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

    @RequestMapping(method = RequestMethod.POST)
    TercerosNovedades create(@RequestBody TercerosNovedades o) {
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
