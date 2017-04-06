package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasMarcasVehiculos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasMarcasVehiculos")
public class ListasMarcasVehiculosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasMarcasVehiculos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasMarcasVehiculos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasMarcasVehiculos[] parametros = restTemplate.getForObject(serviceUrl, ListasMarcasVehiculos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasMarcasVehiculos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasMarcasVehiculos parametros = restTemplate.getForObject(serviceUrl + "/" + id, ListasMarcasVehiculos.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasMarcasVehiculos create(@RequestBody ListasMarcasVehiculos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasMarcasVehiculos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasMarcasVehiculos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasMarcasVehiculos.class);
    }
}
