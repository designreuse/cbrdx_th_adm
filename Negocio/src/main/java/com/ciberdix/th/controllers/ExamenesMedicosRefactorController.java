package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ExamenesMedicos;
import com.ciberdix.th.model.ProcesoSeleccion;
import com.ciberdix.th.model.TercerosPublicaciones;
import com.ciberdix.th.model.VExamenesMedicos;
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
        String tokenProfile = UtilitiesController.generateTokenButton("/profile", null);
        if (obj.getIdInstitucionMedica() != null) {
            String token810 = UtilitiesController.generateTokenButton("/answer-exams/exam/" + obj.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), null);
            String token811 = UtilitiesController.generateTokenButton("/informed-consent/exam/" + obj.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), null);
            UtilitiesController.sendMail("w1andresv@gmail.com", "810", "respondercuest" + token810 + "perfil" + tokenProfile);
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
        if (UtilitiesController.findListItem("ListasEstadosExamenesMedicos", "ENSPR").getIdLista().equals(obj.getIdEstadoExamenMedico())) {
            String token810 = UtilitiesController.generateTokenButton("/answer-exams/exam/" + obj.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), null);
            String token811 = UtilitiesController.generateTokenButton("/informed-consent/exam/" + obj.getIdExamenMedico() + "/terceroPublicacion/" + p.getIdTerceroPublicacion(), null);
            UtilitiesController.sendMail("w1andresv@gmail.com", "810", "respondercuest" + token810 + "perfil" + tokenProfile);
            UtilitiesController.sendMail("w1andresv@gmail.com", "811", "consentimiento" + token811);
        }
        restTemplate.put(serviceUrl, obj);
    }

}
