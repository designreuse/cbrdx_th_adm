package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Adjuntos;
import com.ciberdix.th.model.ProcesoSeleccionAdjuntos;
import com.ciberdix.th.model.TercerosEstudiosFormales;
import com.ciberdix.th.model.VTercerosEstudiosFormales;
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
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/tercerosEstudiosFormales")
@CrossOrigin
public class TercerosEstudiosFormalesRefactorController {

    @Value("${business.url}")
    String businessURL;

    String tokenHeader = "Authorization";

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosEstudiosFormales";

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosEstudiosFormales> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosEstudiosFormales[] parametros = restTemplate.getForObject(serviceUrl, TercerosEstudiosFormales[].class);
        return Arrays.asList(parametros);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    TercerosEstudiosFormales create(@RequestBody TercerosEstudiosFormales request) {
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.postForObject(serviceUrl, request, TercerosEstudiosFormales.class);
//    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosEstudiosFormales create(@RequestParam(name = "obj") String obj, @RequestParam(name = "file", required = false) MultipartFile file, HttpServletRequest request) throws JSONException, ParseException {
        String test = businessURL + "/api/adjuntos";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        JSONObject jsonObject = new JSONObject(obj);
        String token = request.getHeader(tokenHeader);
        JSONObject jsonAdjuntos = new JSONObject();
        Integer idUsuario = jwtTokenUtil.getIdUsernameFromToken(token);
        jsonAdjuntos.put("auditoriaUsuario", idUsuario);
        jsonAdjuntos.put("nombreArchivo", jsonObject.getString("nombre"));
        TercerosEstudiosFormales tercerosEstudiosFormales = new TercerosEstudiosFormales();
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
        if (jsonObject.isNull("idTerceroEstudioFormal")) {
            tercerosEstudiosFormales.setIdAdjunto(idAdjunto);
            tercerosEstudiosFormales.setAuditoriaUsuario(idUsuario);
            tercerosEstudiosFormales.setIdTercero(jsonObject.getLong("idTercero"));
            tercerosEstudiosFormales.setIdNivelEstudio(jsonObject.getInt("idNivelEstudio"));
            tercerosEstudiosFormales.setIdAreaEstudio(jsonObject.getInt("idAreaEstudio"));
            tercerosEstudiosFormales.setTituloEstudio(jsonObject.getString("tituloEstudio"));
            tercerosEstudiosFormales.setIdInstitucion(jsonObject.getInt("idInstitucion"));
            tercerosEstudiosFormales.setOtraInstitucion(jsonObject.getString("otraInstitucion"));
            tercerosEstudiosFormales.setIdCiudad(jsonObject.getInt("idCiudad"));
            tercerosEstudiosFormales.setIdEstado(jsonObject.getInt("idEstado"));
            tercerosEstudiosFormales.setFechaIngresa(Date.valueOf(jsonObject.getString("fechaIngresa")));
            tercerosEstudiosFormales.setFechaTermina(Date.valueOf((jsonObject.getString("fechaTermina")));
            tercerosEstudiosFormales.setIndicadorHabilitado(jsonObject.getBoolean("indicadorHabilitado"));
            tercerosEstudiosFormales.setIndicadorVerificado(jsonObject.getBoolean("indicadorVerificado"));
            tercerosEstudiosFormales.setFechaVerificado(Timestamp.valueOf(jsonObject.getString("fechaIngresa")));
            return restTemplate.postForObject(serviceUrl, tercerosEstudiosFormales, TercerosEstudiosFormales.class);
        } else {
            tercerosEstudiosFormales = restTemplate.getForObject(serviceUrl + "/" + jsonObject.getInt("idTerceroEstudioFormal"), TercerosEstudiosFormales.class);
            tercerosEstudiosFormales.setIdAdjunto(idAdjunto);
            restTemplate.put(serviceUrl, tercerosEstudiosFormales, TercerosEstudiosFormales.class);
            return restTemplate.getForObject(serviceUrl + "/" + jsonObject.getInt("idTerceroEstudioFormal"), TercerosEstudiosFormales.class);
        }
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosEstudiosFormales request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosEstudiosFormales.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTercero}")
    VTercerosEstudiosFormales findOne(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosEstudiosFormales parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idTercero, VTercerosEstudiosFormales.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosEstudiosFormales> findForTercero(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosEstudiosFormales[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + idTercero, VTercerosEstudiosFormales[].class);
        return Arrays.asList(parametros);
    }
}
