package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.Menus;
import org.springframework.beans.factory.annotation.Value;
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

    @RequestMapping(method = RequestMethod.GET)
    List<Menus> findAll() {
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        Menus[] menus = restTemplate.getForObject(serviceUrl, Menus[].class);
        return Arrays.asList(menus);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idMenu}")
    Menus findOne(@PathVariable Integer idMenu) {
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idMenu, Menus.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{idMenu}")
    List<Menus> findByParent(@PathVariable Integer idMenu) {
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        Menus[] menus = restTemplate.getForObject(serviceUrl + "buscarPadre/" + idMenu, Menus[].class);
        return Arrays.asList(menus);
    }

    @RequestMapping(method = RequestMethod.POST)
    Menus create(@RequestBody Menus menus) {
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, menus, Menus.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Menus menus) {
        String serviceUrl = baseUrl + "/api/menus/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, menus);
    }

}
