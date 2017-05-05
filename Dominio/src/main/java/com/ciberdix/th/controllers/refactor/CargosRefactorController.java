package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.configuration.LevenshteinDistance;
import com.ciberdix.th.configuration.ListaSoundex;
import com.ciberdix.th.configuration.SoundexEsp;
import com.ciberdix.th.models.refactor.Cargos;
import com.ciberdix.th.models.refactor.VCargos;
import com.ciberdix.th.repositories.refactor.CargosRefactorRepository;
import com.ciberdix.th.repositories.refactor.VCargosRefactorRepository;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.codec.language.bm.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
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

//    @RequestMapping(method = RequestMethod.GET, path = "/wildcard/{query}")
//    List<VCargos> findByWildCard(@PathVariable String query) {
//        return (List<VCargos>) vCargosRefactorRepository.findByCargoContains(query);
//    }

    @RequestMapping(method = RequestMethod.GET, path = "/wildcard/{query}")
    ArrayList<VCargos> findByWildCard(@PathVariable String query) throws EncoderException {

        Soundex soundex = new Soundex();
        //ArrayList<String> listQ = ListaSoundex.generarList(query, soundex);
        ArrayList<String> listQ = SoundexEsp.getList(query);
        ArrayList<VCargos> listVC = (ArrayList<VCargos>) vCargosRefactorRepository.queryOrderByCargo();
        ArrayList<VCargos> listVCFinal = new ArrayList<>();
        ArrayList<String> listC;
        VCargos vCargo;
        String cargo, strQuery, strCargo;

        cargo = query.toLowerCase();

        listVCFinal = (ArrayList<VCargos>) vCargosRefactorRepository.queryVCargosByCargo(cargo);

        for (int i=0; i<listVCFinal.size(); i++){
            listVC.remove(listVCFinal.get(i));
        }

        for (int i=0; i<listVC.size(); i++){
            vCargo = listVC.get(i);
            cargo = vCargo.getCargo();
            //listC = ListaSoundex.generarList(cargo, soundex);
            listC = SoundexEsp.getList(cargo);
            for (int j=0; j<listQ.size(); j++){
                strQuery = listQ.get(j);
                for (int k=0; k<listC.size(); k++){
                    strCargo = listC.get(k);
                    if (LevenshteinDistance.computeLevenshteinDistance(strQuery, strCargo) == 0){
                        listVCFinal.add(listVC.get(i));
                    }
                }
            }
//            for(int j=0; j<listQ.size(); j++){
//                strQuery = listQ.get(j);
//                if (listC.contains(strQuery)){
//                    listVCFinal.add(listVC.get(i));
//                    j = listQ.size();
//                }
//            }
        }

        return listVCFinal;

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
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setCargo(obj.getCargo());
        cargo.setPersonaACargoDir(obj.getPersonaACargoDir());
        cargo.setPersonaACargoInd(obj.getPersonaACargoInd());
        cargo.setIdCargoJefe(obj.getIdCargoJefe());
        cargo.setMision(obj.getMision());
        cargo.setIndicadorHabilitado(obj.getIndicadorHabilitado());
        cargo.setCodigoCargo(obj.getCodigoCargo());
        cargo.setIdEstructuraArea(obj.getIdEstructuraArea());

        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab2")
    Cargos updateTab2(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setIdEstado(obj.getIdEstado());
        cargo.setPaso(obj.getPaso());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab3")
    Cargos updateTab3(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setInterrelacionesExternas(obj.getInterrelacionesExternas());
        cargo.setInterrelacionesInternas(obj.getInterrelacionesInternas());

        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab4")
    Cargos updateTab4(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setResponsabilidadesAd(obj.getResponsabilidadesAd());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab5")
    Cargos updateTab5(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setTomaDecisiones(obj.getTomaDecisiones());
        cargo.setActividadesSupervisa(obj.getActividadesSupervisa());

        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab6")
    Cargos updateTab6(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setConocimientosBasicos(obj.getConocimientosBasicos());
        cargo.setTiempoExperiencia(obj.getTiempoExperiencia());
        cargo.setOtrosRequisitos(obj.getOtrosRequisitos());
        cargo.setEdad(obj.getEdad());
        cargo.setIdGenero(obj.getIdGenero());
        cargo.setIdEstadoCivil(obj.getIdEstadoCivil());
        cargo.setIdNivelEducacion(obj.getIdNivelEducacion());
        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab7")
    Cargos updateTab7(@RequestBody Cargos obj) {
        Cargos cargo = cargosRefactorRepository.findOne(obj.getIdCargo());
        cargo.setPuntos(obj.getPuntos());
        cargo.setIdCategoria(obj.getIdCategoria());
        cargo.setSalario(obj.getSalario());
        cargo.setIndicadorRequiereFormacion(obj.getIndicadorRequiereFormacion());

        return cargosRefactorRepository.save(cargo);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cargos obj) {
        cargosRefactorRepository.save(obj);
    }
}
