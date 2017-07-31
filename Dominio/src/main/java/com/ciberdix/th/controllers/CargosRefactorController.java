package com.ciberdix.th.controllers;

import com.ciberdix.th.configuration.OutSpecialChars;
import com.ciberdix.th.models.Cargos;
import com.ciberdix.th.models.VCargos;
import com.ciberdix.th.repositories.CargosRefactorRepository;
import com.ciberdix.th.repositories.VCargosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        return vCargosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/wildcard/{query}")
    ArrayList<VCargos> findByWildCard(@PathVariable String query) {

        String queryOutSChars = OutSpecialChars.getStr(query);

        ArrayList<VCargos> listVCFinal;

        listVCFinal = (ArrayList<VCargos>) vCargosRefactorRepository.queryVCargosByCargo(queryOutSChars);

        if (listVCFinal.size() < 1) {
            listVCFinal = (ArrayList<VCargos>) vCargosRefactorRepository.queryVCargosByCargoAll(queryOutSChars);
        }

        return listVCFinal;

    }

    @RequestMapping(method = RequestMethod.GET, path = "/search/{query}/{idEstructuraOrganizacional}")
    List<Cargos> queryByIdEstructuraOrganizacional(@PathVariable String query, @PathVariable Integer idEstructuraOrganizacional) {
        return cargosRefactorRepository.queryByIdEstructuraOrganizacional(OutSpecialChars.getStr(query), idEstructuraOrganizacional);
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
                        obj.getIdEstadoCivil(), obj.getIdEstado(), obj.getPaso(), obj.getIndicadorZona(),obj.getEdadMax())
        );
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab1")
    Cargos updateTab1(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setCargo(obj.getCargo());
        cargo.setPersonaACargoDir(obj.getPersonaACargoDir());
        cargo.setPersonaACargoInd(obj.getPersonaACargoInd());
        cargo.setIdCargoJefe(obj.getIdCargoJefe());
        cargo.setMision(obj.getMision());
        cargo.setIndicadorHabilitado(obj.getIndicadorHabilitado());
        cargo.setCodigoCargo(obj.getCodigoCargo());
        cargo.setIdEstructuraArea(obj.getIdEstructuraArea());
        cargo.setIndicadorZona(obj.getIndicadorZona());
        cargo.setPaso(obj.getPaso());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab2")
    Cargos updateTab2(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setIdEstado(obj.getIdEstado());
        cargo.setPaso(obj.getPaso());
        cargo.setIndicadorHabilitado(obj.getIndicadorHabilitado());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab3")
    Cargos updateTab3(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setInterrelacionesExternas(obj.getInterrelacionesExternas());
        cargo.setInterrelacionesInternas(obj.getInterrelacionesInternas());
        cargo.setPaso(obj.getPaso());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab4")
    Cargos updateTab4(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setResponsabilidadesAd(obj.getResponsabilidadesAd());
        cargo.setPaso(obj.getPaso());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab5")
    Cargos updateTab5(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setTomaDecisiones(obj.getTomaDecisiones());
        cargo.setActividadesSupervisa(obj.getActividadesSupervisa());
        cargo.setPaso(obj.getPaso());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab6")
    Cargos updateTab6(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setConocimientosBasicos(obj.getConocimientosBasicos());
        cargo.setTiempoExperiencia(obj.getTiempoExperiencia());
        cargo.setOtrosRequisitos(obj.getOtrosRequisitos());
        cargo.setEdad(obj.getEdad());
        cargo.setEdadMax(obj.getEdadMax());
        cargo.setIdGenero(obj.getIdGenero());
        cargo.setIdEstadoCivil(obj.getIdEstadoCivil());
        cargo.setIdNivelEducacion(obj.getIdNivelEducacion());
        cargo.setPaso(obj.getPaso());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab7")
    Cargos updateTab7(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setPuntos(obj.getPuntos());
        cargo.setIdCategoria(obj.getIdCategoria());
        cargo.setSalario(obj.getSalario());
        cargo.setIndicadorRequiereFormacion(obj.getIndicadorRequiereFormacion());
        cargo.setPaso(obj.getPaso());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cargos o) {
        cargosRefactorRepository.save(
                new Cargos(o.getIdCargo(), o.getCargo(), o.getAuditoriaUsuario(), o.getPersonaACargoDir(), o.getPersonaACargoInd(),
                        o.getIdCargoJefe(), o.getMision(), o.getPuntos(), o.getIdCategoria(), o.getSalario(), o.getIndicadorRequiereFormacion(),
                        o.getIndicadorHabilitado(), o.getInterrelacionesInternas(), o.getInterrelacionesExternas(), o.getResponsabilidadesAd(),
                        o.getTomaDecisiones(), o.getActividadesSupervisa(), o.getIdNivelEducacion(), o.getConocimientosBasicos(), o.getTiempoExperiencia(),
                        o.getOtrosRequisitos(), o.getEdad(), o.getCargaFisica(), o.getCargaMental(), o.getNivelPsicoSocial(), o.getCodigoCargo(),
                        o.getIdEstructuraArea(), o.getIdGenero(), o.getIdEstadoCivil(), o.getIdEstado(), o.getPaso(), o.getIndicadorZona(),o.getEdadMax())
        );
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/disabled/{idCargo}")
    void disabledEOC(@PathVariable Integer idCargo) {
        cargosRefactorRepository.disabled(idCargo);
    }
}
