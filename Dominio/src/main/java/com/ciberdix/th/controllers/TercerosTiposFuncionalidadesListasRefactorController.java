package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosTiposFuncionalidadesListas;
import com.ciberdix.th.models.VTercerosTiposFuncionalidadesListas;
import com.ciberdix.th.repositories.TercerosTiposFuncionalidadesListasRefactorRepository;
import com.ciberdix.th.repositories.VTercerosTiposFuncionalidadesListasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosTiposFuncionalidadesListas")
public class TercerosTiposFuncionalidadesListasRefactorController {

    @Autowired
    private TercerosTiposFuncionalidadesListasRefactorRepository TercerosTiposFuncionalidadesListasRefactorRepository;

    @Autowired
    private VTercerosTiposFuncionalidadesListasRefactorRepository vTercerosTiposFuncionalidadesListasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosTiposFuncionalidadesListas> findAll() {
        return (List<VTercerosTiposFuncionalidadesListas>) vTercerosTiposFuncionalidadesListasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosTiposFuncionalidadesListas> findEnabled() {
        return vTercerosTiposFuncionalidadesListasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosTiposFuncionalidadesListas findOne(@PathVariable Integer id) {
        return vTercerosTiposFuncionalidadesListasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipoFuncionalidad/{id}")
    List<VTercerosTiposFuncionalidadesListas> findByIdTerceroTipoFuncionalidad(@PathVariable Integer id) {
        return vTercerosTiposFuncionalidadesListasRefactorRepository.findAllByIdTerceroTipoFuncionalidad(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/seccion/{id}")
    List<VTercerosTiposFuncionalidadesListas> findByIdSeccion(@PathVariable Integer id) {
        return vTercerosTiposFuncionalidadesListasRefactorRepository.findAllByIdSeccion(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/control/{id}")
    List<VTercerosTiposFuncionalidadesListas> findByIdControl(@PathVariable Integer id) {
        return vTercerosTiposFuncionalidadesListasRefactorRepository.findAllByIdControl(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposFuncionalidadesListas create(@RequestBody TercerosTiposFuncionalidadesListas o) {
        return TercerosTiposFuncionalidadesListasRefactorRepository.save(
                new TercerosTiposFuncionalidadesListas(

                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposFuncionalidadesListas o) {
        TercerosTiposFuncionalidadesListasRefactorRepository.save(
                new TercerosTiposFuncionalidadesListas(

                )
        );
    }
    
}
