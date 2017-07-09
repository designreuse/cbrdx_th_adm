package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import com.ciberdix.th.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/estructuraOrganizacionalCargos")
public class EstructuraOrganizacionalCargosRefactorController {

    @Value("${business.url}")
    String businessURL;

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/estructuraOrganizacionalCargos";

    @RequestMapping(method = RequestMethod.GET)
    List<VEstructuraOrganizacionalCargos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacionalCargos[] parametros = restTemplate.getForObject(serviceUrl, VEstructuraOrganizacionalCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VEstructuraOrganizacionalCargos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VEstructuraOrganizacionalCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VEstructuraOrganizacionalCargos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacionalCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VEstructuraOrganizacionalCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{idEstructuraOrganizacional}")
    List<VEstructuraOrganizacionalCargos> findByIdCargo(@PathVariable Integer idEstructuraOrganizacional, HttpServletRequest request) {
        RestTemplate restTemplate = new RestTemplate();
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
        List<VCargos> todosCargos = Arrays.asList(restTemplate.getForObject(businessServiceURL + "cargos/enabled", VCargos[].class));
        List<VEstructuraOrganizacionalCargos> todosEOC = Arrays.asList(restTemplate.getForObject(serviceUrl + "/buscarCargo/" + idEstructuraOrganizacional, VEstructuraOrganizacionalCargos[].class));
        List<VEstructuraOrganizacionalCargos> returnList;
        if (isManager) {
            returnList = todosEOC;
        } else {
            Long idTercero = restTemplate.exchange(businessServiceURL + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity).getBody().getIdTercero();
            Integer idEstructuraOrganizacionalCargo = restTemplate.exchange(businessServiceURL + "tercerosCargos/tercero/" + idTercero, HttpMethod.GET, requestEntity, TercerosCargos.class, requestEntity).getBody().getIdEstructuraOrganizacionalCargo();
            Integer idCargo = restTemplate.exchange(businessServiceURL + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity).getBody().getIdCargo();
            List<VCargos> temp = UtilitiesController.jobRecursiveCascade(idCargo, todosCargos);
            returnList = todosEOC.stream().filter(t -> temp.stream().anyMatch(f -> f.getIdCargo().equals(t.getIdCargo()))).collect(Collectors.toList());
        }
        return returnList;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercerosHabInEstrucOrgCarg/{id}")
    List<VEstructuraOrganizacionalCargos> queryAllByIdCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacionalCargos[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercerosHabInEstrucOrgCarg/" + id, VEstructuraOrganizacionalCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargoEstructura/{idCargo}/{idEstructura}")
    VEstructuraOrganizacionalCargos findAllByIdCAndIdE(@PathVariable Integer idCargo, @PathVariable Integer idEstructura) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/buscarCargoEstructura/" + idCargo + "/" + idEstructura, VEstructuraOrganizacionalCargos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraOrganizacionalCargos create(@RequestBody EstructuraOrganizacionalCargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, EstructuraOrganizacionalCargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraOrganizacionalCargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/disabled/{idCargo}")
    void disabled(@PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/disabled/" + idCargo, VEstructuraOrganizacionalCargos.class);
    }
}
