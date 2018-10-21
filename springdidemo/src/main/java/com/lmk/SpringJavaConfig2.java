package com.lmk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 进行混合配置
 *
 * @author LiuMengKe
 * @create 2018-06-30-21:27
 */
@Configuration
public class SpringJavaConfig2 {

    @Bean
    public SuperHero getSuperHero(){
        return new SuperHero();
    }

    @Bean
    public Dao getDao(){
        return new Dao();
    }

    @Bean
    public Weapon getWeapon(){
        return getDao();
    }


}
