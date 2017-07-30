package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Danny on 17/07/2017.
 */

@RestController
@RequestMapping("/api/dotaciones")
@CrossOrigin
public class DotacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/dotaciones/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VDotaciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VDotaciones findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VDotaciones> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/grupoDotacion/{id}")
    List<VDotaciones> findByIdGrupoDotacion(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "grupoDotacion/" + id, VDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tallasGenero/{idProyeccionDotacion}/{idDotacion}")
    List<TallaGeneroDotacion> findAllTallasByGen(@PathVariable Integer idProyeccionDotacion, @PathVariable Integer idDotacion) {
        List<VProyeccionDotacionEstructuraOrganizacional> pdeo = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/proyeccionDotacionEstructuraOrganizacional/proyeccionDotacion/" + idProyeccionDotacion, VProyeccionDotacionEstructuraOrganizacional[].class));
        VDotaciones d = findOne(idDotacion);
        List<TallaGeneroDotacion> ltgd = new ArrayList<>();
        TallaGeneroDotacion tgd = new TallaGeneroDotacion();
        String code = UtilitiesController.findListItemById("ListasTiposTallas", d.getIdTipoTalla()).getCodigo();
        for(VProyeccionDotacionEstructuraOrganizacional vpdeo : pdeo){
            if(vpdeo.getIdEstructuraOrganizacional()!=null){
                List<VTerceros> t = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/vterceros/estructuraOrganizacional/" + vpdeo.getIdEstructuraOrganizacional() + "/", VTerceros[].class));
                if(t.size()>0){
                    List<VTerceros> tempT;
                    List<ListasItems> li = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/ListasTallas/enabled/", ListasItems[].class));
                    for(ListasItems list : li){
                        tgd.setIndicadorHombre(false);
                        tgd.setIndicadorMujer(false);
                        if(code.equals("CAM")){
                            tempT = t.stream().filter(ter->t.stream().anyMatch(f->ter.getIdTallaCamisa()!=null && ter.getIdTallaCamisa().equals(list.getIdLista()))).collect(Collectors.toList());
                        }else if(code.equals("PAN")){
                            tempT = t.stream().filter(ter->t.stream().anyMatch(f->ter.getIdTallaPantalon()!=null && ter.getIdTallaPantalon().equals(list.getIdLista()))).collect(Collectors.toList());
                        }else{
                            tempT = t.stream().filter(ter->t.stream().anyMatch(f->ter.getIdTallaCalzado()!=null && ter.getIdTallaCalzado().equals(list.getIdLista()))).collect(Collectors.toList());
                        }
                        if(tempT.size()>0){
                            Boolean exist = false;
                            if(ltgd.size()>0){
                                for(TallaGeneroDotacion ltgdot : ltgd){
                                    if(ltgdot.getTalla().equals(list.getNombre())){
                                        tgd = ltgdot;
                                        exist = true;
                                    }
                                }
                            }
                            if(exist){
                                ltgd.get(ltgd.indexOf(tgd)).setTotal(ltgd.get(ltgd.indexOf(tgd)).getTotal()+(tempT.size()*d.getCantidad()));
                                for(VTerceros vt : tempT){
                                    if(vt.getIdGenero()!=null){
                                        String genero = UtilitiesController.findListItemById("ListasGeneros", vt.getIdGenero()).getCodigo();
                                        if(genero.equals("M")){
                                            ltgd.get(ltgd.indexOf(tgd)).setIndicadorHombre(true);
                                        }else if(genero.equals("F")){
                                            ltgd.get(ltgd.indexOf(tgd)).setIndicadorMujer(true);
                                        }
                                    }
                                }
                            }else{
                                tgd.setTalla(list.getNombre());
                                tgd.setTotal(tempT.size()*d.getCantidad());
                                for(VTerceros vt : tempT){
                                    if(vt.getIdGenero()!=null){
                                        String genero = UtilitiesController.findListItemById("ListasGeneros", vt.getIdGenero()).getCodigo();
                                        if(genero.equals("M")){
                                            tgd.setIndicadorHombre(true);
                                        }else if(genero.equals("F")){
                                            tgd.setIndicadorMujer(true);
                                        }
                                    }
                                }
                                ltgd.add(tgd);
                            }
                            tgd = new TallaGeneroDotacion();
                        }
                    }
                }
            }
        }
        return ltgd;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/ProyeccionDotacion/{id}")
    List<VDotaciones> findByIdProyeccionDotacion(@PathVariable Integer id) {
        List<VDotaciones> d = Arrays.asList(restTemplate.getForObject(serviceUrl + "idProyeccionDotacion/" + id, VDotaciones[].class));
        Integer count = 0, cant = 0;
        VProyeccionDotacion pd = restTemplate.getForObject(baseUrl + "/api/proyeccionDotacion/" + id, VProyeccionDotacion.class);
        List<VProyeccionDotacionEstructuraOrganizacional> pe = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/proyeccionDotacionEstructuraOrganizacional/proyeccionDotacion/" + id, VProyeccionDotacionEstructuraOrganizacional[].class));
        for(VDotaciones vd : d){
            if(pd.getIndicadorNoAreas()){
                cant = pd.getCantidadProyeccion();
            }else{
                List<VTerceros> tempT;
                String code = UtilitiesController.findListItemById("ListasTiposTallas", vd.getIdTipoTalla()).getCodigo();
                for(VProyeccionDotacionEstructuraOrganizacional vpe : pe){
                    List<VTerceros> t = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/vterceros/estructuraOrganizacional/" + vpe.getIdEstructuraOrganizacional() + "/", VTerceros[].class));
                    if(code.equals("CAM")){
                        tempT = t.stream().filter(ter->t.stream().anyMatch(f->ter.getIdTallaCamisa()!=null)).collect(Collectors.toList());
                    }else if(code.equals("PAN")){
                        tempT = t.stream().filter(ter->t.stream().anyMatch(f->ter.getIdTallaPantalon()!=null)).collect(Collectors.toList());
                    }else{
                        tempT = t.stream().filter(ter->t.stream().anyMatch(f->ter.getIdTallaCalzado()!=null)).collect(Collectors.toList());
                    }
                    cant += (tempT.size() * vd.getCantidad());
                }
            }
            vd.setCantidadTotal(cant);
        }
        return d;
    }

    @RequestMapping(method = RequestMethod.POST)
    Dotaciones create(@RequestBody Dotaciones o) {
        return restTemplate.postForObject(serviceUrl, o, Dotaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Dotaciones o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
