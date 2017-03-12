package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Demografia;
import com.ciberdix.th.model.DivisionPolitica;
import com.ciberdix.th.model.TercerosLocalizacion;
import com.ciberdix.th.model.Localizacion;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/employeesLocations")
public class TercerosLocalizacionController {

    private String serviceUrl = "http://localhost:8445/";

    @RequestMapping(method = RequestMethod.GET, value = "employees/{id}")
    List<TercerosLocalizacion> consultarParametros(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        List<TercerosLocalizacion> tl = new ArrayList<>();
        TercerosLocalizacion[] parametros = restTemplate.getForObject(serviceUrl + "employeesLocations/employees/" + id, TercerosLocalizacion[].class);
        Localizacion[] locs = restTemplate.getForObject(serviceUrl + "locations", Localizacion[].class);

        DivisionPolitica[] divPais = restTemplate.getForObject(serviceUrl + "cities/location/1", DivisionPolitica[].class);
        DivisionPolitica[] divDpto = restTemplate.getForObject(serviceUrl + "cities/location/2", DivisionPolitica[].class);
        DivisionPolitica[] divMncp = restTemplate.getForObject(serviceUrl + "cities/location/5", DivisionPolitica[].class);
        DivisionPolitica[] divBarrio = restTemplate.getForObject(serviceUrl + "cities/location/7", DivisionPolitica[].class);

        for (TercerosLocalizacion t : parametros) {
            for (Localizacion l : locs) {
                if (l.getIdUbicacion().equals(t.getIdLocalizacion())) {
                    for (DivisionPolitica db : divBarrio) {
                        if (l.getIdDivisionPolitica().equals(db.getIdDivisionPolitica())) {
                            Demografia barrio = new Demografia();
                            barrio.setValue(db.getIdDivisionPolitica());
                            barrio.setLabel(db.getDescripcionDivisionPolitica());
                            l.setBarrio(barrio);

                            for (DivisionPolitica dc : divMncp) {
                                if (db.getIdDivisionPoliticaPadre().equals(dc.getIdDivisionPolitica())) {
                                    Demografia ciudad = new Demografia();
                                    ciudad.setValue(dc.getIdDivisionPolitica());
                                    ciudad.setLabel(dc.getDescripcionDivisionPolitica());
                                    l.setCiudad(ciudad);
                                }

                                for (DivisionPolitica dd : divDpto) {
                                    if (dc.getIdDivisionPoliticaPadre().equals(dd.getIdDivisionPolitica())) {
                                        Demografia dpto = new Demografia();
                                        dpto.setValue(dd.getIdDivisionPolitica());
                                        dpto.setLabel(dd.getDescripcionDivisionPolitica());
                                        l.setDepartamento(dpto);
                                    }

                                    for (DivisionPolitica dp : divPais) {
                                        if (dd.getIdDivisionPoliticaPadre().equals(dp.getIdDivisionPolitica())) {
                                            Demografia pais = new Demografia();
                                            pais.setValue(dp.getIdDivisionPolitica());
                                            pais.setLabel(dp.getDescripcionDivisionPolitica());
                                            l.setPais(pais);
                                        }
                                    }
                                }
                            }
                        }
                    }

                    t.setLocalizacion(l);
                    tl.add(t);
                }
            }
        }

        return tl;
    }

