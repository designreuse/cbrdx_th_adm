package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Cargos;
import com.ciberdix.th.model.Requerimientos;
import com.ciberdix.th.model.RequerimientosAcciones;
import com.ciberdix.th.model.VCargos;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargos")
@Api(value = "cargos", description = "Cargos")
public class CargosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargos";

    @RequestMapping(method = RequestMethod.GET)
    List<VCargos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCargos[] parametros = restTemplate.getForObject(serviceUrl, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCargos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/wildcard/{query}")
    List<VCargos> findByWildCard(@PathVariable String query) {
        RestTemplate restTemplate = new RestTemplate();
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/wildcard/" + query, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/search/{query}/{idEstructuraOrganizacional}")
    List<VCargos> queryByIdEstructuraOrganizacional(@PathVariable String query, @PathVariable Integer idEstructuraOrganizacional) {
        RestTemplate restTemplate = new RestTemplate();
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/search/" + query + "/" + idEstructuraOrganizacional, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Cargos create(@RequestBody Cargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Cargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab1")
    void updateTab1(@RequestBody Cargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab1", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab2")
    void updateTab2(@RequestBody Cargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        UtilitiesController utilitiesController = new UtilitiesController();
        String logica = utilitiesController.readParameter("business.url");
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        Integer c = utilitiesController.findListItem("ListasEstadosCargos", "CONST").getIdLista();
        Integer a = utilitiesController.findListItem("ListasEstadosCargos", "APROB").getIdLista();
        if (estadoActual.getIdEstado().equals(c) && obj.getIdEstado().equals(a)) {
            Integer tipoSol = utilitiesController.findListItem("ListasTiposSolicitudes", "CRGNVO").getIdLista();
            Requerimientos requerimientos = restTemplate.getForObject(logica + "/api/requerimientos/byIdCargo/" + obj.getIdCargo() + "/" + tipoSol, Requerimientos.class);
            RequerimientosAcciones requerimientosAcciones = new RequerimientosAcciones();
            requerimientosAcciones.setIdRequerimiento(requerimientos.getIdRequerimiento());
            requerimientosAcciones.setAuditoriaUsuario(obj.getAuditoriaUsuario());
            requerimientosAcciones.setObservacion("Cargo Creado Satisfactoriamente");
            Integer idAccion = utilitiesController.findListItem("ListasRequerimientosAcciones", "APRPER").getIdLista();
            requerimientosAcciones.setIdAccion(idAccion);
            restTemplate.postForObject(logica + "/api/requerimientosAcciones", requerimientosAcciones, RequerimientosAcciones.class);
            Integer reqEstado = utilitiesController.findListItem("ListasEstadosRequerimientos", "APRB").getIdLista();
            requerimientos.setIdEstado(reqEstado);
            restTemplate.put(logica + "/api/requerimientos", requerimientos, Requerimientos.class);
        }
        restTemplate.put(serviceUrl + "/tab2", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab3")
    void updateTab3(@RequestBody Cargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab3", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab4")
    void updateTab4(@RequestBody Cargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab4", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab5")
    void updateTab5(@RequestBody Cargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab5", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab6")
    void updateTab6(@RequestBody Cargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/tab6", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab7")
    void updateTab7(@RequestBody Cargos obj) {
        RestTemplate restTemplate = new RestTemplate();
        UtilitiesController utilitiesController = new UtilitiesController();
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        if (estadoActual.getPaso().equals(15) && obj.getPaso().equals(16)) {
            String recipients = utilitiesController.findConstant("CORAUT").getValor();
            String token = UtilitiesController.generateURLToken("/positions/update/" + obj.getIdCargo());
            String body = "Se ha creado un nuevo cargo que requiere su aprobación. haga click en el siguiente boton para acceder a la información: <p style=\"align:center;\"><a href=\"" + utilitiesController.readParameter("front.url") + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a></p>";
            UtilitiesController.sendMail(recipients, "Aprobación Cargo", body);
        }
        restTemplate.put(serviceUrl + "/tab7", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/disabled/{idCargo}")
    void disabled(@PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/disabled/" + idCargo, VCargos.class);
    }
}
