package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.Reglas;
import com.ciberdix.th.models.VPolicyRules;
import com.ciberdix.th.repositories.VPolicyRulesRefactorRepository;
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
        int i = 0;

        for (VPolicyRules pr : policies) {
            if (pr.getIndicadorHabilitado() != null && pr.getIndicadorHabilitado()){
                accion = "'LISTAR'";

                if (pr.getIndicadorInsertar() != null && pr.getIndicadorInsertar())
                    accion += ",'INSERTAR'";
            }

            if (pr.getRol() != null){
                Reglas r = new Reglas(pr.getRol(), pr.getRol(),
                        "subject.authorities.toString().contains('" + pr.getRol() + "') && {" + accion + "}.contains(action)",
                        pr.getIdMenu() + " == resource.idMenu");
                reglas.add(r);
                i++;
            }
        }

        return reglas;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/rol")
    List<VPolicyRules> findByRol() {
        List<VPolicyRules> policies = (List<VPolicyRules>) vPolicyRulesRefactorRepository.findAll();

        List<VPolicyRules> reglas = new ArrayList<>();

        for (VPolicyRules pr : policies) {
            if (pr.getIndicadorHabilitado() != null && pr.getIndicadorHabilitado()) {
                reglas.add(pr);
            }
        }

        return reglas;
    }
}
