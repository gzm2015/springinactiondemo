package com.lmk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author LiuMengKe
 * @create 2018-07-05-14:15
 *
 * @EnableAspectJAutoProxy 自动应用aspectJ 代理
 * 由于只有被sping 管理的类才能被生成代理 所以必选在java配置中使用注解 @ComponentScan
 *
 * 另外必须有切面的bean才行
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class SpringAopJavaConfig {

    /*@Bean
    public MyAspect getMyAspect(){
        return new MyAspect();
    }*/

    @Bean
    public MyAspectWithParam getMyAspectWithParam(){
        return new MyAspectWithParam();
    }


}
