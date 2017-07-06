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

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/estructuraOrganizacional")
public class EstructuraOrganizacionalRefactorController {

    @Value("${business.url}")
    String businessURL;

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
        RestTemplate restTemplate = new RestTemplate();
        String token = UtilitiesController.extractToken(request); //Extraccion del Token desde el Request
        String businessServiceURL = businessURL + "/api/"; //Composicion de BaseURL para Servicios de Logica
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token); //Encabezados para Request con Autenticación de Logica
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        Collection<?> userRoles = jwtTokenUtil.getAuthorities(); //Extraccion de Nombres de ROLE_ Asignados
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token); //Id de Usuario Conectado
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders); //Entidad de Solicitud Autentica (HeaderOnly)
        String roleCodes = UtilitiesController.findConstant("ROLARB").getValor();
        String[] rolesCodes = roleCodes.split(",");
        StringBuilder sb = new StringBuilder();
        for (String str : rolesCodes) {
            sb.append(restTemplate.exchange(businessServiceURL + "roles/rol/" + str, HttpMethod.GET, requestEntity, Roles.class, requestEntity).getBody().getRol());
            sb.append(",");
        }
        String resultRoles = sb.toString();
        boolean isManager = userRoles.stream().anyMatch(r -> resultRoles.contains(r.toString()));
        List<VEstructuraOrganizacional> organizationalFullList = Arrays.asList(restTemplate.exchange(globales.getUrl() + "/api/estructuraOrganizacional/enabled/", HttpMethod.GET, requestEntity, VEstructuraOrganizacional[].class, requestEntity).getBody());
        List<VEstructuraOrganizacional> returnList;
        if (isManager) {
            returnList = organizationalFullList;
        } else {
            Long idTercero = restTemplate.exchange(businessServiceURL + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity).getBody().getIdTercero();
            Integer idEstructuraOrganizacionalCargo = restTemplate.exchange(businessServiceURL + "tercerosCargos/tercero/" + idTercero, HttpMethod.GET, requestEntity, TercerosCargos.class, requestEntity).getBody().getIdEstructuraOrganizacionalCargo();
            Integer idEstructuraOrganizacional = restTemplate.exchange(businessServiceURL + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity).getBody().getIdEstructuraOrganizacional();
            VEstructuraOrganizacional out = restTemplate.exchange(businessServiceURL + "estructuraOrganizacional/" + idEstructuraOrganizacional, HttpMethod.GET, requestEntity, VEstructuraOrganizacional.class, requestEntity).getBody();
            out.setIdPadre(0);
            returnList = UtilitiesController.organizationalStructureRecursiveCascade(idEstructuraOrganizacional, organizationalFullList);
            returnList.add(out);
        }
        return returnList;
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
}
