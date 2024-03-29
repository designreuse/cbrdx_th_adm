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
        VProyeccionDotacion PD =  restTemplate.getForObject(baseUrl + "/api/proyeccionDotacion/" + idProyeccionDotacion, VProyeccionDotacion.class);

        List<Terceros> tercerosList = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/terceros", Terceros[].class));
        if (PD.getIndicadorNoAreas() != null && !PD.getIndicadorNoAreas()) {
            List<VCargosDotaciones> d = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/cargosDotaciones/grupoDotacion/" + PD.getIdGrupoDotacion(), VCargosDotaciones[].class));
            List<VEstructuraOrganizacionalCargos> vEstructuraOrganizacionalCargos = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/estructuraOrganizacionalCargos", VEstructuraOrganizacionalCargos[].class));
            vEstructuraOrganizacionalCargos = vEstructuraOrganizacionalCargos.stream().filter(t -> pdeo.stream().anyMatch(f -> f.getIdEstructuraOrganizacional().equals(t.getIdEstructuraOrganizacional()))).collect(Collectors.toList());
            vEstructuraOrganizacionalCargos = vEstructuraOrganizacionalCargos.stream().filter(t -> d.stream().anyMatch(f -> t.getIdCargo().equals(f.getIdCargo()))).collect(Collectors.toList());
            List<VEstructuraOrganizacionalCargos> vEstructuraOrganizacionalCargosfiltered = vEstructuraOrganizacionalCargos.stream().filter(VEstructuraOrganizacionalCargos::getIndicadorHabilitado).collect(Collectors.toList());
            List<VTercerosCargos> vTercerosCargos = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/tercerosCargos", VTercerosCargos[].class));
            List<VTercerosCargos> vTercerosCargosFiltered = vTercerosCargos.stream().filter(t -> t.getIndicadorHabilitado() && vEstructuraOrganizacionalCargosfiltered.stream().anyMatch(f -> t.getIdEstructuraOrganizacionalCargo().equals(f.getIdEstructuraOrganizacionalCargo()))).collect(Collectors.toList());
            tercerosList = tercerosList.stream().filter(f -> vTercerosCargosFiltered.stream().anyMatch(t -> f.getIdTercero().equals(t.getIdTercero()))).collect(Collectors.toList());
        }

        VDotaciones d = findOne(idDotacion);
        List<TallaGeneroDotacion> ltgd = new ArrayList<>();
        TallaGeneroDotacion tgd = new TallaGeneroDotacion();
        String code = UtilitiesController.findListItemById("ListasTiposTallas", d.getIdTipoTalla()).getCodigo();
        List<Terceros> t = tercerosList;
        if(t.size()>0){
            List<Terceros> tempT;
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
                        for(Terceros vt : tempT){
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
                        Double valor = Math.ceil(PD.getCantidadMeses()/valueCiclo(d));
                        tgd.setTotal(tempT.size()* valor.intValue());
                        for(Terceros vt : tempT){
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
        return ltgd;
    }

    Integer valueCiclo(VDotaciones d){
        String codeCiclo = UtilitiesController.findListItemById("ListasCiclosEntregas",d.getIdCicloEntrega()).getCodigo();
        if(codeCiclo.equals("ANUAL")){
            return 12;
        }else if(codeCiclo.equals("SEMES")){
            return 6;
        }else if(codeCiclo.equals("TRIMES")){
            return 3;
        }else if(codeCiclo.equals("CUATRIMES")){
            return 4;
        }else{
            return 2;
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/ProyeccionDotacion/{id}")
    List<VDotaciones> findByIdProyeccionDotacion(@PathVariable Integer id) {
        List<VProyeccionesDotacionesTerceros> pdt = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/proyeccionesDotacionesTerceros/proyeccionDotacion/" + id + "/enabled", VProyeccionesDotacionesTerceros[].class));
        List<VDotaciones> d = new ArrayList<>();
        for(VProyeccionesDotacionesTerceros vpdt : pdt){
            List<VProyeccionesDotacionesTercerosDotaciones> pdtd = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/proyeccionesDotacionesTercerosDotaciones/proyeccionDotacionTercero/" + vpdt.getIdProyeccionDotacionTerceros(), VProyeccionesDotacionesTercerosDotaciones[].class));
            List<VDotaciones> dotaciones = findAll();
            d = dotaciones.stream().filter(ter->pdtd.stream().anyMatch(f->ter.getIdDotacion().equals(f.getIdDotacion()))).collect(Collectors.toList());
        }
        Integer count = 0;
        VProyeccionDotacion pd = restTemplate.getForObject(baseUrl + "/api/proyeccionDotacion/" + id, VProyeccionDotacion.class);
        List<VProyeccionDotacionEstructuraOrganizacional> pe = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/proyeccionDotacionEstructuraOrganizacional/proyeccionDotacion/" + id, VProyeccionDotacionEstructuraOrganizacional[].class));
        for(VDotaciones vd : d){
            Integer cant = 0;
            if(pd.getIndicadorNoAreas()){
                cant = pd.getCantidadProyeccion();
            }else{
                List<TallaGeneroDotacion> ltgd = findAllTallasByGen(pd.getIdProyeccionDotacion(),vd.getIdDotacion());
                for(TallaGeneroDotacion tgd : ltgd){
                    cant += tgd.getTotal();
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
