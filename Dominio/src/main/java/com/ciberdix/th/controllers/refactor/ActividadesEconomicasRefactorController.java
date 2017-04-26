package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ActividadesEconomicas;
import com.ciberdix.th.models.refactor.VActividadesEconomicas;
import com.ciberdix.th.repositories.refactor.ActividadesEconomicasRefactorRepository;
import java.util.List;

import com.ciberdix.th.repositories.refactor.VActividadesEconomicasRefactorRepository;
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
    
    @RequestMapping(method = RequestMethod.GET, value="/padre/{id}")
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
    List<VActividadesEconomicas> getActividadesEconomicas(@PathVariable String label) {
        return vActividadesEconomicasRefactorRepository.findByLabelContains(label);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    ActividadesEconomicas crearActividadEconomica(@RequestBody ActividadesEconomicas obj){
        return actividadesEconomicasRepository.save(obj);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody ActividadesEconomicas obj){
        actividadesEconomicasRepository.save(obj);
    }    
}
