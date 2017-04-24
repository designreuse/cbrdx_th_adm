package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Reglas;
import com.ciberdix.th.models.refactor.VPolicyRules;
import com.ciberdix.th.repositories.refactor.VPolicyRulesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/policyRules")
public class PolicyRulesRefactorController {
    @Autowired
    private VPolicyRulesRefactorRepository vPolicyRulesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Reglas> findAll() {
        List<VPolicyRules> policies = (List<VPolicyRules>) vPolicyRulesRefactorRepository.findAll();

        List<Reglas> reglas = new ArrayList<>();
        String accion = "";

        for (VPolicyRules pr : policies) {
            if (pr.getIndicadorHabilitado()){
                accion = "'LISTAR'";

                if (pr.getIndicadorInsertar())
                    accion += ",'INSERTAR'";
            }

            Reglas r = new Reglas(pr.getRol(), pr.getRol(),
                    "subject.authorities.toString().contains('" + pr.getRol() + "') && {" + accion + "}.contains(action)",
                    "subject.funcionalidades.toString().contains('" + pr.getIdFuncionalidad() + "')");
            reglas.add(r);
        }

        return reglas;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{rol}")
    List<VPolicyRules> findByRol(@PathVariable String rol) {
        return vPolicyRulesRefactorRepository.findByRol(rol);
    }
}
