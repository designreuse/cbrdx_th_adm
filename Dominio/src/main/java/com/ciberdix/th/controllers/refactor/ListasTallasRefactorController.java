package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTallas;
import com.ciberdix.th.repositories.refactor.ListasTallasRefactorRepository;
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
@RequestMapping("/api/listasTallas")
@CrossOrigin
public class ListasTallasRefactorController {
    
    @Autowired
    private ListasTallasRefactorRepository listasTallasRefactorRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    List<ListasTallas> findAll() {
        return (List<ListasTallas>) listasTallasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTallas findOne(@PathVariable Integer id) {
        return listasTallasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/{codigo}")
    List<ListasTallas> findEnabled(@PathVariable String codigo) {
        return (List<ListasTallas>) listasTallasRefactorRepository.findByIndicadorHabilitadoIsTrueAndCodigoStartingWith(codigo);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTallas create(@RequestBody ListasTallas listasTallas) {
        return listasTallasRefactorRepository.save(listasTallas);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTallas listasTallas) {
        listasTallasRefactorRepository.save(listasTallas);
    }    
}
