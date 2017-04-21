package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.Menus;
import com.ciberdix.th.security.JwtTokenUtil;
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
@RequestMapping("/api/menus")
@CrossOrigin
public class MenusRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('GERENTE,ADMINISTRADOR,JEFEAREA,ADMDIMORG')")
    List<Menus> findAll() {
        System.out.print(jwtTokenUtil.getAuthorities().toString());
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        Menus[] menus = restTemplate.getForObject(serviceUrl, Menus[].class);
        return Arrays.asList(menus);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idMenu}")
    @PreAuthorize("hasAnyRole('GERENTE,ADMINISTRADOR,JEFEAREA,ADMDIMORG')")
    Menus findOne(@PathVariable Integer idMenu) {
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idMenu, Menus.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{idMenu}")
    @PreAuthorize("hasAnyRole('GERENTE,ADMINISTRADOR,JEFEAREA,ADMDIMORG')")
    List<Menus> findByParent(@PathVariable Integer idMenu) {
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        Menus[] menus = restTemplate.getForObject(serviceUrl + "buscarPadre/" + idMenu, Menus[].class);
        return Arrays.asList(menus);
    }

    @RequestMapping(method = RequestMethod.POST)
    @PreAuthorize("hasRole('ADMINISTRADOR')")
    Menus create(@RequestBody Menus menus) {
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, menus, Menus.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @PreAuthorize("hasRole('ADMINISTRADOR')")
    void update(@RequestBody Menus menus) {
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, menus);
    }

}
