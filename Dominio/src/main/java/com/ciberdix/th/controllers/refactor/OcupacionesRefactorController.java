package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.Ocupaciones;
import com.ciberdix.th.models.VOcupaciones;
import com.ciberdix.th.repositories.OcupacionesRefactorRepository;
import com.ciberdix.th.repositories.VOcupacionesRefactorRepository;
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
@RequestMapping("/api/ocupaciones")
public class OcupacionesRefactorController {

    @Autowired
    private OcupacionesRefactorRepository ocupacionesRepository;

    @Autowired
    private VOcupacionesRefactorRepository vOcupacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Ocupaciones> findAll() {
        return (List<Ocupaciones>) ocupacionesRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Ocupaciones findOne(@PathVariable Integer id) {
        return ocupacionesRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tipo/{id}")
    List<Ocupaciones> listarPorTipo(@PathVariable Integer id) {
        return ocupacionesRepository.findByIdOcupacionTipo(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{idCargo}")
    List<Ocupaciones> listarPorCargo(@PathVariable Integer idCargo) {
        return ocupacionesRepository.findByIdCargo(idCargo);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<Ocupaciones> listEnabled() {
        return ocupacionesRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/search/{label}")
    List<VOcupaciones> getOcupaciones(@PathVariable String label) {
        return vOcupacionesRefactorRepository.findByLabelContains(label);
    }

    @RequestMapping(method = RequestMethod.POST)
    Ocupaciones crearOcupaciones(@RequestBody Ocupaciones obj) {
        return ocupacionesRepository.save(new Ocupaciones(obj.getIdOcupacionPadre(), obj.getIdOcupacionTipo(), obj.getCodigoOcupacion(), obj.getOcupacion(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarOcupaciones(@RequestBody Ocupaciones obj) {
        ocupacionesRepository.save(obj);
    }
}
