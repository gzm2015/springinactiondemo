package com.lmk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author LiuMengKe
 * @create 2018-06-30-22:59
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public ToolService getTool(){
        return new Tool();
    }


    @Bean
    @Profile("test")
    public ToolService getTool2(){
        return new Tool2();
    }

}
