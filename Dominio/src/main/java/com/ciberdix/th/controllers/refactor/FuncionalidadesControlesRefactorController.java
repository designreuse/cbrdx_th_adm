package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.FuncionalidadesControles;
import com.ciberdix.th.models.refactor.VFuncionalidadesControles;
import com.ciberdix.th.repositories.refactor.FuncionalidadesControlesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VFuncionalidadesControlesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/funcionalidadesControles")
public class FuncionalidadesControlesRefactorController {

    @Autowired
    private FuncionalidadesControlesRefactorRepository funcionalidadesControlesRefactorRepository;

    @Autowired
    private VFuncionalidadesControlesRefactorRepository vFuncionalidadesControlesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VFuncionalidadesControles> getLists() {
        return (List<VFuncionalidadesControles>) vFuncionalidadesControlesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id/{idFuncionalidad}")
    VFuncionalidadesControles findOne(@PathVariable Integer idFuncionalidad) {
        return vFuncionalidadesControlesRefactorRepository.findOne(idFuncionalidad);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{IdPadre}")
    List<VFuncionalidadesControles> findByFather(@PathVariable Integer IdPadre) {
        return vFuncionalidadesControlesRefactorRepository.findByIdPadre(IdPadre);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/secycam/{idFuncionalidad}/{indicador}")
    List<VFuncionalidadesControles> queryAllByIdSecCam(@PathVariable Integer idFuncionalidad, @PathVariable Boolean indicador) {
        return (List<VFuncionalidadesControles>) vFuncionalidadesControlesRefactorRepository.queryAllByIdSecCam(idFuncionalidad, indicador);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/indicadorsecycam/{indicador}")
    List<VFuncionalidadesControles> queryAllBySecCam(@PathVariable Boolean indicador) {
        return (List<VFuncionalidadesControles>) vFuncionalidadesControlesRefactorRepository.queryAllBySecCam(indicador);
    }

    @RequestMapping(method = RequestMethod.POST)
    FuncionalidadesControles createList(@RequestBody FuncionalidadesControles fc) {
        return funcionalidadesControlesRefactorRepository.save(
                new FuncionalidadesControles(fc.getCodigo(), fc.getControl(), fc.getIdClasificacion(),
                        fc.getIdFuncionalidad(), fc.getIndicadorVisible(), fc.getIndicadorImprimir(),
                        fc.getIndicadorHabilitado(), fc.getAuditoriaUsuario(),
                        fc.getIdPadre(), fc.getIndicadorSeccion()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    FuncionalidadesControles updateList(@RequestBody FuncionalidadesControles fc) {
        return funcionalidadesControlesRefactorRepository.save(fc);
    }

}