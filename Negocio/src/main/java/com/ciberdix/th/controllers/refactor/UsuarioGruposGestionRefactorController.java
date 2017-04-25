package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.UsuarioGruposGestion;
import com.ciberdix.th.model.refactor.VUsuarioGruposGestion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 25/04/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/usuariosGruposGestion")
public class UsuarioGruposGestionRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<UsuarioGruposGestion> getLists() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosGruposGestion";
        UsuarioGruposGestion[] parametros = restTemplate.getForObject(serviceUrl, UsuarioGruposGestion[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path="/vistas")
    List<VUsuarioGruposGestion> getVLists() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosGruposGestion";
        VUsuarioGruposGestion[] parametros = restTemplate.getForObject(serviceUrl + "/vistas", VUsuarioGruposGestion[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "vista/{idUsuario}")
    List<VUsuarioGruposGestion> queryCenrtosCostos(@PathVariable Integer idUsuario) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosGruposGestion";
        VUsuarioGruposGestion[] parametros = restTemplate.getForObject(serviceUrl + "/vista/" + idUsuario, VUsuarioGruposGestion[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    UsuarioGruposGestion viewCentrosCostos(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosGruposGestion";
        return restTemplate.getForObject(serviceUrl + "/" + IdParametro, UsuarioGruposGestion.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/enabled/{idUsuario}")
    List<UsuarioGruposGestion> findEnabled(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosGruposGestion";
        UsuarioGruposGestion[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/" + IdParametro, UsuarioGruposGestion[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/vista/enabled/{idUsuario}")
    List<VUsuarioGruposGestion> findVEnabled(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosGruposGestion";
        VUsuarioGruposGestion[] parametros = restTemplate.getForObject(serviceUrl + "/vista/enabled/" + IdParametro, VUsuarioGruposGestion[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    UsuarioGruposGestion createCentrosCostos(@RequestBody UsuarioGruposGestion request) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosGruposGestion";
        return restTemplate.postForObject(serviceUrl, request, UsuarioGruposGestion.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateCentrosCostos(@RequestBody UsuarioGruposGestion request) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosGruposGestion";
        restTemplate.put(serviceUrl, request, UsuarioGruposGestion.class);
    }

}
