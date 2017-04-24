package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.Roles;
import com.ciberdix.th.model.refactor.VUsuarioRolesCantidad;
import com.ciberdix.th.security.JwtTokenUtil;
import com.ciberdix.th.security.abac.policy.spring.ContextAwarePolicyEnforcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by felip on 19/04/2017.
 */
@RestController
@RequestMapping("/api/roles")
@CrossOrigin
public class RolesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    //@Autowired
    //private ContextAwarePolicyEnforcement policy;

    @RequestMapping(method = RequestMethod.GET)
    List<Roles> findAll() {
        String serviceUrl = baseUrl + "/api/roles/";
        RestTemplate restTemplate = new RestTemplate();
        Roles[] parametros = restTemplate.getForObject(serviceUrl, Roles[].class);
        //policy.checkPermission(null, "LISTAR");
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/usuario/{idUsuario}")
    List<Roles> findUsuario(@PathVariable Integer idUsuario) {
        String serviceUrl = baseUrl + "/api/roles/";
        RestTemplate restTemplate = new RestTemplate();
        Roles[] parametros = restTemplate.getForObject(serviceUrl + "usuario/" + idUsuario, Roles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/dashboard/")
    List<VUsuarioRolesCantidad> findDashboard() {
        String serviceUrl = baseUrl + "/api/roles/";
        RestTemplate restTemplate = new RestTemplate();
        VUsuarioRolesCantidad[] parametros = restTemplate.getForObject(serviceUrl + "dashboard/", VUsuarioRolesCantidad[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Roles create(@RequestBody Roles request) {
        String serviceUrl = baseUrl + "/api/roles/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Roles.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Roles request) {
        String serviceUrl = baseUrl + "/api/roles/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Roles.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    Roles findOne(@PathVariable Integer IdParametro) {
        String serviceUrl = baseUrl + "/api/roles/";
        RestTemplate restTemplate = new RestTemplate();
        Roles parametro = restTemplate.getForObject(serviceUrl + IdParametro, Roles.class);
        return parametro;
    }
}
