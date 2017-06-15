package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Constantes;
import com.ciberdix.th.model.VConstantes;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/constantes")
public class ConstantesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "api/constantes/";

    @RequestMapping(method = RequestMethod.GET)
    List<VConstantes> list() {
        RestTemplate restTemplate = new RestTemplate();
        VConstantes[] Constantes = restTemplate.getForObject(serviceUrl, VConstantes[].class);

        return Arrays.asList(Constantes);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    VConstantes getOne(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VConstantes actividad = restTemplate.getForObject(serviceUrl + id, VConstantes.class);

        return actividad;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/codigo/{codigo}")
    VConstantes findByCodigo(@PathVariable String codigo) {
        RestTemplate restTemplate = new RestTemplate();
        VConstantes actividad = restTemplate.getForObject(serviceUrl + "codigo/" + codigo, VConstantes.class);

        return actividad;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/codigos")
    ArrayList<VConstantes> constantes() {
        RestTemplate restTemplate = new RestTemplate();
        ArrayList<VConstantes> constantes = new ArrayList<>();
        constantes.add(restTemplate.getForObject(serviceUrl + "/codigo/" + "APLNMO", VConstantes.class));
        constantes.add(restTemplate.getForObject(serviceUrl + "/codigo/" + "APLBON", VConstantes.class));
        return constantes;
    }

    @RequestMapping(method = RequestMethod.POST)
    Constantes create(@RequestBody Constantes obj) {
        RestTemplate restTemplate = new RestTemplate();
        Constantes tercero = restTemplate.postForObject(serviceUrl, obj, Constantes.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Constantes obj) {
        RestTemplate restTemplate = new RestTemplate();
        Constantes uObj = restTemplate.getForObject(serviceUrl + "/" + obj.getIdConstante(), Constantes.class);

        uObj.setIdConstante(obj.getIdConstante());
        uObj.setAuditoriaUsuario(obj.getAuditoriaUsuario());
        uObj.setDescripcion(obj.getDescripcion());
        uObj.setIdTipoDato(obj.getIdTipoDato());
        uObj.setIndicadorHabilitado(obj.getIndicadorHabilitado());
        uObj.setValor(obj.getValor());

        restTemplate.put(serviceUrl, uObj);
    }
}
