package com.ciberdix.th.controllers;

import com.ciberdix.th.model.EstructuraOrganizacionalCargos;
import com.ciberdix.th.model.Usuarios;
import com.ciberdix.th.model.VTerceros;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Roberto Chajin Ortiz
 */
@CrossOrigin
@RestController
@RequestMapping("/api/vterceros")
@Api(value = "vterceros", description = "Vista Terceros")
public class VTercerosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/vterceros/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener terceros", notes = "Retorna el listado de terceros")
    List<VTerceros> listarTerceros() {
        VTerceros[] terceros = restTemplate.getForObject(serviceUrl, VTerceros[].class);
        return Arrays.asList(terceros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiOperation(value = "Obtener terceros por id", notes = "Retorna el tercero por ID")
    VTerceros obtenerTercero(@PathVariable Long id) {
        VTerceros tercero = restTemplate.getForObject(serviceUrl + id, VTerceros.class);
        return tercero;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarTerceros/{tipo}")
    @ApiOperation(value = "Obtener terceros por tipo", notes = "Retorna el tercero por Tipo")
    List<VTerceros> obtenerTerceros(@PathVariable String tipo) {
        VTerceros[] tercero = restTemplate.getForObject(serviceUrl + "buscarTerceros/" + tipo, VTerceros[].class);
        return Arrays.asList(tercero);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/asignarColaborador/{queryString}/")
    List<VTerceros> obtenerTercero(@PathVariable String queryString) {
        VTerceros[] tercero = restTemplate.getForObject(serviceUrl + "asignarColaborador/"+queryString+"/", VTerceros[].class);
        return Arrays.asList(tercero);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarTercerosTipo/{wildcard}/{codeTipoTercero}")
    List<VTerceros> listarTercerosTipo(@PathVariable String wildcard, @PathVariable String codeTipoTercero) {
        VTerceros[] tercero = restTemplate.getForObject(serviceUrl + "buscarTercerosTipo/"+wildcard+"/"+codeTipoTercero, VTerceros[].class);
        return Arrays.asList(tercero);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tercerosUsuarios")
    List<VTerceros> findAllTercerosUsuarios() {
        List<VTerceros> t = Arrays.asList(restTemplate.getForObject(serviceUrl, VTerceros[].class));
        List<Usuarios> u = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/usuarios", Usuarios[].class));
        t = t.stream().filter(f->u.stream().anyMatch(user->f.getIdTercero().equals(user.getIdTercero()))).collect(Collectors.toList());
        return t;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/estructuraOrganizacional/{id}")
    List<VTerceros> queryAllByIdEstructuraOrganizacional(@PathVariable Integer id) {
        VTerceros[] tercero = restTemplate.getForObject(serviceUrl + "estructuraOrganizacional/"+id+"/", VTerceros[].class);
        return Arrays.asList(tercero);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/estructuraOrganizacionalCargos")
    List<VTerceros> listarTercerosTipo(@RequestBody List<EstructuraOrganizacionalCargos> list) {
        List<VTerceros> listT = new ArrayList<>();
        List<VTerceros> listTer = Arrays.asList(restTemplate.getForObject(serviceUrl, VTerceros[].class));
        for(EstructuraOrganizacionalCargos o : list){
            List<VTerceros> t = Arrays.asList(restTemplate.getForObject(serviceUrl + "estructuraOrganizacionalCargos/"+o.getIdEstructuraOrganizacionalCargo(), VTerceros[].class));
            for(VTerceros vt : t){
                listT.add(vt);
            }
        }
        return listTer.stream().filter(ter->listT.stream().anyMatch(f->ter.getIdTercero().equals(f.getIdTercero()))).collect(Collectors.toList());
    }

}
