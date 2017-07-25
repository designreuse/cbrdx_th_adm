package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/requerimientosAcciones")
public class RequerimientosAccionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${front.url}")
    private String frontUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientosAcciones> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VRequerimientosAcciones[].class));
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

        UtilitiesController utilitiesController = new UtilitiesController();
        String domain = utilitiesController.readParameter("domain.url");
        String serviceUrl = domain + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        Integer idReqHist = null;
        ListasItems solaut = utilitiesController.findListItem("ListasRequerimientosAcciones", "SOLAUT");
        ListasItems aprper = utilitiesController.findListItem("ListasRequerimientosAcciones", "APRPER");
        ListasItems crrd = utilitiesController.findListItem("ListasRequerimientosAcciones", "CRRD");
        ListasItems crgelmn = utilitiesController.findListItem("ListasTiposSolicitudes", "CRGELMN");
        VRequerimientos vRequerimientos = restTemplate.getForObject(domain + "/api/requerimientos/" + o.getIdRequerimiento(), VRequerimientos.class);
        if (o.getIdAccion().equals(solaut.getIdLista())) {
            String token = UtilitiesController.generateURLToken("/vacancies/approve/" + o.getIdRequerimiento());
            String body = "Se ha creado un requerimiento de personal que requiere su aprobación: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p><a href=\"http://" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a></p>";
            String recipients = utilitiesController.findConstant("CORAUT").getValor();
            UtilitiesController.sendMail(recipients, "Aprobación", body);
        } else if (o.getIdAccion().equals(crrd.getIdLista()) && vRequerimientos.getIdTipoSolicitud().equals(crgelmn.getIdLista())) {
            Integer crrd_i = utilitiesController.findListItem("ListasEstadosRequerimientos", "CRRD").getIdLista();
            vRequerimientos.setIdEstado(crrd_i);
            restTemplate.put(domain + "/api/estructuraOrganizacionalCargos/disabled/" + vRequerimientos.getIdCargo(), vRequerimientos);
            restTemplate.put(domain + "/api/cargos/disabled/" + vRequerimientos.getIdCargo(), vRequerimientos);
            restTemplate.put(domain + "/api/requerimientos/", vRequerimientos, VRequerimientos.class);
        } else if (o.getIdAccion().equals(aprper.getIdLista())) {
            EstructuraOrganizacionalCargos estructuraOrganizacionalCargos = new EstructuraOrganizacionalCargos();
            estructuraOrganizacionalCargos.setAuditoriaUsuario(o.getAuditoriaUsuario());
            estructuraOrganizacionalCargos.setIdCargo(vRequerimientos.getIdCargo());
            estructuraOrganizacionalCargos.setIdEstructuraOrganizacional(vRequerimientos.getIdEstructuraOrganizacional());
            estructuraOrganizacionalCargos.setPlazas(vRequerimientos.getCantidadVacantes());
            estructuraOrganizacionalCargos.setIndicadorHabilitado(true);
            restTemplate.postForObject(domain + "/api/estructuraOrganizacionalCargos", estructuraOrganizacionalCargos, EstructuraOrganizacionalCargos.class);
        } else {
            Integer aprb = utilitiesController.findListItem("ListasRequerimientosAcciones", "APRB").getIdLista();
            Integer rchz = utilitiesController.findListItem("ListasRequerimientosAcciones", "RCHZ").getIdLista();
            Integer devcam = utilitiesController.findListItem("ListasRequerimientosAcciones", "DEVCAM").getIdLista();
            if (o.getIdAccion().equals(aprb) || o.getIdAccion().equals(rchz) || o.getIdAccion().equals(devcam)) {
                List<VRequerimientosAcciones> vRequerimientosAcciones = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/requerimientosAcciones/requerimiento/" + o.getIdRequerimiento(), VRequerimientosAcciones[].class));
                VRequerimientosAcciones last = new VRequerimientosAcciones();
                last.setIdRequerimientoAccion(1);
                for (VRequerimientosAcciones r : vRequerimientosAcciones) {
                    if (last.getIdRequerimientoAccion() < r.getIdRequerimientoAccion()) {
                        last = r;
                    }
                }
                if (last.getAuditoriaUsuario() != null && last.getIdAccion().equals(solaut.getIdLista())) {
                    Usuarios usuarioSolicitud = utilitiesController.findUser(last.getAuditoriaUsuario());
                    Usuarios usuarioRequerimiento = utilitiesController.findUser(vRequerimientos.getIdSolicitante());

                    if (o.getIdAccion().equals(aprb)) {
                        String token = UtilitiesController.generateURLToken("/vacancies/update/" + o.getIdRequerimiento());
                        String body = "Se ha aprobado un requerimiento de personal del cual usted solicito aprobación: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p style=\"align:center;\"><a href=\"http://" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\" alt=\"" + frontUrl + "/login?token=" + token + "\"></a></p>";
                        UtilitiesController.sendMail(usuarioSolicitud.getCorreoElectronico(), "Revisión", body);

                        token = UtilitiesController.generateURLToken("/personnel-requirement/detail/" + o.getIdRequerimiento());
                        body = "Se ha aprobado un requerimiento de personal solicitado por usted: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p><a href=\"http://" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\" alt=\"" + frontUrl + "/login?token=" + token + "\"></a></p>";
                        UtilitiesController.sendMail(usuarioRequerimiento.getCorreoElectronico(), "Revisión", body);

                        Calendar now = Calendar.getInstance();
                        int year = now.get(Calendar.YEAR) + 1;
                        VProyeccionLaboral vProyeccionLaboralAfectada = null;
                        List<VProyeccionLaboral> vProyeccionLaborals = new ArrayList<>();
                        VProyeccionLaboral[] vProyeccionLaborales = restTemplate.getForObject(baseUrl + "/api/proyeccionesLaborales/anio/" + year, VProyeccionLaboral[].class);
                        if (vProyeccionLaborales != null && vProyeccionLaborales.length > 0) {
                            vProyeccionLaborals = Arrays.asList(vProyeccionLaborales);
                            for (VProyeccionLaboral vProyeccionLaboral : vProyeccionLaborals) {
                                if (vProyeccionLaboral.getIdEstructuraOrganizacional().equals(vRequerimientos.getIdEstructuraOrganizacional()) && vProyeccionLaboral.getIdCargo().equals(vRequerimientos.getIdCargo())) {
                                    vProyeccionLaboralAfectada = vProyeccionLaboral;
                                    break;
                                }
                            }
                        }
                        VCargos vCargos = new VCargos();
                        if (vRequerimientos.getIdCargo() != null) {
                            vCargos = restTemplate.getForObject(domain + "/api/cargos/" + vRequerimientos.getIdCargo(), VCargos.class);
                        }
                        Integer aplnt = utilitiesController.findListItem("ListasTiposSolicitudes", "APLNT").getIdLista();
                        Integer dmnplnt = utilitiesController.findListItem("ListasTiposSolicitudes", "DMNPLNT").getIdLista();
                        Integer crgnvarea = utilitiesController.findListItem("ListasTiposSolicitudes", "CRGNVAREA").getIdLista();
                        if (vRequerimientos.getIdTipoSolicitud().equals(aplnt)) {
                            VEstructuraOrganizacionalCargos data = restTemplate.getForObject(domain + "/api/estructuraOrganizacionalCargos/buscarCargoEstructura/" + vRequerimientos.getIdCargo() + "/" + vRequerimientos.getIdEstructuraOrganizacional(), VEstructuraOrganizacionalCargos.class);
                            data.setPlazas(data.getPlazas() + vRequerimientos.getCantidadVacantes());
                            restTemplate.put(domain + "/api/estructuraOrganizacionalCargos", data, EstructuraOrganizacional.class);
                            if (vProyeccionLaboralAfectada != null) {
                                vProyeccionLaboralAfectada.setPlazasActuales(vProyeccionLaboralAfectada.getPlazasActuales() + vRequerimientos.getCantidadVacantes());
                                vProyeccionLaboralAfectada.setPlazasProyectadas(vProyeccionLaboralAfectada.getPlazasProyectadas() + vRequerimientos.getCantidadVacantes());
                                vProyeccionLaboralAfectada.setCostoActual((double) (vCargos.getSalario() * vProyeccionLaboralAfectada.getPlazasActuales()));
                                Double aDouble = Double.parseDouble(utilitiesController.findConstant("AUMSUE").getValor());
                                vProyeccionLaboralAfectada.setCostoProyectado(vCargos.getSalario() * aDouble * vProyeccionLaboralAfectada.getPlazasProyectadas());
                                restTemplate.postForObject(baseUrl + "/api/proyeccionLaboral", vProyeccionLaboralAfectada, VProyeccionLaboral.class);
                            }
                        } else if (vRequerimientos.getIdTipoSolicitud().equals(dmnplnt)) {
                            VEstructuraOrganizacionalCargos data = restTemplate.getForObject(baseUrl + "/api/estructuraOrganizacionalCargos/buscarCargoEstructura/" + vRequerimientos.getIdCargo() + "/" + vRequerimientos.getIdEstructuraOrganizacional(), VEstructuraOrganizacionalCargos.class);
                            data.setPlazas(data.getPlazas() - vRequerimientos.getCantidadVacantes());
                            restTemplate.put(domain + "/api/estructuraOrganizacionalCargos", data, EstructuraOrganizacional.class);
                            if (vProyeccionLaboralAfectada != null) {
                                vProyeccionLaboralAfectada.setPlazasActuales(vProyeccionLaboralAfectada.getPlazasActuales() - vRequerimientos.getCantidadVacantes());
                                vProyeccionLaboralAfectada.setPlazasProyectadas(vProyeccionLaboralAfectada.getPlazasProyectadas() - vRequerimientos.getCantidadVacantes());
                                vProyeccionLaboralAfectada.setCostoActual((double) (vCargos.getSalario() * vProyeccionLaboralAfectada.getPlazasActuales()));
                                Double aDouble = Double.parseDouble(utilitiesController.findConstant("AUMSUE").getValor());
                                vProyeccionLaboralAfectada.setCostoProyectado(vCargos.getSalario() * aDouble * vProyeccionLaboralAfectada.getPlazasProyectadas());
                                restTemplate.postForObject(domain + "/api/proyeccionLaboral", vProyeccionLaboralAfectada, VProyeccionLaboral.class);
                            }
                        } else if (vRequerimientos.getIdTipoSolicitud().equals(crgnvarea)) {
                            EstructuraOrganizacionalCargos cargos = new EstructuraOrganizacionalCargos();
                            cargos.setPlazas(vRequerimientos.getCantidadVacantes());
                            cargos.setIdCargo(vRequerimientos.getIdCargo());
                            cargos.setIdEstructuraOrganizacional(vRequerimientos.getIdEstructuraOrganizacional());
                            cargos.setIndicadorHabilitado(true);
                            cargos.setAuditoriaUsuario(vRequerimientos.getIdSolicitante());
                            restTemplate.postForObject(domain + "/api/estructuraOrganizacionalCargos", cargos, EstructuraOrganizacional.class);

                            if (!vProyeccionLaborals.isEmpty()) {
                                ProyeccionesLaborales proyeccionesLaborales = new ProyeccionesLaborales();
                                proyeccionesLaborales.setAnio(year);
                                proyeccionesLaborales.setAuditoriaUsuario(o.getAuditoriaUsuario());
                                proyeccionesLaborales.setIdCargo(vRequerimientos.getIdCargo());
                                proyeccionesLaborales.setIdEstructuraOrganizacional(vRequerimientos.getIdEstructuraOrganizacional());
                                proyeccionesLaborales.setPlazasActuales(vRequerimientos.getCantidadVacantes());
                                proyeccionesLaborales.setPlazasProyectadas(vRequerimientos.getCantidadVacantes());
                                proyeccionesLaborales.setIdUsuarioProyecta(o.getAuditoriaUsuario());
                                proyeccionesLaborales.setObservacion("Proyección Creada Automaticamente por Requerimiento de Personal");
                                proyeccionesLaborales.setIdEstadoProyeccion(utilitiesController.findListItem("ListasEstadosProyecciones", "").getIdLista());
                                restTemplate.postForObject(domain + "/api/proyeccionLaboral", proyeccionesLaborales, VProyeccionLaboral.class);
                            }

                        }
                    } else {
                        String token = UtilitiesController.generateURLToken("/vacancies/detail/" + o.getIdRequerimiento());
                        String body = "Se ha modificado un requerimiento de personal del cual usted solicito aprobación: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p><a href=\"http://" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\" alt=\"" + frontUrl + "/login?token=" + token + "\"></a></p>";
                        UtilitiesController.sendMail(usuarioSolicitud.getCorreoElectronico(), "Revisión", body);

                        token = UtilitiesController.generateURLToken("/personnel-requirement/detail/" + o.getIdRequerimiento());
                        body = "Se ha modificado un requerimiento de personal solicitado por usted: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <p><a href=\"http://" + frontUrl + "/login?token=" + token + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\" alt=\"" + frontUrl + "/login?token=" + token + "\"></a></p>";
                        UtilitiesController.sendMail(usuarioRequerimiento.getCorreoElectronico(), "Revisión", body);
                    }
                }
            }
        }
        List<RequerimientosHistoricos> requerimientosHistoricos = Arrays.asList(restTemplate.getForObject(domain + "/api/requerimientosHistoricos", RequerimientosHistoricos[].class));
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
