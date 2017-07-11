package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import com.ciberdix.th.security.JwtTokenUtil;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesoSeleccionPruebasTecnicas")
public class ProcesoSeleccionPruebasTecnicasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesoSeleccionPruebasTecnicas";

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccionPruebasTecnicas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionPruebasTecnicas[] parametros = restTemplate.getForObject(serviceUrl, VProcesoSeleccionPruebasTecnicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProcesoSeleccionPruebasTecnicas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VProcesoSeleccionPruebasTecnicas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProcesoSeleccionPruebasTecnicas> findByIndicadorHabTrue() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionPruebasTecnicas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", VProcesoSeleccionPruebasTecnicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoSeleccion/{id}")
    List<VProcesoSeleccionPruebasTecnicas> findByIdProcesoSeleccion(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionPruebasTecnicas[] parametros = restTemplate.getForObject(serviceUrl + "/procesoSeleccion/" + id, VProcesoSeleccionPruebasTecnicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoSeleccion/{id}/inicializar/{idTerceroPublicacion}")
    List<VProcesoSeleccionPruebasTecnicas> findByIdProcesoSeleccion(@PathVariable Integer id, @PathVariable Integer idTerceroPublicacion, HttpServletRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        String token = UtilitiesController.extractToken(request);
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token);
        TercerosPublicaciones data = restTemplate.getForObject(globales.getUrl() + "/api/tercerosPublicaciones/" + idTerceroPublicacion, TercerosPublicaciones.class);
        Publicaciones pubData = restTemplate.getForObject(globales.getUrl() + "/api/publicaciones/" + data.getIdPublicacion(), Publicaciones.class);
        List<RequerimientosCuestionarios> reqData = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "/api/requerimientosCuestionarios/requerimientos/" + pubData.getIdRequerimiento(), RequerimientosCuestionarios[].class));
        for (RequerimientosCuestionarios reqCue : reqData) {
            ProcesoSeleccionPruebasTecnicas testData = new ProcesoSeleccionPruebasTecnicas();
            testData.setIdProcesoSeleccion(id);
            testData.setIndicadorHabilitado(true);
            testData.setAuditoriaUsuario(idUsuario);
            testData.setIdPruebaTecnica(reqCue.getIdCuestionario());
            restTemplate.postForObject(serviceUrl, testData, ProcesoSeleccionPruebasTecnicas.class);
        }
        VProcesoSeleccionPruebasTecnicas[] parametros = restTemplate.getForObject(serviceUrl + "/procesoSeleccion/" + id, VProcesoSeleccionPruebasTecnicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/pruebaTecnica/{id}")
    List<VProcesoSeleccionPruebasTecnicas> findByIdPruebaTecnica(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionPruebasTecnicas[] parametros = restTemplate.getForObject(serviceUrl + "/pruebaTecnica/" + id, VProcesoSeleccionPruebasTecnicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccionPruebasTecnicas create(@RequestBody ProcesoSeleccionPruebasTecnicas o) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, ProcesoSeleccionPruebasTecnicas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccionPruebasTecnicas o) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

}
