package com.lmk;

import org.junit.Assert;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LiuMengKe
 * @create 2018-06-30-15:38
 */
public class SpringApplicationContextTest {



    /*
    *
    * AnnotationConfigApplicationContext
    * 从一个或多个基于Java的配置类中加载Spring应用上下文。
    * ClassPathXmlApplicationContext
    * 从类路径下的一个或多个XML配置文件中加载上下文定义，把应用上下文的定义文件作为类资源。
    * FileSystemXmlApplicationContext
    * 从文件系统下的一个或多个XML配置文件中加载上下文定义
     */
    /*spring 应用上下文*/
    public static void main(String[] args) {
        //使用配置类 配置类扫描  被spring 上下文管理
        //由于hero注入weapon失败
        //通过@primary 优先注入 gun
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringAutoDiConfig.class);
        Class gun_class = applicationContext.getBean("gun").getClass();
        Assert.assertEquals(gun_class,Gun.class);
    }


}
