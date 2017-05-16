package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosDatosClinicos;
import com.ciberdix.th.models.VTercerosDatosClinicos;
import com.ciberdix.th.repositories.TercerosDatosClinicosRefactorRepository;
import com.ciberdix.th.repositories.VTercerosDatosClinicosRefactorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/api/tercerosDatosClinicos")
public class TercerosDatosClinicosRefactorController {

    @Autowired
    private TercerosDatosClinicosRefactorRepository tercerosDatosClinicosRefactorRepository;
    
    @Autowired
    private VTercerosDatosClinicosRefactorRepository vTercerosDatosClinicosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosDatosClinicos> findAll() {
        return (List<TercerosDatosClinicos>) tercerosDatosClinicosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosDatosClinicos findOne(@PathVariable Long id) {
        return tercerosDatosClinicosRefactorRepository.findOne(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{id}")
    List<VTercerosDatosClinicos> findDatosClinicos(@PathVariable Long id) {
        return (List<VTercerosDatosClinicos>) vTercerosDatosClinicosRefactorRepository.findByIdTercero(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{id}")
    VTercerosDatosClinicos findDatosClinicosOne(@PathVariable Long id) {
        return vTercerosDatosClinicosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosDatosClinicos create(@RequestBody TercerosDatosClinicos obj) {
        return tercerosDatosClinicosRefactorRepository.save(
                new TercerosDatosClinicos(obj.getIdTercero(), obj.getIdDiagnostico(), 
                        obj.getFechaInicio(), obj.getFechaFin(), 
                        obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosDatosClinicos obj) {
        tercerosDatosClinicosRefactorRepository.save(new TercerosDatosClinicos(obj.getIdTerceroDatoClinico(),obj.getIdTercero(), obj.getIdDiagnostico(),
                obj.getFechaInicio(), obj.getFechaFin(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }
}
