package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VPolicyRules;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
public interface VPolicyRulesRefactorRepository extends CrudRepository<VPolicyRules,Integer> {
    List<VPolicyRules> findByRol(String rol);
}
