package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Terceros;
import com.ciberdix.th.models.VTercerosCargosAreasFisicas;
import com.ciberdix.th.repositories.TercerosRefactorRepository;
import com.ciberdix.th.repositories.VTercerosCargosAreasFisicasRefactorRepository;
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

    @Autowired
    private VTercerosCargosAreasFisicasRefactorRepository vTercerosCargosAreasFisicasRefactorRepository;

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

    @RequestMapping(method = RequestMethod.GET, value = "/tercerosCargosAreasFisica/{idTercero}")
    VTercerosCargosAreasFisicas findAllTCAF(@PathVariable Long idTercero) {
        return vTercerosCargosAreasFisicasRefactorRepository.findAllByIdTercero(idTercero);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarJefes/{idArea}/{query}")
    List<VTercerosCargosAreasFisicas> findByIdEstructuraFisica(@PathVariable Integer idArea, @PathVariable String query) {
        return vTercerosCargosAreasFisicasRefactorRepository.queryAllByIdEstructuraFisica(idArea, query);
    }

    @RequestMapping(method = RequestMethod.POST)
    Terceros crearTercero(@RequestBody Terceros obj) {
        return tercerosRepository.save(new Terceros(obj.getPrimerNombre(), obj.getSegundoNombre(), obj.getPrimerApellido(), obj.getSegundoApellido(), obj.getImagen(), obj.getIdTipoDocumento(), obj.getNumeroDocumento(), obj.getFechaDocumento(), obj.getIdCiudadExpDocumento(), obj.getFechaNacimiento(), obj.getIdCiudadNacimiento(), obj.getIdGenero(), obj.getIdEstadoCivil(), obj.getIdFactorRh(), obj.getNroHijos(), obj.getIdLateralidad(), obj.getCorreoElectronico(), obj.getCorreoElectronico(), obj.getCorreoElectronico(), obj.getCorreoElectronico(), obj.getFechaCreacion(), obj.getIdTipoPersona(), obj.getRazonSocial(), obj.getTalla(), obj.getPeso(), obj.getImc(), obj.getIdProfesion(), obj.getIdNivelEducacion(), obj.getAuditoriaUsuario(), obj.getTelefonoFijo(), obj.getTelefonoCelular(), obj.getFechaDefuncion(), obj.getIdTipoOcupacion(), obj.getIdSectorEconomico(), obj.getIdActividadEconomica(), obj.getIdOcupacion(), obj.getIdEstadoJuridico(), obj.getIdCoberturaSalud(), obj.getIndicadorVivo(), obj.getIdTipoAfiliacion(), obj.getIndicadorHabilitado(), obj.getIdTipoTercero(), obj.getIdTallaCamisa(), obj.getIdTallaPantalon(), obj.getIdTallaCalzado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTercero(@RequestBody Terceros o) {
        tercerosRepository.save(new Terceros(o.getIdTercero(), o.getPrimerNombre(), o.getSegundoNombre(), o.getPrimerApellido(), o.getSegundoApellido(), o.getImagen(), o.getIdTipoDocumento(), o.getNumeroDocumento(), o.getFechaDocumento(), o.getIdCiudadExpDocumento(), o.getFechaNacimiento(), o.getIdCiudadNacimiento(), o.getIdGenero(), o.getIdEstadoCivil(), o.getIdFactorRh(), o.getNroHijos(), o.getIdLateralidad(), o.getCorreoElectronico(), o.getCorreoElectronico(), o.getCorreoElectronico(), o.getCorreoElectronico(), o.getFechaCreacion(), o.getIdTipoPersona(), o.getRazonSocial(), o.getTalla(), o.getPeso(), o.getImc(), o.getIdProfesion(), o.getIdNivelEducacion(), o.getAuditoriaUsuario(), o.getTelefonoFijo(), o.getTelefonoCelular(), o.getFechaDefuncion(), o.getIdTipoOcupacion(), o.getIdSectorEconomico(), o.getIdActividadEconomica(), o.getIdOcupacion(), o.getIdEstadoJuridico(), o.getIdCoberturaSalud(), o.getIndicadorVivo(), o.getIdTipoAfiliacion(), o.getIndicadorHabilitado(), o.getIdTipoTercero(), o.getIdTallaCamisa(), o.getIdTallaPantalon(), o.getIdTallaCalzado(), o.getSitioWeb()));
    }
}
