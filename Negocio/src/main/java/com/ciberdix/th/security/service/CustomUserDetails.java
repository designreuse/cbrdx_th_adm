package com.ciberdix.th.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by robertochajin on 27/04/17.
 */
public interface CustomUserDetails extends UserDetailsService {
    UserDetails loadUserByIdUsername(Integer var1) throws UsernameNotFoundException;
}
