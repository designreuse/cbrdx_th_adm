package com.ciberdix.th.controllers;

import com.ciberdix.th.configuration.OutSpecialChars;
import com.ciberdix.th.models.DivisionPolitica;
import com.ciberdix.th.models.VDivisionPolitica;
import com.ciberdix.th.models.VDivisionPoliticaRec;
import com.ciberdix.th.repositories.DivisionPoliticaRefactorRepository;
import com.ciberdix.th.repositories.VDivisionPoliticaRecRefactorRepository;
import com.ciberdix.th.repositories.VDivisionPoliticaRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
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

    @Autowired
    private VDivisionPoliticaRefactorRepository vDivisionPoliticaRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPolitica> findAll() {
        return (List<DivisionPolitica>) divisionPoliticaRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idDivisionPolitica}")
    VDivisionPoliticaRec findOne(@PathVariable Integer idDivisionPolitica) {
        return vDivisionPoliticaRecRefactorRepository.findOne(idDivisionPolitica);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarHijos/{idDivisionPoliticaPadre}")
    List<DivisionPolitica> findSons(@PathVariable Integer idDivisionPoliticaPadre) {
        return divisionPoliticaRefactorRepository.findByIdDivisionPoliticaPadre(idDivisionPoliticaPadre);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarLocalizaciones/{queryString}/")
    List<VDivisionPoliticaRec> findHoods(@PathVariable String queryString) {
        List<VDivisionPoliticaRec> presort = vDivisionPoliticaRecRefactorRepository.queryLocations(queryString);
        presort.sort(Comparator.comparing(VDivisionPoliticaRec::getCamino));
        return presort;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarLocalizacionesAll/{queryString}/")
    List<VDivisionPoliticaRec> findLocaliAll(@PathVariable String queryString) {
        String queryStringO = OutSpecialChars.getStr(queryString);
        return vDivisionPoliticaRecRefactorRepository.queryLocationsAll(queryStringO);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarLocalizacion/{idLocalizacion}")
    VDivisionPoliticaRec findInView(@PathVariable Integer idLocalizacion) {
        return vDivisionPoliticaRecRefactorRepository.findOne(idLocalizacion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCiudad/{queryString}/")
    List<VDivisionPoliticaRec> findCities(@PathVariable String queryString) {
        return vDivisionPoliticaRecRefactorRepository.queryAllCities(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/search/{label}")
    ArrayList<VDivisionPolitica> findByWildCard(@PathVariable String label) {

        String queryOutSChars = OutSpecialChars.getStr(label);

        ArrayList<VDivisionPolitica> listVCFinal;

        listVCFinal = (ArrayList<VDivisionPolitica>) vDivisionPoliticaRefactorRepository.queryVDivsByLabel(queryOutSChars);

        if (listVCFinal.size() < 1) {
            listVCFinal = (ArrayList<VDivisionPolitica>) vDivisionPoliticaRefactorRepository.queryVDivByLabelAll(queryOutSChars);
        }

        return listVCFinal;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/divisionPublicacion")
    List<DivisionPolitica> findByPublicacion() {
        return divisionPoliticaRefactorRepository.queryAllByPublicacion();
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPolitica create(@RequestBody DivisionPolitica c) {
        return divisionPoliticaRefactorRepository.save(new DivisionPolitica(c.getIdDivisionPoliticaPadre(), c.getCodigoDivisionPolitica(), c.getDescripcionDivisonPolitica(), c.getIndicativoDivisonPolitica(), c.getCodigoPostalDivisionPolitica(), c.getIdDivisionPoliticaTipo(), c.getIdDivisionPoliticaArea(), c.getIdDivisionPoliticaAgrupacion(), c.getIdEstratoDivisionPolitica(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario(), c.getGentilicio()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivisionPolitica update(@RequestBody DivisionPolitica c) {
        return divisionPoliticaRefactorRepository.save(
                new DivisionPolitica(c.getIdDivisionPolitica(),c.getIdDivisionPoliticaPadre(), c.getCodigoDivisionPolitica(), c.getDescripcionDivisonPolitica(), c.getIndicativoDivisonPolitica(), c.getCodigoPostalDivisionPolitica(), c.getIdDivisionPoliticaTipo(), c.getIdDivisionPoliticaArea(), c.getIdDivisionPoliticaAgrupacion(), c.getIdEstratoDivisionPolitica(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario(), c.getGentilicio())
        );
    }
}
