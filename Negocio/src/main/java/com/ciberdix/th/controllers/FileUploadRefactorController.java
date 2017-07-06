package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Terceros;
import com.ciberdix.th.model.Usuarios;
import com.ciberdix.th.security.JwtTokenUtil;
import com.ciberdix.th.storage.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by robertochajin on 25/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/upload")
public class FileUploadRefactorController {

    private final Logger logger = LoggerFactory.getLogger(FileUploadRefactorController.class);
    private final StorageService storageService;

    @Value("${domain.url}")
    private String serviceUrl;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    public FileUploadRefactorController(StorageService storageService) {
        this.storageService = storageService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> handleFileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String authToken = request.getHeader("Authorization");
        int id = jwtTokenUtil.getUserIdFromToken(authToken);
        RestTemplate restTemplate = new RestTemplate();
        Usuarios usuario = restTemplate.getForObject(serviceUrl + "/api/usuarios/query/" + id, Usuarios.class);
        Terceros tercero = restTemplate.getForObject(serviceUrl + "/api/terceros/" + usuario.getIdTercero(), Terceros.class);
        String avatarGuardado = storageService.store(file);
        tercero.setImagen(avatarGuardado);
        restTemplate.put(serviceUrl + "api/terceros", tercero);
        return ResponseEntity.ok(avatarGuardado);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{idTercero}")
    public ResponseEntity<?> handleFileUpload(@RequestParam("file") MultipartFile file, @PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        Terceros tercero = restTemplate.getForObject(serviceUrl + "/api/terceros/" + idTercero, Terceros.class);
        String avatarGuardado = storageService.store(file);
        tercero.setImagen(avatarGuardado);
        restTemplate.put(serviceUrl + "api/terceros", tercero);
        return ResponseEntity.ok(avatarGuardado);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/file/{filename}.{ext}")
    public ResponseEntity<Resource> serveFile(@PathVariable String filename, @PathVariable String ext) {

        Resource file = storageService.loadAsResource(filename + "." + ext);
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
                .body(file);
    }
}
