package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ProyeccionesLaborales;
import com.ciberdix.th.models.refactor.VProyeccionLaboral;
import com.ciberdix.th.repositories.refactor.ProyeccionesLaboralesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VProyeccionLaboralRefactorRepository;
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
        proyeccionesLaboralesRefactorRepository.save(obj);
    }
}
