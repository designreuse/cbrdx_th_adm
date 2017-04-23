package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.FuncionalidadesControles;
import com.ciberdix.th.repositories.refactor.FuncionalidadesControlesRefactorRepository;
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

    @RequestMapping(method = RequestMethod.GET)
    List<FuncionalidadesControles> getLists() {
        return (List<FuncionalidadesControles>) funcionalidadesControlesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idFuncionalidad}")
    List<FuncionalidadesControles> findByOne(@PathVariable Integer idFuncionalidad) {
        return (List<FuncionalidadesControles>) funcionalidadesControlesRefactorRepository.findOne(idFuncionalidad);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sec/{idFuncionalidad}")
    List<FuncionalidadesControles> queryAllByIdSecCamSec(@PathVariable Integer idFuncionalidad) {
        FuncionalidadesControles fc = funcionalidadesControlesRefactorRepository.findOne(idFuncionalidad);
        String sec = "sec";
        return (List<FuncionalidadesControles>) funcionalidadesControlesRefactorRepository.queryAllByIdSecCam(idFuncionalidad, sec);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cam/{idFuncionalidad}")
    List<FuncionalidadesControles> queryAllByIdSecCamCam(@PathVariable Integer idFuncionalidad) {
        FuncionalidadesControles fc = funcionalidadesControlesRefactorRepository.findOne(idFuncionalidad);
        String sec = "cam";
        return (List<FuncionalidadesControles>) funcionalidadesControlesRefactorRepository.queryAllByIdSecCam(idFuncionalidad, sec);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sec")
    List<FuncionalidadesControles> queryAllBySecCamSec() {
        String sec = "sec";
        return (List<FuncionalidadesControles>) funcionalidadesControlesRefactorRepository.queryAllBySecCam(sec);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cam")
    List<FuncionalidadesControles> queryAllBySecCamCam() {
        String cam = "cam";
        return (List<FuncionalidadesControles>) funcionalidadesControlesRefactorRepository.queryAllBySecCam(cam);
    }

    @RequestMapping(method = RequestMethod.POST)
    FuncionalidadesControles createList(@RequestBody FuncionalidadesControles fc) {
        return funcionalidadesControlesRefactorRepository.save(
                new FuncionalidadesControles(fc.getCodigo(), fc.getControl(), fc.getIdClasificacion(),
                        fc.getIdFuncionalidad(), fc.getIndicadorVisible(), fc.getIndicadorImprimir(),
                        fc.getIndicadorImprimir(), fc.getAuditoriaUsuario(),
                        fc.getIdPadre(), fc.getIndicadorSeccion()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    FuncionalidadesControles updateList(@RequestBody FuncionalidadesControles fc) {
        return funcionalidadesControlesRefactorRepository.save(fc);
    }

}
