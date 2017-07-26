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
 * Created by robertochajin on 23/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/rolesFuncionalidades")
public class RolesFuncionalidadesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/rolesFuncionalidades/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VRolesFuncionalidades> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VRolesFuncionalidades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VRolesFuncionalidades> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled/", VRolesFuncionalidades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarRol/{id}")
    List<VRolesFuncionalidades> findByIdRol(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "buscarRol/" + id, VRolesFuncionalidades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path="/{id}")
    VRolesFuncionalidades findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VRolesFuncionalidades.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    RolesFuncionalidades create(@RequestBody RolesFuncionalidades request) {
        List<VFuncionalidadesControles> fc = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/funcionalidadesControles/funcionalidad/" + request.getIdFuncionalidad(), VFuncionalidadesControles[].class));
        createRFC(fc, request);
        return restTemplate.postForObject(serviceUrl, request, RolesFuncionalidades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RolesFuncionalidades request) {
        List<VFuncionalidadesControles> fc = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/funcionalidadesControles/funcionalidad/" + request.getIdFuncionalidad(), VFuncionalidadesControles[].class));
        List<VRolesFuncionalidadesControles> rfc = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/rolesFuncionalidadesControles/buscarFuncionalidad/" + request.getIdRol() + "/" + request.getIdFuncionalidad(), VRolesFuncionalidadesControles[].class));
        List<VFuncionalidadesControles> temp = fc.stream().filter(t->rfc.stream().anyMatch(f->t.getIdFuncionalidadControl().equals(f.getIdFuncionalidadControl()))).collect(Collectors.toList());
        if(temp != null){
            fc = fc.stream().filter(t->temp.stream().noneMatch(f->t.getIdFuncionalidadControl().equals(f.getIdFuncionalidadControl()))).collect(Collectors.toList());
        }
        if(fc.size()>0){
            createRFC(fc, request);
        }
        restTemplate.put(serviceUrl, request, RolesFuncionalidades.class);
    }

    void createRFC(List<VFuncionalidadesControles> fc, RolesFuncionalidades request){
        for(VFuncionalidadesControles vfc: fc){
            RolesFuncionalidadesControles rfc = new RolesFuncionalidadesControles();
            rfc.setIdRol(request.getIdRol());
            rfc.setIdFuncionalidadControl(vfc.getIdFuncionalidadControl());
            rfc.setIndicadorEditar(true);
            rfc.setIndicadorHabilitado(true);
            rfc.setAuditoriaUsuario(request.getAuditoriaUsuario());
            restTemplate.postForObject(baseUrl + "/api/rolesFuncionalidadesControles", rfc, RolesFuncionalidadesControles.class);
        }
    }

}
