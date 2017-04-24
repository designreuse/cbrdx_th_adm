package com.ciberdix.th.security.abac.policy;

/**
 * Created by robertochajin on 21/04/17.
 */
public interface PolicyEnforcement {
    boolean check(Object subject, Object resource, Object action, Object environment);
}
