package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Danny on 11/07/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/examenesMedicos")
public class ExamenesMedicosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/examenesMedicos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VExamenesMedicos> findAll() {
        VExamenesMedicos[] parametros = restTemplate.getForObject(serviceUrl, VExamenesMedicos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VExamenesMedicos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + "/" + id, VExamenesMedicos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoSeleccion/{id}")
    VExamenesMedicos getByIdProcesoSeleccion(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + "/procesoSeleccion/" + id, VExamenesMedicos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ExamenesMedicos create(@RequestBody ExamenesMedicos obj) {
        obj = restTemplate.postForObject(serviceUrl, obj, ExamenesMedicos.class);
        ProcesoSeleccion p = restTemplate.getForObject(baseUrl + "/api/procesoSeleccion/" + obj.getIdProcesoSeleccion(), ProcesoSeleccion.class);
        TercerosPublicaciones tercerosPublicaciones = restTemplate.getForObject(baseUrl + "/api/tercerosPublicaciones/" + p.getIdTerceroPublicacion(), TercerosPublicaciones.class);
        VTerceros vTerceros = restTemplate.getForObject(baseUrl + "/api/vterceros/" + tercerosPublicaciones.getIdTercero(), VTerceros.class);
        Publicaciones publicaciones = restTemplate.getForObject(baseUrl + "/api/publicaciones/" + tercerosPublicaciones.getIdPublicacion(), Publicaciones.class);
        Requerimientos requerimientos = restTemplate.getForObject(baseUrl + "/api/requerimientos/" + publicaciones.getIdRequerimiento(), Requerimientos.class);
        Cargos cargos = restTemplate.getForObject(baseUrl + "/api/cargos/" + requerimientos.getIdCargo(), Cargos.class);
        Usuarios[] usuarios = restTemplate.getForObject(baseUrl + "/api/usuarios", Usuarios[].class);
        Usuarios postulante = Arrays.stream(usuarios).filter(t -> t.getIdTercero() != null && t.getIdTercero().equals(vTerceros.getIdTercero())).collect(Collectors.toList()).get(0);
        if (obj.getIdInstitucionMedica() != null) {
            VInstitucionesMedicas institucionesMedicas = restTemplate.getForObject(baseUrl + "/api/institucionesMedicas/" + obj.getIdInstitucionMedica(), VInstitucionesMedicas.class);
            UtilitiesController.sendMail(institucionesMedicas.getCorreoElectronico(), "Proceso de Selección - Examen Médico de Ingreso - " + UtilitiesController.fullName(vTerceros, true), assembleInstitutionBody(vTerceros, UtilitiesController.fullName(vTerceros, true), cargos, p, obj));
            UtilitiesController.sendMail(postulante.getCorreoElectronico(), "Crezcamos - Solicitud Examen Médico de Ingreso - " + UtilitiesController.fullName(vTerceros, true), assemblePostulantBody(institucionesMedicas, UtilitiesController.fullName(vTerceros, true), p, obj));
        } else {
            UtilitiesController.sendMail(postulante.getCorreoElectronico(), "Crezcamos - Solicitud Examen Médico de Ingreso - " + UtilitiesController.fullName(vTerceros, true), assembleNoInstitutionBody(UtilitiesController.fullName(vTerceros, true), cargos, p, obj));
        }
        return obj;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ExamenesMedicos obj) {
        //Correo 810 y 811 si Estado = ENESPR e InstMedic!=null
        if (obj.getIdInstitucionMedica() != null && UtilitiesController.findListItem("ListasEstadosExamenesMedicos", "ENESPR").getIdLista().equals(obj.getIdEstadoExamenMedico())) {
            ProcesoSeleccion p = restTemplate.getForObject(baseUrl + "/api/procesoSeleccion/" + obj.getIdProcesoSeleccion(), ProcesoSeleccion.class);
            TercerosPublicaciones tercerosPublicaciones = restTemplate.getForObject(baseUrl + "/api/tercerosPublicaciones/" + p.getIdTerceroPublicacion(), TercerosPublicaciones.class);
            VTerceros vTerceros = restTemplate.getForObject(baseUrl + "/api/vterceros/" + tercerosPublicaciones.getIdTercero(), VTerceros.class);
            Publicaciones publicaciones = restTemplate.getForObject(baseUrl + "/api/publicaciones/" + tercerosPublicaciones.getIdPublicacion(), Publicaciones.class);
            Requerimientos requerimientos = restTemplate.getForObject(baseUrl + "/api/requerimientos/" + publicaciones.getIdRequerimiento(), Requerimientos.class);
            Cargos cargos = restTemplate.getForObject(baseUrl + "/api/cargos/" + requerimientos.getIdCargo(), Cargos.class);
            Usuarios[] usuarios = restTemplate.getForObject(baseUrl + "/api/usuarios", Usuarios[].class);
            Usuarios postulante = Arrays.stream(usuarios).filter(t -> t.getIdTercero() != null && t.getIdTercero().equals(vTerceros.getIdTercero())).collect(Collectors.toList()).get(0);
            VInstitucionesMedicas institucionesMedicas = restTemplate.getForObject(baseUrl + "/api/institucionesMedicas/" + obj.getIdInstitucionMedica(), VInstitucionesMedicas.class);
            UtilitiesController.sendMail(institucionesMedicas.getCorreoElectronico(), "Proceso de Selección - Examen Médico de Ingreso - " + UtilitiesController.fullName(vTerceros, true), assembleInstitutionBody(vTerceros, UtilitiesController.fullName(vTerceros, true), cargos, p, obj));
            UtilitiesController.sendMail(postulante.getCorreoElectronico(), "Crezcamos - Solicitud Examen Médico de Ingreso - " + UtilitiesController.fullName(vTerceros, true), assemblePostulantBody(institucionesMedicas, UtilitiesController.fullName(vTerceros, true), p, obj));
        }
        restTemplate.put(serviceUrl, obj);
    }

    private String assembleInstitutionBody(VTerceros tercero, String nombreTercero, Cargos cargo, ProcesoSeleccion p, ExamenesMedicos e) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>");
        sb.append("Proceso de Selección - Examen Médico de Ingreso - ");
        sb.append(nombreTercero);
        sb.append("</h2>");
        sb.append("<ol>");
        sb.append("<li>");
        sb.append("Solicitud del examen de ingreso");
        sb.append("<p>");
        sb.append("Comedidamente le solicito realizar el examen médico laboral relacionado en el asunto para el(la) señor(a) ");
        sb.append(nombreTercero);
        sb.append(", Identificado(a) con ");
        sb.append(tercero.getTipoDocumento());
        sb.append(" número ");
        sb.append(tercero.getNumeroDocumento());
        sb.append(" de ");
        sb.append(tercero.getCiudadExpDocumento());
        sb.append(" para el desarrollo en el cargo de ");
        sb.append(cargo.getCargo());
        sb.append(". El examen solicitado contiene las siguientes especificaciones de Valoración:");
        sb.append("</p>");
        sb.append("<h3>");
        sb.append("Evaluación médica laboral con énfasis en:");
        sb.append("</h3>");
        sb.append("<ol>");
        sb.append("<li>");
        sb.append("Sistema osteomuscular de miembros superiores e inferiores: Validar signos de enfermedades secundarias a desordenes musculo esqueléticos como: STC, Epicondilitis, Tenosinovitis De Quervain.");
        sb.append("</li>");
        sb.append("<li>");
        sb.append("Columna vertebral: Especificar escoliosis, cifosis, hiperlordosis; detallando el grado de la deformidad y las alteraciones funcionales secundarias a esto. Antecedentes quirúrgicos de columna");
        sb.append("</li>");
        sb.append("</ol>");
        sb.append("</p>");
        sb.append("</li>");
        sb.append("<li>");
        sb.append("<h3>");
        sb.append("Perfil de Cargo");
        sb.append("<h3>");
        sb.append(UtilitiesController.generateTokenButton("/positions/detail-pdf/" + cargo.getIdCargo(), "consentimiento_informado.png"));
        sb.append("</li>");
        sb.append("<li>");
        sb.append("<h3>");
        sb.append("Resultado");
        sb.append("<h3>");
        sb.append(UtilitiesController.generateTokenButton("/answer-exams/exam/" + e.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), "ingresar_resultado.png"));
        sb.append("</li>");
        sb.append("<li>");
        sb.append("<h3>");
        sb.append("Solicitud de adjuntar documentos una vez finalizada la atención del aspirante");
        sb.append("<h3>");
        sb.append("Recuerde una vez finalizada la atención del aspirante adjuntar al sistema los formatos de aptitud laboral requeridos por Crezcamos");
        return sb.toString();
    }

