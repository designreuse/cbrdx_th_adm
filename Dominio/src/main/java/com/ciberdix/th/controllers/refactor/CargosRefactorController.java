package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Cargos;
import com.ciberdix.th.models.refactor.VCargos;
import com.ciberdix.th.repositories.refactor.CargosRefactorRepository;
import com.ciberdix.th.repositories.refactor.VCargosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargos")
public class CargosRefactorController {
    @Autowired
    private CargosRefactorRepository cargosRefactorRepository;

    @Autowired
    private VCargosRefactorRepository vCargosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargos> findAll() {
        return (List<VCargos>) vCargosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VCargos> findEnabled() {
        return (List<VCargos>) vCargosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargos findOne(@PathVariable Integer id) {
        return vCargosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Cargos create(@RequestBody Cargos obj) {
        return cargosRefactorRepository.save(
                new Cargos(obj.getCargo(), obj.getAuditoriaUsuario(), obj.getPersonaACargoDir(),
                        obj.getPersonaACargoInd(), obj.getIdCargoJefe(), obj.getMision(), obj.getPuntos(),
                        obj.getIdCategoria(), obj.getSalario(), obj.getIndicadorRequiereFormacion(),
                        obj.getIndicadorHabilitado(), obj.getInterrelacionesInternas(), obj.getInterrelacionesExternas(),
                        obj.getResponsabilidadesAd(), obj.getTomaDecisiones(), obj.getActividadesSupervisa(),
                        obj.getIdNivelEducacion(), obj.getConocimientosBasicos(), obj.getTiempoExperiencia(),
                        obj.getOtrosRequisitos(), obj.getEdad(), obj.getCargaFisica(), obj.getCargaMental(),
                        obj.getNivelPsicoSocial(), obj.getCodigoCargo(), obj.getIdEstructuraArea(), obj.getIdGenero(),
                        obj.getIdEstadoCivil(), obj.getIdEstado(), obj.getPaso())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cargos obj) {
        cargosRefactorRepository.save(obj);
    }
}