    @RequestMapping(method = RequestMethod.GET, value = "location/{id}")
    Localizacion consultarLocalizacion(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Localizacion[] parametros = restTemplate.getForObject(serviceUrl + "locations", Localizacion[].class);
        Localizacion localizacion = new Localizacion();

        DivisionPolitica[] divPais = restTemplate.getForObject(serviceUrl + "cities/location/1", DivisionPolitica[].class);
        DivisionPolitica[] divDpto = restTemplate.getForObject(serviceUrl + "cities/location/2", DivisionPolitica[].class);
        DivisionPolitica[] divMncp = restTemplate.getForObject(serviceUrl + "cities/location/5", DivisionPolitica[].class);
        DivisionPolitica[] divBarrio = restTemplate.getForObject(serviceUrl + "cities/location/7", DivisionPolitica[].class);

        for (Localizacion l : parametros) {
            if (l.getIdUbicacion().equals(id)) {
                for (DivisionPolitica db : divBarrio) {
                    if (l.getIdDivisionPolitica().equals(db.getIdDivisionPolitica())) {
                        Demografia barrio = new Demografia();
                        barrio.setValue(db.getIdDivisionPolitica());
                        barrio.setLabel(db.getDescripcionDivisionPolitica());
                        l.setBarrio(barrio);

                        for (DivisionPolitica dc : divMncp) {
                            if (db.getIdDivisionPoliticaPadre().equals(dc.getIdDivisionPolitica())) {
                                Demografia ciudad = new Demografia();
                                ciudad.setValue(dc.getIdDivisionPolitica());
                                ciudad.setLabel(dc.getDescripcionDivisionPolitica());
                                l.setCiudad(ciudad);
                            }

                            for (DivisionPolitica dd : divDpto) {
                                if (dc.getIdDivisionPoliticaPadre().equals(dd.getIdDivisionPolitica())) {
                                    Demografia dpto = new Demografia();
                                    dpto.setValue(dd.getIdDivisionPolitica());
                                    dpto.setLabel(dd.getDescripcionDivisionPolitica());
                                    l.setDepartamento(dpto);
                                }

                                for (DivisionPolitica dp : divPais) {
                                    if (dd.getIdDivisionPoliticaPadre().equals(dp.getIdDivisionPolitica())) {
                                        Demografia pais = new Demografia();
                                        pais.setValue(dp.getIdDivisionPolitica());
                                        pais.setLabel(dp.getDescripcionDivisionPolitica());
                                        l.setPais(pais);
                                    }
                                }
                            }
                        }
                    }
                }
                localizacion = l;
            }
        }

        return localizacion;
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosLocalizacion crearTerceroLocalizacion(@RequestBody TercerosLocalizacion tl) {
        
        RestTemplate restTemplate = new RestTemplate();
        TercerosLocalizacion terceroLocalizacion = new TercerosLocalizacion();
        Localizacion localizacion = new Localizacion();
        Demografia barrio = new Demografia();
        
        barrio.setValue(Integer.MIN_VALUE);
        barrio.setLabel((String) tl.getLocalizacion().getBarrio().getLabel());
        
        localizacion.setIdUbicacion(tl.getLocalizacion().getIdUbicacion());
        localizacion.setTipoDireccion(tl.getLocalizacion().getTipoDireccion());
        localizacion.setDireccion(tl.getLocalizacion().getDireccion());
        localizacion.setAuditoriaFecha(tl.getLocalizacion().getAuditoriaFecha());
        localizacion.setAuditoriaUsuario(tl.getLocalizacion().getAuditoriaUsuario());
        localizacion.setBarrio(barrio);
        localizacion.setCiudad(tl.getLocalizacion().getCiudad());
        localizacion.setComoLlegar(tl.getLocalizacion().getComoLlegar());
        localizacion.setDepartamento(tl.getLocalizacion().getDepartamento());
        localizacion.setLatitud(tl.getLocalizacion().getLatitud());
        localizacion.setLongitud(tl.getLocalizacion().getLongitud());
        localizacion.setPais(tl.getLocalizacion().getPais());
        localizacion.setIdDivisionPolitica(tl.getLocalizacion().getIdDivisionPolitica());
        localizacion.setIndicadorHabilitado(true);
        
        Localizacion loc = restTemplate.postForObject(serviceUrl + "locations", localizacion, Localizacion.class);
        
//        terceroLocalizacion.setLocalizacion(localizacion);
        terceroLocalizacion.setIdTercero(tl.getIdTercero());
        terceroLocalizacion.setIdLocalizacion(loc.getIdUbicacion());
        terceroLocalizacion.setAuditoriaFecha(tl.getAuditoriaFecha());
        terceroLocalizacion.setAuditoriaUsuario(tl.getAuditoriaUsuario());
        terceroLocalizacion.setIndicadorHabilitado(true);
        
        
        return restTemplate.postForObject(serviceUrl + "employeesLocations", terceroLocalizacion, TercerosLocalizacion.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTerceroLocalizacion(@RequestBody TercerosLocalizacion request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "employeesLocations", request, TercerosLocalizacion.class);
    }
}
