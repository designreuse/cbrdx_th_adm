package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ListasItems;
import com.ciberdix.th.model.Requerimientos;
import com.ciberdix.th.model.RequerimientosHistoricos;
import com.ciberdix.th.model.VRequerimientos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 15/05/2017.
 */

@RestController
@RequestMapping("/api/requerimientos")
@CrossOrigin
public class RequerimientosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientos> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idRequerimientos}")
    VRequerimientos findOne(@PathVariable Integer idRequerimientos) {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idRequerimientos, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimientosHistoricos/{idRequerimientoHistorico}")
    VRequerimientos findRequerimientoHistoricoOne(@PathVariable Integer idRequerimientoHistorico) {
        String serviceUrl = baseUrl + "/api/requerimientosHistoricos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idRequerimientoHistorico, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/estado/{idEstado}")
    List<VRequerimientos> findByIdEstado(@PathVariable Integer idEstado) {
        String serviceUrl = baseUrl + "/api/requerimientos/estado/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + idEstado, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byUser/{idUsuario}")
    List<VRequerimientos> findByIdSolicitante(@PathVariable Integer idUsuario) {
        String serviceUrl = baseUrl + "/api/requerimientos/byUser/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + idUsuario, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/fecha/{fechaInicio}/{fechaFin}")
    List<VRequerimientos> findByFecha(@PathVariable String fechaInicio, @PathVariable String fechaFin) {
        String serviceUrl = baseUrl + "/api/requerimientos/fecha/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + fechaInicio + "/" + fechaFin, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/filtroReq/{idEstado}/{idResponsableSeleccion}")
    List<VRequerimientos> findIdEstadoAndIdRespSelec(@PathVariable Integer idEstado, @PathVariable Integer idResponsableSeleccion) {
        String serviceUrl = baseUrl + "/api/requerimientos/filtroReq/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + idEstado + "/" + idResponsableSeleccion, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/filtroReq2/{idEstado}/{idTipoSolicitud}")
    List<VRequerimientos> findIdEstadoAndIdTipoSoli(@PathVariable Integer idEstado, @PathVariable Integer idTipoSolicitud) {
        String serviceUrl = baseUrl + "/api/requerimientos/filtroReq2/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + idEstado + "/" + idTipoSolicitud, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacion/{idPublicacion}")
    VRequerimientos findByIdPublicacion(@PathVariable Integer idPublicacion) {
        String serviceUrl = baseUrl + "/api/requerimientos/publicacion/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idPublicacion, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byResponsable/{idResponsableSeleccion}")
    List<VRequerimientos> findAllByIdResponsableSeleccion(@PathVariable Integer idResponsableSeleccion) {
        String serviceUrl = baseUrl + "/api/requerimientos/byResponsable/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + idResponsableSeleccion, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacionFechas/todasActivas")
    List<VRequerimientos> queryAllByFechaActual() {
        String serviceUrl = baseUrl + "/api/requerimientos/publicacionFechas/todasActivas";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacionFechas/cantidadN/{cantidad}")
    List<VRequerimientos> queryAllByFechaActualCantN(@PathVariable Integer cantidad) {
        String serviceUrl = baseUrl + "/api/requerimientos/publicacionFechas/cantidadN/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + cantidad, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byIdCargo/{idCargo}/{idTipoSolicitud}")
    VRequerimientos findByIdCargo(@PathVariable Integer idCargo, @PathVariable Integer idTipoSolicitud) {
        String serviceUrl = baseUrl + "/api/requerimientos/byIdCargo/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idCargo + "/" + idTipoSolicitud, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/internaMixta")
    List<VRequerimientos> findIntMix() {
        String serviceUrl = baseUrl + "/api/requerimientos/internaMixta";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/externaMixta")
    List<VRequerimientos> findExtMix() {
        String serviceUrl = baseUrl + "/api/requerimientos/externaMixta";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Requerimientos create(@RequestBody Requerimientos requerimientos) {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, requerimientos, Requerimientos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Requerimientos requerimientos) {
        updateTR(requerimientos);
        /*
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        Requerimientos req = restTemplate.getForObject(serviceUrl + requerimientos.getIdRequerimiento(), Requerimientos.class);
        ListasItems EstadoAnterior = restTemplate.getForObject(baseUrl + "/api/ListasEstadosRequerimientos/" + req.getIdEstado(), ListasItems.class);
        ListasItems EstadoActual = restTemplate.getForObject(baseUrl + "/api/ListasEstadosRequerimientos/" + requerimientos.getIdEstado(), ListasItems.class);
        if (EstadoActual.getCodigo().compareTo("SOLICITADO") == 0) {
            if (EstadoAnterior.getCodigo().compareTo("PRCREQ") == 0 || EstadoAnterior.getCodigo().compareTo("DVLT") == 0) {
                RequerimientosHistoricos requerimientosHistoricos = new RequerimientosHistoricos(req);
                restTemplate.postForObject(baseUrl + "/api/requerimientosHistoricos", requerimientosHistoricos, RequerimientosHistoricos.class);
            }
        }
        restTemplate.put(serviceUrl, requerimientos);*/
    }

    public void update(VRequerimientos requerimientos) {
        updateTR(requerimientos);
    }

    public void updateTR(Object requ) {
        Requerimientos requerimientos = (Requerimientos) requ;
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        Requerimientos req = restTemplate.getForObject(serviceUrl + requerimientos.getIdRequerimiento(), Requerimientos.class);
        ListasItems EstadoAnterior = restTemplate.getForObject(baseUrl + "/api/ListasEstadosRequerimientos/" + req.getIdEstado(), ListasItems.class);
        ListasItems EstadoActual = restTemplate.getForObject(baseUrl + "/api/ListasEstadosRequerimientos/" + requerimientos.getIdEstado(), ListasItems.class);
        if (EstadoActual.getCodigo().compareTo("SOLICITADO") == 0) {
            if (EstadoAnterior.getCodigo().compareTo("PRCREQ") == 0 || EstadoAnterior.getCodigo().compareTo("DVLT") == 0) {
                RequerimientosHistoricos requerimientosHistoricos = new RequerimientosHistoricos(req);
                restTemplate.postForObject(baseUrl + "/api/requerimientosHistoricos", requerimientosHistoricos, RequerimientosHistoricos.class);
            }
        }
        restTemplate.put(serviceUrl, requerimientos);
    }

    VRequerimientos findIdCargo(Integer idCargo, Integer idTipoSolicitud) {
        String serviceUrl = baseUrl + "/api/requerimientos/byIdCargo/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idCargo + "/" + idTipoSolicitud, VRequerimientos.class);
    }
}
