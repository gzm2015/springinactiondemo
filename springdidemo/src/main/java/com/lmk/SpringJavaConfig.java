package com.lmk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 手工方式配置spring
 *
 * @author LiuMengKe
 * @create 2018-06-30-15:25
 */
@Configuration
public class SpringJavaConfig {

    @Bean
    public Weapon getWeapon(){
        return new Gun();
    }

    /*getWeapon（） 方法调用时 被spring 拦截 返回spring拦截的bean 即为gun*/
    @Bean
    public Hero getHero(){
        return new Hero(getWeapon());
    }

}
