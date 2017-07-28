package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/proyeccionDotacion")
@CrossOrigin
public class ProyeccionDotacionRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/proyeccionDotacion/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionDotacion> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionDotacion findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VProyeccionDotacion.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionDotacion> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/entreFechas/{fechaInicio}/{fechaFin}")
    List<VProyeccionDotacion> findByFechaSolicitudBetween(@PathVariable String fechaInicio, @PathVariable String fechaFin) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "entreFechas/" + fechaInicio + "/" + fechaFin, VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/entreFechas/{fechaInicio}/{fechaFin}/{idUsuario}")
    List<VProyeccionDotacion> findByFechaSolicitudBetweenAndIdUsuario(@PathVariable String fechaInicio, @PathVariable String fechaFin, @PathVariable Integer idUsuario) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "entreFechas/" + fechaInicio + "/" + fechaFin + "/" + idUsuario, VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{idTercero}")
    List<VProyeccionDotacion> findByIdTercero(@PathVariable Long idTercero) {
        List<VProyeccionDotacion> p = Arrays.asList(restTemplate.getForObject(serviceUrl + "tercero/" + idTercero, VProyeccionDotacion[].class));
        for(VProyeccionDotacion vp : p){
            VProyeccionesDotacionesTerceros pdt = restTemplate.getForObject(baseUrl + "/api/proyeccionesDotacionesTerceros/proyeccionDotacionTercero/" + vp.getIdProyeccionDotacion() + "/" + idTercero, VProyeccionesDotacionesTerceros.class);
            vp.setIdEstado(pdt.getIdEstado());
        }
        return p;
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionDotacion create(@RequestBody ProyeccionDotacion o) {
        List<Integer> ids = o.getIdEstructuraOrganizacional();
        ProyeccionDotacion PD = restTemplate.postForObject(serviceUrl, o, ProyeccionDotacion.class);
        if(o.getIndicadorNoAreas() != null){
            if(!o.getIndicadorNoAreas()){
                if(o.getIdEstructuraOrganizacional() != null){
                    if(o.getIdEstructuraOrganizacional().size()>0){
                        for (Integer id : ids){
                            ProyeccionDotacionEstructuraOrganizacional pe = new ProyeccionDotacionEstructuraOrganizacional();
                            pe.setIdProyeccionDotacion(PD.getIdProyeccionDotacion());
                            pe.setIdEstructuraOrganizacional(id);
                            pe.setIndicadorHabilitado(true);
                            pe.setAuditoriaUsuario(o.getAuditoriaUsuario());
                            restTemplate.postForObject(baseUrl + "/api/proyeccionDotacionEstructuraOrganizacional", pe, ProyeccionDotacionEstructuraOrganizacional.class);
                        }
                    }
                }
            }
        }

        List<VProyeccionDotacionEstructuraOrganizacional> pdeo = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/proyeccionDotacionEstructuraOrganizacional/proyeccionDotacion/" + PD.getIdProyeccionDotacion(), VProyeccionDotacionEstructuraOrganizacional[].class));
        ProyeccionesDotacionesTerceros pdt = new ProyeccionesDotacionesTerceros();
        ProyeccionesDotacionesTercerosDotaciones pdtd = new ProyeccionesDotacionesTercerosDotaciones();
        pdt.setIdProyeccionDotacion(PD.getIdProyeccionDotacion());
        pdt.setIndicadorHabilitado(true);
        pdt.setAuditoriaUsuario(PD.getAuditoriaUsuario());
        pdtd.setIndicadorHabilitado(true);
        pdtd.setAuditoriaUsuario(PD.getAuditoriaUsuario());
        for(VProyeccionDotacionEstructuraOrganizacional vpdeo : pdeo){
            if(vpdeo.getIdEstructuraOrganizacional()!=null){
                List<VTerceros> t = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/vterceros/estructuraOrganizacional/" + vpdeo.getIdEstructuraOrganizacional() + "/", VTerceros[].class));
                for(VTerceros vt : t){
                    pdt.setIdTercero(vt.getIdTercero());
                    ProyeccionesDotacionesTerceros pdtO = restTemplate.postForObject(baseUrl + "/api/proyeccionesDotacionesTerceros", pdt, ProyeccionesDotacionesTerceros.class);
                    pdtd.setIdProyeccionDotacionTercero(pdtO.getIdProyeccionDotacionTerceros());
                    List<VDotaciones> d = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/dotaciones/idProyeccionDotacion/" + PD.getIdProyeccionDotacion(), VDotaciones[].class));
                    for(VDotaciones vd :d){
                        pdtd.setIdDotacion(vd.getIdDotacion());
                        if(vd.getIdTipoTalla()!=null){
                            pdtd.setIdTalla(getTalla(vd.getIdTipoTalla(),vt));
                        }
                        restTemplate.postForObject(baseUrl + "/api/proyeccionesDotacionesTercerosDotaciones", pdtd, ProyeccionesDotacionesTercerosDotaciones.class);
                    }
                    List<VTercerosDotacionesAdicionales> tda = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/tercerosDotacionesAdicionales/tercero/" + vt.getIdTercero(), VTercerosDotacionesAdicionales[].class));
                    if(tda!=null){
                        if(tda.size()>0){
                            for(VTercerosDotacionesAdicionales vtda : tda){
                                vtda.setIdProyeccionDotacion(PD.getIdProyeccionDotacion());
                                VDotaciones dot = restTemplate.getForObject(baseUrl + "/api/dotaciones/" + vtda.getIdDotacion(), VDotaciones.class);
                                if(dot.getIdTipoTalla()!=null){
                                    vtda.setIdTalla(getTalla(dot.getIdTipoTalla(),vt));
                                }
                                restTemplate.postForObject(baseUrl + "/api/proyeccionesDotacionesTercerosDotaciones", vtda, TercerosDotacionesAdicionales.class);
                            }
                        }
                    }
                }
            }
        }
        return PD;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionDotacion o) {
        restTemplate.put(serviceUrl, o);
    }

    Integer getTalla(Integer tipoTalla, VTerceros vt){
        String code = UtilitiesController.findListItemById("ListasTiposTallas",tipoTalla).getCodigo();
        if(code.equals("CAM")){
            return vt.getIdTallaCamisa();
        }else if(code.equals("PAN")){
            return vt.getIdTallaPantalon();
        }else{
            return vt.getIdTallaCalzado();
        }
    }

}
