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

    @RequestMapping(method = RequestMethod.GET, path = "/id/{idFuncionalidad}")
    List<FuncionalidadesControles> findOne(@PathVariable Integer idFuncionalidad) {
        return (List<FuncionalidadesControles>) funcionalidadesControlesRefactorRepository.findOne(idFuncionalidad);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{IdPadre}")
    List<FuncionalidadesControles> findByFather(@PathVariable Integer IdPadre) {
        return funcionalidadesControlesRefactorRepository.findByIdPadre(IdPadre);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/secycam/{idFuncionalidad}/{indicador}")
    List<FuncionalidadesControles> queryAllByIdSecCam(@PathVariable Integer idFuncionalidad, @PathVariable Boolean indicador) {
        return (List<FuncionalidadesControles>) funcionalidadesControlesRefactorRepository.queryAllByIdSecCam(idFuncionalidad, indicador);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/indicadorsecycam/{indicador}")
    List<FuncionalidadesControles> queryAllBySecCam(@PathVariable Boolean indicador) {
        return (List<FuncionalidadesControles>) funcionalidadesControlesRefactorRepository.queryAllBySecCam(indicador);
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
