package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Adjuntos;
import com.ciberdix.th.storage.StorageService;
import org.apache.commons.io.FilenameUtils;
import org.apache.tika.parser.ParseContext;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/adjuntos")
public class AdjuntosRefactorController {

    private final StorageService storageService;

    @Value("${front.address}")
    String frontAddress;

    @Value("${mule.url}")
    String muleUrl;

    @Value("${business.port}")
    String businessPort;

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

//    @RequestMapping(method = RequestMethod.GET, path = "/preview/{id}")
//    ResponseEntity<Resource> previsualizar(@PathVariable String id) throws IOException {
//        RestTemplate restTemplate = new RestTemplate();
//        Adjuntos adjunto = restTemplate.getForObject(serviceUrl + "/" + id, Adjuntos.class);
//        Resource result = restTemplate.getForObject(muleUrl + "/getFile?nodeRef=" + adjunto.getIdAlfresco(), ByteArrayResource.class);
//
//        return ResponseEntity.ok()
//                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + adjunto.getNombreArchivo() + "\"")
//                .header(HttpHeaders.CONTENT_TYPE, getMimeType(adjunto, result).get(Metadata.CONTENT_TYPE))
//                .body(result);
//    }

    @RequestMapping(method = RequestMethod.GET, path = "/file/{id}")
    ResponseEntity<Resource> descargarArchivo(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        Adjuntos adjunto = restTemplate.getForObject(serviceUrl + "/" + id, Adjuntos.class);
        Resource result = restTemplate.getForObject(muleUrl + "/getFile?nodeRef=" + adjunto.getIdAlfresco(), ByteArrayResource.class);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + adjunto.getNombreArchivo() + "\"")
                .header(HttpHeaders.CONTENT_TYPE, getMimeType(adjunto, result).get(Metadata.CONTENT_TYPE))
                .body(result);
    }

    @RequestMapping(method = RequestMethod.POST)
    Adjuntos create(@RequestParam("obj") String obj, @RequestParam("file") MultipartFile file, @RequestHeader MultiValueMap<String, String> rawHeaders) {
        try {
            JSONObject jsonObject = new JSONObject(obj);
            Adjuntos adjuntos = new Adjuntos();
            adjuntos.setAuditoriaUsuario(jsonObject.getInt("auditoriaUsuario"));
            adjuntos.setNombreArchivo(jsonObject.getString("nombreArchivo"));
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();

            headers.putAll(rawHeaders);

            MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

            if (!file.isEmpty()) {
                UUID fileName = UUID.randomUUID();
                String tipo = FilenameUtils.getExtension(file.getOriginalFilename());

                map.add("name", fileName + "." + tipo);
                map.add("filename", fileName + "." + tipo);

                ByteArrayResource contentsAsResource = null;
                try {
                    contentsAsResource = new ByteArrayResource(file.getBytes()) {
                        @Override
                        public String getFilename() {
                            return fileName + "." + tipo;
                        }
                    };
                } catch (IOException e) {
                    e.printStackTrace();
                }

                map.add("file", contentsAsResource);
                map.add("dirpath", jsonObject.getString("ruta")); //"/alguna/carpeta");
                map.add("mime-type", file.getContentType());

                adjuntos.setAdjunto(fileName + "." + tipo);
            }

            HttpEntity<?> requestEntity = new HttpEntity<Object>(map, headers);

            String temp = restTemplate.postForObject(muleUrl + "/uploadFile", requestEntity, String.class);
            JSONObject tempFile = new JSONObject(temp);
            adjuntos.setIdAlfresco(tempFile.getString("id"));
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

    private Metadata getMimeType(Adjuntos adj, Resource result){
        Metadata metadata = new Metadata();

        try {
            ContentHandler contenthandler = new BodyContentHandler();
            metadata.set(Metadata.RESOURCE_NAME_KEY, adj.getNombreArchivo());
            Parser parser = new AutoDetectParser();
            ParseContext pc = new ParseContext();
            parser.parse(result.getInputStream(), contenthandler, metadata, pc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return metadata;
    }

}
