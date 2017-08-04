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
 * Created by Danny on 16/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/institucionesMedicas")
public class InstitucionesMedicasRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/institucionesMedicas/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VInstitucionesMedicas> findAll() {
        VInstitucionesMedicas[] parametros = restTemplate.getForObject(serviceUrl, VInstitucionesMedicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VInstitucionesMedicas findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VInstitucionesMedicas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VInstitucionesMedicas> findEnabled() {
        VInstitucionesMedicas[] parametros = restTemplate.getForObject(serviceUrl + "enabled", VInstitucionesMedicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacion/{idPublicacion}")
    List<VInstitucionesMedicas> findProcess(@PathVariable Integer idPublicacion) {
        Publicaciones pubData = restTemplate.getForObject(baseUrl + "/api/publicaciones/" + idPublicacion, Publicaciones.class);
        Requerimientos reqData = restTemplate.getForObject(baseUrl + "/api/requerimientos/" + pubData.getIdRequerimiento(), Requerimientos.class);
        if (reqData.getIdEstructuraFisica() != null) {
            VInstitucionesMedicasEstructurasFisicas[] parametros = restTemplate.getForObject(baseUrl + "/api/institucionesMedicasEstructurasFisicas/estructuraFisica/" + reqData.getIdEstructuraFisica(), VInstitucionesMedicasEstructurasFisicas[].class);
            VInstitucionesMedicas[] fullData = restTemplate.getForObject(serviceUrl, VInstitucionesMedicas[].class);
            List<VInstitucionesMedicas> returnData = Arrays.asList(fullData);
            returnData = returnData.stream().filter(t -> Arrays.stream(parametros).anyMatch(f -> f.getIdInstitucionMedica().equals(t.getIdInstitucionMedica()))).collect(Collectors.toList());
            return returnData;
        } else {
            VInstitucionesMedicas[] parametros = restTemplate.getForObject(serviceUrl + "enabled", VInstitucionesMedicas[].class);
            return Arrays.asList(parametros);
        }

    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicas create(@RequestBody InstitucionesMedicas obj) {
        InstitucionesMedicas im = restTemplate.postForObject(serviceUrl, obj, InstitucionesMedicas.class);
        InstitucionesMedicasTiposExamenes imte = new InstitucionesMedicasTiposExamenes();
        if (obj.getListTipos() != null && obj.getListTipos().size() > 0) {
            imte.setIdInstitucionMedica(im.getIdInstitucionMedica());
            imte.setIndicadorHabilitado(true);
            imte.setAuditoriaUsuario(im.getAuditoriaUsuario());
            imte.setAuditoriaFecha(im.getAuditoriaFecha());
            for (Integer id : obj.getListTipos()) {
                imte.setIdTipoExamen(id);
                restTemplate.postForObject(baseUrl + "/api/institucionesMedicasTiposExamenes", imte, InstitucionesMedicasTiposExamenes.class);
            }
        }
        return im;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicas obj) {
        restTemplate.getForObject(baseUrl + "/api/institucionesMedicasTiposExamenes/disabled/" + obj.getIdInstitucionMedica(), InstitucionesMedicasTiposExamenes.class);
        if (obj.getListTipos() != null && obj.getListTipos().size() > 0) {
            VInstitucionesMedicasTiposExamenes imte = new VInstitucionesMedicasTiposExamenes();
            for (Integer id : obj.getListTipos()) {
                imte = restTemplate.getForObject(baseUrl + "/api/institucionesMedicasTiposExamenes/institucionMedicaTipoExamen/" + obj.getIdInstitucionMedica() + "/" + id, VInstitucionesMedicasTiposExamenes.class);
                if (imte != null) {
                    imte.setIndicadorHabilitado(true);
                    restTemplate.put(baseUrl + "/api/institucionesMedicasTiposExamenes", imte, InstitucionesMedicasTiposExamenes.class);
                } else {
                    imte.setIdInstitucionMedica(obj.getIdInstitucionMedica());
                    imte.setIndicadorHabilitado(true);
                    imte.setAuditoriaUsuario(obj.getAuditoriaUsuario());
                    imte.setAuditoriaFecha(obj.getAuditoriaFecha());
                    imte.setIdTipoExamen(id);
                    restTemplate.postForObject(baseUrl + "/api/institucionesMedicasTiposExamenes", imte, InstitucionesMedicasTiposExamenes.class);
                }
            }
        }
        restTemplate.put(serviceUrl, obj);
    }

}
