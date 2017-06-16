package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import com.ciberdix.th.storage.StorageService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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

    @Value("${front.url}")
    private String frontUrl;

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
        UtilitiesController u = new UtilitiesController();
        VPublicaciones publicaciones = restTemplate.getForObject(globales.getUrl() + "api/publicaciones/" + idPublicacion, VPublicaciones.class);
        List<TercerosPublicaciones> tercerosPublicaciones = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/tercerosPublicaciones/publicacion/" + publicaciones.getIdPublicacion(), TercerosPublicaciones[].class));
        List<VProcesosPasos> procesosPasos;
        String forma = u.findListItemById("ListasFormasReclutamientos",publicaciones.getIdFormaReclutamiento()).getCodigo();

        if(forma.equals("EXT")){
            procesosPasos = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/procesosPasos/procesoOrden/externoMixto/" + publicaciones.getIdProceso(), VProcesosPasos[].class));
        }else if(forma.equals("INT")){
            procesosPasos = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/procesosPasos/procesoOrden/internoMixto/" + publicaciones.getIdProceso(), VProcesosPasos[].class));
        }else{
            procesosPasos = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/procesosPasos/procesoOrden/" + publicaciones.getIdProceso(), VProcesosPasos[].class));
        }

        for(TercerosPublicaciones tp: tercerosPublicaciones){
            Terceros terceros = restTemplate.getForObject(globales.getUrl() + "api/terceros/" + tp.getIdTercero(), Terceros.class);
            String nombreCompleto = terceros.getPrimerNombre() + " " + terceros.getSegundoNombre() + " " + terceros.getPrimerApellido() + " " + terceros.getSegundoApellido();
            List<VProcesoSeleccion> vProcesoSeleccion = Arrays.asList(restTemplate.getForObject(serviceUrl + "/malla/" + tp.getIdTercerosPublicaciones(), VProcesoSeleccion[].class));
            List<ListaProcesoSeleccion> LPSL = new ArrayList<>();
            ArrayList<Integer> ps = new ArrayList<>();

            for(int i=0; i<vProcesoSeleccion.size(); i++){
                ps.add(vProcesoSeleccion.get(i).getIdProcesoPaso());
            }

            for(VProcesosPasos vpp: procesosPasos){

                ListaProcesoSeleccion LPS = new ListaProcesoSeleccion();
                LPS.setIdProcesoPaso(vpp.getIdProcesoPaso());
                LPS.setInterfaz(vpp.getInterfaz());
                LPS.setInterfazInterna(vpp.getInterfazInterna());
                LPS.setOrden(vpp.getOrden());

                if(vProcesoSeleccion.size()>0){
                    if(ps.contains(vpp.getIdProcesoPaso())){
                        for(VProcesoSeleccion vps: vProcesoSeleccion){
                            if(vpp.getIdProcesoPaso() == vps.getIdProcesoPaso()){
                                LPS.setIdProcesoSeleccion(vps.getIdProcesoSeleccion());
                                LPS.setIdResponsable(vps.getIdResponsable());
                                String codigo = u.findListItemById("ListasEstadosDiligenciados",vps.getIdEstadoDiligenciado()).getCodigo();
                                LPS.setCodigoEstadoDiligenciado(codigo);
                                LPSL.add(LPS);
                            }
                        }
                    }else{
                        LPSL.add(LPS);
                    }
                }else{
                    LPSL.add(LPS);
                }
            }

            OPS = new ObjetoProcesoSeleccion(tp.getIdTercerosPublicaciones(),terceros.getIdTercero(),nombreCompleto,LPSL);
            OPSL.add(OPS);
        }

        return OPSL;
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccion create(@RequestBody ProcesoSeleccion obj) {
        RestTemplate restTemplate = new RestTemplate();
        UtilitiesController u = new UtilitiesController();
        Long idTercero = restTemplate.getForObject(globales.getUrl() + "/api/tercerosPublicaciones/" + obj.getIdTerceroPublicacion(), TercerosPublicaciones.class).getIdTercero();
        Terceros t = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + idTercero, Terceros.class);
        Usuarios user = restTemplate.getForObject(globales.getUrl() + "/api/usuarios/query/" + obj.getIdResponsable(), Usuarios.class);
        String estado = u.findListItemById("ListasEstadosDiligenciados", obj.getIdEstadoDiligenciado()).getCodigo();
        String token = UtilitiesController.generateURLToken("/process-step/" + obj.getIdProcesoPaso() + "/terceroPublication/" + obj.getIdTerceroPublicacion() + "/process/" + obj.getIdProcesoSeleccion());
        Terceros te = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + user.getIdTercero(), Terceros.class);
        if(estado.equals("PROG")){
            UtilitiesController.sendMail(user.getCorreoElectronico(),"Responsable Vacante","<h3>Buen día</h3><h2> " + te.getPrimerNombre() + " " + te.getSegundoNombre() + " " + te.getPrimerApellido() + " " + te.getSegundoApellido() + "</h2><p><a href=\"" + frontUrl + "/login?token=" + token + "\">Paso a diligenciar</a></p>");
            UtilitiesController.sendMail(t.getCorreoElectronico(),"Se te ha programado una cita","<h3>Buen día!</h3><h2> " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</h2><p>Se te ha asignado una cita programada para: " + obj.getFechaCita() + "</p><p>" + obj.getDetalleCorreo() + "</p>");
        }
        VProcesosPasos p = restTemplate.getForObject(globales.getUrl() + "/api/procesosPasos/" + obj.getIdProcesoPaso(), VProcesosPasos.class);
        if(estado.equals("APROB") && p.getIndicadorCorreo()){
            UtilitiesController.sendMail(t.getCorreoElectronico(),"Has aprobado!","<h3>Buen día!</h3><h2> " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</h2><p>Has arpobado el paso: " + p.getNombre() + "</p>");
        }
        return restTemplate.postForObject(serviceUrl, obj, ProcesoSeleccion.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccion obj) {
        RestTemplate restTemplate = new RestTemplate();
        UtilitiesController u = new UtilitiesController();
        Long idTercero = restTemplate.getForObject(globales.getUrl() + "/api/tercerosPublicaciones/" + obj.getIdTerceroPublicacion(), TercerosPublicaciones.class).getIdTercero();
        Terceros t = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + idTercero, Terceros.class);
        Usuarios user = restTemplate.getForObject(globales.getUrl() + "/api/usuarios/query/" + obj.getIdResponsable(), Usuarios.class);
        String estado = u.findListItemById("ListasEstadosDiligenciados", obj.getIdEstadoDiligenciado()).getCodigo();
        String token = UtilitiesController.generateURLToken("/process-step/" + obj.getIdProcesoPaso() + "/terceroPublication/" + obj.getIdTerceroPublicacion() + "/process/" + obj.getIdProcesoSeleccion());
        Terceros te = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + user.getIdTercero(), Terceros.class);
        if(estado.equals("PROG")){
            UtilitiesController.sendMail(user.getCorreoElectronico(),"Responsable Vacante","<h3>Buen día</h3><h2> " + te.getPrimerNombre() + " " + te.getSegundoNombre() + " " + te.getPrimerApellido() + " " + te.getSegundoApellido() + "</h2><p><a href=\"" + frontUrl + "/login?token=" + token + "\">Paso a diligenciar</a></p>");
            UtilitiesController.sendMail(t.getCorreoElectronico(),"Se te ha programado una cita","<h3>Buen día!</h3><h2> " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</h2><p>Se te ha asignado una cita programada para: " + obj.getFechaCita() + "</p><p>" + obj.getDetalleCorreo() + "</p>");
        }
        VProcesosPasos p = restTemplate.getForObject(globales.getUrl() + "/api/procesosPasos/" + obj.getIdProcesoPaso(), VProcesosPasos.class);
        if(estado.equals("APROB") && p.getIndicadorCorreo()){
            UtilitiesController.sendMail(t.getCorreoElectronico(),"Has aprobado!","<h3>Buen día!</h3><h2> " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</h2><p>Has arpobado el paso: " + p.getNombre() + "</p>");
        }
        restTemplate.put(serviceUrl, obj);
    }

}
