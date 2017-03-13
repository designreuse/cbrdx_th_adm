package com.ciberdix.th.controllers;

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

    private String serviceUrl = "http://localhost:8445";




//    @RequestMapping(method = RequestMethod.POST)
//    TerceroFamily crearTerceroFamily(@RequestBody TerceroFamily tf) {
//
//        Tercero tercero = new Tercero(tf.getPrimerNombre(), tf.getSegundoNombre(), tf.getPrimerApellido(), tf.getSegundoApellido(), tf.getImagen(), tf.getIdTipoDocumento(), tf.getNumeroDocumento(),tf.getIdGenero(), tf.getCorreoElectronico(), tf.getIdLocalizacion(), tf.getFechaCreacion(), tf.getIdTipoPersona(), tf.getRazonSocial(), tf.getTalla(), tf.getPeso(), tf.getImc(), tf.getIdProfesion(), tf.getIdOcupacion(), tf.getAuditoriaUsuario());
//
//        RestTemplate restTemplate = new RestTemplate();
//        Tercero rspTercero = restTemplate.postForObject(serviceUrl + "/employee/", tercero, Tercero.class);
//
//        TercerosFamiliares tercerosFamiliares = new TercerosFamiliares(tf.getIdPadre(),rspTercero.getIdTercero(),tf.getIdParentezco(),tf.getIdConvivencia(), true, tf.getAuditoriaUsuario());
//        restTemplate.postForObject(serviceUrl + "/family/", tercerosFamiliares, TercerosFamiliares.class);
//        tf.setIdTerceroFamiliar(rspTercero.getIdTercero());
//        
//        return tf;
//    }

//    @RequestMapping(method = RequestMethod.PUT)
//    TerceroFamily actualizarTerceroFamily(@RequestBody TerceroFamily request) {
//
//        Tercero tercero = new Tercero(request.getPrimerNombre(), request.getSegundoNombre(), request.getPrimerApellido(), request.getSegundoApellido(), request.getImagen(), request.getIdTipoDocumento(), request.getNumeroDocumento(),request.getIdGenero(), request.getCorreoElectronico(), request.getIdLocalizacion(), request.getFechaCreacion(), request.getIdTipoPersona(), request.getRazonSocial(), request.getTalla(), request.getPeso(), request.getImc(), request.getIdProfesion(), request.getIdOcupacion(), request.getAuditoriaUsuario());
//
//        RestTemplate restTemplate = new RestTemplate();
//        Tercero rspTercero = restTemplate.postForObject(serviceUrl + "/employee/", tercero, Tercero.class);
//
//        TercerosFamiliares tercerosFamiliares = new TercerosFamiliares(request.getIdPadre(),rspTercero.getIdTercero(),request.getIdParentezco(),request.getIdConvivencia(), true, request.getAuditoriaUsuario());
//        restTemplate.postForObject(serviceUrl + "/family/", tercerosFamiliares, TercerosFamiliares.class);
//        request.setIdTerceroFamiliar(rspTercero.getIdTercero());
//        return request;
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TerceroFamily verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily parametro = restTemplate.getForObject(serviceUrl + "/Vfamily/" + IdParametro, TerceroFamily.class);
        return parametro;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    List<TerceroFamily> consultarTercerosFamiliares() {
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

}