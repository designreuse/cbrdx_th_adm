package com.ciberdix.th.controllers;

import com.ciberdix.th.models.PublicacionesCuestionarios;
import com.ciberdix.th.repositories.PublicacionesCuestionariosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/publicacionesCuestionarios")
@CrossOrigin
public class PublicacionesCuestionariosRefactorController {

    @Autowired
    private PublicacionesCuestionariosRefactorRepository publicacionesCuestionariosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<PublicacionesCuestionarios> listarProductividades() {
        return (List<PublicacionesCuestionarios>) publicacionesCuestionariosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    PublicacionesCuestionarios parent(@PathVariable Integer id) {
        return publicacionesCuestionariosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    PublicacionesCuestionarios crearActividadEconomica(@RequestBody PublicacionesCuestionarios o) {
        return publicacionesCuestionariosRefactorRepository.save(
                new PublicacionesCuestionarios(o.getIdPublicacion(),o.getIdCuestionario(),
                        o.getOrden(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody PublicacionesCuestionarios o) {
        publicacionesCuestionariosRefactorRepository.save(
                new PublicacionesCuestionarios(o.getIdPublicacionCustionario(),o.getIdPublicacion(),o.getIdCuestionario(),
                        o.getOrden(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario())
        );
    }

}
