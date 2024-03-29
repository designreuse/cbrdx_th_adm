package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPolicyRules;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
public interface VPolicyRulesRefactorRepository extends CrudRepository<VPolicyRules,Integer> {
    List<VPolicyRules> findByRol(String rol);
}
