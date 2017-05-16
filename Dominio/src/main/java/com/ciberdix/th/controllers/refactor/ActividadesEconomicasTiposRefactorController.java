package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.ActividadesEconomicasTipos;
import com.ciberdix.th.repositories.ActividadesEconomicasTiposRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/actividadesEconomicasTipos")
public class ActividadesEconomicasTiposRefactorController {

    @Autowired
    private ActividadesEconomicasTiposRefactorRepository actividadesEconomicasRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ActividadesEconomicasTipos> getActividadesEconomicasTipo() {
        return (List<ActividadesEconomicasTipos>) actividadesEconomicasRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    ActividadesEconomicasTipos findAll(@PathVariable Integer idLista) {
        return actividadesEconomicasRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    ActividadesEconomicasTipos createActividadEconomicaTipo(@RequestBody ActividadesEconomicasTipos c) {
        return actividadesEconomicasRepository.save(new ActividadesEconomicasTipos(c.getCodigoActividadTipo(), c.getDescripcionActividadTipo(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ActividadesEconomicasTipos updateActividadEconbomicaTipo(@RequestBody ActividadesEconomicasTipos centrosCostosEntity) {
        return actividadesEconomicasRepository.save(centrosCostosEntity);
    }
}
