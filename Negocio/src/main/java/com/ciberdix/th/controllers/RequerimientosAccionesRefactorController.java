package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 16/05/2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/requerimientosAcciones")
public class RequerimientosAccionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${front.url}")
    private String frontUrl;

    @Value("${business.url}")
    private String businessUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientosAcciones> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        List<VRequerimientosAcciones> requerimientosAcciones = Arrays.asList(restTemplate.getForObject(serviceUrl, VRequerimientosAcciones[].class));
        return requerimientosAcciones;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRequerimientosAcciones findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, VRequerimientosAcciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<VRequerimientosAcciones> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/requerimiento/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientosAcciones[] parametros = restTemplate.getForObject(serviceUrl + idRequerimiento, VRequerimientosAcciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosAcciones create(@RequestBody RequerimientosAcciones o) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        Integer idReqHist = null;
        ListasItems solaut = UtilitiesController.findListItem("ListasRequerimientosAcciones", "SOLAUT");
        if (o.getIdAccion().equals(solaut.getIdLista())) {
            String token = UtilitiesController.generateURLToken("/vacancies/approve/" + o.getIdRequerimiento());
            String body = "Se ha creado un requerimiento de personal que requiere su aprobación: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p><a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a></p>";
            String recipients = UtilitiesController.findConstant("CORAUT").getValor();
            UtilitiesController.sendMail(recipients, "Aprobación", body);
        } else {
            Integer aprb = UtilitiesController.findListItem("ListasRequerimientosAcciones", "APRB").getIdLista();
            Integer rchz = UtilitiesController.findListItem("ListasRequerimientosAcciones", "RCHZ").getIdLista();
            Integer devcam = UtilitiesController.findListItem("ListasRequerimientosAcciones", "DEVCAM").getIdLista();
            if (o.getIdAccion().equals(aprb) || o.getIdAccion().equals(rchz) || o.getIdAccion().equals(devcam)) {
                List<VRequerimientosAcciones> vRequerimientosAcciones = Arrays.asList(restTemplate.getForObject(businessUrl + "/api/requerimientosAcciones/requerimiento/" + o.getIdRequerimiento(), VRequerimientosAcciones[].class));
                VRequerimientosAcciones last = new VRequerimientosAcciones();
                last.setIdRequerimientoAccion(1);
                for (VRequerimientosAcciones r : vRequerimientosAcciones) {
                    if (last.getIdRequerimientoAccion() < r.getIdRequerimientoAccion()) {
                        last = r;
                    }
                }
                if (last.getAuditoriaUsuario() != null && last.getIdAccion().equals(solaut.getIdLista())) {
                    VRequerimientos vRequerimientos = restTemplate.getForObject(baseUrl + "/api/requerimientos/" + o.getIdRequerimiento(), VRequerimientos.class);
                    Usuarios usuarioSolicitud = UtilitiesController.findUser(last.getAuditoriaUsuario());
                    Usuarios usuarioRequerimiento = UtilitiesController.findUser(vRequerimientos.getIdSolicitante());

                    if (o.getIdAccion().equals(aprb)) {
                        String token = UtilitiesController.generateURLToken("/vacancies/update/" + o.getIdRequerimiento());
                        String body = "Se ha aprobado un requerimiento de personal del cual usted solicito aprobación: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p><a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a></p>";
                        UtilitiesController.sendMail(usuarioSolicitud.getCorreoElectronico(), "Revisión", body);

                        token = UtilitiesController.generateURLToken("/personnel-requirement/detail/" + o.getIdRequerimiento());
                        body = "Se ha aprobado un requerimiento de personal solicitado por usted: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p><a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a></p>";
                        UtilitiesController.sendMail(usuarioRequerimiento.getCorreoElectronico(), "Revisión", body);

                        Integer aplnt = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasTiposSolicitudes/code/APLNT", ListasItems.class).getIdLista();
                        Integer dmnplnt = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasTiposSolicitudes/code/DMNPLNT", ListasItems.class).getIdLista();
                        Integer crgnvarea = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasTiposSolicitudes/code/CRGNVAREA", ListasItems.class).getIdLista();
                        if (vRequerimientos.getIdTipoSolicitud().equals(aplnt)) {
                            VEstructuraOrganizacionalCargos data = restTemplate.getForObject(businessUrl + "/api/estructuraOrganizacionalCargos/buscarCargoEstructura/" + vRequerimientos.getIdCargo() + "/" + vRequerimientos.getIdEstructuraOrganizacional(), VEstructuraOrganizacionalCargos.class);
                            data.setPlazas(data.getPlazas() + vRequerimientos.getCantidadVacantes());
                            restTemplate.put(businessUrl + "/api/estructuraOrganizacionalCargos", data, EstructuraOrganizacional.class);
                        } else if (vRequerimientos.getIdTipoSolicitud().equals(dmnplnt)) {
                            VEstructuraOrganizacionalCargos data = restTemplate.getForObject(businessUrl + "/api/estructuraOrganizacionalCargos/buscarCargoEstructura/" + vRequerimientos.getIdCargo() + "/" + vRequerimientos.getIdEstructuraOrganizacional(), VEstructuraOrganizacionalCargos.class);
                            data.setPlazas(data.getPlazas() - vRequerimientos.getCantidadVacantes());
                            restTemplate.put(businessUrl + "/api/estructuraOrganizacionalCargos", data, EstructuraOrganizacional.class);
                        } else if (vRequerimientos.getIdTipoSolicitud().equals(crgnvarea)) {
                            EstructuraOrganizacionalCargos cargos = new EstructuraOrganizacionalCargos();
                            cargos.setPlazas(vRequerimientos.getCantidadVacantes());
                            cargos.setIdCargo(vRequerimientos.getIdCargo());
                            cargos.setIdEstructuraOrganizacional(vRequerimientos.getIdEstructuraOrganizacional());
                            cargos.setIndicadorHabilitado(true);
                            cargos.setAuditoriaUsuario(vRequerimientos.getIdSolicitante());
                            restTemplate.postForObject(businessUrl + "/api/estructuraOrganizacionalCargos", cargos, EstructuraOrganizacional.class);
                        }
                    } else {
                        String token = UtilitiesController.generateURLToken("/vacancies/detail/" + o.getIdRequerimiento());
                        String body = "Se ha modificado un requerimiento de personal del cual usted solicito aprobación: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p><a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a></p>";
                        UtilitiesController.sendMail(usuarioSolicitud.getCorreoElectronico(), "Revisión", body);

                        token = UtilitiesController.generateURLToken("/personnel-requirement/detail/" + o.getIdRequerimiento());
                        body = "Se ha modificado un requerimiento de personal solicitado por usted: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p><a href=\"" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a></p>";
                        UtilitiesController.sendMail(usuarioRequerimiento.getCorreoElectronico(), "Revisión", body);
                    }
                }
            }
        }
        List<RequerimientosHistoricos> requerimientosHistoricos = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/requerimientosHistoricos", RequerimientosHistoricos[].class));
        for (RequerimientosHistoricos r : requerimientosHistoricos) {
            idReqHist = r.getIdRequerimientoHistorico();
        }
        o.setIdRequerimientoHistorico(idReqHist);
        return restTemplate.postForObject(serviceUrl, o, RequerimientosAcciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosAcciones o) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }
}
