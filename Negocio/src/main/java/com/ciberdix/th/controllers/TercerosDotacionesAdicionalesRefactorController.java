package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosDotacionesAdicionales")
@CrossOrigin
public class TercerosDotacionesAdicionalesRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosDotacionesAdicionales/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosDotacionesAdicionales> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosDotacionesAdicionales[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosDotacionesAdicionales findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosDotacionesAdicionales.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosDotacionesAdicionales> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosDotacionesAdicionales[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{idTercero}")
    List<VTercerosDotacionesAdicionales> findEnabled(@PathVariable Long idTercero) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "tercero/" + idTercero, VTercerosDotacionesAdicionales[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroProyeccionDotacion/{idTercero}/{idProyeccionDotacion}")
    List<VTercerosDotacionesAdicionales> findEnabled(@PathVariable Long idTercero, @PathVariable Integer idProyeccionDotacion) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroProyeccionDotacion/" + idTercero + "/" + idProyeccionDotacion, VTercerosDotacionesAdicionales[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosDotacionesAdicionales create(@RequestBody TercerosDotacionesAdicionales o) {
        List<Novedades> novedades = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/novedades", Novedades[].class));
        Novedades aplicar = null;
        for (Novedades n : novedades) {
            if (n.getCodigoNovedad().equals(UtilitiesController.findConstant("NOVDOT").getValor())) {
                aplicar = n;
                break;
            }
        }
        if (aplicar != null) {
            Dotaciones dotaciones = restTemplate.getForObject(baseUrl + "/api/dotaciones/" + o.getIdDotacion(), Dotaciones.class);
            TercerosNovedades tercerosNovedades = new TercerosNovedades();
            tercerosNovedades.setFechaReporte(new Date(System.currentTimeMillis()));
            tercerosNovedades.setIdTercero(o.getIdTercero());
            tercerosNovedades.setIdNovedad(aplicar.getIdNovedad());
            tercerosNovedades.setDescripcion("Novedad Automatica por Dotación Adicional");
            tercerosNovedades.setValor(dotaciones.getCosto().multiply(BigDecimal.valueOf(o.getCantidadDotacion())));
            tercerosNovedades.setIdEstadoNovedad(UtilitiesController.findListItem("ListasEstadosNovedades", "SOLICI").getIdLista());
            tercerosNovedades.setAuditoriaUsuario(o.getAuditoriaUsuario());
            tercerosNovedades.setAuditoriaFecha(o.getAuditoriaFecha());
            TercerosNovedades resultado = restTemplate.postForObject(baseUrl + "/api/tercerosNovedades", tercerosNovedades, TercerosNovedades.class);
        }
        return restTemplate.postForObject(serviceUrl, o, TercerosDotacionesAdicionales.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosDotacionesAdicionales o) {
        restTemplate.put(serviceUrl, o);
    }
}
