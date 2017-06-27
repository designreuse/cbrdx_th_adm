package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Reglas;
import com.ciberdix.th.models.VPermisosFormulariosCargos;
import com.ciberdix.th.repositories.VPermisosFormulariosCargosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    List<VPermisosFormulariosCargos> findAll(@PathVariable String codigo) {
        List<VPermisosFormulariosCargos> permisos = vPermisosFormulariosCargosRepository.queryByCodigoMenu(codigo);
        return permisos;
    }
}
