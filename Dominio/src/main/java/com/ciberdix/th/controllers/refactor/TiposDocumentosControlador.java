package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposDocumentos;
import com.ciberdix.th.repositories.refactor.TiposDocumentosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    private TiposDocumentosRepository tiposDocumentosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposDocumentos> listarTerceros() {
        return (List<ListasTiposDocumentos>) tiposDocumentosRepository.findAll();
    }
}
