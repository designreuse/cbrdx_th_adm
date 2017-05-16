package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.configuration.OutSpecialChars;
import com.ciberdix.th.models.VTerceros;
import com.ciberdix.th.repositories.VTercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/vterceros")
public class VTercerosRefactorController {

    @Autowired
    private VTercerosRefactorRepository vtercerosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTerceros> listarTerceros() {
        return (List<VTerceros>) vtercerosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    VTerceros listarTercerosPorId(@PathVariable Long id) {
        return vtercerosRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarTerceros/{type}")
    List<VTerceros> listarColaborador(@PathVariable String type) {
        return vtercerosRepository.findByTypes(type);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/asignarColaborador/{queryString}/")
    ArrayList<VTerceros> findByWildCard(@PathVariable String queryString){

        String queryOutSChars = OutSpecialChars.getStr(queryString);

        ArrayList<VTerceros> listVCFinal;

        listVCFinal = (ArrayList<VTerceros>) vtercerosRepository.queryVTercerosByName(queryOutSChars);

        return listVCFinal;
    }

}
