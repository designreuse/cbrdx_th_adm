package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Terceros;
import com.ciberdix.th.model.VPermisosFormularios;
import com.ciberdix.th.model.VTercerosCargosAreasFisicas;
import com.ciberdix.th.security.JwtTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Roberto Chajin Ortiz
 */
@CrossOrigin
@RestController
@RequestMapping("/api/terceros")
@Api(value = "terceros", description = "Terceros")
public class TercerosRefactorController {

    @Value("${business.url}")
    String businessURL;

    @Value("${domain.url}")
    String domainURL;

    RestTemplate restTemplate;

    private String serviceUrl;

    private List<VPermisosFormularios> listadoPermisos;

    @PostConstruct
    void init() {
        serviceUrl = domainURL + "/api/terceros";
        restTemplate = new RestTemplate();
    }

    void readData() {
        listadoPermisos = Arrays.asList(restTemplate.getForObject(domainURL + "/api/reglasFormularios/TERCEROS", VPermisosFormularios[].class));
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener terceros", notes = "Retorna el listado de terceros")
    List<Terceros> listarTerceros() {
        RestTemplate restTemplate = new RestTemplate();
        Terceros[] terceros = restTemplate.getForObject(serviceUrl, Terceros[].class);

        return Arrays.asList(terceros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiOperation(value = "Obtener terceros por id", notes = "Retorna el tercero por ID")
    Terceros obtenerTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        Terceros tercero = restTemplate.getForObject(serviceUrl + "/" + id, Terceros.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{cedula}/{id}")
    @ApiOperation(value = "Obtener terceros por número de documento e id de documento", notes = "Retorna el tercero por numero de documento e id de documento")
    Terceros obtenerTerceroCedula(@PathVariable String cedula, @PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Terceros tercero = restTemplate.getForObject(serviceUrl + "/" + cedula + "/" + id, Terceros.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tercerosCargosAreasFisica/{idTercero}")
    @ApiOperation(value = "Obtener tercerosCargosAreasFisicas", notes = "Retorna el listado de tercerosCargosAreasFisica")
    VTercerosCargosAreasFisicas findAllTCAF(@PathVariable Long idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/tercerosCargosAreasFisica/" + idTercero, VTercerosCargosAreasFisicas.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarJefes/{idArea}/{query}")
    @ApiOperation(value = "Obtener tercerosCargosAreasFisicas por idEstructuraFisica", notes = "Retorna el listado de tercerosCargosAreasFisica por idEstructuraFisica")
    List<VTercerosCargosAreasFisicas> findByIdEstructuraFisica(@PathVariable Integer idArea, @PathVariable String query) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosCargosAreasFisicas[] parametros = restTemplate.getForObject(serviceUrl + "/buscarJefes/" + idArea + "/" + query, VTercerosCargosAreasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarJefes/{idArea}/{query}/{idCargo}")
    @ApiOperation(value = "Obtener tercerosCargosAreasFisicas por idEstructuraFisica", notes = "Retorna el listado de tercerosCargosAreasFisica por idEstructuraFisica")
    List<VTercerosCargosAreasFisicas> findByIdEstructuraFisica(@PathVariable Integer idArea, @PathVariable String query, @PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosCargosAreasFisicas[] parametros = restTemplate.getForObject(serviceUrl + "/buscarJefes/" + idArea + "/" + query + "/" + idCargo, VTercerosCargosAreasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Crear tercero", notes = "Retorna el tercero creado")
    Terceros crearTercero(@RequestBody Terceros t) {
        Terceros tercero = restTemplate.postForObject(serviceUrl, t, Terceros.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "Actualizar tercero", notes = "Actualiza el tercero")
    void actualizarTercero(@RequestBody Terceros obj) {
        readData();
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        Collection<?> userRoles = jwtTokenUtil.getAuthorities();
        Terceros estadoActual = restTemplate.getForObject(serviceUrl + "/" + obj.getIdTercero(), Terceros.class);
        List<VPermisosFormularios> primernombre = listadoPermisos.stream().filter(t -> t.getCodigo().equals("PRIMERNOMBRE") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> segundonombre = listadoPermisos.stream().filter(t -> t.getCodigo().equals("SEGUNDONOMBRE") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> primerapellido = listadoPermisos.stream().filter(t -> t.getCodigo().equals("PRIMERAPELLIDO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> segundoapellido = listadoPermisos.stream().filter(t -> t.getCodigo().equals("SEGUNDOAPELLIDO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idtipodocumento = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDTIPODOCUMENTO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> numerodocumento = listadoPermisos.stream().filter(t -> t.getCodigo().equals("NUMERODOCUMENTO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> fechadocumento = listadoPermisos.stream().filter(t -> t.getCodigo().equals("FECHADOCUMENTO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idciudadexpdocumento = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDCIUDADEXPDOCUMENTO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> fechanacimiento = listadoPermisos.stream().filter(t -> t.getCodigo().equals("FECHANACIMIENTO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idciudadnacimiento = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDCIUDADNACIMIENTO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idgenero = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDGENERO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idestadocivil = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDESTADOCIVIL") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idfactorrh = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDFACTORRH") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> nrohijos = listadoPermisos.stream().filter(t -> t.getCodigo().equals("NROHIJOS") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idlateralidad = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDLATERALIDAD") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idtallacamisa = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDTALLACAMISA") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idtallapantalon = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDTALLAPANTALON") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idtallacalzado = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDTALLACALZADO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> correoelectronico = listadoPermisos.stream().filter(t -> t.getCodigo().equals("CORREOELECTRONICO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idtipopersona = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDTIPOPERSONA") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> razonsocial = listadoPermisos.stream().filter(t -> t.getCodigo().equals("RAZONSOCIAL") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> talla = listadoPermisos.stream().filter(t -> t.getCodigo().equals("TALLA") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> peso = listadoPermisos.stream().filter(t -> t.getCodigo().equals("PESO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> imc = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IMC") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idprofesion = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDPROFESION") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idniveleducacion = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDNIVELEDUCACION") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> telefonofijo = listadoPermisos.stream().filter(t -> t.getCodigo().equals("TELEFONOFIJO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> telefonocelular = listadoPermisos.stream().filter(t -> t.getCodigo().equals("TELEFONOCELULAR") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> fechadefuncion = listadoPermisos.stream().filter(t -> t.getCodigo().equals("FECHADEFUNCION") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idtipoocupacion = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDTIPOOCUPACION") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idsectoreconomico = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDSECTORECONOMICO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idactividadeconomica = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDACTIVIDADECONOMICA") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idocupacion = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDOCUPACION") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idestadojuridico = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDESTADOJURIDICO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idcoberturasalud = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDCOBERTURASALUD") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> indicadorvivo = listadoPermisos.stream().filter(t -> t.getCodigo().equals("INDICADORVIVO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idtipoafiliacion = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDTIPOAFILIACION") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> indicadorhabilitado = listadoPermisos.stream().filter(t -> t.getCodigo().equals("INDICADORHABILITADO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idtipotercero = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDTIPOTERCERO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> sitioweb = listadoPermisos.stream().filter(t -> t.getCodigo().equals("SITIOWEB") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        List<VPermisosFormularios> idadjunto = listadoPermisos.stream().filter(t -> t.getCodigo().equals("IDADJUNTO") && userRoles.stream().anyMatch(f -> f.toString().equals(t.getRol()))).collect(Collectors.toList());
        if (!primernombre.isEmpty() &&
                primernombre.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !primernombre.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setPrimerNombre(estadoActual.getPrimerNombre());
        }
        if (!segundonombre.isEmpty() &&
                segundonombre.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !segundonombre.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setSegundoNombre(estadoActual.getSegundoNombre());
        }
        if (!primerapellido.isEmpty() &&
                primerapellido.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !primerapellido.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setPrimerApellido(estadoActual.getPrimerApellido());
        }
        if (!segundoapellido.isEmpty() &&
                segundoapellido.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !segundoapellido.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setSegundoApellido(estadoActual.getSegundoApellido());
        }
        if (!idtipodocumento.isEmpty() &&
                idtipodocumento.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idtipodocumento.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdTipoDocumento(estadoActual.getIdTipoDocumento());
        }
        if (!numerodocumento.isEmpty() &&
                numerodocumento.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !numerodocumento.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setNumeroDocumento(estadoActual.getNumeroDocumento());
        }
        if (!fechadocumento.isEmpty() &&
                fechadocumento.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !fechadocumento.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setFechaDocumento(estadoActual.getFechaDocumento());
        }
        if (!idciudadexpdocumento.isEmpty() &&
                idciudadexpdocumento.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idciudadexpdocumento.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdCiudadExpDocumento(estadoActual.getIdCiudadExpDocumento());
        }
        if (!fechanacimiento.isEmpty() &&
                fechanacimiento.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !fechanacimiento.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setFechaNacimiento(estadoActual.getFechaNacimiento());
        }
        if (!idciudadnacimiento.isEmpty() &&
                idciudadnacimiento.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idciudadnacimiento.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdCiudadNacimiento(estadoActual.getIdCiudadNacimiento());
        }
        if (!idgenero.isEmpty() &&
                idgenero.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idgenero.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdGenero(estadoActual.getIdGenero());
        }
        if (!idestadocivil.isEmpty() &&
                idestadocivil.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idestadocivil.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdEstadoCivil(estadoActual.getIdEstadoCivil());
        }
        if (!idfactorrh.isEmpty() &&
                idfactorrh.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idfactorrh.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdFactorRh(estadoActual.getIdFactorRh());
        }
        if (!nrohijos.isEmpty() &&
                nrohijos.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !nrohijos.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setNroHijos(estadoActual.getNroHijos());
        }
        if (!idlateralidad.isEmpty() &&
                idlateralidad.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idlateralidad.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdLateralidad(estadoActual.getIdLateralidad());
        }
        if (!idtallacamisa.isEmpty() &&
                idtallacamisa.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idtallacamisa.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdTallaCamisa(estadoActual.getIdTallaCamisa());
        }
        if (!idtallapantalon.isEmpty() &&
                idtallapantalon.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idtallapantalon.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdTallaPantalon(estadoActual.getIdTallaPantalon());
        }
        if (!idtallacalzado.isEmpty() &&
                idtallacalzado.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idtallacalzado.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdTallaCalzado(estadoActual.getIdTallaCalzado());
        }
        if (!correoelectronico.isEmpty() &&
                correoelectronico.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !correoelectronico.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setCorreoElectronico(estadoActual.getCorreoElectronico());
        }
        if (!idtipopersona.isEmpty() &&
                idtipopersona.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idtipopersona.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdTipoPersona(estadoActual.getIdTipoPersona());
        }
        if (!razonsocial.isEmpty() &&
                razonsocial.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !razonsocial.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setRazonSocial(estadoActual.getRazonSocial());
        }
        if (!talla.isEmpty() &&
                talla.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !talla.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setTalla(estadoActual.getTalla());
        }
        if (!peso.isEmpty() &&
                peso.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !peso.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setPeso(estadoActual.getPeso());
        }
        if (!imc.isEmpty() &&
                imc.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !imc.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setImc(estadoActual.getImc());
        }
        if (!idprofesion.isEmpty() &&
                idprofesion.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idprofesion.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdProfesion(estadoActual.getIdProfesion());
        }
        if (!idniveleducacion.isEmpty() &&
                idniveleducacion.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idniveleducacion.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdNivelEducacion(estadoActual.getIdNivelEducacion());
        }
        if (!telefonofijo.isEmpty() &&
                telefonofijo.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !telefonofijo.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setTelefonoFijo(estadoActual.getTelefonoFijo());
        }
        if (!telefonocelular.isEmpty() &&
                telefonocelular.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !telefonocelular.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setTelefonoCelular(estadoActual.getTelefonoCelular());
        }
        if (!fechadefuncion.isEmpty() &&
                fechadefuncion.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !fechadefuncion.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setFechaDefuncion(estadoActual.getFechaDefuncion());
        }
        if (!idtipoocupacion.isEmpty() &&
                idtipoocupacion.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idtipoocupacion.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdTipoOcupacion(estadoActual.getIdTipoOcupacion());
        }
        if (!idactividadeconomica.isEmpty() &&
                idactividadeconomica.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idactividadeconomica.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdActividadEconomica(estadoActual.getIdActividadEconomica());
        }
        if (!idsectoreconomico.isEmpty() &&
                idsectoreconomico.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idsectoreconomico.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdSectorEconomico(estadoActual.getIdSectorEconomico());
        }
        if (!idocupacion.isEmpty() &&
                idocupacion.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idocupacion.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdOcupacion(estadoActual.getIdOcupacion());
        }
        if (!idestadojuridico.isEmpty() &&
                idestadojuridico.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idestadojuridico.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdEstadoJuridico(estadoActual.getIdEstadoJuridico());
        }
        if (!idcoberturasalud.isEmpty() &&
                idcoberturasalud.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idcoberturasalud.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdCoberturaSalud(estadoActual.getIdCoberturaSalud());
        }
        if (!indicadorvivo.isEmpty() &&
                indicadorvivo.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !indicadorvivo.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIndicadorVivo(estadoActual.getIndicadorVivo());
        }
        if (!idtipoafiliacion.isEmpty() &&
                idtipoafiliacion.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idtipoafiliacion.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdTipoAfiliacion(estadoActual.getIdTipoAfiliacion());
        }
        if (!indicadorhabilitado.isEmpty() &&
                indicadorhabilitado.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !indicadorhabilitado.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIndicadorHabilitado(estadoActual.getIndicadorHabilitado());
        }
        if (!idtipotercero.isEmpty() &&
                idtipotercero.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idtipotercero.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdTipoTercero(estadoActual.getIdTipoTercero());
        }
        if (!sitioweb.isEmpty() &&
                sitioweb.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !sitioweb.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setSitioWeb(estadoActual.getSitioWeb());
        }
        if (!idadjunto.isEmpty() &&
                idadjunto.stream().filter(VPermisosFormularios::getIndicadorEditar).collect(Collectors.toList()).isEmpty() &&
                !idadjunto.stream().filter(t -> !t.getIndicadorEditar()).collect(Collectors.toList()).isEmpty()) {
            obj.setIdAdjunto(estadoActual.getIdAdjunto());
        }
        restTemplate.put(serviceUrl, obj);
    }
}
