package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Adjuntos;
import com.ciberdix.th.model.Terceros;
import com.ciberdix.th.model.ValoracionesRiesgos;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tika.metadata.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.UUID;


/**
 * Created by robertochajin on 02/08/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/mapa")
public class MapaRiesgosRefactorController {

    @Value("${mule.url}")
    String muleUrl;

    @Value("${domain.url}")
    private String serviceUrl;

    @RequestMapping(method = RequestMethod.GET, path = "/alfresco/{idUsuario}")
    ResponseEntity<byte[]> descargarMapaAlfresco(@PathVariable Integer idUsuario, @RequestHeader MultiValueMap<String, String> rawHeaders) throws IOException, JSONException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.putAll(rawHeaders);
        UUID fileName = UUID.randomUUID();
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        Adjuntos adjunto = new Adjuntos();
        ValoracionesRiesgos valoracionesRiesgos = new ValoracionesRiesgos();

        map.add("name", fileName + ".xlsx");
        map.add("filename", fileName + ".xlsx");

        ByteArrayResource contentsAsResource = null;
        try {
            byte[] archivo = writeFile();
            contentsAsResource = new ByteArrayResource(archivo) {
                @Override
                public String getFilename() {
                    String filename = fileName + ".xlsx";
                    return filename;
                }
            };
        } catch (IOException e) {
            e.printStackTrace();
        }

        map.add("file", contentsAsResource);
        map.add("dirpath", "/Gestionamos/Matriz de priorizacion de riesgos");
        map.add("mime-type", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

        headers.add("content-length", String.valueOf(contentsAsResource.contentLength()));
        headers.remove("content-type");
        headers.add("content-type", "multipart/form-data; boundary=----WebKitFormBoundary3Vjy2pkEznI4KSCE");

        HttpEntity<?> requestEntity = new HttpEntity<Object>(map, headers);

        String temp = restTemplate.postForObject(muleUrl + "/uploadFile", requestEntity, String.class);

        JSONObject tempFile = new JSONObject(temp);

        adjunto.setAdjunto(fileName + ".xlsx");
        adjunto.setIdAlfresco(tempFile.getString("id"));
        adjunto.setAuditoriaUsuario(1);
        adjunto.setNombreArchivo("Matriz_de_priorizacion_de_riesgos.xlsx");

        Adjuntos adj = restTemplate.postForObject(serviceUrl + "/api/adjuntos", adjunto, Adjuntos.class);

        valoracionesRiesgos.setIdAdjunto(adj.getIdAdjunto());
        valoracionesRiesgos.setIdUsuario(idUsuario);
        valoracionesRiesgos.setAuditoriaUsuario(idUsuario);
        valoracionesRiesgos.setIndicadorHabilitado(true);

        restTemplate.postForObject(serviceUrl + "/api/valoracionesRiesgos", valoracionesRiesgos, ValoracionesRiesgos.class);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"Matriz_de_priorizacion_de_riesgos.xlsx\"")
                .header(HttpHeaders.CONTENT_TYPE, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
                .body(writeFile());
    }

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<byte[]> descargarMapa() throws IOException {
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"Matriz_de_priorizacion_de_riesgos.xlsx\"")
                .header(HttpHeaders.CONTENT_TYPE, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
                .body(writeFile());
    }

    private byte[] writeFile() throws IOException {
        String sheetName = "PANORAMA DE RIESGOS";//name of sheet

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet(sheetName);

        //iterating r number of rows
        for (int r = 0; r < 5; r++) {
            XSSFRow row = sheet.createRow(r);

            //iterating c number of columns
            for (int c = 0; c < 5; c++) {
                XSSFCell cell = row.createCell(c);

                cell.setCellValue("Cell " + r + " " + c);
            }
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            wb.write(bos);
        } finally {
            bos.close();
        }

        final byte[] bytes = bos.toByteArray();

        return bytes;
    }

}
