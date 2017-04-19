package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosProyecciones;
import com.ciberdix.th.repositories.refactor.ListasEstadosProyeccionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/listasEstadosProyecciones")
@CrossOrigin
public class ListasEstadosProyeccionesRefactorController {
    @Autowired
    private ListasEstadosProyeccionesRefactorRepository listasEstadosProyeccionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosProyecciones> listarEstadosJuridicos() {
        return (List<ListasEstadosProyecciones>) listasEstadosProyeccionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasEstadosProyecciones> listEnabled() {
        return listasEstadosProyeccionesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    ListasEstadosProyecciones obtenerEstadoJuridico(@PathVariable Integer id) {
        return listasEstadosProyeccionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosProyecciones crearListasEstadosJuridicos(@RequestBody ListasEstadosProyecciones obj){
        return listasEstadosProyeccionesRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarListasEstadosJuridicos(@RequestBody ListasEstadosProyecciones obj){
        listasEstadosProyeccionesRefactorRepository.save(obj);
    }
}
