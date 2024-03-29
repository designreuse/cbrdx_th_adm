package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Listas;
import com.ciberdix.th.model.ListasItems;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/listas")
public class ListasRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "api/";

    @RequestMapping(method = RequestMethod.GET)
    List<Listas> listarGeneros() {
        RestTemplate restTemplate = new RestTemplate();
        Listas[] generos = restTemplate.getForObject(serviceUrl + "listas/", Listas[].class);
        return Arrays.asList(generos);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarId/{idLista}")
    Listas findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "listas/buscarId/" + idLista, Listas.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/")
    List<ListasItems> findOne(@PathVariable String tableName) {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + tableName, ListasItems[].class);
        return Arrays.asList(parameter);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/idItem/{idItem}")
    ListasItems findOne(@PathVariable String tableName, @PathVariable Integer idItem) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + tableName + "/" + idItem, ListasItems.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/enabled/")
    List<ListasItems> findEnabled(@PathVariable String tableName) {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + tableName + "/enabled/", ListasItems[].class);
        return Arrays.asList(parameter);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/code/{queryString}")
    ListasItems findByCode(@PathVariable String tableName, @PathVariable String queryString) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + tableName + "/code/" + queryString + "/", ListasItems.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/codeStarts/{queryString}")
    List<ListasItems> findByCodeStarts(@PathVariable String tableName, @PathVariable String queryString) {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + tableName + "/codeStarts/" + queryString + "/", ListasItems[].class);
        return Arrays.asList(parameter);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/name/{queryString}")
    List<ListasItems> findByName(@PathVariable String tableName, @PathVariable String queryString) {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + tableName + "/name/" + queryString + "/", ListasItems[].class);
        return Arrays.asList(parameter);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tabla/{tableName}/")
    ListasItems createItem(@PathVariable String tableName, @RequestBody ListasItems listasItems) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl + "/" + tableName, listasItems, ListasItems.class);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/tabla/{tableName}/")
    void updateItem(@PathVariable String tableName, @RequestBody ListasItems listasItems) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/" + tableName, listasItems);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Listas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "listas/", obj);
    }
}