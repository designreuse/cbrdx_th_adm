package com.ciberdix.th.security.abac.policy;

import java.util.List;

/**
 * Created by robertochajin on 21/04/17.
 */
public interface PolicyDefinition {

    public List<PolicyRule> getAllPolicyRules();
}
