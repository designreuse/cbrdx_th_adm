package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Adjuntos;
import com.ciberdix.th.storage.StorageService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/adjuntos")
public class AdjuntosRefactorController {

    private final StorageService storageService;
    Globales globales = new Globales();
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

    @RequestMapping(method = RequestMethod.GET, path = "/file/{id}")
    ResponseEntity<Resource> findFile(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Adjuntos adjuntos = restTemplate.getForObject(serviceUrl + "/" + id, Adjuntos.class);
        Resource file = storageService.loadAsResource(adjuntos.getAdjunto(), "adjuntos");
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + adjuntos.getNombreArchivo() + "\"")
                .body(file);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/preview/{id}")
    ResponseEntity<Resource> viewFile(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Adjuntos adjuntos = restTemplate.getForObject(serviceUrl + "/" + id, Adjuntos.class);
        Resource file = storageService.loadAsResource(adjuntos.getAdjunto(), "adjuntos");
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + adjuntos.getNombreArchivo() + "\"").body(file);
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

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Adjuntos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
