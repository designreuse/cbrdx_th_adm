package com.ciberdix.th.security.abac.policy.spring;

import com.ciberdix.th.security.abac.policy.PolicyEnforcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by robertochajin on 21/04/17.
 */
@Component
public class AbacPermissionEvaluator implements PermissionEvaluator {

    @Autowired
    PolicyEnforcement policy;

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        Object user = authentication.getPrincipal();
        Map<String, Object> environment = new HashMap<>();

        /*
		Object authDetails = authentication.getDetails();
		if(authDetails != null) {
			if(authDetails instanceof WebAuthenticationDetails) {
				environment.put("remoteAddress", ((WebAuthenticationDetails) authDetails).getRemoteAddress());
			}
		}
         */
        environment.put("time", new Date());

        //logger.debug("hasPersmission({}, {}, {})", user, targetDomainObject, permission);
        return policy.check(user, targetDomainObject, permission, environment);
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        return false;
    }

}