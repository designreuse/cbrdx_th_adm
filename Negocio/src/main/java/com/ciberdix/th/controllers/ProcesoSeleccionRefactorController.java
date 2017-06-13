package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import com.ciberdix.th.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesoSeleccion")
public class ProcesoSeleccionRefactorController {

    private final StorageService storageService;
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesoSeleccion";

    @Autowired
    public ProcesoSeleccionRefactorController(StorageService storageService) {
        this.storageService = storageService;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccion> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccion[] cargosCompetencias = restTemplate.getForObject(serviceUrl, VProcesoSeleccion[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idProcesoSeleccion}")
    VProcesoSeleccion findOne(@PathVariable Integer idProcesoSeleccion) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + idProcesoSeleccion, VProcesoSeleccion.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroPublicacion/{idPublicacion}")
    List<ObjetoProcesoSeleccion> findMalla(@PathVariable Integer idPublicacion) {
        RestTemplate restTemplate = new RestTemplate();
        List<ObjetoProcesoSeleccion> OPSL = new ArrayList<>();
        ObjetoProcesoSeleccion OPS;
        List<ListaProcesoSeleccion> LPSL = new ArrayList<>();
        UtilitiesController u = new UtilitiesController();
        VPublicaciones publicaciones = restTemplate.getForObject(globales.getUrl() + "api/publicaciones/" + idPublicacion, VPublicaciones.class);
        List<VProcesosPasos> procesosPasos = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/procesosPasos/procesoOrden/" + publicaciones.getIdProceso(), VProcesosPasos[].class));
        List<TercerosPublicaciones> tercerosPublicaciones = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/tercerosPublicaciones/publicacion/" + publicaciones.getIdPublicacion(), TercerosPublicaciones[].class));

        for(int i=0; i<tercerosPublicaciones.size(); i++){

            Terceros terceros = restTemplate.getForObject(globales.getUrl() + "api/terceros/" + tercerosPublicaciones.get(i).getIdTercero(), Terceros.class);
            String nombreCompleto = terceros.getPrimerNombre() + " " + terceros.getSegundoNombre() + " " + terceros.getPrimerApellido() + " " + terceros.getSegundoApellido();
            List<VProcesoSeleccion> vProcesoSeleccion = Arrays.asList(restTemplate.getForObject(serviceUrl + "/malla/" + idPublicacion + "/" + terceros.getIdTercero(), VProcesoSeleccion[].class));

            for(int j=0; j<procesosPasos.size(); i++){
                for(int k=0; k<vProcesoSeleccion.size(); k++){
                    ListaProcesoSeleccion LPS = new ListaProcesoSeleccion();
                    if(procesosPasos.get(j).getIdProcesoPaso() == vProcesoSeleccion.get(k).getIdProcesoPaso()){
                        LPS.setIdProcesoPaso(procesosPasos.get(j).getIdProcesoPaso());
                        LPS.setIdProcesoSeleccion(vProcesoSeleccion.get(k).getIdProcesoSeleccion());
                        String codigo = u.findListItemById("ListasEstadosDiligenciados",vProcesoSeleccion.get(k).getIdEstadoDiligenciado()).getCodigo();
                        LPS.setCodigoEstadoDiligenciado(codigo);
                        LPS.setInterfaz(procesosPasos.get(j).getInterfaz());
                        LPS.setInterfazInterna(procesosPasos.get(j).getInterfazInterna());
                        LPS.setOrden(procesosPasos.get(j).getOrden());
                    }else{
                        LPS.setIdProcesoPaso(procesosPasos.get(j).getIdProcesoPaso());
                        LPS.setInterfaz(procesosPasos.get(j).getInterfaz());
                        LPS.setInterfazInterna(procesosPasos.get(j).getInterfazInterna());
                        LPS.setOrden(procesosPasos.get(j).getOrden());
                    }
                    LPSL.add(LPS);
                }
            }

            OPS = new ObjetoProcesoSeleccion(terceros.getIdTercero(),nombreCompleto,LPSL);
            OPSL.add(OPS);

        }

        return OPSL;
    }

//    @RequestMapping(method = RequestMethod.POST)
//    ProcesoSeleccion create(@RequestBody ProcesoSeleccion obj, @RequestParam("file") MultipartFile file, HttpServletRequest request) {
//        RestTemplate restTemplate = new RestTemplate();
//        String avatarGuardado = storageService.store(file, "procesoSeleccion");
//        obj.setAdjunto(avatarGuardado);
//        return restTemplate.postForObject(serviceUrl, obj, ProcesoSeleccion.class);
//    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccion create(@RequestBody ProcesoSeleccion obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ProcesoSeleccion.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccion obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
