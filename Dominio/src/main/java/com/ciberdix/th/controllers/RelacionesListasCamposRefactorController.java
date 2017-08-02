package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RelacionesListasCampos;
import com.ciberdix.th.models.VRelacionesListasCampos;
import com.ciberdix.th.repositories.RelacionesListasSeccionesRefactorRepository;
import com.ciberdix.th.repositories.VRelacionesListasSeccionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 27/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/relacionesListasCampos")
public class RelacionesListasCamposRefactorController {

    @Autowired
    private RelacionesListasSeccionesRefactorRepository relacionesListasSeccionesRefactorRepository;

    @Autowired
    private VRelacionesListasSeccionesRefactorRepository vRelacionesListasSeccionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRelacionesListasCampos> findAll() {
        return (List<VRelacionesListasCampos>) vRelacionesListasSeccionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/control/{idControl}")
    List<RelacionesListasCampos> findByIdControl(@PathVariable Integer idControl) {
        return relacionesListasSeccionesRefactorRepository.findByIndicadorHabilitadoTrueAndIdFuncionalidadesControles(idControl);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VRelacionesListasCampos> findEnabled() {
        return vRelacionesListasSeccionesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRelacionesListasCampos findOne(@PathVariable Integer id) {
        return vRelacionesListasSeccionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/relacionLista/{id}")
    List<VRelacionesListasCampos> findRelacionLista(@PathVariable Integer id) {
        return vRelacionesListasSeccionesRefactorRepository.findAllByIdRelacionLista(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/funcionalidadControl/{id}")
    List<VRelacionesListasCampos> findFuncionalidadControl(@PathVariable Integer id) {
        return vRelacionesListasSeccionesRefactorRepository.findAllByIdFuncionalidadesControles(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    RelacionesListasCampos create(@RequestBody RelacionesListasCampos o) {
        return relacionesListasSeccionesRefactorRepository.save(
                new RelacionesListasCampos(
                        o.getIdRelacionLista(), o.getIdFuncionalidadesControles(),
                        o.getIndicadorHabilitado(), o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RelacionesListasCampos o) {
        relacionesListasSeccionesRefactorRepository.save(new RelacionesListasCampos(
                o.getIdRelacionListaCampo(), o.getIdRelacionLista(), o.getIdFuncionalidadesControles(),
                o.getIndicadorHabilitado(), o.getAuditoriaUsuario()
        ));
    }

}
