package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

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
        String tokenProfile = UtilitiesController.generateTokenButton("/profile", null);
        Publicaciones publicaciones = restTemplate.getForObject(baseUrl + "/api/publicaciones/" + tercerosPublicaciones.getIdPublicacion(), Publicaciones.class);
        Requerimientos requerimientos = restTemplate.getForObject(baseUrl + "/api/requerimientos" + publicaciones.getIdRequerimiento(), Requerimientos.class);
        Cargos cargos = restTemplate.getForObject(baseUrl + "/api/cargos/" + requerimientos.getIdCargo(), Cargos.class);
        if (obj.getIdInstitucionMedica() != null) {
            InstitucionesMedicas institucionesMedicas = restTemplate.getForObject(baseUrl + "/api/institucionesMedicas/" + obj.getIdInstitucionMedica(), InstitucionesMedicas.class);
            String token811 = UtilitiesController.generateTokenButton("/informed-consent/exam/" + obj.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), null);
            UtilitiesController.sendMail(institucionesMedicas.getCorreoElectronico(), "810", assembleInstitutionBody(vTerceros, UtilitiesController.fullName(vTerceros, true), cargos, p, obj));
            UtilitiesController.sendMail("w1andresv@gmail.com", "811", "consentimiento" + token811);
        } else {
            String token814 = UtilitiesController.generateTokenButton("/informed-consent/exam/" + obj.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), null);
            UtilitiesController.sendMail("w1andresv@gmail.com", "810", "consentimiento" + token814 + "perfil" + tokenProfile);
        }
        //Correo 810 y 811 si InstMedic!=null o 814 si null
        // url 810 es /answer-exams/exam/:idExamen/terceroPublicacion/:idTerceroPublication
        // url 811 y 814 /informed-consent/exam/:idExamen/terceroPublicacion/:idTerceroPublication
        // url 814 perfil del cargo....
        return obj;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ExamenesMedicos obj) {
        //Correo 810 y 811 si Estado = ENESPR e InstMedic!=null
        ProcesoSeleccion p = restTemplate.getForObject(baseUrl + "/api/procesoSeleccion/" + obj.getIdProcesoSeleccion(), ProcesoSeleccion.class);
        TercerosPublicaciones tercerosPublicaciones = restTemplate.getForObject(baseUrl + "/api/tercerosPublicaciones/" + p.getIdTerceroPublicacion(), TercerosPublicaciones.class);
        String tokenProfile = UtilitiesController.generateTokenButton("/profile", null);
        if (UtilitiesController.findListItem("ListasEstadosExamenesMedicos", "ENESPR").getIdLista().equals(obj.getIdEstadoExamenMedico())) {
            String token810 = UtilitiesController.generateTokenButton("/answer-exams/exam/" + obj.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), null);
            String token811 = UtilitiesController.generateTokenButton("/informed-consent/exam/" + obj.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), null);
            UtilitiesController.sendMail("w1andresv@gmail.com", "810", "respondercuest" + token810 + "perfil" + tokenProfile);
            UtilitiesController.sendMail("w1andresv@gmail.com", "811", "consentimiento" + token811);
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
        sb.append(UtilitiesController.generateTokenButton("/profile", null));
        sb.append("</li>");
        sb.append("<li>");
        sb.append("<h3>");
        sb.append("Resultado");
        sb.append("<h3>");
        sb.append(UtilitiesController.generateTokenButton("/answer-exams/exam/" + e.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), null));
        sb.append("</li>");
        sb.append("<li>");
        sb.append("<h3>");
        sb.append("Solicitud de adjuntar documentos una vez finalizada la atención del aspirante");
        sb.append("<h3>");
        sb.append("Recuerde una vez finalizada la atención del aspirante adjuntar al sistema los formatos de aptitud laboral requeridos por Crezcamos");
        return sb.toString();
    }
}
