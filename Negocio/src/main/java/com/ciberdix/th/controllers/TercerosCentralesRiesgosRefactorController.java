package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Adjuntos;
import com.ciberdix.th.model.TercerosCentralesRiesgos;
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
 * Created by Danny on 13/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/tercerosCentralesRiesgos")
public class TercerosCentralesRiesgosRefactorController {

    @Value("${business.url}")
    String businessURL;

    String tokenHeader = "Authorization";
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosCentralesRiesgos";

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosCentralesRiesgos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosCentralesRiesgos[] parametros = restTemplate.getForObject(serviceUrl, TercerosCentralesRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosCentralesRiesgos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, TercerosCentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosCentralesRiesgos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosCentralesRiesgos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", TercerosCentralesRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{idTercero}")
    List<TercerosCentralesRiesgos> findByIdTercero(@PathVariable Long idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosCentralesRiesgos[] parametros = restTemplate.getForObject(serviceUrl + "/tercero/" + idTercero, TercerosCentralesRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosCentralesRiesgos create(@RequestParam(name = "obj") String obj, @RequestParam(name = "file", required = false) MultipartFile file, HttpServletRequest request) throws JSONException, IOException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();

        String name = file.getOriginalFilename();
        String token = request.getHeader(tokenHeader);
        JSONObject jsonObject = new JSONObject(obj);
        JSONObject jsonAdjuntos = new JSONObject();
        Integer idUsuario = jwtTokenUtil.getIdUsernameFromToken(token);
        jsonAdjuntos.put("auditoriaUsuario", idUsuario);
        jsonAdjuntos.put("nombreArchivo", name);
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
        TercerosCentralesRiesgos tercerosCentralesRiesgos = new TercerosCentralesRiesgos();
        tercerosCentralesRiesgos.setIdTercero(jsonObject.getLong("idTercero"));
        tercerosCentralesRiesgos.setIdCentralRiesgo(jsonObject.getInt("idCentralRiesgo"));
        tercerosCentralesRiesgos.setindicadorAprobado(jsonObject.getBoolean("indicadorAprobado"));
        tercerosCentralesRiesgos.setAuditoriaUsuario(idUsuario);
        tercerosCentralesRiesgos.setIndicadorReportado(jsonObject.getBoolean("indicadorReportado"));
        tercerosCentralesRiesgos.setIndicadorHabilitado(jsonObject.getBoolean("indicadorHabilitado"));
        //restTemplate.postForObject(globales.getUrl() + "/api/adjuntos", requestEntity, Adjuntos.class);
        String test = businessURL + "/api/adjuntos";
        ResponseEntity<Adjuntos> responseEntity = restTemplate.exchange(test, HttpMethod.POST, requestEntity, Adjuntos.class, requestEntity);
        Integer idAdjunto = responseEntity.getBody().getIdAdjunto();
        tercerosCentralesRiesgos.setIdAdjunto();
        return restTemplate.postForObject(serviceUrl, tercerosCentralesRiesgos, TercerosCentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosCentralesRiesgos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
