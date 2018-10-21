package com.lmk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author LiuMengKe
 * @create 2018-07-01-15:39
 */
@Configuration
@PropertySource("classpath:applicationcontext.properties")
public class SpringRuntimeDi2 {


    /*@Autowired
    Environment environment;

    */

    /*要在自动装配环境使用PropertySourcesPlaceholderConfigurer*/
    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfiguration(){
        return new PropertySourcesPlaceholderConfigurer();
    }


    /*@Bean
    public Computer getComputer(@Value("${name}")String name, @Value("${price}")String price){
        return new Computer(name,price);
    }*/


    @Bean
    public Computer getComputer(@Value("#{systemProperties['sys_name']}")String name, @Value("#{systemProperties['sys_price']}")String price){
        return new Computer(name,price);
    }

}
