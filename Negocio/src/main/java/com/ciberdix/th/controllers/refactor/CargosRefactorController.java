package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Cargos;
import com.ciberdix.th.model.refactor.VCargos;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargos")
@Api(value = "cargos", description = "Cargos")
public class CargosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargos";

    @RequestMapping(method = RequestMethod.GET)
    List<VCargos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCargos[] parametros = restTemplate.getForObject(serviceUrl, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCargos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/wildcard/{query}")
    List<VCargos> findByWildCard(@PathVariable String query) {
        RestTemplate restTemplate = new RestTemplate();
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/wildcard/" + query, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Cargos create(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Cargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab1")
    void updateTab1(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab1", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab2")
    void updateTab2(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab2", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab3")
    void updateTab3(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab3", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab4")
    void updateTab4(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab4", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab5")
    void updateTab5(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab5", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab6")
    void updateTab6(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab6", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab7")
    void updateTab7(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab7", obj);
    }
}
