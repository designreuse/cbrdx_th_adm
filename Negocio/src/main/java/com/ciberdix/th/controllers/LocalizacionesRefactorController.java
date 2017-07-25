package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Localizaciones;
import com.ciberdix.th.model.LocalizacionesNomenclaturas;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/localizaciones")
@CrossOrigin
public class LocalizacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/localizaciones/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Localizaciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, Localizaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/localizacionTercero/{idTercero}")
    List<Localizaciones> findByIdTerceroAllLocalizacion(@PathVariable Long idTercero) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "localizacionTercero/" + idTercero, Localizaciones[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    Localizaciones create(@RequestBody Localizaciones request) {
        if(request.getListLN()!= null){
            if(request.getListLN().size()>0){
                for(LocalizacionesNomenclaturas ln : request.getListLN()){
                    ln.setIdLocalizacion(request.getIdLocalizacion());
                    restTemplate.postForObject(baseUrl + "/api/localizacionesNomenclaturas", ln, LocalizacionesNomenclaturas.class);
                }
            }
        }
        return restTemplate.postForObject(serviceUrl, request, Localizaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Localizaciones request) {
        String serviceLN = baseUrl + "/api/localizacionesNomenclaturas";
        if(request.getListLN().size()>0){
            restTemplate.getForObject(serviceLN + "/disbled/" + request.getIdLocalizacion(), LocalizacionesNomenclaturas.class);
            for(LocalizacionesNomenclaturas ln : request.getListLN()){
                if(ln.getIdLocalizacionNomenclatura() != null){
                    LocalizacionesNomenclaturas LN = restTemplate.getForObject(serviceLN + ln.getIdLocalizacionNomenclatura(), LocalizacionesNomenclaturas.class);
                    restTemplate.put(serviceLN, LN, LocalizacionesNomenclaturas.class);
                }else{
                    ln.setIdLocalizacion(request.getIdLocalizacion());
                    restTemplate.postForObject(serviceLN, ln, LocalizacionesNomenclaturas.class);
                }
            }
        }
        restTemplate.put(serviceUrl, request, Localizaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLocalizacion}")
    Localizaciones findOne(@PathVariable Integer idLocalizacion) {
        return restTemplate.getForObject(serviceUrl + "buscarId/" + idLocalizacion, Localizaciones.class);
    }
}