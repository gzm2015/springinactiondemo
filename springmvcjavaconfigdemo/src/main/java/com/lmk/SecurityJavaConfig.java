package com.lmk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 配置springsecurity
 *
 * @author LiuMengKe
 * @create 2018-07-11-10:36
 */
@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = ("com.lmk"),excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {EnableWebMvc.class,EnableWebSecurity.class}))
public class SecurityJavaConfig extends WebSecurityConfigurerAdapter {


    /*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        *//*内存中模拟一个对象*//*
        *//*auth
                .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");*//*

        auth.userDetailsService(new DemoUserService());

    }*/

    //通过重载，配置如何通过拦截器保护请求
    /*如果要这样用必须配置 MyAuthenticationProvider */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(new DemoUserService())/*.passwordEncoder(new BCryptPasswordEncoder())*/;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //当前security版本不需要再添加ROLE前缀
        //class not found OpenIDAuthenticationFilter 在loginPage 后面添加 permitAll()
        http
                .authorizeRequests()
                .antMatchers("/resources/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .successForwardUrl("/index")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }


}
