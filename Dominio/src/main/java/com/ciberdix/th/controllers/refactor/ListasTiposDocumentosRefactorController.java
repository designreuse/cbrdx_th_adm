package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposDocumentos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.ciberdix.th.repositories.refactor.ListasTiposDocumentosRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tiposDocumentos")
public class ListasTiposDocumentosRefactorController {

    @Autowired
    private ListasTiposDocumentosRefactorRepository tiposDocumentosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposDocumentos> listarTerceros() {
        return (List<ListasTiposDocumentos>) tiposDocumentosRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasTiposDocumentos> listEnabled() {
        return tiposDocumentosRepository.findByIndicadorHabilitadoIsTrue();
    }
    
    @RequestMapping(method = RequestMethod.POST)
    ListasTiposDocumentos crearTiposDocumentos(@RequestBody ListasTiposDocumentos obj) {
        return tiposDocumentosRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTiposDocumentos(@RequestBody ListasTiposDocumentos obj) {
        tiposDocumentosRepository.save(obj);
    }    
}
