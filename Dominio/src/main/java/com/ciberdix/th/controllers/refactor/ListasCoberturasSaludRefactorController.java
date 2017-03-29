package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasCoberturasSalud;
import com.ciberdix.th.repositories.refactor.ListasCoberturasSaludRefactorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@Transactional
@RequestMapping("/api/coberturasSalud")
@CrossOrigin
public class ListasCoberturasSaludRefactorController {

    @Autowired
    private ListasCoberturasSaludRefactorRepository coberturasSaludRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasCoberturasSalud> listarCoberturasSalud() {
        return (List<ListasCoberturasSalud>) coberturasSaludRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    ListasCoberturasSalud obtenerCoberturasSalud(@PathVariable Integer id) {
        return coberturasSaludRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasCoberturasSalud crearListasCoberturasSalud(@RequestBody ListasCoberturasSalud obj) {
        return coberturasSaludRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarListasCoberturasSalud(@RequestBody ListasCoberturasSalud obj) {
        coberturasSaludRepository.save(obj);
    }
}
