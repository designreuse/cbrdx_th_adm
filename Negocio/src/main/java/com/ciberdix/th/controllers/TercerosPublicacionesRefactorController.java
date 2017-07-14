package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/tercerosPublicaciones")
public class TercerosPublicacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosPublicaciones> findAll() {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        TercerosPublicaciones[] params = restTemplate.getForObject(serviceUrl, TercerosPublicaciones[].class);
        return Arrays.asList(params);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosPublicaciones findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, TercerosPublicaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/terceroPublicacion/{idTercero}/{idPublicacion}")
    List<TercerosPublicaciones> findByIdTerceroAndIdPublicacion(@PathVariable Long idTercero, @PathVariable Integer idPublicacion) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/terceroPublicacion/";
        RestTemplate restTemplate = new RestTemplate();
        List<TercerosPublicaciones> tercerosPublicaciones = Arrays.asList(restTemplate.getForObject(serviceUrl + idTercero + "/" + idPublicacion, TercerosPublicaciones[].class));
        return tercerosPublicaciones;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/historic/{idTercero}")
    List<VTercerosPublicacionesHistoricos> findHistoric(@PathVariable Long idTercero) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/historic/";
        RestTemplate restTemplate = new RestTemplate();
        List<VTercerosPublicacionesHistoricos> tercerosPublicaciones = Arrays.asList(restTemplate.getForObject(serviceUrl + idTercero, VTercerosPublicacionesHistoricos[].class));
        return tercerosPublicaciones;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/terceroAll/{idTercero}")
    List<TercerosPublicaciones> findByIdTerceroAll(@PathVariable Long idTercero) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/terceroAll/";
        RestTemplate restTemplate = new RestTemplate();
        List<TercerosPublicaciones> tercerosPublicaciones = Arrays.asList(restTemplate.getForObject(serviceUrl + idTercero, TercerosPublicaciones[].class));
        return tercerosPublicaciones;
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosPublicaciones create(@RequestBody TercerosPublicaciones o) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        Usuarios usuarios = restTemplate.getForObject(baseUrl + "/api/usuarios/query/" + o.getAuditoriaUsuario(), Usuarios.class);
        usuarios.setIdTercero(o.getIdTercero());
        restTemplate.put(baseUrl + "/api/usuarios", usuarios, Usuarios.class);
        return restTemplate.postForObject(serviceUrl, o, TercerosPublicaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosPublicaciones o) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        Terceros t = restTemplate.getForObject(baseUrl + "/api/terceros/" + o.getIdTercero(), Terceros.class);
        Publicaciones p = restTemplate.getForObject(baseUrl + "/api/publicaciones/" + o.getIdPublicacion(), Publicaciones.class);
        VRequerimientos r = restTemplate.getForObject(baseUrl + "/api/requerimientos/" + p.getIdRequerimiento(), VRequerimientos.class);
        if (o.getIndicadorFinalizado() == null) {
            o.setIndicadorFinalizado(false);
        }
        if (o.getIndicadorFinalizado()) {
            UtilitiesController.sendMail(t.getCorreoElectronico(), "Bienvenido al proceso de Selección", "<h2>Te haz postulado a la vacante " + r.getCargo() + "</h2><br/><p>Hola " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</p><p>Gracias por aplicar al empleo ofrecido por nuestra compañía. Muy pronto revisaremos tu perfil con mucha atención. Si tu perfil encaja -o no- con el cargo " + r.getCargo() + ", nos pondremos en contacto para comunicarte cuáles fueron tus resultados.</p>" +
                    "<p>Si estás interesado en otra de las vacantes que tenemos, por favor ingresa a nuestra página web <a href=\"www.crezcamos.com/trabajeconnosotros\">www.crezcamos.com/trabajeconnosotros</a> y aplica a la opción que más te interese.</p><p>¡Gracias por preferirnos!</p>");
        }
        if(o.getIndicadorContratacion()){
            String listado = "";
            List<DocumentosTerceros> dt = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/documentosTerceros", DocumentosTerceros[].class));
            List<VTercerosDocumentosTercero> tdt = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/tercerosDocumentosTercero/tercero/" + t.getIdTercero(), VTercerosDocumentosTercero[].class));
            for(DocumentosTerceros dT : dt){
                for(VTercerosDocumentosTercero vtdt : tdt){
                    if(dT.getIdDocumentoTercero().equals(vtdt.getIdDocumentoTercero())){
                        listado += "<ol><li>" + vtdt.getNombreDocumentoTercero() + "</li></ol>";
                    }
                }
            }
            UtilitiesController.sendMail(t.getCorreoElectronico(), "Felicidades has sido Contratado", "<h2>Felicitaciones</h2><p>Ha sido contrado en la vacanate " + r.getIdCargo() + ".</p> <p>Debe diligenciar los siguientes documentos: </p>" + listado);
        }
        restTemplate.put(serviceUrl, o);
    }

}
