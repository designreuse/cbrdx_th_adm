package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposTerceros;
import com.ciberdix.th.repositories.refactor.ListasTiposTercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasTiposTerceros")
@CrossOrigin
public class ListasTiposTercerosRefactorController {

    @Autowired
    private ListasTiposTercerosRefactorRepository listasTiposTercerosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposTerceros> findAll() {
        return (List<ListasTiposTerceros>) listasTiposTercerosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposTerceros> findEnabled() {
        return (List<ListasTiposTerceros>) listasTiposTercerosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idListaInstitucion}")
    ListasTiposTerceros findOne(@PathVariable Integer idListaInstitucion) {
        return listasTiposTercerosRefactorRepository.findOne(idListaInstitucion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCodigo/{codigo}")
    ListasTiposTerceros findOne(@PathVariable String codigo) {
        return listasTiposTercerosRefactorRepository.findByIndicadorHabilitadoIsTrueAndCodigo(codigo);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposTerceros create(@RequestBody ListasTiposTerceros listasTiposReferencias) {
        return listasTiposTercerosRefactorRepository.save(new ListasTiposTerceros(listasTiposReferencias.getCodigo(), listasTiposReferencias.getNombre(), listasTiposReferencias.getOrden(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposTerceros update(@RequestBody ListasTiposTerceros divisionPolitica) {
        return listasTiposTercerosRefactorRepository.save(divisionPolitica);
    }
}
