package com.ciberdix.th.controllers;

import com.ciberdix.th.models.PublicacionesCuestionarios;
import com.ciberdix.th.models.VPublicacionesCuestionarios;
import com.ciberdix.th.repositories.PublicacionesCuestionariosRefactorRepository;
import com.ciberdix.th.repositories.VPublicacionesCuestionariosRefactorRepository;
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

    @Autowired
    private VPublicacionesCuestionariosRefactorRepository vPublicacionesCuestionariosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VPublicacionesCuestionarios> listarProductividades() {
        return (List<VPublicacionesCuestionarios>) vPublicacionesCuestionariosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPublicacionesCuestionarios parent(@PathVariable Integer id) {
        return vPublicacionesCuestionariosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacion/{id}")
    List<VPublicacionesCuestionarios> findByIdPublicacion(@PathVariable Integer id) {
        return vPublicacionesCuestionariosRefactorRepository.findAllByIdPublicacion(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacion/{id}/enabled")
    List<VPublicacionesCuestionarios> findByIdPublicacionEnabled(@PathVariable Integer id) {
        return vPublicacionesCuestionariosRefactorRepository.findAllByIdPublicacionAndIndicadorHabilitadoTrue(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    PublicacionesCuestionarios crearActividadEconomica(@RequestBody PublicacionesCuestionarios o) {
        return publicacionesCuestionariosRefactorRepository.save(
                new PublicacionesCuestionarios(o.getIdPublicacion(), o.getIdCuestionario(),
                        o.getOrden(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody PublicacionesCuestionarios o) {
        publicacionesCuestionariosRefactorRepository.save(
                new PublicacionesCuestionarios(o.getIdPublicacionCustionario(), o.getIdPublicacion(), o.getIdCuestionario(),
                        o.getOrden(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario())
        );
    }

}
