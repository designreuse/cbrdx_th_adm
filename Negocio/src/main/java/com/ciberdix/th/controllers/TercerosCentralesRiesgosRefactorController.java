package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
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
    TercerosCentralesRiesgos create(@RequestBody TercerosCentralesRiesgos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, TercerosCentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/file")
    TercerosCentralesRiesgos create(@RequestParam(name = "obj") String obj, @RequestParam(name = "file", required = false) MultipartFile file, HttpServletRequest request) throws JSONException, IOException {
        String test = businessURL + "/api/adjuntos";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        JSONObject jsonObject = new JSONObject(obj);
        String name = file.getOriginalFilename();
        String token = request.getHeader(tokenHeader);
        JSONObject jsonAdjuntos = new JSONObject();
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token);
        jsonAdjuntos.put("auditoriaUsuario", idUsuario);
        jsonAdjuntos.put("nombreArchivo", name);
        TercerosCentralesRiesgos tercerosCentralesRiesgos = new TercerosCentralesRiesgos();
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
        if (jsonObject.isNull("idTerceroCentralRiesgo")) {
            tercerosCentralesRiesgos.setIdTercero(jsonObject.getLong("idTercero"));
            tercerosCentralesRiesgos.setIdCentralRiesgo(jsonObject.getInt("idCentralRiesgo"));
            tercerosCentralesRiesgos.setIndicadorAprobado(jsonObject.getBoolean("indicadorAprobado"));
            tercerosCentralesRiesgos.setAuditoriaUsuario(idUsuario);
            tercerosCentralesRiesgos.setIndicadorReportado(jsonObject.getBoolean("indicadorReportado"));
            tercerosCentralesRiesgos.setIndicadorHabilitado(jsonObject.getBoolean("indicadorHabilitado"));
            tercerosCentralesRiesgos.setIdAdjunto(idAdjunto);
            return restTemplate.postForObject(serviceUrl, tercerosCentralesRiesgos, TercerosCentralesRiesgos.class);
        } else {
            tercerosCentralesRiesgos = restTemplate.getForObject(serviceUrl + "/" + jsonObject.getInt("idTerceroCentralRiesgo"), TercerosCentralesRiesgos.class);
            tercerosCentralesRiesgos.setIdAdjunto(idAdjunto);
            restTemplate.put(serviceUrl, tercerosCentralesRiesgos, TercerosCentralesRiesgos.class);
            return restTemplate.getForObject(serviceUrl + "/" + jsonObject.getInt("idTerceroCentralRiesgo"), TercerosCentralesRiesgos.class);
        }
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosCentralesRiesgos obj) {
        RestTemplate restTemplate = new RestTemplate();
        CentralesRiesgos c = restTemplate.getForObject(globales.getUrl() + "/api/centralesRiesgos/" + obj.getIdCentralRiesgo(),CentralesRiesgos.class);
        TercerosCentralesRiesgos tc = findOne(obj.getIdTerceroCentralRiesgo());
        if(!tc.getIndicadorReportado()){
            if(obj.getIndicadorReportado()){
                Constantes constantes = restTemplate.getForObject(globales.getUrl() + "/api/constantes/codigo/RESLRE",Constantes.class);
                Terceros t = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + obj.getIdTercero(),Terceros.class);
                VDivisionPoliticaRec d = restTemplate.getForObject(globales.getUrl() + "/api/divisionPolitica/buscarId/" + t.getIdCiudadExpDocumento(),VDivisionPoliticaRec.class);
                UtilitiesController.sendMail(constantes.getValor(), "Notificacion Reportado", "<h2>Buen día!</h2><p>Con el presente correo se verifica que en el proceso de selección la persona " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + " identificada con número de ciudadanía " + t.getNumeroDocumento() + " de " + d.getDescripcionDivisonPolitica() + ", se encuentra reportada en la central de riesgos " + c.getNombre() + ".</p><p>Verificar por favor su ingreso a listas restrictivas del sistema.</p><p>Muchas gracias.</p>");
            }
        }
        restTemplate.put(serviceUrl, obj);
    }
}
