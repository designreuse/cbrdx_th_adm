package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasAtributosCargos;
import com.ciberdix.th.repositories.refactor.ListasAtributosCargosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/listasAtributosCargos")
public class ListasAtributosCargosRefactorController {

    @Autowired
    private ListasAtributosCargosRefactorRepository listasAtributosCargosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasAtributosCargos> listarTerceros() {
        return (List<ListasAtributosCargos>) listasAtributosCargosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasAtributosCargos> listEnabled() {
        return listasAtributosCargosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasAtributosCargos crearGeneros(@RequestBody ListasAtributosCargos obj) {
        return listasAtributosCargosRefactorRepository.save(new ListasAtributosCargos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarGeneros(@RequestBody ListasAtributosCargos obj) {
        listasAtributosCargosRefactorRepository.save(obj);
    }
}
