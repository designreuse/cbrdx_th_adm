package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import com.ciberdix.th.security.JwtTokenUtil;
import io.swagger.annotations.Api;
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
@RequestMapping("/api/tercerosCargos")
@Api(value = "tercerosCargos", description = "Cargos del Tercero")
public class TercerosCargosRefactorController {

    @Value("${business.url}")
    String businessURL;

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosCargos";

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosCargos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosCargos[] parametros = restTemplate.getForObject(serviceUrl, VTercerosCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosCargos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VTercerosCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarEstructuraCargo/{id}")
    List<VTercerosCargos> findByEstructuraCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/buscarEstructuraCargo/" + id, VTercerosCargos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarEstructura/{id}")
    List<VTercerosCargos> findByEstructura(@PathVariable Integer id, HttpServletRequest request) {
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
        List<VTercerosCargos> todosTC = Arrays.asList(restTemplate.getForObject(serviceUrl + "/buscarEstructura/" + id, VTercerosCargos[].class));
        List<VTercerosCargos> returnList;
        if (isManager) {
            returnList = todosTC;
        } else {
            Long idTercero = restTemplate.exchange(businessServiceURL + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity).getBody().getIdTercero();
            Integer idEstructuraOrganizacionalCargo = restTemplate.exchange(businessServiceURL + "tercerosCargos/tercero/" + idTercero, HttpMethod.GET, requestEntity, TercerosCargos.class, requestEntity).getBody().getIdEstructuraOrganizacionalCargo();
            Integer idCargo = restTemplate.exchange(businessServiceURL + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity).getBody().getIdCargo();
            List<VCargos> temp = UtilitiesController.jobRecursiveCascade(idCargo, todosCargos);
            returnList = todosTC.stream().filter(t -> temp.stream().anyMatch(f -> f.getIdCargo().equals(t.getIdCargo()))).collect(Collectors.toList());
        }
        return returnList;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosCargos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VTercerosCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VTercerosCargos> findByIdCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/buscarCargo/" + id, VTercerosCargos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{id}")
    VTercerosCargos findByIdTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/tercero/" + id, VTercerosCargos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosCargos create(@RequestBody TercerosCargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, TercerosCargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosCargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
