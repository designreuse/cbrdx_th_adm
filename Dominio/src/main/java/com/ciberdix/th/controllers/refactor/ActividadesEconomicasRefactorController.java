package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ActividadesEconomicas;
import com.ciberdix.th.repositories.refactor.ActividadesEconomicasRefactorRepository;
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
@Transactional
@RequestMapping("/api/actividadesEconomicas")
@CrossOrigin
public class ActividadesEconomicasRefactorController {

    @Autowired
    private ActividadesEconomicasRefactorRepository actividadesEconomicasRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ActividadesEconomicas parent(@PathVariable Integer id) {
        return actividadesEconomicasRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/lastChild/{id}")
    List<ActividadesEconomicas> lastChild(@PathVariable Integer id) {
        return actividadesEconomicasRepository.queryAllActividadesEconomicasPorTipo(id);
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
