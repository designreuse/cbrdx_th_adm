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
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/sectoresEmpresas")
public class ListasSectoresEmpresasRefactorController {

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

    @RequestMapping(method = RequestMethod.POST)
    ListasSectoresEmpresas crearSectoresEmpresas(@RequestBody ListasSectoresEmpresas obj) {
        return sectoresEmpresasRepository.save(obj);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizarSectoresEmpresas(@RequestBody ListasSectoresEmpresas obj){
        sectoresEmpresasRepository.save(obj);
    }     
}
