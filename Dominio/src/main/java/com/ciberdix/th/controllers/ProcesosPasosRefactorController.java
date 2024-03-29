package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProcesosPasos;
import com.ciberdix.th.models.VProcesosPasos;
import com.ciberdix.th.repositories.ProcesosPasosRefactorRepository;
import com.ciberdix.th.repositories.VProcesosPasosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesosPasos")
public class ProcesosPasosRefactorController {

    @Autowired
    private ProcesosPasosRefactorRepository procesosPasosRefactorRepository;

    @Autowired
    private VProcesosPasosRefactorRepository vProcesosPasosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesosPasos> findAll() {
        return (List<VProcesosPasos>) vProcesosPasosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProcesosPasos findOne(@PathVariable Integer id) {
        return vProcesosPasosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proceso/{idProceso}")
    List<VProcesosPasos> findAllByIdProceso(@PathVariable Integer idProceso) {
        return vProcesosPasosRefactorRepository.findAllByIdProceso(idProceso);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoOrden/{idProceso}")
    List<VProcesosPasos> findAllByIdProcesoOrden(@PathVariable Integer idProceso) {
        return vProcesosPasosRefactorRepository.findAllByIdProcesoAndIndicadorHabilitadoIsTrueOrderByOrden(idProceso);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoOrden/externoMixto/{idProceso}")
    List<VProcesosPasos> findAllByIdProcesoOrdenExternoMixto(@PathVariable Integer idProceso) {
        return vProcesosPasosRefactorRepository.queryAllByIdProcesoExternaMixta(idProceso);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoOrden/internoMixto/{idProceso}")
    List<VProcesosPasos> findAllByIdProcesoOrdenInternoMixto(@PathVariable Integer idProceso) {
        return vProcesosPasosRefactorRepository.queryAllByIdProcesoInternaMixta(idProceso);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codigo/{codigo}")
    List<VProcesosPasos> findAllByCodigo(@PathVariable String codigo) {
        return vProcesosPasosRefactorRepository.findAllByCodigo(codigo);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/ultimoPaso/{idProceso}")
    VProcesosPasos queryLastPaso(@PathVariable Integer idProceso) {
        return vProcesosPasosRefactorRepository.queryLastPaso(idProceso);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesosPasos create(@RequestBody ProcesosPasos o) {
        return procesosPasosRefactorRepository.save(new ProcesosPasos(
                o.getIdProceso(),o.getCodigo(),o.getOrden(),o.getNombre(),o.getIdRol(),o.getIdTipoConvocatoria(),
                o.getIndicadorInterfazInterna(),o.getInterfazInterna(),o.getIndicadorBloqueante(),
                o.getIndicadorObservacion(),o.getIndicadorCorreo(),o.getIndicadorAdjunto(),
                o.getIndicadorCalendario(),o.getIndicadorCuestionarios(),o.getIdCuestionario(),
                o.getIndicadorInterfaz(),o.getInterfaz(),o.getDescripcion(),o.getAuditoriaUsuario(),o.getIndicadorHabilitado()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesosPasos o) {
        procesosPasosRefactorRepository.save(
                new ProcesosPasos(
                        o.getIdProcesoPaso(),o.getIdProceso(),o.getCodigo(),o.getOrden(),o.getNombre(),o.getIdRol(),
                        o.getIdTipoConvocatoria(),o.getIndicadorInterfazInterna(),o.getInterfazInterna(),
                        o.getIndicadorBloqueante(),o.getIndicadorObservacion(),o.getIndicadorCorreo(),o.getIndicadorAdjunto(),
                        o.getIndicadorCalendario(),o.getIndicadorCuestionarios(),o.getIdCuestionario(),
                        o.getIndicadorInterfaz(),o.getInterfaz(),o.getDescripcion(),o.getAuditoriaUsuario(),
                        o.getIndicadorHabilitado()
                )
        );
    }

}
