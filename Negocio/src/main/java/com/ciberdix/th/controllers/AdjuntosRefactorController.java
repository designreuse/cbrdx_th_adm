package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Adjuntos;
import com.ciberdix.th.storage.StorageException;
import com.ciberdix.th.storage.StorageService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/adjuntos")
public class AdjuntosRefactorController {

    Globales globales = new Globales();
    private final StorageService storageService;
    private String serviceUrl = globales.getUrl() + "/api/adjuntos";

    @Autowired
    public AdjuntosRefactorController(StorageService storageService) {
        this.storageService = storageService;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Adjuntos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Adjuntos[] parametros = restTemplate.getForObject(serviceUrl, Adjuntos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Adjuntos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, Adjuntos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    Adjuntos create(@RequestParam("obj") String obj, @RequestParam("file") MultipartFile file) {
        try {

            JSONObject jsonObject = new JSONObject(obj);
            Adjuntos adjuntos = new Adjuntos();
            adjuntos.setAuditoriaUsuario(jsonObject.getInt("auditoriaUsuario"));
            adjuntos.setNombreArchivo(jsonObject.getString("nombreArchivo"));
            RestTemplate restTemplate = new RestTemplate();
            String temp = storageService.store(file, "adjuntos");
            adjuntos.setAdjunto(temp);
            return restTemplate.postForObject(serviceUrl, adjuntos, Adjuntos.class);
        } catch (JSONException e) {
            return null;
        }
    }


//    @RequestMapping(method = RequestMethod.POST)
//    ProcesoSeleccion create(@RequestBody ProcesoSeleccion obj, @RequestParam("file") MultipartFile file, HttpServletRequest request) {
//        RestTemplate restTemplate = new RestTemplate();
//        String avatarGuardado = storageService.store(file, "procesoSeleccion");
//        obj.setAdjunto(avatarGuardado);
//        return restTemplate.postForObject(serviceUrl, obj, ProcesoSeleccion.class);
//    }


    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Adjuntos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
