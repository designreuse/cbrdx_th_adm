package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RequerimientosCuestionarios;
import com.ciberdix.th.models.VRequerimientosCuestionarios;
import com.ciberdix.th.repositories.RequerimientosCuestionariosRefactorRepository;
import com.ciberdix.th.repositories.VRequerimientosCuestionariosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 19/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/requerimientosCuestionarios")
public class RequerimientosCuestionariosRefactorController {

    @Autowired
    private RequerimientosCuestionariosRefactorRepository requerimientosCuestionariosRefactorRepository;

    @Autowired
    private VRequerimientosCuestionariosRefactorRepository vRequerimientosCuestionariosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientosCuestionarios> findAll() {
        return (List<VRequerimientosCuestionarios>) vRequerimientosCuestionariosRefactorRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRequerimientosCuestionarios findOne(@PathVariable Integer id) {
        return vRequerimientosCuestionariosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<VRequerimientosCuestionarios> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        return vRequerimientosCuestionariosRefactorRepository.findAllByIndicadorHabilitadoIsTrueAndIdRequerimiento(idRequerimiento);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosCuestionarios create(@RequestBody RequerimientosCuestionarios o) {
        return requerimientosCuestionariosRefactorRepository.save(

                new RequerimientosCuestionarios(o.getIdRequerimiento(),o.getIdCuestionario(),
                        o.getAuditoriaUsuario(),o.getIndicadorHabilitado())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosCuestionarios o) {
        requerimientosCuestionariosRefactorRepository.save(
                new RequerimientosCuestionarios(o.getIdRequerimientoCuestionario(),o.getIdRequerimiento(),
                        o.getIdCuestionario(),o.getAuditoriaUsuario(),o.getIndicadorHabilitado())
        );
    }

}
