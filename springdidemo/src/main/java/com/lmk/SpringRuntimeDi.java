package com.lmk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author LiuMengKe
 * @create 2018-07-01-15:39
 */
@Configuration
@PropertySource("classpath:applicationcontext.properties")
public class SpringRuntimeDi {

    /*@Bean
    public Computer getComputer(@Value("${name}")String name,@Value("${value}")String price){
        return new Computer(name,price);
    }*/
    @Autowired
    Environment environment;


    @Bean
    public Computer getComputer(){
        return new Computer(environment.getProperty("name"),environment.getProperty("price"));
    }

}
