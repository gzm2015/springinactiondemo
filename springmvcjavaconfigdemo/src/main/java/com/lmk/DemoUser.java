package com.lmk;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @author LiuMengKe
 * @create 2018-07-11-11:05
 */
public class DemoUser implements UserDetails {

    private String username;
    private String password;
    private List<GrantedAuthority> list;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<GrantedAuthority> getList() {
        return list;
    }

    public void setList(List<GrantedAuthority> list) {
        this.list = list;
    }

    public DemoUser() {
    }

    public DemoUser(String username, String password, List<GrantedAuthority> list) {
        this.username = username;
        this.password = password;
        this.list = list;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
