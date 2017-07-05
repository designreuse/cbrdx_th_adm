package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import com.ciberdix.th.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/estructuraOrganizacional")
public class EstructuraOrganizacionalRefactorController {

    @Value("${business.url}")
    String businessURL;

    String tokenHeader = "Authorization";

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/estructuraOrganizacional";

    @RequestMapping(method = RequestMethod.GET)
    List<VEstructuraOrganizacional> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl, VEstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VEstructuraOrganizacional findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VEstructuraOrganizacional.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VEstructuraOrganizacional> findEnabled(HttpServletRequest request) {
        String test = businessURL + "/api/";
        RestTemplate restTemplate = new RestTemplate();
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        HttpHeaders httpHeaders = new HttpHeaders();
        String token = request.getHeader(tokenHeader);
        Collection<?> roles = jwtTokenUtil.getAuthorities();
        httpHeaders.set(tokenHeader, token);
        Integer idUsuario = jwtTokenUtil.getIdUsernameFromToken(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        String roleCodes = UtilitiesController.findConstant("ROLARB").getValor();
        String[] rolesCodes = roleCodes.split(",");
        StringBuilder sb = new StringBuilder();
        for (String str : rolesCodes) {
            sb.append(restTemplate.exchange(test + "roles/rol/" + str, HttpMethod.GET, requestEntity, Roles.class, requestEntity).getBody().getRol());
            sb.append(",");
        }
        String resultRoles = sb.toString();
        boolean admin = false;
        for (Object rol : roles) {
            if (resultRoles.contains(rol.toString())) {
                admin = true;
                break;
            }
        }

        ResponseEntity<VEstructuraOrganizacional[]> eoresponseEntity = restTemplate.exchange(test + "estructuraOrganizacional/enabled/", HttpMethod.GET, requestEntity, VEstructuraOrganizacional[].class, requestEntity);
        List<VEstructuraOrganizacional> todosEO = Arrays.asList(eoresponseEntity.getBody());
        List<VEstructuraOrganizacional> resultadoEO;
        if (admin) {
            resultadoEO = todosEO;

        } else {
            ResponseEntity<Usuarios> responseEntity = restTemplate.exchange(test + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity);
            Long idTercero = responseEntity.getBody().getIdTercero();

            ResponseEntity<TercerosCargos> tercerosCargosEntity = restTemplate.exchange(test + "tercerosCargos/tercero/" + idTercero, HttpMethod.GET, requestEntity, TercerosCargos.class, requestEntity);
            Integer idEstructuraOrganizacionalCargo = tercerosCargosEntity.getBody().getIdEstructuraOrganizacionalCargo();

            ResponseEntity<EstructuraOrganizacionalCargos> eocresponseEntity = restTemplate.exchange(test + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity);
            Integer idEstructuraOrganizacional = eocresponseEntity.getBody().getIdEstructuraOrganizacional();

            resultadoEO = recursiveEOSearch(idEstructuraOrganizacional, todosEO);
            ResponseEntity<VEstructuraOrganizacional> singleRecord = restTemplate.exchange(test + "estructuraOrganizacional/" + idEstructuraOrganizacional, HttpMethod.GET, requestEntity, VEstructuraOrganizacional.class, requestEntity);
            VEstructuraOrganizacional out = singleRecord.getBody();
            out.setIdPadre(0);
            resultadoEO.add(out);
        }
        return resultadoEO;
        /*
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VEstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
        */
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{id}")
    List<VEstructuraOrganizacional> findByIdPadre(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl + "/buscarPadre/" + id, VEstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTipo/{id}")
    List<EstructuraOrganizacional> findByIdTipo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        EstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTipo/" + id, EstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraOrganizacional create(@RequestBody EstructuraOrganizacional obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, EstructuraOrganizacional.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraOrganizacional obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
/*
    @RequestMapping(method = RequestMethod.GET, path = "/security/")
    void findByIdTipo(HttpServletRequest request) {
        String test = businessURL + "/api/";
        RestTemplate restTemplate = new RestTemplate();
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        HttpHeaders httpHeaders = new HttpHeaders();
        String token = request.getHeader(tokenHeader);
        Collection<?> roles = jwtTokenUtil.getAuthorities();
        httpHeaders.set(tokenHeader, token);
        Integer idUsuario = jwtTokenUtil.getIdUsernameFromToken(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        String roleCodes = UtilitiesController.findConstant("ROLARB").getValor();
        String[] rolesCodes = roleCodes.split(",");
        StringBuilder sb = new StringBuilder();
        for (String str : rolesCodes) {
            sb.append(restTemplate.exchange(test + "roles/rol/" + str, HttpMethod.GET, requestEntity, Roles.class, requestEntity).getBody().getRol());
            sb.append(",");
        }
        String resultRoles = sb.toString();
        boolean admin = false;
        for (Object rol : roles) {
            if (resultRoles.contains(rol.toString())) {
                admin = true;
                break;
            }
        }
        ResponseEntity<Cargos[]> cresponseEntity = restTemplate.exchange(test + "cargos/enabled/", HttpMethod.GET, requestEntity, Cargos[].class, requestEntity);
        List<Cargos> todosCargos = Arrays.asList(cresponseEntity.getBody());

        ResponseEntity<EstructuraOrganizacional[]> eoresponseEntity = restTemplate.exchange(test + "estructuraOrganizacional/enabled/", HttpMethod.GET, requestEntity, EstructuraOrganizacional[].class, requestEntity);
        List<EstructuraOrganizacional> todosEO = Arrays.asList(eoresponseEntity.getBody());
        List<EstructuraOrganizacional> resultadoEO;
        List<Cargos> resultado;
        if (admin) {
            resultado = todosCargos;
            resultadoEO = todosEO;

        } else {
            ResponseEntity<Usuarios> responseEntity = restTemplate.exchange(test + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity);
            Long idTercero = responseEntity.getBody().getIdTercero();

            ResponseEntity<TercerosCargos> tercerosCargosEntity = restTemplate.exchange(test + "tercerosCargos/tercero/" + idTercero, HttpMethod.GET, requestEntity, TercerosCargos.class, requestEntity);
            Integer idEstructuraOrganizacionalCargo = tercerosCargosEntity.getBody().getIdEstructuraOrganizacionalCargo();

            ResponseEntity<EstructuraOrganizacionalCargos> eocresponseEntity = restTemplate.exchange(test + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity);
            Integer idCargo = eocresponseEntity.getBody().getIdCargo();
            Integer idEstructuraOrganizacional = eocresponseEntity.getBody().getIdEstructuraOrganizacional();

            resultadoEO = recursiveEOSearch(idEstructuraOrganizacional, todosEO);
            resultado = recursiveSearch(idCargo, todosCargos);
        }

    }

    List<Cargos> recursiveSearch(Integer idCargo, List<Cargos> todosCargos) {
        List<Cargos> dependencyJobs = new ArrayList<>();
        List<Cargos> collectedSons = todosCargos.stream().filter(u -> u.getIdCargoJefe() != null && u.getIdCargoJefe().equals(idCargo)).collect(Collectors.toList());
        if (!collectedSons.isEmpty()) {
            for (Cargos c : collectedSons) {
                dependencyJobs.addAll(recursiveSearch(c.getIdCargo(), todosCargos));
            }
        }
        dependencyJobs.addAll(collectedSons);
        return dependencyJobs;
    }
*/
    /*
    List<EstructuraOrganizacional> recursiveEOSearch(Integer idCargo, List<EstructuraOrganizacional> todosEstructuras) {
        List<EstructuraOrganizacional> dependencyJobs = new ArrayList<>();
        List<EstructuraOrganizacional> collectedSons = todosEstructuras.stream().filter(u -> u.getIdPadre() != null && u.getIdPadre().equals(idCargo)).collect(Collectors.toList());
        if (!collectedSons.isEmpty()) {
            for (EstructuraOrganizacional c : collectedSons) {
                dependencyJobs.addAll(recursiveEOSearch(c.getIdEstructuraOrganizacional(), todosEstructuras));
            }
        }
        dependencyJobs.addAll(collectedSons);
        return dependencyJobs;
    }*/

    List<VEstructuraOrganizacional> recursiveEOSearch(Integer idCargo, List<VEstructuraOrganizacional> todosEstructuras) {
        List<VEstructuraOrganizacional> dependencyJobs = new ArrayList<>();
        List<VEstructuraOrganizacional> collectedSons = todosEstructuras.stream().filter(u -> u.getIdPadre() != null && u.getIdPadre().equals(idCargo)).collect(Collectors.toList());
        if (!collectedSons.isEmpty()) {
            for (VEstructuraOrganizacional c : collectedSons) {
                dependencyJobs.addAll(recursiveEOSearch(c.getIdEstructuraOrganizacional(), todosEstructuras));
            }
        }
        dependencyJobs.addAll(collectedSons);
        return dependencyJobs;
    }
}
