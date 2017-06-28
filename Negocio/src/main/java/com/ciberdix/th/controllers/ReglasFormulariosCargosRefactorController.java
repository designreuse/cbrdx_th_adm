package com.ciberdix.th.controllers;

import com.ciberdix.th.model.VPermisosFormulariosCargos;
import com.ciberdix.th.security.JwtTokenUtil;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * Created by robertochajin on 27/06/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/reglasFormulariosCargos")
public class ReglasFormulariosCargosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @RequestMapping(method = RequestMethod.GET, path = "/{codigo}")
    List<Object> findByRol(@PathVariable String codigo) {
        String serviceUrl = baseUrl + "/api/reglasFormulariosCargos/rol/";
        RestTemplate restTemplate = new RestTemplate();
        Collection<?> roles = jwtTokenUtil.getAuthorities();

        List<VPermisosFormulariosCargos> allPermisos = new ArrayList<>();

        for (Object rol : roles) {
            List<VPermisosFormulariosCargos> permisos = Arrays.asList(restTemplate.getForObject(serviceUrl + rol + "/" + codigo, VPermisosFormulariosCargos[].class));
            if (permisos.size() > 0)
                allPermisos.addAll(permisos);
        }

        List<Object> permisosForm = new ArrayList<>();

        for (VPermisosFormulariosCargos p : allPermisos) {
            if (p.getIndicadorSeccion()) {
//                HashMap<String, Object> hmap = new HashMap<>();
                HashMap<String, Object> obj = new HashMap<>();
                HashMap<String, Object> dataControl = new HashMap<>();

                if (p.getIndicadorHabilitadoFc() != null && p.getIndicadorHabilitadoFc()
                        && p.getIndicadorHabilitadoRfc() != null && p.getIndicadorHabilitadoRfc()) {
                    obj.put("codigo", p.getCodigo());
                    obj.put("visible", Boolean.TRUE);

                    for (VPermisosFormulariosCargos d : allPermisos) {
                        if (!d.getIndicadorSeccion()) {
                            if (d.getIndicadorHabilitadoFc() != null && d.getIndicadorHabilitadoFc()
                                    && d.getIndicadorHabilitadoRfc() != null && d.getIndicadorHabilitadoRfc()) {
//                                dataControl.put("codigo", d.getCodigo());
                                dataControl.put("visible", Boolean.TRUE);

                                if (d.getIndicadorEditar()) {
                                    dataControl.put("editable", Boolean.TRUE);
                                } else {
                                    dataControl.put("editable", Boolean.FALSE);
                                }
                            } else {
                                dataControl.put("visible", Boolean.FALSE);

                                if (d.getIndicadorEditar()) {
                                    dataControl.put("editable", Boolean.TRUE);
                                } else {
                                    dataControl.put("editable", Boolean.FALSE);
                                }
                            }

                            obj.put(d.getCodigo(), dataControl);
                        }
                    }

                    //hmap.put("data", obj);
                } else {
                    obj.put("codigo", p.getCodigo());
                    obj.put("visible", Boolean.FALSE);

                    for (VPermisosFormulariosCargos d : allPermisos) {
                        if (!d.getIndicadorSeccion()) {
                            if (d.getIndicadorHabilitadoFc() != null && d.getIndicadorHabilitadoFc()
                                    && d.getIndicadorHabilitadoRfc() != null && d.getIndicadorHabilitadoRfc()) {
                                dataControl.put("visible", Boolean.TRUE);

                                if (d.getIndicadorEditar()) {
                                    dataControl.put("editable", Boolean.TRUE);
                                } else {
                                    dataControl.put("editable", Boolean.FALSE);
                                }
                            } else {
                                dataControl.put("visible", Boolean.FALSE);

                                if (d.getIndicadorEditar()) {
                                    dataControl.put("editable", Boolean.TRUE);
                                } else {
                                    dataControl.put("editable", Boolean.FALSE);
                                }
                            }

                            obj.put(d.getCodigo(), dataControl);
                        }
                    }

                    //hmap.put(p.getCodigo(), obj);
                }

                permisosForm.add(obj);
            }
        }

        return permisosForm;
    }
}
