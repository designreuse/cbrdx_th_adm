package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasSectoresEmpresas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciberdix.th.repositories.refactor.SectoresEmpresasRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/sectoresEmpresas")
public class SectoresEmpresasControlador {

    @Autowired
    private SectoresEmpresasRefactorRepository sectoresEmpresasRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasSectoresEmpresas> listarSectoresEmpresas() {
        return (List<ListasSectoresEmpresas>) sectoresEmpresasRepository.findAll();
    }    
    
    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasSectoresEmpresas> listEnabled() {
        return sectoresEmpresasRepository.findByIndicadorHabilitadoIsTrue();
    }    
}
