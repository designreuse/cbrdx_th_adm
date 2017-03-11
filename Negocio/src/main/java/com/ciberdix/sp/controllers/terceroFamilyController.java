package com.ciberdix.sp.controllers;

import com.ciberdix.sp.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/terceroFamily")
public class terceroFamilyController {

    private String serviceUrl = "http://localhost:8080";


    @RequestMapping(method = RequestMethod.POST)
    TerceroFamily crearParametro(@RequestBody TerceroFamily request) {

        Tercero tercero = new Tercero(request.getPrimerNombre(), request.getSegundoNombre(), request.getPrimerApellido(), request.getSegundoApellido(), request.getImagen(), request.getIdTipoDocumento(), request.getNumeroDocumento(),request.getIdGenero(), request.getCorreoElectronico(), request.getIdLocalizacion(), request.getFechaCreacion(), request.getIdTipoPersona(), request.getRazonSocial(), request.getTalla(), request.getPeso(), request.getImc(), request.getIdProfesion(), request.getIdOcupacion(), request.getAuditoriaUsuario());

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(serviceUrl + "/employee", tercero, Tercero.class);

        //TercerosFamiliares tercerosFamiliares = new TercerosFamiliares(request.getIdPadre(),rspTercero.getIdTercero(),request.getIdParentezco(),request.getIdConvivencia(), true, request.getAuditoriaUsuario());
        //restTemplate.postForObject(serviceUrl + "/family", tercerosFamiliares, TercerosFamiliares.class);
        //request.setIdTerceroFamiliar(rspTercero.getIdTercero());
        return request;
    }

}