package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasCoberturasSalud;
import com.ciberdix.th.repositories.refactor.ListasCoberturasSaludRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@Transactional
@RequestMapping("/api/ListasCoberturasSalud")
@CrossOrigin
public class ListasCoberturasSaludRefactorController {

    @Autowired
    private ListasCoberturasSaludRefactorRepository coberturasSaludRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasCoberturasSalud> listarCoberturasSalud() {
        return coberturasSaludRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    ListasCoberturasSalud obtenerCoberturasSalud(@PathVariable Integer id) {
        return coberturasSaludRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasCoberturasSalud crearListasCoberturasSalud(@RequestBody ListasCoberturasSalud obj) {
        return coberturasSaludRepository.save(new ListasCoberturasSalud(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarListasCoberturasSalud(@RequestBody ListasCoberturasSalud obj) {
        coberturasSaludRepository.save(obj);
    }
}
