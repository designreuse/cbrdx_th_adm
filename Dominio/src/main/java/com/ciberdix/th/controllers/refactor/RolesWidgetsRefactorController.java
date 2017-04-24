package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.RolesWidgets;
import com.ciberdix.th.models.refactor.VRolesWidgets;
import com.ciberdix.th.repositories.refactor.RolesWidgetsRefactorRepository;
import com.ciberdix.th.repositories.refactor.VRolesWidgetsRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/rolesWidgets")
public class RolesWidgetsRefactorController {
    @Autowired
    private RolesWidgetsRefactorRepository rolesWidgetsRefactorRepository;

    @Autowired
    private VRolesWidgetsRefactorRepository vRolesWidgetsRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRolesWidgets> findAll() {
        return (List<VRolesWidgets>) vRolesWidgetsRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VRolesWidgets> findEnabled() {
        return vRolesWidgetsRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarRol/{id}")
    List<VRolesWidgets> findByIdRol(@PathVariable Integer id) {
        return vRolesWidgetsRefactorRepository.findByIdRol(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRolesWidgets findOne(@PathVariable Integer id) {
        return vRolesWidgetsRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    RolesWidgets create(@RequestBody RolesWidgets obj) {
        return rolesWidgetsRefactorRepository.save(
                new RolesWidgets(obj.getIdRol(),obj.getIdWidget(),obj.getIndicadorHabilitado(),
                        obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RolesWidgets obj) {
        rolesWidgetsRefactorRepository.save(obj);
    }
}
