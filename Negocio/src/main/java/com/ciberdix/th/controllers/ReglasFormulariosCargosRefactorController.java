package com.ciberdix.th.controllers;

import com.ciberdix.th.model.VPermisosFormulariosCargos;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by robertochajin on 27/06/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/reglasFormulariosCargos")
public class ReglasFormulariosCargosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET, path = "/{codigo}")
    List<Object> findAll(@PathVariable String codigo) {
        String serviceUrl = baseUrl + "/api/reglasFormulariosCargos/";
        RestTemplate restTemplate = new RestTemplate();
        List<VPermisosFormulariosCargos> permisos = Arrays.asList(restTemplate.getForObject(serviceUrl + codigo, VPermisosFormulariosCargos[].class));

        List<Object> permisosForm = new ArrayList<>();

        for (VPermisosFormulariosCargos p : permisos) {
            if (p.getIndicadorSeccion()) {
                HashMap<String, Object> hmap = new HashMap<>();
                HashMap<String, Object> obj = new HashMap<>();
                HashMap<String, Boolean> dataControl = new HashMap<>();

                if (p.getIndicadorHabilitadoFc() != null && p.getIndicadorHabilitadoFc()
                        && p.getIndicadorHabilitadoRfc() != null && p.getIndicadorHabilitadoRfc()){
                    obj.put("visible", Boolean.TRUE);

                    for (VPermisosFormulariosCargos d : permisos){
                        if(!d.getIndicadorSeccion()){
                            if (d.getIndicadorHabilitadoFc() != null && d.getIndicadorHabilitadoFc()
                                    && d.getIndicadorHabilitadoRfc() != null && d.getIndicadorHabilitadoRfc()){
                                dataControl.put("visible", Boolean.TRUE);

                                if (d.getIndicadorEditar()){
                                    dataControl.put("editable", Boolean.TRUE);
                                } else {
                                    dataControl.put("editable", Boolean.FALSE);
                                }
                            }

                            obj.put(d.getCodigo(), dataControl);
                        }
                    }

                    hmap.put(p.getCodigo(), obj);
                } else {
                    obj.put("visible", Boolean.FALSE);

                    for (VPermisosFormulariosCargos d : permisos){
                        if(!d.getIndicadorSeccion()){
                            if (d.getIndicadorHabilitadoFc() != null && d.getIndicadorHabilitadoFc()
                                    && d.getIndicadorHabilitadoRfc() != null && d.getIndicadorHabilitadoRfc()){
                                dataControl.put("visible", Boolean.TRUE);

                                if (d.getIndicadorEditar()){
                                    dataControl.put("editable", Boolean.TRUE);
                                } else {
                                    dataControl.put("editable", Boolean.FALSE);
                                }
                            } else {
                                dataControl.put("visible", Boolean.FALSE);

                                if (d.getIndicadorEditar()){
                                    dataControl.put("editable", Boolean.TRUE);
                                } else {
                                    dataControl.put("editable", Boolean.FALSE);
                                }
                            }

                            obj.put(d.getCodigo(), dataControl);
                        }
                    }

                    hmap.put(p.getCodigo(), obj);
                }

                permisosForm.add(hmap);
            }
        }

        return permisosForm;
    }
}
