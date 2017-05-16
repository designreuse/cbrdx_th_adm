package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosResidencias;
import com.ciberdix.th.repositories.TercerosResidenciasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/tercerosResidencias")
@CrossOrigin
public class TercerosResidenciasRefactorController {

    @Autowired
    private TercerosResidenciasRefactorRepository TercerosResidenciasRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosResidencias> listarTercerosResidencias() {
        return (List<TercerosResidencias>) TercerosResidenciasRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{id}")
    TercerosResidencias parent(@PathVariable Integer id) {
        return TercerosResidenciasRepository.findByIdTerceroLocalizacion(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosResidencias crearActividadEconomica(@RequestBody TercerosResidencias obj) {
        if (obj.getIndicadorHabilitado()) {
            TercerosResidenciasRepository.updateChecks(obj.getIdTerceroLocalizacion());
        }
        return TercerosResidenciasRepository.save(new TercerosResidencias(obj.getIdTerceroLocalizacion(), obj.getIdTipoVivienda(), obj.getIdTipoConstruccionVivienda(), obj.getIdEstrato(), obj.getIdClasesViviendas(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody TercerosResidencias obj) {
        if (obj.getIndicadorHabilitado()) {
            TercerosResidenciasRepository.updateChecks(obj.getIdTerceroLocalizacion());
        }
        TercerosResidenciasRepository.save(obj);
    }
}
