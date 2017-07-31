package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/proyeccionesDotacionesTerceros")
@CrossOrigin
public class ProyeccionesDotacionesTercerosRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/proyeccionesDotacionesTerceros/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionesDotacionesTerceros> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VProyeccionesDotacionesTerceros[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionesDotacionesTerceros findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VProyeccionesDotacionesTerceros.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionesDotacionesTerceros> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VProyeccionesDotacionesTerceros[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacion/{idProyeccionDotacion}")
    List<VProyeccionesDotacionesTerceros> findEnabled(@PathVariable Integer idProyeccionDotacion) {
        List<VProyeccionesDotacionesTerceros> pdt = Arrays.asList(restTemplate.getForObject(serviceUrl + "proyeccionDotacion/" + idProyeccionDotacion, VProyeccionesDotacionesTerceros[].class));
        for(VProyeccionesDotacionesTerceros vpdt : pdt){
            vpdt.setIndicadorAdicional(false);
            List<VTercerosDotacionesAdicionales> tda = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/tercerosDotacionesAdicionales/tercero/" + vpdt.getIdTercero(), VTercerosDotacionesAdicionales[].class));
            if(tda.size()>0){
                vpdt.setIndicadorAdicional(true);
            }
        }
        return pdt;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacion/{idProyeccionDotacion}/enabled")
    List<VProyeccionesDotacionesTerceros> findIdProyeccionDotacionEnabled(@PathVariable Integer idProyeccionDotacion) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "proyeccionDotacion/" + idProyeccionDotacion + "/enabled", VProyeccionesDotacionesTerceros[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabledEstado")
    List<VProyeccionesDotacionesTerceros> findEnabledAndIdEstadoNotNull() {
        List<VProyeccionesDotacionesTerceros> p = Arrays.asList(restTemplate.getForObject(serviceUrl, VProyeccionesDotacionesTerceros[].class));
        List<VProyeccionesDotacionesTerceros> pd = new ArrayList<>();
        for (VProyeccionesDotacionesTerceros vp : p) {
            if (vp.getIdEstado() != null && vp.getIndicadorHabilitado() != null && vp.getIndicadorHabilitado()) {
                pd.add(vp);
            }
        }
        return pd;
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionesDotacionesTerceros create(@RequestBody ProyeccionesDotacionesTerceros o) {
        ProyeccionesDotacionesTerceros  pdt = restTemplate.postForObject(serviceUrl, o, ProyeccionesDotacionesTerceros.class);
        VTerceros t =  restTemplate.postForObject(baseUrl + "/api/vterceros/" + pdt.getIdTercero(), o, VTerceros.class);
        List<VDotaciones> d = Arrays.asList(restTemplate.postForObject(baseUrl + "/api/dotaciones/idProyeccionDotacion/" + pdt.getIdProyeccionDotacion(), o, VDotaciones[].class));
        List<VTercerosDotacionesAdicionales> tda = Arrays.asList(restTemplate.postForObject(baseUrl + "/api/tercerosDotacionesAdicionales/tercero/" + pdt.getIdTercero(), o, VTercerosDotacionesAdicionales[].class));
        ProyeccionesDotacionesTercerosDotaciones pdtd = new ProyeccionesDotacionesTercerosDotaciones();
        pdtd.setIdProyeccionDotacionTercero(pdt.getIdProyeccionDotacionTerceros());
        pdtd.setIndicadorHabilitado(true);
        pdtd.setAuditoriaUsuario(pdt.getAuditoriaUsuario());
        pdtd.setAuditoriaFecha(pdt.getAuditoriaFecha());
        for(VDotaciones vd : d){
            List<VTercerosDotacionesAdicionales> tempTDA = tda.stream().filter(TDA->tda.stream().anyMatch(f->TDA.getIdDotacion()!=null && TDA.getIdDotacion().equals(vd.getIdDotacion()))).collect(Collectors.toList());
            for(VTercerosDotacionesAdicionales vtda : tempTDA){
                vtda.setIdProyeccionDotacion(pdt.getIdProyeccionDotacion());
                if(vd.getIdTipoTalla()!=null){
                    if(getTalla(vd, t)!=null){
                        vtda.setIdTalla(getTalla(vd, t));
                    }
                }
                restTemplate.put(baseUrl + "/api/tercerosDotacionesAdicionales", vtda, VTercerosDotacionesAdicionales.class);
            }
            pdtd.setIdDotacion(vd.getIdDotacion());
            if(vd.getIdTipoTalla()!=null){
                if(getTalla(vd, t)!=null){
                    pdtd.setIdTalla(getTalla(vd, t));
                }
            }
            restTemplate.postForObject(baseUrl + "/api/proyeccionesDotacionesTercerosDotaciones", pdtd, ProyeccionesDotacionesTercerosDotaciones.class);
        }
        return pdt;
    }

    Integer getTalla(VDotaciones vd, VTerceros t){
        String code = UtilitiesController.findListItemById("ListasTiposTallas", vd.getIdTipoTalla()).getCodigo();
        Integer idTalla = null;
        if(vd.getIdTipoTalla()!=null){
            if(code.equals("CAM")){
                if(t.getIdTallaCamisa()!=null){
                    idTalla = t.getIdTallaCamisa();
                }
            }else if(code.equals("PAN")){
                if(t.getIdTallaPantalon()!=null){
                    idTalla = t.getIdTallaPantalon();
                }
            }else{
                if(t.getIdTallaCalzado()!=null){
                    idTalla = t.getIdTallaCalzado();
                }
            }
        }
        return idTalla;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionesDotacionesTerceros o) {
        ProyeccionesDotacionesTerceros estadoActual = restTemplate.getForObject(serviceUrl + o.getIdProyeccionDotacionTerceros(), ProyeccionesDotacionesTerceros.class);
        Integer IdEntregado = UtilitiesController.findListItem("ListasEstadosProyeccionesTerceros", "ENTRE").getIdLista();
        if (estadoActual.getIdEstado()!=null && o.getIdEstado()!=null && !estadoActual.getIdEstado().equals(IdEntregado) && o.getIdEstado().equals(IdEntregado)) {
            Terceros terceros = restTemplate.getForObject(baseUrl + "/api/terceros/" + o.getIdTercero(), Terceros.class);
            String token = UtilitiesController.generateTokenButton("/employees/supplies-confirmation/" + o.getIdProyeccionDotacionTerceros(), null);
            List<VProyeccionesDotacionesTercerosDotaciones> dotacionesTercero = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/proyeccionesDotacionesTercerosDotaciones/proyeccionDotacionTercero/" + o.getIdProyeccionDotacion(), VProyeccionesDotacionesTercerosDotaciones[].class));
            String ListadoDotaciones = "<ol>";
            for (VProyeccionesDotacionesTercerosDotaciones p : dotacionesTercero) {
                ListadoDotaciones = ListadoDotaciones + "<li>" + p.getDotacion() + "</li>";
            }
            ListadoDotaciones = ListadoDotaciones + "</ol>";
            UtilitiesController.sendMail(terceros.getCorreoElectronico(), "Encuesta de Satisfacción", "<p>Por favor ingrese al siguiente enlace para realizar la confirmación la dotación relacionada</p>" + ListadoDotaciones + token);
        }
        restTemplate.put(serviceUrl, o);
    }
}
