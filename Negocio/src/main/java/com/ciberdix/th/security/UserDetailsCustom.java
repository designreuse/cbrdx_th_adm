package com.ciberdix.th.security;

import com.ciberdix.th.model.RolesFuncionalidades;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * Created by robertochajin on 23/06/17.
 */
public interface UserDetailsCustom extends UserDetails {
    List<String> getPantallasAprobadas();
}
