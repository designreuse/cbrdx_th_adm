package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposDatos;
import com.ciberdix.th.repositories.refactor.ListasTiposDatosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasTiposDatos")
@CrossOrigin
public class ListasTiposDatosRefactorController {

    @Autowired
    private ListasTiposDatosRefactorRepository listasTiposDatosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposDatos> findAll() {
        return (List<ListasTiposDatos>) listasTiposDatosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposDatos> findEnabled() {
        return (List<ListasTiposDatos>) listasTiposDatosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTiposDatos}")
    ListasTiposDatos findOne(@PathVariable Integer idTiposDatos) {
        return listasTiposDatosRefactorRepository.findOne(idTiposDatos);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposDatos create(@RequestBody ListasTiposDatos listasTiposReferencias) {
        return listasTiposDatosRefactorRepository.save(new ListasTiposDatos(listasTiposReferencias.getCodigo(), listasTiposReferencias.getNombre(), listasTiposReferencias.getOrden(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposDatos update(@RequestBody ListasTiposDatos divisionPolitica) {
        return listasTiposDatosRefactorRepository.save(divisionPolitica);
    }
}
