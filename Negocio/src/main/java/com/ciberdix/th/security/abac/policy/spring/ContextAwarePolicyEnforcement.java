package com.ciberdix.th.security.abac.policy.spring;

import com.ciberdix.th.security.abac.policy.PolicyEnforcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by robertochajin on 21/04/17.
 */
@Component
public class ContextAwarePolicyEnforcement {
    @Autowired
    protected PolicyEnforcement policy;

    public Boolean checkPermission(Object resource, String permission) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Boolean permitido;

        Map<String, Object> environment = new HashMap<>();

        /*
		Object authDetails = auth.getDetails();
		if(authDetails != null) {
			if(authDetails instanceof WebAuthenticationDetails) {
				environment.put("remoteAddress", ((WebAuthenticationDetails) authDetails).getRemoteAddress());
			}
		}
         */
        environment.put("time", new Date());

        if (!policy.check(auth.getPrincipal(), resource, permission, environment)) {
            //throw new AccessDeniedException("Acceso denegado a este recurso");
            permitido=false;
        } else {
            permitido = true;
        }

        return permitido;
    }
}
