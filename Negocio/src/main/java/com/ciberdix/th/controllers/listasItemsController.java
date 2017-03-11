package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ListasItems;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/listasItems")
public class listasItemsController {

    private String serviceUrl = "http://localhost:8445/listasItems/";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasItems> getLists() {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parametros = restTemplate.getForObject(serviceUrl, ListasItems[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasItems createList(@RequestBody ListasItems request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasItems.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateList(@RequestBody ListasItems request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasItems.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idListaItem}")
    ListasItems getList(@PathVariable Integer idListaItem) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idListaItem, ListasItems.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/lista/{idLista}")
    List<ListasItems> getOthers(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parametros = restTemplate.getForObject(serviceUrl + "/lista/" + idLista, ListasItems[].class);
        return Arrays.asList(parametros);
    }
}