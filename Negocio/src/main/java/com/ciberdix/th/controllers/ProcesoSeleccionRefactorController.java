package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ObjetoProcesoSeleccion;
import com.ciberdix.th.model.ProcesoSeleccion;
import com.ciberdix.th.model.Terceros;
import com.ciberdix.th.model.VProcesoSeleccion;
import com.ciberdix.th.storage.StorageService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesoSeleccion")
public class ProcesoSeleccionRefactorController {

    private final StorageService storageService;
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesoSeleccion";

    @Autowired
    public ProcesoSeleccionRefactorController(StorageService storageService) {
        this.storageService = storageService;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccion> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccion[] cargosCompetencias = restTemplate.getForObject(serviceUrl, VProcesoSeleccion[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idProcesoSeleccion}")
    VProcesoSeleccion findOne(@PathVariable Integer idProcesoSeleccion) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + idProcesoSeleccion, VProcesoSeleccion.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroPublicacion/{idPublicacion}")
    List<ObjetoProcesoSeleccion> findMalla(@PathVariable Integer idPublicacion) throws JSONException {
        RestTemplate restTemplate = new RestTemplate();
        Long idTercero;
        VProcesoSeleccion[] param = restTemplate.getForObject(serviceUrl + "/publicacion/" + idPublicacion, VProcesoSeleccion[].class);

        ArrayList<ObjetoProcesoSeleccion> OPS = new ArrayList<>();

        idTercero = param[0].getIdTercero();

        Terceros ter = restTemplate.getForObject(globales.getUrl() + "api/terceros/" + idTercero, Terceros.class);



        VProcesoSeleccion[] param1 = restTemplate.getForObject(serviceUrl + "/terceroPublicacion/" + idPublicacion + "/" + idTercero, VProcesoSeleccion[].class);

        return OPS;
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccion create(@RequestBody ProcesoSeleccion obj, @RequestParam("file") MultipartFile file, HttpServletRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        String avatarGuardado = storageService.store(file, "procesoSeleccion");
        obj.setAdjunto(avatarGuardado);
        return restTemplate.postForObject(serviceUrl, obj, ProcesoSeleccion.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccion obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
