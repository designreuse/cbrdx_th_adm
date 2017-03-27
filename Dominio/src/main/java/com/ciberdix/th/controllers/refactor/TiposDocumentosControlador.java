package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposDocumentos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciberdix.th.repositories.refactor.TiposDocumentosRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tiposDocumentos")
public class TiposDocumentosControlador {

    @Autowired
    private TiposDocumentosRefactorRepository tiposDocumentosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposDocumentos> listarTerceros() {
        return (List<ListasTiposDocumentos>) tiposDocumentosRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasTiposDocumentos> listEnabled() {
        return tiposDocumentosRepository.findByIndicadorHabilitadoIsTrue();
    }     
}
