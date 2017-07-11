package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Danny on 16/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/institucionesMedicas")
public class InstitucionesMedicasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/institucionesMedicas";

    @RequestMapping(method = RequestMethod.GET)
    List<VInstitucionesMedicas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VInstitucionesMedicas[] parametros = restTemplate.getForObject(serviceUrl, VInstitucionesMedicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VInstitucionesMedicas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VInstitucionesMedicas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VInstitucionesMedicas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VInstitucionesMedicas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", VInstitucionesMedicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacion/{idPublicacion}")
    List<VInstitucionesMedicas> findProcess(@PathVariable Integer idPublicacion) {
        RestTemplate restTemplate = new RestTemplate();
        Publicaciones pubData = restTemplate.getForObject(globales.getUrl() + "/api/publicaciones/" + idPublicacion, Publicaciones.class);
        Requerimientos reqData = restTemplate.getForObject(globales.getUrl() + "/api/requerimientos/" + pubData.getIdRequerimiento(), Requerimientos.class);
        if (reqData.getIdEstructuraFisica() != null) {
            VInstitucionesMedicasEstructurasFisicas[] parametros = restTemplate.getForObject(globales.getUrl() + "/api/institucionesMedicasEstructurasFisicas/estructuraFisica/" + reqData.getIdEstructuraFisica(), VInstitucionesMedicasEstructurasFisicas[].class);
            VInstitucionesMedicas[] fullData = restTemplate.getForObject(serviceUrl, VInstitucionesMedicas[].class);
            List<VInstitucionesMedicas> returnData = Arrays.asList(fullData);
            returnData = returnData.stream().filter(t -> Arrays.stream(parametros).anyMatch(f -> f.getIdInstitucionMedica().equals(t.getIdInstitucionMedica()))).collect(Collectors.toList());
            return returnData;
        } else {
            VInstitucionesMedicas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", VInstitucionesMedicas[].class);
            return Arrays.asList(parametros);
        }

    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicas create(@RequestBody InstitucionesMedicas obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, InstitucionesMedicas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
