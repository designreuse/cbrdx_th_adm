package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RelacionesListas;
import com.ciberdix.th.models.VRelacionesListas;
import com.ciberdix.th.repositories.RelacionesListasRefactorRepository;
import com.ciberdix.th.repositories.VRelacionesListasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 20/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/relacionesListas")
public class RelacionesListasRefactorController {

    @Autowired
    private RelacionesListasRefactorRepository relacionesListasRefactorRepository;

    @Autowired
    private VRelacionesListasRefactorRepository vRelacionesListasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRelacionesListas> findAll() {
        return (List<VRelacionesListas>) vRelacionesListasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VRelacionesListas> findEnabled() {
        return vRelacionesListasRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{codigo}")
    RelacionesListas findByCodigo(@PathVariable String codigo) {
        return relacionesListasRefactorRepository.findByCodigo(codigo);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/findByParents/{idParent}/{idItem}")
    List<RelacionesListas> findRelationship(@PathVariable Integer idParent, @PathVariable Integer idItem) {
        return relacionesListasRefactorRepository.findByIdListaPadreAndIdItemPadreAndIndicadorHabilitadoIsTrue(idParent, idItem);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRelacionesListas findOne(@PathVariable Integer id) {
        return vRelacionesListasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    RelacionesListas create(@RequestBody RelacionesListas o) {
        return relacionesListasRefactorRepository.save(
                new RelacionesListas(
                        o.getIdListaPadre(), o.getIdListaHijo(), o.getIdItemPadre(), o.getNombreRelacion(),
                        o.getCodigo(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RelacionesListas o) {
        relacionesListasRefactorRepository.save(new RelacionesListas(
                o.getIdRelacionLista(), o.getIdListaPadre(), o.getIdListaHijo(), o.getIdItemPadre(),
                o.getNombreRelacion(), o.getCodigo(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario()
        ));
    }

}
