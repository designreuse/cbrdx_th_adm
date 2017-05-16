package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Terceros;
import com.ciberdix.th.repositories.TercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/terceros")
public class TercerosRefactorController {

    @Autowired
    private TercerosRefactorRepository tercerosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Terceros> listarTerceros() {
        return (List<Terceros>) tercerosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Terceros obtenerTercero(@PathVariable Long id) {
        return tercerosRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{cedula}/{id}")
    Terceros obtenerTerceroPorCedula(@PathVariable String cedula, @PathVariable Integer id) {
        return tercerosRepository.queryTercero(cedula, id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Terceros crearTercero(@RequestBody Terceros obj) {
        return tercerosRepository.save(new Terceros(obj.getPrimerNombre(), obj.getSegundoNombre(), obj.getPrimerApellido(), obj.getSegundoApellido(), obj.getImagen(), obj.getIdTipoDocumento(), obj.getNumeroDocumento(), obj.getFechaDocumento(), obj.getIdCiudadExpDocumento(), obj.getFechaNacimiento(), obj.getIdCiudadNacimiento(), obj.getIdGenero(), obj.getIdEstadoCivil(), obj.getIdFactorRh(), obj.getNroHijos(), obj.getIdLateralidad(), obj.getCorreoElectronico(), obj.getCorreoElectronico(), obj.getCorreoElectronico(), obj.getCorreoElectronico(), obj.getFechaCreacion(), obj.getIdTipoPersona(), obj.getRazonSocial(), obj.getTalla(), obj.getPeso(), obj.getImc(), obj.getIdProfesion(), obj.getIdNivelEducacion(), obj.getAuditoriaUsuario(), obj.getTelefonoFijo(), obj.getTelefonoCelular(), obj.getFechaDefuncion(), obj.getIdTipoOcupacion(), obj.getIdSectorEconomico(), obj.getIdActividadEconomica(), obj.getIdOcupacion(), obj.getIdEstadoJuridico(), obj.getIdCoberturaSalud(), obj.getIndicadorVivo(), obj.getIdTipoAfiliacion(), obj.getIndicadorHabilitado(), obj.getIdTipoTercero(), obj.getIdTallaCamisa(), obj.getIdTallaPantalon(), obj.getIdTallaCalzado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTercero(@RequestBody Terceros obj) {
        tercerosRepository.save(obj);
    }
}