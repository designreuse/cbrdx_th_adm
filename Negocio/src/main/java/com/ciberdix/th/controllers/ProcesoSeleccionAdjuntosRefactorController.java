package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Adjuntos;
import com.ciberdix.th.model.ProcesoSeleccionAdjuntos;
import com.ciberdix.th.model.VProcesoSeleccionAdjuntos;
import com.ciberdix.th.security.JwtTokenUtil;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/procesoSeleccionAdjuntos")
public class ProcesoSeleccionAdjuntosRefactorController {

    @Value("${business.url}")
    String businessURL;

    String tokenHeader = "Authorization";

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesoSeleccionAdjuntos";

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccionAdjuntos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionAdjuntos[] parametros = restTemplate.getForObject(serviceUrl, VProcesoSeleccionAdjuntos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProcesoSeleccionAdjuntos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VProcesoSeleccionAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terPublicPaso/{idTerceroPublicacion}/{idProcesoPaso}")
    List<VProcesoSeleccionAdjuntos> findByTerPublicPaso(@PathVariable Integer idTerceroPublicacion, @PathVariable Integer idProcesoPaso) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionAdjuntos[] parametros = restTemplate.getForObject(serviceUrl + "/terPublicPaso/" + idTerceroPublicacion + "/" + idProcesoPaso, VProcesoSeleccionAdjuntos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccionAdjuntos create(@RequestParam(name = "obj") String obj, @RequestParam(name = "file", required = false) MultipartFile file, HttpServletRequest request) throws JSONException {
        String test = businessURL + "/api/adjuntos";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        JSONObject jsonObject = new JSONObject(obj);
        String token = request.getHeader(tokenHeader);
        JSONObject jsonAdjuntos = new JSONObject();
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token);
        jsonAdjuntos.put("auditoriaUsuario", idUsuario);
        jsonAdjuntos.put("nombreArchivo", jsonObject.getString("nombre"));
        ProcesoSeleccionAdjuntos procesoSeleccionAdjuntos = new ProcesoSeleccionAdjuntos();
        httpHeaders.set(tokenHeader, token);
        httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(parts, httpHeaders);
        String tipo = "." + FilenameUtils.getExtension(file.getOriginalFilename());
        File tempFile = null;
        try {
            tempFile = File.createTempFile("temp", tipo);
            file.transferTo(tempFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        parts.add("file", new FileSystemResource(tempFile));
        parts.add("obj", jsonAdjuntos.toString());
        ResponseEntity<Adjuntos> responseEntity = restTemplate.exchange(test, HttpMethod.POST, requestEntity, Adjuntos.class, requestEntity);
        Integer idAdjunto = responseEntity.getBody().getIdAdjunto();
        if (jsonObject.isNull("idProcesoSeleccionAdjunto")) {
            procesoSeleccionAdjuntos.setIdAdjunto(idAdjunto);
            procesoSeleccionAdjuntos.setAuditoriaUsuario(idUsuario);
            procesoSeleccionAdjuntos.setIdProcesoPaso(jsonObject.getInt("idProcesoPaso"));
            procesoSeleccionAdjuntos.setIdTerceroPublicacion(jsonObject.getInt("idTerceroPublicacion"));
            return restTemplate.postForObject(serviceUrl, procesoSeleccionAdjuntos, ProcesoSeleccionAdjuntos.class);
        } else {
            procesoSeleccionAdjuntos = restTemplate.getForObject(serviceUrl + "/" + jsonObject.getInt("idProcesoSeleccionAdjunto"), ProcesoSeleccionAdjuntos.class);
            procesoSeleccionAdjuntos.setIdAdjunto(idAdjunto);
            restTemplate.put(serviceUrl, procesoSeleccionAdjuntos, ProcesoSeleccionAdjuntos.class);
            return restTemplate.getForObject(serviceUrl + "/" + jsonObject.getInt("idProcesoSeleccionAdjunto"), ProcesoSeleccionAdjuntos.class);
        }
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccionAdjuntos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
