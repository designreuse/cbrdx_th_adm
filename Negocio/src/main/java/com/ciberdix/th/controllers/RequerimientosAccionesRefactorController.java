package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
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
    List<VRequerimientosAcciones> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        List<VRequerimientosAcciones> requerimientosAcciones = Arrays.asList(restTemplate.getForObject(serviceUrl, VRequerimientosAcciones[].class));
        return requerimientosAcciones;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRequerimientosAcciones findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, VRequerimientosAcciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<VRequerimientosAcciones> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/requerimiento/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientosAcciones[] parametros = restTemplate.getForObject(serviceUrl + idRequerimiento, VRequerimientosAcciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosAcciones create(@RequestBody RequerimientosAcciones o) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        Integer idReqHist = null;
        UtilitiesController utilitiesController = new UtilitiesController();
        ListasItems listasItems = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasRequerimientosAcciones/code/SOLAUT", ListasItems.class);
        if (o.getIdAccion().equals(listasItems.getIdLista())) {
            Map<String, Object> map = new HashMap<>();
            map.put("URL", "/vacancies/approve/" + o.getIdRequerimiento());
            String token = Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS512, "fdsldfjklfjsld73647364").compact();
            String body = "Se ha creado un requerimiento de personal que requiere su aprobacion: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a>";
            String recipients = utilitiesController.findConstant("CORAUT").getValor();
            UtilitiesController.sendMail(recipients, "Aprobación", body);
        }
        Integer aprb = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasRequerimientosAcciones/code/APRB", ListasItems.class).getIdLista();
        Integer rchz = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasRequerimientosAcciones/code/RCHZ", ListasItems.class).getIdLista();
        Integer devcam = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasRequerimientosAcciones/code/DEVCAM", ListasItems.class).getIdLista();
        if (o.getIdAccion().equals(aprb) || o.getIdAccion().equals(rchz) || o.getIdAccion().equals(devcam)) {
            List<VRequerimientosAcciones> vRequerimientosAcciones = Arrays.asList(restTemplate.getForObject(businessUrl + "/api/requerimientosAcciones/requerimiento/" + o.getIdRequerimiento(), VRequerimientosAcciones[].class));
            VRequerimientosAcciones last = new VRequerimientosAcciones();
            last.setIdRequerimientoAccion(1);
            for (VRequerimientosAcciones r : vRequerimientosAcciones) {
                if (last.getIdRequerimientoAccion() < r.getIdRequerimientoAccion()) {
                    last = r;
                }
            }
            if (last.getIdAccion().equals(listasItems.getIdLista())) {
                if (o.getIdAccion().equals(aprb)) {
                    Integer idUsuario = last.getAuditoriaUsuario();
                    Map<String, Object> map = new HashMap<>();
                    map.put("URL", "/vacancies/update/" + o.getIdRequerimiento());
                    String token = Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS512, "fdsldfjklfjsld73647364").compact();
                    String body = "Se ha aprobado un requerimiento de personal del cual usted solicito aprobacion: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a>";
                    String recipients = restTemplate.getForObject(baseUrl + "/api/usuarios/" + idUsuario, Usuarios.class).getCorreoElectronico();
                    UtilitiesController.sendMail(recipients, "Revisión", body);

                    VRequerimientos vRequerimientos = restTemplate.getForObject(baseUrl + "/api/requerimientos/" + idUsuario, VRequerimientos.class);
                    idUsuario = vRequerimientos.getIdSolicitante();
                    map = new HashMap<>();
                    map.put("URL", "/personnel_requirement/update/" + o.getIdRequerimiento());
                    token = Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS512, "fdsldfjklfjsld73647364").compact();
                    body = "Se ha aprobado un requerimiento de personal solicitado por usted: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a>";
                    recipients = restTemplate.getForObject(baseUrl + "/api/usuarios/" + idUsuario, Usuarios.class).getCorreoElectronico();
                    UtilitiesController.sendMail(recipients, "Revisión", body);
                }else{
                    Integer idUsuario = last.getAuditoriaUsuario();
                    Map<String, Object> map = new HashMap<>();
                    map.put("URL", "/vacancies/detail/" + o.getIdRequerimiento());
                    String token = Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS512, "fdsldfjklfjsld73647364").compact();
                    String body = "Se ha modificado un requerimiento de personal del cual usted solicito aprobacion: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a>";
                    String recipients = restTemplate.getForObject(baseUrl + "/api/usuarios/" + idUsuario, Usuarios.class).getCorreoElectronico();
                    UtilitiesController.sendMail(recipients, "Revisión", body);

                    VRequerimientos vRequerimientos = restTemplate.getForObject(baseUrl + "/api/requerimientos/" + idUsuario, VRequerimientos.class);
                    idUsuario = vRequerimientos.getIdSolicitante();
                    map = new HashMap<>();
                    map.put("URL", "/personnel_requirement/update/" + o.getIdRequerimiento());
                    token = Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS512, "fdsldfjklfjsld73647364").compact();
                    body = "Se ha modificado un requerimiento de personal solicitado por usted: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a>";
                    recipients = restTemplate.getForObject(baseUrl + "/api/usuarios/" + idUsuario, Usuarios.class).getCorreoElectronico();
                    UtilitiesController.sendMail(recipients, "Revisión", body);
                }
            }
        }
        List<RequerimientosHistoricos> requerimientosHistoricos = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/requerimientosHistoricos", RequerimientosHistoricos[].class));
        for (RequerimientosHistoricos r : requerimientosHistoricos) {
            idReqHist = r.getIdRequerimientoHistorico();
        }
        o.setIdRequerimientoHistorico(idReqHist);
        return restTemplate.postForObject(serviceUrl, o, RequerimientosAcciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosAcciones o) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }
}
