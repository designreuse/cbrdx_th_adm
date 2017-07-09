package com.ciberdix.th.controllers;

import com.ciberdix.th.models.DocumentosTerceros;
import com.ciberdix.th.repositories.DocumentosTercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@RestController
@Transactional
@RequestMapping("/api/documentosTerceros")
public class DocumentosTercerosRefactorController {

    @Autowired
    private DocumentosTercerosRefactorRepository documentosTercerosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DocumentosTerceros> findAll() {
        return (List<DocumentosTerceros>) documentosTercerosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    DocumentosTerceros findOne(@PathVariable Integer id) {
        return documentosTercerosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<DocumentosTerceros> findEnabled() {
        return documentosTercerosRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/clasificacionDocumento/{id}")
    List<DocumentosTerceros> findByIdClasificacionDocumento(@PathVariable Integer id) {
        return documentosTercerosRefactorRepository.findAllByIdClasificacionDocumento(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    DocumentosTerceros create(@RequestBody DocumentosTerceros o) {
        return documentosTercerosRefactorRepository.save(new DocumentosTerceros(
                o.getIdClasificacionDocumento(),o.getNombre(),
                o.getCodigoInstitucional(),o.getDescripcion(),o.getIndicadorAdjunto(),o.getIndicadorDescarga(),
                o.getIdAdjunto(),o.getIndicadorContratacion(),o.getVigencia(),
                o.getIndicadorAplica(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DocumentosTerceros o) {
        documentosTercerosRefactorRepository.save(
                new DocumentosTerceros(
                        o.getIdDocumentoTercero(),o.getIdClasificacionDocumento(),o.getNombre(),
                        o.getCodigoInstitucional(),o.getDescripcion(),o.getIndicadorAdjunto(),o.getIndicadorDescarga(),
                        o.getIdAdjunto(),o.getIndicadorContratacion(),o.getVigencia(),
                        o.getIndicadorAplica(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
