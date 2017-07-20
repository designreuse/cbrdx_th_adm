package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import com.ciberdix.th.security.JwtTokenUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargos")
@Api(value = "cargos", description = "Cargos")
public class CargosRefactorController {

    @Value("${business.url}")
    String businessURL;

    @Value("${domain.url}")
    String domainURL;

    RestTemplate restTemplate;

    private String serviceUrl;

    List<VPermisosFormularios> listadoPermisos;

    @PostConstruct
    void init() {
        serviceUrl = domainURL + "/api/cargos";
        restTemplate = new RestTemplate();
    }

    void readData(){
        listadoPermisos = Arrays.asList(restTemplate.getForObject(domainURL + "/api/reglasFormularios/CARGOS", VPermisosFormularios[].class));
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VCargos> findAll() {
        VCargos[] parametros = restTemplate.getForObject(serviceUrl, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + "/" + id, VCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCargos> findEnabled() {
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/wildcard/{query}")
    List<VCargos> findByWildCard(@PathVariable String query) {
        RestTemplate restTemplate = new RestTemplate();
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/wildcard/" + query, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/wildcardFiltered/{query}")
    List<VCargos> findByWildCard(@PathVariable String query, HttpServletRequest request) {
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        String token = UtilitiesController.extractToken(request);
        String businessServiceURL = businessURL + "/api/";
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        Integer idUsuario = jwtTokenUtil.getUserIdFromToken(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        String roleCodes = UtilitiesController.findConstant("ROLARB").getValor();
        String[] rolesCodes = roleCodes.split(",");
        StringBuilder sb = new StringBuilder();
        for (String str : rolesCodes) {
            sb.append(restTemplate.exchange(businessServiceURL + "roles/rol/" + str, HttpMethod.GET, requestEntity, Roles.class, requestEntity).getBody().getRol());
            sb.append(",");
        }
        String resultRoles = sb.toString();
        boolean isManager = userRoles.stream().anyMatch(r -> resultRoles.contains(r.toString()));
        List<VCargos> todosCargos = Arrays.asList(restTemplate.getForObject(serviceUrl + "/wildcard/" + query, VCargos[].class));
        List<VCargos> returnList;
        if (isManager) {
            returnList = todosCargos;
        } else {
            Long idTercero = restTemplate.exchange(businessServiceURL + "usuarios/query/" + idUsuario, HttpMethod.GET, requestEntity, Usuarios.class, requestEntity).getBody().getIdTercero();
            Integer idEstructuraOrganizacionalCargo = restTemplate.exchange(businessServiceURL + "tercerosCargos/tercero/" + idTercero, HttpMethod.GET, requestEntity, TercerosCargos.class, requestEntity).getBody().getIdEstructuraOrganizacionalCargo();
            Integer idCargo = restTemplate.exchange(businessServiceURL + "estructuraOrganizacionalCargos/" + idEstructuraOrganizacionalCargo, HttpMethod.GET, requestEntity, EstructuraOrganizacionalCargos.class, requestEntity).getBody().getIdCargo();
            returnList = UtilitiesController.jobRecursiveCascade(idCargo, todosCargos);
        }

        return returnList;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/search/{query}/{idEstructuraOrganizacional}")
    List<VCargos> queryByIdEstructuraOrganizacional(@PathVariable String query, @PathVariable Integer idEstructuraOrganizacional) {
        VCargos[] parametros = restTemplate.getForObject(serviceUrl + "/search/" + query + "/" + idEstructuraOrganizacional, VCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Cargos create(@RequestBody Cargos obj) {
        return restTemplate.postForObject(serviceUrl, obj, Cargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cargos obj) {
        restTemplate.put(serviceUrl, obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab1")
    void updateTab1(@RequestBody Cargos obj, HttpServletRequest request) {
        readData();
        String token = UtilitiesController.extractToken(request);
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        List<VPermisosFormularios> cargoPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("CARGO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> personaacargodirPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("PERSONAACARGODIR") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> personaacargoindPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("PERSONAACARGOIND") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> cargojefePermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDCARGOJEFE") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> misionPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("MISION") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> indicadorhabilitadoPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("INDICADORHABILITADO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> codigocargoPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("CODIGOCARGO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> estructuraareaPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDESTRUCTURAAREA") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> indicadorzonaPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("INDICADORZONA") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        if (!cargoPermisos.isEmpty() &&
                cargoPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !cargoPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setCargo(estadoActual.getCargo());
        }
        if (!personaacargodirPermisos.isEmpty() &&
                personaacargodirPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !personaacargodirPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setPersonaACargoDir(estadoActual.getPersonaACargoDir());
        }
        if (!personaacargoindPermisos.isEmpty() &&
                personaacargoindPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !personaacargoindPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setPersonaACargoInd(estadoActual.getPersonaACargoInd());
        }
        if (!cargojefePermisos.isEmpty() &&
                cargojefePermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !cargojefePermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdCargoJefe(estadoActual.getIdCargoJefe());
        }
        if (!misionPermisos.isEmpty() &&
                misionPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !misionPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setMision(estadoActual.getMision());
        }
        if (!indicadorhabilitadoPermisos.isEmpty() &&
                indicadorhabilitadoPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !indicadorhabilitadoPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIndicadorHabilitado(estadoActual.getIndicadorHabilitado());
        }
        if (!codigocargoPermisos.isEmpty() &&
                codigocargoPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !codigocargoPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setCodigoCargo(estadoActual.getCodigoCargo());
        }
        if (!estructuraareaPermisos.isEmpty() &&
                estructuraareaPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !estructuraareaPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdEstructuraArea(estadoActual.getIdEstructuraArea());
        }
        if (!indicadorzonaPermisos.isEmpty() &&
                indicadorzonaPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !indicadorzonaPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIndicadorZona(estadoActual.getIndicadorZona());
        }

        restTemplate.put(serviceUrl + "/tab1", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab2")
    void updateTab2(@RequestBody Cargos obj, HttpServletRequest request) {
        readData();
        String token = UtilitiesController.extractToken(request);
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        List<VPermisosFormularios> indicatorPermission = listadoPermisos.stream().filter(t -> t.getCodigo().equals("INDICADORHABILITADO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());

        RequerimientosAccionesRefactorController requerimientosAccionesRefactorController = new RequerimientosAccionesRefactorController();
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        Integer c = UtilitiesController.findListItem("ListasEstadosCargos", "CONST").getIdLista();
        Integer a = UtilitiesController.findListItem("ListasEstadosCargos", "APROB").getIdLista();
        Integer n = UtilitiesController.findListItem("ListasEstadosCargos", "NOAPR").getIdLista();
        Integer tipoSol = UtilitiesController.findListItem("ListasTiposSolicitudes", "CRGNVO").getIdLista();
        Requerimientos requerimientos = restTemplate.getForObject(domainURL + "/api/requerimientos/byIdCargo/" + obj.getIdCargo() + "/" + tipoSol, Requerimientos.class);
        if ((estadoActual.getIdEstado().equals(c) || estadoActual.getIdEstado().equals(n)) && obj.getIdEstado().equals(a) && (requerimientos != null && requerimientos.getIdRequerimiento() != null)) {
            RequerimientosAcciones requerimientosAcciones = new RequerimientosAcciones();
            requerimientosAcciones.setIdRequerimiento(requerimientos.getIdRequerimiento());
            requerimientosAcciones.setAuditoriaUsuario(obj.getAuditoriaUsuario());
            requerimientosAcciones.setObservacion("Cargo Creado Satisfactoriamente");
            Integer idAccion = UtilitiesController.findListItem("ListasRequerimientosAcciones", "APRPER").getIdLista();
            requerimientosAcciones.setIdAccion(idAccion);
            requerimientosAccionesRefactorController.create(requerimientosAcciones);
            Integer reqEstado = UtilitiesController.findListItem("ListasEstadosRequerimientos", "APRB").getIdLista();
            requerimientos.setIdEstado(reqEstado);


            requestEntity = new HttpEntity<>(requerimientos, httpHeaders);
            restTemplate.exchange(businessURL + "api/requerimientos", HttpMethod.PUT, requestEntity, Requerimientos.class);
        }
        if (!indicatorPermission.isEmpty() &&
                indicatorPermission.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !indicatorPermission.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIndicadorHabilitado(estadoActual.getIndicadorHabilitado());
        }
        restTemplate.put(serviceUrl + "/tab2", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab3")
    void updateTab3(@RequestBody Cargos obj, HttpServletRequest request) {
        readData();
        String token = UtilitiesController.extractToken(request);
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        List<VPermisosFormularios> interrelacionesinternasPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("INTERRELACIONESINTERNAS") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> interrelacionesexternasPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("INTERRELACIONESEXTERNAS") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());

        if (!interrelacionesinternasPermisos.isEmpty() &&
                interrelacionesinternasPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !interrelacionesinternasPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setInterrelacionesInternas(estadoActual.getInterrelacionesInternas());
        }
        if (!interrelacionesexternasPermisos.isEmpty() &&
                interrelacionesexternasPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !interrelacionesexternasPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setInterrelacionesExternas(estadoActual.getInterrelacionesExternas());
        }
        restTemplate.put(serviceUrl + "/tab3", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab4")
    void updateTab4(@RequestBody Cargos obj, HttpServletRequest request) {
        readData();
        String token = UtilitiesController.extractToken(request);
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        List<VPermisosFormularios> responsabilidadesadPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("RESPONSABILIDADESAD") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());

        if (!responsabilidadesadPermisos.isEmpty() &&
                responsabilidadesadPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !responsabilidadesadPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setResponsabilidadesAd(estadoActual.getResponsabilidadesAd());
        }
        restTemplate.put(serviceUrl + "/tab4", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab5")
    void updateTab5(@RequestBody Cargos obj, HttpServletRequest request) {
        readData();
        String token = UtilitiesController.extractToken(request);
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        List<VPermisosFormularios> tomadescisionesPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("TOMADECISIONES") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> actividadessupervisaPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("ACTIVIDADESSUPERVISA") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());

        if (!tomadescisionesPermisos.isEmpty() &&
                tomadescisionesPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !tomadescisionesPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setTomaDecisiones(estadoActual.getTomaDecisiones());
        }
        if (!actividadessupervisaPermisos.isEmpty() &&
                actividadessupervisaPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !actividadessupervisaPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setActividadesSupervisa(estadoActual.getActividadesSupervisa());
        }
        restTemplate.put(serviceUrl + "/tab5", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab6")
    void updateTab6(@RequestBody Cargos obj, HttpServletRequest request) {
        readData();
        String token = UtilitiesController.extractToken(request);
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        List<VPermisosFormularios> conocimientosbasicosPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("CONOCIMIENTOSBASICOS") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> tiempoexperienciaPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("TIEMPOEXPERIENCIA") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> otrosrequisitosPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("OTROSREQUISITOS") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> edadPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("EDAD") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idgeneroPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDGENERO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idestadocivilPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDESTADOCIVIL") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idniveleducacion = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDNIVELEDUCACION") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        if (!conocimientosbasicosPermisos.isEmpty() &&
                conocimientosbasicosPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !conocimientosbasicosPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setConocimientosBasicos(estadoActual.getConocimientosBasicos());
        }
        if (!tiempoexperienciaPermisos.isEmpty() &&
                tiempoexperienciaPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !tiempoexperienciaPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setTiempoExperiencia(estadoActual.getTiempoExperiencia());
        }
        if (!otrosrequisitosPermisos.isEmpty() &&
                otrosrequisitosPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !otrosrequisitosPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setOtrosRequisitos(estadoActual.getOtrosRequisitos());
        }
        if (!edadPermisos.isEmpty() &&
                edadPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !edadPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setEdad(estadoActual.getEdad());
            obj.setEdadMax(estadoActual.getEdadMax());
        }
        if (!idgeneroPermisos.isEmpty() &&
                idgeneroPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !idgeneroPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdGenero(estadoActual.getIdGenero());
        }
        if (!idestadocivilPermisos.isEmpty() &&
                idestadocivilPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !idestadocivilPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdEstadoCivil(estadoActual.getIdEstadoCivil());
        }
        if (!idniveleducacion.isEmpty() &&
                idniveleducacion.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !idniveleducacion.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdNivelEducacion(estadoActual.getIdNivelEducacion());
        }
        restTemplate.put(serviceUrl + "/tab6", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/tab7")
    void updateTab7(@RequestBody Cargos obj, HttpServletRequest request) {
        readData();
        String token = UtilitiesController.extractToken(request);
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        HttpHeaders httpHeaders = UtilitiesController.assembleHttpHeaders(token);
        HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        Cargos estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdCargo(), Cargos.class);
        List<VPermisosFormularios> puntosPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("PUNTOS") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idcategoriaPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDCATEGORIA") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> salarioPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("SALARIO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> indicadorrequiereformacionPermisos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("INDICADORREQUIEREFORMACION") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());

        if (!puntosPermisos.isEmpty() &&
                puntosPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !puntosPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setPuntos(estadoActual.getPuntos());
        }
        if (!idcategoriaPermisos.isEmpty() &&
                idcategoriaPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !idcategoriaPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdCategoria(estadoActual.getIdCategoria());
        }
        if (!salarioPermisos.isEmpty() &&
                salarioPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !salarioPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setSalario(estadoActual.getSalario());
        }
        if (!indicadorrequiereformacionPermisos.isEmpty() &&
                indicadorrequiereformacionPermisos.stream().filter(t -> t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty() &&
                !indicadorrequiereformacionPermisos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIndicadorRequiereFormacion(estadoActual.getIndicadorRequiereFormacion());
        }

        if (estadoActual.getPaso().equals(15) && obj.getPaso().equals(16)) {
            String recipients = UtilitiesController.findConstant("CORAUT").getValor();
            String urltoken = UtilitiesController.generateURLToken("/positions/update/" + obj.getIdCargo());
            String body = "Se ha creado un nuevo cargo que requiere su aprobación. haga click en el siguiente boton para acceder a la información: <p style=\"align:center;\"><a href=\"" + UtilitiesController.readParameter("front.url") + "/login?token=" + urltoken + "\"><img src=\"http://www.ciberdix.com/proyecto/gestionamos/img/revisar.png\"></a></p>";
            UtilitiesController.sendMail(recipients, "Aprobación Cargo", body);
        }
        restTemplate.put(serviceUrl + "/tab7", obj);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/disabled/{idCargo}")
    void disabled(@PathVariable Integer idCargo) {
        restTemplate.put(serviceUrl + "/disabled/" + idCargo, VCargos.class);
    }
}