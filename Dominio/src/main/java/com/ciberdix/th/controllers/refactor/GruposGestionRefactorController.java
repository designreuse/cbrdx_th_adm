package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.GruposGestion;
import com.ciberdix.th.repositories.GruposGestionRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/gruposGestion")
public class GruposGestionRefactorController {

    @Autowired
    private GruposGestionRefactorRepository gruposGestionRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<GruposGestion> getLists() {
        return (List<GruposGestion>) gruposGestionRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/usuario/{idUsuario}")
    List<GruposGestion> getUserLists(@PathVariable Integer idUsuario) {
        return (List<GruposGestion>) gruposGestionRepository.findUserAvaliable(idUsuario);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    GruposGestion findList(@PathVariable Integer idLista) {
        return gruposGestionRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    GruposGestion createList(@RequestBody GruposGestion c) {
        return gruposGestionRepository.save(new GruposGestion(c.getGrupoGestion(), c.getFunciones(), c.getResponsabilidades(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario(), c.getFechaInicio(), c.getFechaFin(), c.getCodigoGrupoGestion()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    GruposGestion updateList(@RequestBody GruposGestion centrosCostos) {
        return gruposGestionRepository.save(centrosCostos);
    }
}
