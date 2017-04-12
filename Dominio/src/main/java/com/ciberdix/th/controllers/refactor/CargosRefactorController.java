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

    @RequestMapping(method = RequestMethod.PUT, path = "/tab1")
    Cargos updateTab1(@RequestBody Cargos obj) {
        return cargosRefactorRepository.save(new Cargos(obj.getIdCargo(), obj.getCargo(),
                obj.getPersonaACargoDir(), obj.getPersonaACargoInd(), obj.getIdCargoJefe(),
                obj.getMision(), obj.getIndicadorHabilitado(), obj.getCodigoCargo(),
                obj.getIdEstructuraArea(), obj.getIdEstado()));
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab2")
    Cargos updateTab2(@RequestBody Cargos obj) {
        return cargosRefactorRepository.save(new Cargos(obj.getIdCargo(), obj.getIdEstado(),
                obj.getPaso()));
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab3")
    Cargos updateTab3(@RequestBody Cargos obj) {
        return cargosRefactorRepository.save(new Cargos(obj.getIdCargo(),
                obj.getInterrelacionesInternas(), obj.getInterrelacionesExternas()));
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab4")
    Cargos updateTab4(@RequestBody Cargos obj) {
        return cargosRefactorRepository.save(new Cargos(obj.getIdCargo(),
                obj.getResponsabilidadesAd()));
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab5")
    Cargos updateTab5(@RequestBody Cargos obj) {
        return cargosRefactorRepository.save(
                new Cargos(obj.getIdCargo(), obj.getConocimientosBasicos(),
                        obj.getTiempoExperiencia(), obj.getOtrosRequisitos(),
                        obj.getEdad(), obj.getIdGenero(), obj.getIdEstadoCivil()));
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab6")
    Cargos updateTab6(@RequestBody Cargos obj) {
        return cargosRefactorRepository.save(new Cargos(
                obj.getIdCargo(), obj.getPuntos(), obj.getIdCategoria(), obj.getSalario()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cargos obj) {
        cargosRefactorRepository.save(obj);
    }
}