    private String assembleNoInstitutionBody(String nombreTercero, Cargos cargo, ProcesoSeleccion p, ExamenesMedicos e) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>");
        sb.append("Proceso de Selección - Examen Médico de Ingreso - ");
        sb.append(nombreTercero);
        sb.append("</h2>");
        sb.append("Buen día,");
        sb.append("<br/>");
        sb.append("A continuación los documentos para el examen de ingreso. Adjuntamos el perfil del cargo en el contenido del correo el cual debe imprimir y llevarlo al instituto de su preferencia. Igualmente un link para que declare la veracidad de la información y consentimiento informado.");
        sb.append("Debe descarga los siguientes documentos de la plataforma y llevarlos a la institución médica donde va a realizar el examen:");
        sb.append("<ol>");
        sb.append("<li>");
        sb.append("Solicitud del examen de ingreso");
        sb.append("</li>");
        sb.append("<li>");
        sb.append("Certificado de Aptitud Laboral");
        sb.append("</li>");
        sb.append("</ol>");
        sb.append("Los documentos los encuentra en la sección Documentos Adjuntos Sección Documentos a Descargar");
        sb.append("<br/>");
        sb.append("Realizado el examen y diligenciado en los documentos adjuntos el concepto médico, debe escanear y adjuntar a la plataforma los siguientes documentos:");
        sb.append("<ol>");
        sb.append("<li>");
        sb.append("Cerficado de Aptitud Laboral");
        sb.append("</li>");
        sb.append("<li>");
        sb.append("Factura o cuenta de cobro del examen médico nombre de Crezcamos S.A. NIT: 900 211.263-0 a la dirección Carrera 23 N 28- 27 Barrio Alarcón en Bucaramanga.");
        sb.append("</li>");
        sb.append("<li>");
        sb.append("Rut del instituto médico o médico especialista.");
        sb.append("</li>");
        sb.append("</ol>");
        sb.append("Los documentos los debe adjuntar en la sección Documentos Adjuntos Sección Documentos Adjuntar.");
        sb.append("<br/>");
        sb.append("Antes de realizado el examen debe declarar la veracidad de la información y consentimiento informado para ello debe dar click en el siguiente link:");
        sb.append(UtilitiesController.generateTokenButton("/informed-consent/exam/" + e.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), "consentimiento_informado.png"));
        sb.append("Es importante adjuntar los documentos a la plataforma y la declaración para continuar proceso de selección.");
        sb.append("<br/>");
        sb.append("El costo del examen médico no debe ser superior a 30.000.");
        sb.append("<br/>");
        sb.append("A continuación el perfil de cargo. Debe imprimirlo y llevarlo al instituto de su preferencia.");
        sb.append(UtilitiesController.generateTokenButton("/positions/detail-pdf/" + cargo.getIdCargo(), "ver_perfil_cargo.png"));
        return sb.toString();
    }

    private String assemblePostulantBody(VInstitucionesMedicas i, String nombreTercero, ProcesoSeleccion p, ExamenesMedicos e) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>");
        sb.append("Proceso de Selección - Examen Médico de Ingreso - ");
        sb.append(nombreTercero);
        sb.append("</h2>");
        sb.append("<ol>");
        sb.append("<li>");
        sb.append("Datos del instituto médico");
        sb.append("<p>");
        sb.append("Comedidamente le solicito realizar el examen médico laboral de ingreso en el siguiente instituto médico: ");
        sb.append("</p>");
        sb.append("<p>");
        sb.append("Nombre del Instituto: ");
        sb.append(i.getInstitucionMedica());
        sb.append("</p>");
        sb.append("<p>");
        sb.append(i.getDireccion());
        sb.append("</p>");
        sb.append("<p>");
        sb.append(i.getCorreoElectronico());
        sb.append("</p>");
        sb.append("<p>");
        sb.append(i.getTelefonoContacto());
        sb.append("</p>");
        sb.append("<p>");
        sb.append(e.getFechaProgramada());
        sb.append("</p>");
        sb.append("<p>");
        sb.append("Debe descarga los siguientes documentos de la plataforma y llevarlos a la institución médica donde va a realizar el examen: ");
        sb.append("</p>");
        sb.append("<ol>");
        sb.append("<li>");
        sb.append("Solicitud del examen de ingreso ");
        sb.append("</li>");
        sb.append("<li>");
        sb.append("Certificado de Aptitud Laboral ");
        sb.append("</li>");
        sb.append("</ol>");
        sb.append("</li>");
        sb.append("<li>");
        sb.append("<p>");
        sb.append("Consentimiento Informado");
        sb.append("</p>");
        sb.append("<p>");
        sb.append("Con el fin de continuar proceso de selección debe declarar la veracidad de la información y el consentimiento informado, dando click en el siguiente link realiza dicho proceso, el cual se debe declarar antes de realizar el examen: ");
        sb.append("</p>");
        sb.append("<p>");
        sb.append(UtilitiesController.generateTokenButton("/informed-consent/exam/" + e.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), "consentimiento_informado.png"));
        sb.append("</p>");
        sb.append("</li>");
        sb.append("</ol>");
        return sb.toString();
    }
}
