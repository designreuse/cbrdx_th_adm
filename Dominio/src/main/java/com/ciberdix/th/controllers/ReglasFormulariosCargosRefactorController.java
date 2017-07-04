package com.ciberdix.th.controllers;

import com.ciberdix.th.models.VPermisosFormularios;
import com.ciberdix.th.repositories.VPermisosFormulariosCargosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 27/06/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/reglasFormulariosCargos")
public class ReglasFormulariosCargosRefactorController {

    @Autowired
    VPermisosFormulariosCargosRepository vPermisosFormulariosCargosRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/{codigo}")
    List<VPermisosFormularios> findAll(@PathVariable String codigo) {
        List<VPermisosFormularios> permisos = vPermisosFormulariosCargosRepository.queryByCodigoMenu(codigo);
        return permisos;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/rol/{rol}/{codigo}")
    List<VPermisosFormularios> findByRol(@PathVariable String rol, @PathVariable String codigo) {
        List<VPermisosFormularios> permisos = vPermisosFormulariosCargosRepository.findByRolAndCodigoMenu(rol, codigo);
        return permisos;
    }
}
