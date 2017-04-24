package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.VPolicyRules;
import com.ciberdix.th.repositories.refactor.VPolicyRulesRefactorRepository;
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
@RequestMapping("/api/policyRules")
public class PolicyRulesRefactorController {
    @Autowired
    private VPolicyRulesRefactorRepository vPolicyRulesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/{rol}")
    List<VPolicyRules> findAll(@PathVariable String rol) {
        return vPolicyRulesRefactorRepository.findByRol(rol);
    }
}
