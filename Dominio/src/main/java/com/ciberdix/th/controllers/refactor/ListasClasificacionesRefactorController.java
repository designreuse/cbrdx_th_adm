package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Funcionalidades;
import com.ciberdix.th.models.refactor.ListasClasificaciones;
import com.ciberdix.th.repositories.refactor.ListasClasificacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasClasificaciones")
public class ListasClasificacionesRefactorController {

    @Autowired
    private ListasClasificacionesRefactorRepository listasClasificacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasificaciones> getLists() {
        return (List<ListasClasificaciones>) listasClasificacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id/{idListaClasificacion}")
    List<ListasClasificaciones> findByOne(@PathVariable Integer idListaClasificacion) {
        return (List<ListasClasificaciones>) listasClasificacionesRefactorRepository.findOne(idListaClasificacion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sec/{idListaClasificacion}")
    List<ListasClasificaciones> queryAllByIdSecCamSec(@PathVariable Integer idListaClasificacion) {
        ListasClasificaciones lc = listasClasificacionesRefactorRepository.findOne(idListaClasificacion);
        String sec = "sec";
        return (List<ListasClasificaciones>) listasClasificacionesRefactorRepository.queryAllByIdSecCam(idListaClasificacion, sec);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cam/{idListaClasificacion}")
    List<ListasClasificaciones> queryAllByIdSecCamCam(@PathVariable Integer idListaClasificacion) {
        ListasClasificaciones lc = listasClasificacionesRefactorRepository.findOne(idListaClasificacion);
        String sec = "cam";
        return (List<ListasClasificaciones>) listasClasificacionesRefactorRepository.queryAllByIdSecCam(idListaClasificacion, sec);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sec")
    List<ListasClasificaciones> queryAllBySecCamSec() {
        String sec = "sec";
        return (List<ListasClasificaciones>) listasClasificacionesRefactorRepository.queryAllBySecCam(sec);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cam")
    List<ListasClasificaciones> queryAllBySecCamCam() {
        String cam = "cam";
        return (List<ListasClasificaciones>) listasClasificacionesRefactorRepository.queryAllBySecCam(cam);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasificaciones createList(@RequestBody ListasClasificaciones l) {
        return listasClasificacionesRefactorRepository.save(
                new ListasClasificaciones(l.getCodigo(), l.getNombre(), l.getOrden(),
                        l.getIndicadorHabilitado(), l.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasClasificaciones updateList(@RequestBody ListasClasificaciones listasClasificaciones) {
        return listasClasificacionesRefactorRepository.save(listasClasificaciones);
    }


}
