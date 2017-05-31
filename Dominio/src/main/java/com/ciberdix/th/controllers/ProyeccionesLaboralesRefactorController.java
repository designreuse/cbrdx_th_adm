package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProyeccionesLaborales;
import com.ciberdix.th.models.VProyeccionLaboral;
import com.ciberdix.th.models.VProyeccionLaboralResumen;
import com.ciberdix.th.repositories.ProyeccionesLaboralesRefactorRepository;
import com.ciberdix.th.repositories.VProyeccionLaboralRefactorRepository;
import com.ciberdix.th.repositories.VProyeccionLaboralResumenRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/proyeccionesLaborales")
@CrossOrigin
public class ProyeccionesLaboralesRefactorController {
    @Autowired
    private ProyeccionesLaboralesRefactorRepository proyeccionesLaboralesRefactorRepository;

    @Autowired
    private VProyeccionLaboralRefactorRepository vProyeccionLaboralRefactorRepository;

    @Autowired
    private VProyeccionLaboralResumenRefactorRepository vProyeccionLaboralResumenRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionLaboral> listarEstadosJuridicos() {
        return (List<VProyeccionLaboral>) vProyeccionLaboralRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    ProyeccionesLaborales obtenerEstadoJuridico(@PathVariable Integer id) {
        return proyeccionesLaboralesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarArea/{id}")
    List<VProyeccionLaboral> findByArea(@PathVariable Integer id) {
        return vProyeccionLaboralRefactorRepository.findByIdEstructuraOrganizacional(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/generarProyeccion/{idUsuario}")
    Integer runProcedure(@PathVariable Integer idUsuario) {
        return proyeccionesLaboralesRefactorRepository.executeCreation(idUsuario);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/consultarPendientes")
    List<VProyeccionLaboralResumen> findPending() {
        return (List<VProyeccionLaboralResumen>) vProyeccionLaboralResumenRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/confirmarProyeccion")
    Integer runProcedure() {
        return vProyeccionLaboralResumenRefactorRepository.executeConfirmation(1);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/anio/{anio}")
    List<VProyeccionLaboral> findAllByAño(@PathVariable Integer anio) {
        return vProyeccionLaboralRefactorRepository.findAllByAnio(anio);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionesLaborales crearListasEstadosJuridicos(@RequestBody ProyeccionesLaborales obj) {
        return proyeccionesLaboralesRefactorRepository.save(
                new ProyeccionesLaborales(obj.getIdEstructuraOrganizacional(), obj.getIdCargo(),
                        obj.getPlazasActuales(), obj.getPlazasProyectadas(), obj.getCostoActual(),
                        obj.getCostoProyectado(), obj.getIdEstadoProyeccion(), obj.getIdUsuarioProyecta(),
                        obj.getIdUsuarioAprueba(), obj.getAnio(), obj.getObservacion(),
                        obj.getObservacionAprobacion(), obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarListasEstadosJuridicos(@RequestBody ProyeccionesLaborales obj) {
        proyeccionesLaboralesRefactorRepository.save(
                new ProyeccionesLaborales(obj.getIdProyecccionLaboral(),obj.getIdEstructuraOrganizacional(),
                        obj.getIdCargo(),obj.getPlazasActuales(), obj.getPlazasProyectadas(), obj.getCostoActual(),
                        obj.getCostoProyectado(), obj.getIdEstadoProyeccion(), obj.getIdUsuarioProyecta(),
                        obj.getIdUsuarioAprueba(), obj.getAnio(), obj.getObservacion(),
                        obj.getObservacionAprobacion(), obj.getAuditoriaUsuario())
        );
    }
}
