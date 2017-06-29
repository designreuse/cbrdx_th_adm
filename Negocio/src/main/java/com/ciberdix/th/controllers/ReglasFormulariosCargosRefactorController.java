package com.ciberdix.th.controllers;

import com.ciberdix.th.model.VPermisosFormulariosCargos;
import com.ciberdix.th.security.JwtTokenUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by robertochajin on 27/06/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/reglasFormulariosCargos")
public class ReglasFormulariosCargosRefactorController {

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    private ObjectMapper objectMapper;

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET, path = "/{codigo}")
    JsonNode findByRol(@PathVariable String codigo) throws JSONException {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/reglasFormulariosCargos/rol/";
        Collection<?> roles = jwtTokenUtil.getAuthorities();
        List<VPermisosFormulariosCargos> allParents = new ArrayList<>();
        List<VPermisosFormulariosCargos> allChilds = new ArrayList<>();

        for (Object rol : roles) {
            List<VPermisosFormulariosCargos> permisos = Arrays.asList(restTemplate.getForObject(serviceUrl + rol + "/" + codigo, VPermisosFormulariosCargos[].class));
            if (!permisos.isEmpty()) {
                allParents.addAll(permisos);
                allChilds.addAll(permisos);
            }
        }

        Map<String, Object> responseJson = new HashMap<>();
        allParents.removeIf(i -> i.getIdPadre() != null);
        allChilds.removeIf(i -> i.getIdPadre() == null);
        for (VPermisosFormulariosCargos p : allParents) {
            if (p.getIndicadorSeccion()) {
                List<VPermisosFormulariosCargos> childs = allChilds.stream().filter(test -> test.getIdPadre().equals(p.getIdFuncionalidadControl())).collect(Collectors.toList());
                Map<String, Object> internalJson = new LinkedHashMap<>();
                internalJson.put("visible", p.getIndicadorVisible() && (p.getIndicadorHabilitadoFc() != null && p.getIndicadorHabilitadoFc() && p.getIndicadorHabilitadoRfc() != null && p.getIndicadorHabilitadoRfc()));
                internalJson.put("seccion", true);
                for (VPermisosFormulariosCargos child : childs) {
                    Map<String, Object> securityData = new HashMap<>();
                    securityData.put("visible", (child.getIndicadorHabilitadoFc() != null && child.getIndicadorHabilitadoFc() && child.getIndicadorHabilitadoRfc() != null && child.getIndicadorHabilitadoRfc()));
                    securityData.put("editable", child.getIndicadorEditar());
                    internalJson.put(child.getCodigo(), securityData);
                }
                responseJson.put(p.getCodigo(), internalJson);
            } else {
                Map<String, Object> securityData = new HashMap<>();
                securityData.put("visible", (p.getIndicadorHabilitadoFc() != null && p.getIndicadorHabilitadoFc() && p.getIndicadorHabilitadoRfc() != null && p.getIndicadorHabilitadoRfc()));
                securityData.put("editable", p.getIndicadorEditar());
                responseJson.put(p.getCodigo(), securityData);
            }
        }
/*
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
*/
        return objectMapper.valueToTree(responseJson);
    }
}
