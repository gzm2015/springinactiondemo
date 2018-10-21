package com.lmk;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 *
 * @author LiuMengKe
 * @create 2018-06-30-14:57
 */
/*设置扫描的基础包*/
/*basePackageClasses 用类所在的包 作为扫描的基础包*/
/*@ComponentScan("com.lmk")*/
@ComponentScan(basePackageClasses = {Gun.class,Dao.class})
@Configuration
public class SpringAutoDiConfig {
}
