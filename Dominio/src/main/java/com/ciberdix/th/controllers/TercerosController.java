package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosEntity;
import com.ciberdix.th.repositories.TercerosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/employees")
public class TercerosController {

    @Autowired
    private TercerosRepository tercerosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosEntity> getLists() {
        return (List<TercerosEntity>) tercerosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TercerosEntity verConstante(@PathVariable Long IdParametro) {
        return tercerosRepository.findOne(IdParametro);
    }



    @RequestMapping(method = RequestMethod.POST)
    TercerosEntity createList(@RequestBody TercerosEntity ter) {
        return tercerosRepository.save(new TercerosEntity(ter.getPrimerNombre(), ter.getSegundoNombre(), ter.getPrimerApellido(), ter.getSegundoApellido(), ter.getImagen(), ter.getNumeroDocumento(), ter.getFechaDocumento(), ter.getFechaNacimiento(), ter.getIdFactorRh(), ter.getFactorRh(), ter.getNroHijos(), ter.getIdLateralidad(), ter.getIdTipoVivienda(), ter.getEstrato(), ter.getTallaCamisa(), ter.getTallaPantalon(), ter.getTallaCalzado(), ter.getCorreoElectronico(), ter.getFechaCreacion(), ter.getRazonSocial(), ter.getTalla(), ter.getPeso(), ter.getImc(), ter.getIdVehiculo(), ter.getTelefonoFijo(), ter.getTelefonoCelular(), ter.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosEntity updateList(@RequestBody TercerosEntity centrosCostosEntity) {
        return tercerosRepository.save(centrosCostosEntity);
    }
}
