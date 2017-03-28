package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasNivelesEstudios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciberdix.th.repositories.refactor.ListasNivelesEstudiosRefactorRepository;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/nivelesEstudios")
public class ListasNivelesEstudiosRefactorController {
    
    @Autowired
    private ListasNivelesEstudiosRefactorRepository listasNivelesEstudiosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasNivelesEstudios> listarNivelesEstudio() {
        return (List<ListasNivelesEstudios>) listasNivelesEstudiosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasNivelesEstudios> listEnabled() {
        return listasNivelesEstudiosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }
    
    @RequestMapping(method = RequestMethod.POST)
    ListasNivelesEstudios crearNivelesEstudios(@RequestBody ListasNivelesEstudios obj) {
        return listasNivelesEstudiosRefactorRepository.save(obj);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizarNivelesEstudios(@RequestBody ListasNivelesEstudios obj){
        listasNivelesEstudiosRefactorRepository.save(obj);
    }    
}