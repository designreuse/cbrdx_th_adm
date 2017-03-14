package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/terceroFamily")
public class terceroFamilyController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = { RequestMethod.PUT, RequestMethod.POST })
    TerceroFamily crearTerceroFamily(@RequestBody TerceroFamily request) {

        Tercero tercero = new Tercero(request.getIdTercero(),
                request.getIdFamiliar(),
                request.getIdTipoDocumento(),
                request.getPrimerNombre(),
                request.getSegundoNombre(),
                request.getPrimerApellido(),
                request.getSegundoApellido(),
                request.getFechaNacimiento(),
                request.getCorreoElectronico(),
                request.getNumeroDocumento(),
                request.getIdConvivencia(),
                request.getIdParentezco(),
                request.getTelefonoFijo(),
                request.getTelefonoFijo(),
                request.getDireccion());

        RestTemplate restTemplate = new RestTemplate();
        Tercero rspTercero = restTemplate.postForObject(serviceUrl + "/employee/", tercero, Tercero.class);

        TercerosFamiliares tercerosFamiliares = new TercerosFamiliares(request.getIdFamiliar(),rspTercero.getIdTercero(),request.getIdParentezco(),request.getIdConvivencia(), true, request.getAuditoriaUsuario());
        restTemplate.postForObject(serviceUrl + "/family/", tercerosFamiliares, TercerosFamiliares.class);
        request.setIdTerceroFamiliar(rspTercero.getIdTercero());
        return request;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TerceroFamily verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily parametro = restTemplate.getForObject(serviceUrl + "/Vfamily/" + IdParametro, TerceroFamily.class);
        return parametro;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    List<TerceroFamily> getTercerosFamiliares() {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily[] parametro = restTemplate.getForObject(serviceUrl + "/Vfamily", TerceroFamily[].class);
        
        return Arrays.asList(parametro);
    }



    @RequestMapping(method = RequestMethod.GET, value = "employee/{IdParametro}")
    List<TerceroFamily> consultarParemetros(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily[] parametros = restTemplate.getForObject(serviceUrl + "/Vfamily/" + IdParametro, TerceroFamily[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "employee/habilitated/{IdParametro}")
    List<TerceroFamily> getEmployeeHabilitated(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily[] parametros = restTemplate.getForObject(serviceUrl + "/Vfamily/habilitated/" + IdParametro, TerceroFamily[].class);
        return Arrays.asList(parametros);
    }


    @RequestMapping(method = RequestMethod.GET, value = "habilitated")
    List<TerceroFamily> getHabilitated() {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily[] parametros = restTemplate.getForObject(serviceUrl + "/Vfamily/habilitated", TerceroFamily[].class);
        return Arrays.asList(parametros);
    }

}