package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ListasItems;
import com.ciberdix.th.model.RequerimientosAcciones;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Danny on 16/05/2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/requerimientosAcciones")
public class RequerimientosAccionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${front.url}")
    private String frontUrl;

    @Value("${business.url}")
    private String businessUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<RequerimientosAcciones> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        List<RequerimientosAcciones> requerimientosAcciones = Arrays.asList(restTemplate.getForObject(serviceUrl, RequerimientosAcciones[].class));
        return requerimientosAcciones;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RequerimientosAcciones findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, RequerimientosAcciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosAcciones create(@RequestBody RequerimientosAcciones o) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();

        ListasItems listasItems = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasRequerimientosAcciones/code/SOLAUT", ListasItems.class);
        if (o.getIdAccion().equals(listasItems.getIdLista())) {
            Map<String, Object> map = new HashMap<>();
            map.put("URL", "/vacancies/approve/" + o.getIdRequerimiento());
            String token = Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS512, "fdsldfjklfjsld73647364").compact();
            String body = "Se ha creado un requerimiento de personal que requiere su aprobacion: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <a href=\"" + frontUrl + "/login/" + token + "\">" + frontUrl + "/login/" + token + "</a>";
            UtilitiesController.sendMail("angel.luna@ciberdix.com", "Aprobacion", body);
        }
        return restTemplate.postForObject(serviceUrl, o, RequerimientosAcciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosAcciones o) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }
}
