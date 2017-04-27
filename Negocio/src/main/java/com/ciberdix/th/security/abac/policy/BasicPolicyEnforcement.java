package com.ciberdix.th.security.abac.policy;

import com.ciberdix.th.security.JwtUser;
import com.ciberdix.th.security.abac.policy.json.JsonFilePolicyDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.expression.EvaluationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by robertochajin on 21/04/17.
 */
@Component
public class BasicPolicyEnforcement implements PolicyEnforcement {

    private static final Logger logger = LoggerFactory.getLogger(BasicPolicyEnforcement.class);

    @Autowired
    @Qualifier("jsonFilePolicyDefinition")
    private PolicyDefinition policyDefinition;

    @Override
    public boolean check(Object subject, Object resource, Object action, Object environment) {

        //Get all policy rules
        List<PolicyRule> allRules = null;
        try {
            allRules = policyDefinition.obtenerReglas();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        //Wrap the context
        SecurityAccessContext cxt = new SecurityAccessContext(subject, resource, action, environment);
        //Filter the rules according to context.
        List<PolicyRule> matchedRules = filterRules(allRules, cxt);
        //finally, check if any of the rules are satisfied, otherwise return false.
        return checkRules(matchedRules, cxt);
    }

    private List<PolicyRule> filterRules(List<PolicyRule> allRules, SecurityAccessContext cxt) {
        List<PolicyRule> matchedRules = new ArrayList<>();
        for (PolicyRule rule : allRules) {
            try {
                if (rule.getTarget().getValue(cxt, Boolean.class)) {
                    matchedRules.add(rule);
                }
            } catch (EvaluationException ex) {
                logger.info("Ocurrió un error evaluando PolicyRule.", ex.getLocalizedMessage());
            }
        }
        return matchedRules;
    }

    private boolean checkRules(List<PolicyRule> matchedRules, SecurityAccessContext cxt) {
        for (PolicyRule rule : matchedRules) {
            try {
                if (rule.getCondition().getValue(cxt, Boolean.class)) {
                    return true;
                }
            } catch (EvaluationException ex) {
                logger.info("Ocurrió un error evaluando PolicyRule.", ex);
            }
        }
        return false;
    }
}