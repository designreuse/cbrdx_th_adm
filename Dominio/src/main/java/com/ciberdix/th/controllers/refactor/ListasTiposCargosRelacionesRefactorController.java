package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposCargosRelaciones;
import com.ciberdix.th.repositories.refactor.ListasTiposCargosRelacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasTiposCargosRelaciones")
@CrossOrigin
public class ListasTiposCargosRelacionesRefactorController {

    @Autowired
    private ListasTiposCargosRelacionesRefactorRepository listasTiposCargosRelacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposCargosRelaciones> findAll() {
        return (List<ListasTiposCargosRelaciones>) listasTiposCargosRelacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposCargosRelaciones> findEnabled() {
        return listasTiposCargosRelacionesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposCargosRelaciones create(@RequestBody ListasTiposCargosRelaciones obj) {
        return listasTiposCargosRelacionesRefactorRepository.save(new ListasTiposCargosRelaciones(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposCargosRelaciones update(@RequestBody ListasTiposCargosRelaciones obj) {
        return listasTiposCargosRelacionesRefactorRepository.save(obj);
    }
}
