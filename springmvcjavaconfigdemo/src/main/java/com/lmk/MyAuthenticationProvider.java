package com.lmk;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuMengKe
 * @create 2018-07-12-15:22
 */
public class MyAuthenticationProvider implements AuthenticationProvider {

    UserDetailsService demoUserService;

    public MyAuthenticationProvider(UserDetailsService demoUserService) {
        this.demoUserService = demoUserService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("USER"));
        return new UsernamePasswordAuthenticationToken(demoUserService,
                authentication.getCredentials(), roles);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
