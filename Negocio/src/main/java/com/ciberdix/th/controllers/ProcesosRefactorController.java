package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ListasItems;
import com.ciberdix.th.model.Procesos;
import com.ciberdix.th.model.VProcesos;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesos")
public class ProcesosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesos";

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesos[] cargosCompetencias = restTemplate.getForObject(serviceUrl, VProcesos[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProcesos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VProcesos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/current/")
    Procesos findCurrent() {
        RestTemplate restTemplate = new RestTemplate();
        UtilitiesController utilitiesController = new UtilitiesController();
        ListasItems edicion = utilitiesController.findListItem("ListasEstadosProcesos", "EDIT");
        ListasItems publico = utilitiesController.findListItem("ListasEstadosProcesos", "PUBLIC");
        List<Procesos> procesosEdicion = Arrays.asList(restTemplate.getForObject(serviceUrl + "/disabled/" + edicion.getIdLista(), Procesos[].class));
        List<Procesos> procesosPublicos = Arrays.asList(restTemplate.getForObject(serviceUrl + "/enabled/" + publico.getIdLista(), Procesos[].class));
        if (procesosEdicion.size() == 0 && procesosPublicos.size() == 0) {
            Procesos procesos = new Procesos();
            procesos.setIndicadorHabilitado(false);
            procesos.setIdEstado(edicion.getIdLista());
            return restTemplate.postForObject(serviceUrl, procesos, Procesos.class);
        } else if (procesosEdicion.size() != 0) {
            return procesosEdicion.get(0);
        } else {
            return procesosPublicos.get(0);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    Procesos create(@RequestBody Procesos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Procesos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Procesos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }


}
