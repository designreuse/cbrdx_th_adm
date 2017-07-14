package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import com.ciberdix.th.storage.StorageService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @RequestMapping(method = RequestMethod.GET, path = "/compareCargo/{idTerceroPublicacion}")
    Boolean compareCargos(@PathVariable Integer idTerceroPublicacion) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosPublicaciones tp = restTemplate.getForObject(globales.getUrl() + "/api/tercerosPublicaciones/" + idTerceroPublicacion, TercerosPublicaciones.class);

        Terceros t = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + tp.getIdTercero(), Terceros.class);
        VTercerosCargos vtc = restTemplate.getForObject(globales.getUrl() + "/api/tercerosCargos/tercero/" + t.getIdTercero(), VTercerosCargos.class);
        if(vtc==null || vtc.getIdCargo()==null)
            return false;
        List<VCargosRiesgos> lvcrT = new ArrayList<>();
        if(vtc.getIdCargo() != null){
            lvcrT = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "/api/cargosRiesgos/buscarCargo/" + vtc.getIdCargo(), VCargosRiesgos[].class));
        }
        ArrayList<VRiesgos> lvrT = new ArrayList<>();
        if(lvcrT.size()>0){
            for (VCargosRiesgos vcr : lvcrT){
                lvrT.add(restTemplate.getForObject(globales.getUrl() + "/api/riesgos/" + vcr.getIdRiesgo(), VRiesgos.class));
            }
        }

        VPublicaciones vp = restTemplate.getForObject(globales.getUrl() + "/api/publicaciones/" + tp.getIdPublicacion(), VPublicaciones.class);
        VRequerimientos vr = restTemplate.getForObject(globales.getUrl() + "/api/requerimientos/" + vp.getIdRequerimiento(), VRequerimientos.class);
        List<VCargosRiesgos> lvcrP = new ArrayList<>();
        if(vr.getIdCargo() != null){
            lvcrP = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "/api/cargosRiesgos/buscarCargo/" + vr.getIdCargo(), VCargosRiesgos[].class));
        }
        ArrayList<VRiesgos> lvrP = new ArrayList<>();
        if(lvcrP.size()>0){
            for (VCargosRiesgos vcr : lvcrP){
                lvrP.add(restTemplate.getForObject(globales.getUrl() + "/api/riesgos/" + vcr.getIdRiesgo(), VRiesgos.class));
            }
        }

        List<VRiesgos> lrC = lvrT.stream().filter(lt->lvrP.stream().anyMatch(f->f.getIdRiesgo().equals(lt.getIdRiesgo()))).collect(Collectors.toList());

        return (lrC.size()==lvrP.size()) && (lrC.size()==lvrT.size()) && (lvrP.size()==lvrT.size());
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
        String forma = UtilitiesController.findListItemById("ListasFormasReclutamientos", publicaciones.getIdFormaReclutamiento()).getCodigo();
        Integer cantProcesoSeleccion = 0;

        if (forma.equals("EXT")) {
            procesosPasos = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/procesosPasos/procesoOrden/externoMixto/" + publicaciones.getIdProceso(), VProcesosPasos[].class));
        } else if (forma.equals("INT")) {
            procesosPasos = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/procesosPasos/procesoOrden/internoMixto/" + publicaciones.getIdProceso(), VProcesosPasos[].class));
        } else {
            procesosPasos = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/procesosPasos/procesoOrden/" + publicaciones.getIdProceso(), VProcesosPasos[].class));
        }

        for (TercerosPublicaciones tp : tercerosPublicaciones) {
            Terceros terceros = restTemplate.getForObject(globales.getUrl() + "api/terceros/" + tp.getIdTercero(), Terceros.class);
            String nombreCompleto = terceros.getPrimerNombre() + " " + terceros.getSegundoNombre() + " " + terceros.getPrimerApellido() + " " + terceros.getSegundoApellido();
            List<VProcesoSeleccion> vProcesoSeleccion = Arrays.asList(restTemplate.getForObject(serviceUrl + "/malla/" + tp.getIdTercerosPublicaciones(), VProcesoSeleccion[].class));

            List<TercerosPublicaciones> terP = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "api/tercerosPublicaciones/tercero/" + tp.getIdTercero(), TercerosPublicaciones[].class));
            for(TercerosPublicaciones trP : terP){
                VPublicaciones p = restTemplate.getForObject(globales.getUrl() + "api/publicaciones/" + trP.getIdPublicacion(), VPublicaciones.class);
                VRequerimientos r = restTemplate.getForObject(globales.getUrl() + "api/requerimientos/" + p.getIdRequerimiento(), VRequerimientos.class);
                String code = UtilitiesController.findListItemById("ListasEstadosRequerimientos", r.getIdEstado()).getCodigo();

                if(code.equals("PRCSEL")){
                    cantProcesoSeleccion++;
                }
            }

            List<ListaProcesoSeleccion> LPSL = new ArrayList<>();
            ArrayList<Integer> ps = new ArrayList<>();

            for (VProcesoSeleccion vps : vProcesoSeleccion) {
                ps.add(vps.getIdProcesoPaso());
            }

            for (VProcesosPasos vpp : procesosPasos) {

                ListaProcesoSeleccion LPS = new ListaProcesoSeleccion();
                LPS.setIdProcesoPaso(vpp.getIdProcesoPaso());
                LPS.setInterfaz(vpp.getInterfaz());
                LPS.setInterfazInterna(vpp.getInterfazInterna());
                LPS.setOrden(vpp.getOrden());

                if (vProcesoSeleccion.size() > 0) {
                    if (ps.contains(vpp.getIdProcesoPaso())) {
                        for (VProcesoSeleccion vps : vProcesoSeleccion) {
                            if (vpp.getIdProcesoPaso().equals(vps.getIdProcesoPaso())) {
                                LPS.setIdProcesoSeleccion(vps.getIdProcesoSeleccion());
                                LPS.setIdResponsable(vps.getIdResponsable());
                                String codigo = UtilitiesController.findListItemById("ListasEstadosDiligenciados", vps.getIdEstadoDiligenciado()).getCodigo();
                                LPS.setCodigoEstadoDiligenciado(codigo);
                                LPSL.add(LPS);
                            }
                        }
                    } else {
                        LPSL.add(LPS);
                    }
                } else {
                    LPSL.add(LPS);
                }
            }

            OPS = new ObjetoProcesoSeleccion(tp.getIdTercerosPublicaciones(), terceros.getIdTercero(), nombreCompleto, LPSL, cantProcesoSeleccion);
            cantProcesoSeleccion = 0;
            OPSL.add(OPS);
        }

        return OPSL;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacion/{id}")
    List<VProcesoSeleccion> findByIdPublicacion(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/publicacion/" + id, VProcesoSeleccion[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccion create(@RequestBody ProcesoSeleccion obj) {
        RestTemplate restTemplate = new RestTemplate();
        UtilitiesController u = new UtilitiesController();
        Long idTercero = restTemplate.getForObject(globales.getUrl() + "/api/tercerosPublicaciones/" + obj.getIdTerceroPublicacion(), TercerosPublicaciones.class).getIdTercero();
        Terceros t = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + idTercero, Terceros.class);
        String estado = UtilitiesController.findListItemById("ListasEstadosDiligenciados", obj.getIdEstadoDiligenciado()).getCodigo();
        if (estado.equals("PROG")) {
            Usuarios user = restTemplate.getForObject(globales.getUrl() + "/api/usuarios/query/" + obj.getIdResponsable(), Usuarios.class);
            Terceros te = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + user.getIdTercero(), Terceros.class);
            String token = UtilitiesController.generateURLToken("/process-step/" + obj.getIdProcesoPaso() + "/terceroPublication/" + obj.getIdTerceroPublicacion() + "/process/" + obj.getIdProcesoSeleccion());
            UtilitiesController.sendMail(user.getCorreoElectronico(), "Responsable Vacante", "<h3>Buen día</h3><h2> " + te.getPrimerNombre() + " " + te.getSegundoNombre() + " " + te.getPrimerApellido() + " " + te.getSegundoApellido() + "</h2><p><a href=\"" + frontUrl + "/login?token=" + token + "\">Paso a diligenciar</a></p>");
            if (obj.getFechaCita() != null) {
                UtilitiesController.sendMail(t.getCorreoElectronico(), "Se te ha programado una cita", "<h3>Buen día!</h3><h2> " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</h2><p>Se te ha asignado una cita programada para: " + obj.getFechaCita() + "</p><p>" + obj.getDetalleCorreo() + "</p>");
            }
        }
        VProcesosPasos p = restTemplate.getForObject(globales.getUrl() + "/api/procesosPasos/" + obj.getIdProcesoPaso(), VProcesosPasos.class);
        if (estado.equals("APROB") && p.getIndicadorCorreo()) {
            UtilitiesController.sendMail(t.getCorreoElectronico(), "Has aprobado!", "<h3>Buen día!</h3><h2> " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</h2><p>Has arpobado el paso: " + p.getNombre() + "</p>");
        }
        ProcesoSeleccion procesoSeleccion = restTemplate.getForObject(serviceUrl + "/exist/" + obj.getIdTerceroPublicacion() + "/" + obj.getIdProcesoPaso(), ProcesoSeleccion.class);
        if(procesoSeleccion != null){
            return procesoSeleccion;
        }else{
            return restTemplate.postForObject(serviceUrl, obj, ProcesoSeleccion.class);
        }
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccion obj) {
        RestTemplate restTemplate = new RestTemplate();
        UtilitiesController u = new UtilitiesController();
        Long idTercero = restTemplate.getForObject(globales.getUrl() + "/api/tercerosPublicaciones/" + obj.getIdTerceroPublicacion(), TercerosPublicaciones.class).getIdTercero();
        Terceros t = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + idTercero, Terceros.class);
        String estado = UtilitiesController.findListItemById("ListasEstadosDiligenciados", obj.getIdEstadoDiligenciado()).getCodigo();
        if (estado.equals("PROG")) {
            Usuarios user = restTemplate.getForObject(globales.getUrl() + "/api/usuarios/query/" + obj.getIdResponsable(), Usuarios.class);
            Terceros te = restTemplate.getForObject(globales.getUrl() + "/api/terceros/" + user.getIdTercero(), Terceros.class);
            String token = UtilitiesController.generateURLToken("/process-step/" + obj.getIdProcesoPaso() + "/terceroPublication/" + obj.getIdTerceroPublicacion() + "/process/" + obj.getIdProcesoSeleccion());
            UtilitiesController.sendMail(user.getCorreoElectronico(), "Responsable Vacante", "<h3>Buen día</h3><h2> " + te.getPrimerNombre() + " " + te.getSegundoNombre() + " " + te.getPrimerApellido() + " " + te.getSegundoApellido() + "</h2><p><a href=\"" + frontUrl + "/login?token=" + token + "\">Paso a diligenciar</a></p>");
            if (obj.getFechaCita() != null) {
                UtilitiesController.sendCalendarMail(t.getCorreoElectronico(), "Se te ha programado una cita", "<h3>Buen día!</h3><h2> " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</h2><p>Se te ha asignado una cita programada para: " + obj.getFechaCita() + "</p><p>" + obj.getDetalleCorreo() + "</p>", obj.getFechaCita(), te.getPrimerNombre() + " " + te.getSegundoNombre() + " " + te.getPrimerApellido() + " " + te.getSegundoApellido());
            }
        }
        VProcesosPasos p = restTemplate.getForObject(globales.getUrl() + "/api/procesosPasos/" + obj.getIdProcesoPaso(), VProcesosPasos.class);
        if (estado.equals("APROB") && p.getIndicadorCorreo()) {
            UtilitiesController.sendMail(t.getCorreoElectronico(), "Has aprobado!", "<h3>Buen día!</h3><h2> " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</h2><p>Has arpobado el paso: " + p.getNombre() + "</p>");
        }
        restTemplate.put(serviceUrl, obj);
    }

}
