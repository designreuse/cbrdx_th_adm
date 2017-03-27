package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasNivelesEstudios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciberdix.th.repositories.refactor.NivelAcademicoRefactorRepository;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/nivelesEstudios")
public class NivelAcademicoControlador {
    
    @Autowired
    private NivelAcademicoRefactorRepository nivelesEstudiosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasNivelesEstudios> listarNivelesEstudio() {
        return (List<ListasNivelesEstudios>) nivelesEstudiosRepository.findAll();
    }    
}