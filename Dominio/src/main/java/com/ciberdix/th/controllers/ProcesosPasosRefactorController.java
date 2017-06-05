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

    @RequestMapping(method = RequestMethod.POST)
    ProcesosPasos create(@RequestBody ProcesosPasos o) {
        return procesosPasosRefactorRepository.save(new ProcesosPasos(
                o.getIdProceso(),o.getCodigo(),o.getOrden(),o.getNombre(),o.getIdRol(),o.getIdTipoConvocatoria(),
                o.getIndicadorInterfazInterna(),o.getInterfazInterna(),o.getIndicadorBloqueante(),
                o.getIndicadorObservacion(),o.getIndicadorCorreo(),o.getIndicadorAdjunto(),o.getIndicadorLlamada(),
                o.getIndicadorCalendario(),o.getIndicadorContratado(),o.getIndicadorCuestionarios(),o.getIdCuestionario(),
                o.getIndicadorInterfaz(),o.getInterfaz(),o.getDescripcion(),o.getAuditoriaUsuario()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesosPasos o) {
        procesosPasosRefactorRepository.save(
                new ProcesosPasos(
                        o.getIdProcesoPaso(),o.getIdProceso(),o.getCodigo(),o.getOrden(),o.getNombre(),o.getIdRol(),
                        o.getIdTipoConvocatoria(),o.getIndicadorInterfazInterna(),o.getInterfazInterna(),o.getIndicadorBloqueante(),
                        o.getIndicadorObservacion(),o.getIndicadorCorreo(),o.getIndicadorAdjunto(),o.getIndicadorLlamada(),
                        o.getIndicadorCalendario(),o.getIndicadorContratado(),o.getIndicadorCuestionarios(),o.getIdCuestionario(),
                        o.getIndicadorInterfaz(),o.getInterfaz(),o.getDescripcion(),o.getAuditoriaUsuario()
                )
        );
    }

}
