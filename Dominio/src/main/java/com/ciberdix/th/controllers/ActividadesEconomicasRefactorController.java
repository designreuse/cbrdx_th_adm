package com.ciberdix.th.controllers;

import com.ciberdix.th.configuration.OutSpecialChars;
import com.ciberdix.th.models.ActividadesEconomicas;
import com.ciberdix.th.models.VActividadesEconomicas;
import com.ciberdix.th.repositories.ActividadesEconomicasRefactorRepository;

import java.util.ArrayList;
import java.util.List;

import com.ciberdix.th.repositories.VActividadesEconomicasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@Transactional
@RequestMapping("/api/actividadesEconomicas")
@CrossOrigin
public class ActividadesEconomicasRefactorController {

    @Autowired
    private ActividadesEconomicasRefactorRepository actividadesEconomicasRepository;

    @Autowired
    private VActividadesEconomicasRefactorRepository vActividadesEconomicasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ActividadesEconomicas> listarActividadesEconomicas() {
        return (List<ActividadesEconomicas>) actividadesEconomicasRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/padre/{id}")
    List<ActividadesEconomicas> listarActividadesEconomicas(@PathVariable Integer id) {
        return (List<ActividadesEconomicas>) actividadesEconomicasRepository.findByIdActividadPadre(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ActividadesEconomicas parent(@PathVariable Integer id) {
        return actividadesEconomicasRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/lastChild/{id}")
    List<ActividadesEconomicas> lastChild(@PathVariable Integer id) {
        return actividadesEconomicasRepository.queryAllActividadesEconomicasPorTipo(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/search/{label}")
    ArrayList<VActividadesEconomicas> findByWildCard(@PathVariable String label){

        String queryOutSChars = OutSpecialChars.getStr(label);

        ArrayList<VActividadesEconomicas> listVCFinal;

        listVCFinal = (ArrayList<VActividadesEconomicas>) vActividadesEconomicasRefactorRepository.queryVActiviByLabel(queryOutSChars);

        if (listVCFinal.size()<1){
            listVCFinal = (ArrayList<VActividadesEconomicas>) vActividadesEconomicasRefactorRepository.queryVActiviByLabelAll(queryOutSChars);
        }

        return listVCFinal;
    }

    @RequestMapping(method = RequestMethod.POST)
    ActividadesEconomicas crearActividadEconomica(@RequestBody ActividadesEconomicas obj) {
        return actividadesEconomicasRepository.save(new ActividadesEconomicas(obj.getIdActividadPadre(),
                obj.getIdActividadTipo(),obj.getActividadEconomica(),obj.getIndicadorHabilitado(),
                obj.getAuditoriaUsuario(),obj.getCodigoActividadEconomica()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody ActividadesEconomicas o) {
        actividadesEconomicasRepository.save(
                new ActividadesEconomicas(o.getIdActividadEconomica(),o.getIdActividadPadre(), o.getIdActividadTipo(),
                        o.getActividadEconomica(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario(),
                        o.getCodigoActividadEconomica())
        );
    }
}
