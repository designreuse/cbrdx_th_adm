package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.DivisionPolitica;
import com.ciberdix.th.models.refactor.VDivisionPoliticaRec;
import com.ciberdix.th.repositories.refactor.DivisionPoliticaRefactorRepository;
import com.ciberdix.th.repositories.refactor.VDivisionPoliticaRecRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/divisionPolitica")
@CrossOrigin
public class DivisionPoliticaRefactorController {

    @Autowired
    private DivisionPoliticaRefactorRepository divisionPoliticaRefactorRepository;

    @Autowired
    private VDivisionPoliticaRecRefactorRepository vDivisionPoliticaRecRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPolitica> findAll() {
        return (List<DivisionPolitica>) divisionPoliticaRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idDivisionPolitica}")
    DivisionPolitica findOne(@PathVariable Integer idDivisionPolitica) {
        return divisionPoliticaRefactorRepository.findOne(idDivisionPolitica);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarHijos/{idDivisionPoliticaPadre")
    List<DivisionPolitica> findSons(@PathVariable Integer idDivisionPoliticaPadre) {
        return divisionPoliticaRefactorRepository.findByIdDivisionPoliticaPadre(idDivisionPoliticaPadre);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarLocalizaciones/{queryString}/")
    List<VDivisionPoliticaRec> findHoods(@PathVariable String queryString) {
        return vDivisionPoliticaRecRefactorRepository.queryLocations(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarLocalizacion/{idLocalizacion}")
    VDivisionPoliticaRec findInView(@PathVariable Integer idLocalizacion) {
        return vDivisionPoliticaRecRefactorRepository.findOne(idLocalizacion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCiudad/{queryString}/")
    List<VDivisionPoliticaRec> findCities(@PathVariable String queryString) {
        return vDivisionPoliticaRecRefactorRepository.queryAllCities(queryString);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPolitica create(@RequestBody DivisionPolitica divisionPolitica) {
        return divisionPoliticaRefactorRepository.save(new DivisionPolitica(divisionPolitica.getIdDivisionPoliticaPadre(), divisionPolitica.getCodigoDivisionPolitica(), divisionPolitica.getDescripcionDivisonPolitica(), divisionPolitica.getIndicativoDivisonPolitica(), divisionPolitica.getCodigoPostalDivisionPolitica(), divisionPolitica.getIdDivisionPoliticaTipo(), divisionPolitica.getIdDivisionPoliticaArea(), divisionPolitica.getIdDivisionPoliticaResguardo(), divisionPolitica.getIdEstratoDivisionPolitica(), divisionPolitica.getIndicadorHabilitado(), divisionPolitica.getAuditoriaUsuario(), divisionPolitica.getIdDivisionPoliticaComuna(), divisionPolitica.getIdDivisionPoliticaLocalidad()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivisionPolitica update(@RequestBody DivisionPolitica divisionPolitica) {
        return divisionPoliticaRefactorRepository.save(divisionPolitica);
    }
}
