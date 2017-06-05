package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */

@RestController
@RequestMapping("/api/publicaciones")
@CrossOrigin
public class PublicacionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/publicaciones";

    @RequestMapping(method = RequestMethod.GET)
    List<VPublicaciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VPublicaciones[] parametros = restTemplate.getForObject(serviceUrl, VPublicaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPublicaciones findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VPublicaciones parametro = restTemplate.getForObject(serviceUrl + "/" + id, VPublicaciones.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cantidadPublicacion")
    List<VCantidadPublicacion> findCant() {
        RestTemplate restTemplate = new RestTemplate();
        VCantidadPublicacion[] parametros = restTemplate.getForObject(serviceUrl + "/cantidadPublicacion", VCantidadPublicacion[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/internaMixta")
    List<VPublicaciones> findIntMix() {
        RestTemplate restTemplate = new RestTemplate();
        VPublicaciones[] parametros = restTemplate.getForObject(serviceUrl + "/internaMixta", VPublicaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/externaMixta")
    List<VPublicaciones> findExtMix() {
        RestTemplate restTemplate = new RestTemplate();
        VPublicaciones[] parametros = restTemplate.getForObject(serviceUrl + "/externaMixta", VPublicaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Publicaciones create(@RequestBody Publicaciones request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Publicaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    String update(@RequestBody Publicaciones request) {
        RestTemplate restTemplate = new RestTemplate();
        VPublicaciones vPublicaciones = findOne(request.getIdPublicacion());
        if (request.getIndicadorPublicacion() && (vPublicaciones.getIndicadorPublicacion() == null || !vPublicaciones.getIndicadorPublicacion())) {
            List<RequerimientosReferidos> requerimientosReferidos = Arrays.asList(restTemplate.getForObject(globales.getUrl() + "/api/requerimientosReferidos/requerimiento/" + request.getIdRequerimiento(), RequerimientosReferidos[].class));
            StringBuilder correos = new StringBuilder();
            for (int i = 0; i < requerimientosReferidos.size(); i++) {
                correos.append(requerimientosReferidos.get(i).getCorreoElectronico());
                if (i != requerimientosReferidos.size() - 1) {
                    correos.append(";");
                }
            }
            Requerimientos requerimientos = restTemplate.getForObject(globales.getUrl() + "/api/requerimientos/" + request.getIdRequerimiento(), Requerimientos.class);
            Cargos cargos = restTemplate.getForObject(globales.getUrl() + "/api/cargos/" + requerimientos.getIdCargo(), Cargos.class);
            VEstructuraFisica vEstructuraFisica = restTemplate.getForObject(globales.getUrl() + "/api/estructuraFisica/" + requerimientos.getIdEstructuraFisica(), VEstructuraFisica.class);
            UtilitiesController.sendMail(correos.toString(), "Vacante", "Usted ha sido postulado para el cargo " + cargos.getCargo() + " en la oficina " + vEstructuraFisica.getEstructuraFisica() + " de la ciudad de " + vEstructuraFisica.getCamino() + ", para aplicar a dicha vacante debe ingresar a <a href=\"http://www.crezcamos.com\">http://www.crezcamos.com</a>");
        }
        restTemplate.put(serviceUrl, request, Publicaciones.class);
        return request.getFechaFin().toString();
    }

}
