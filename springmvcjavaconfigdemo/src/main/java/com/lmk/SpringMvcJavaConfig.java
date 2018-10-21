package com.lmk;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 手工配置dispatcherServlet
 *
 * @author LiuMengKe
 * @create 2018-07-06-9:38
 *
 *
 * 在Servlet 3.0环境
 * 中，容器会在类路径中查找实现
 * javax.servlet.ServletContainerInitializer接口的类，
 * 如果能发现的话，就会用它来配置Servlet容器。
 * Spring提供了这个接口的实现，名
 * 为SpringServletContainerInitializer，这个类反过来又会
 * 查找实现WebApplicationInitializer的类并将配置的任务交给
 * 它们来完成。Spring 3.2引入了一个便利的
 * WebApplicationInitializer基础实现，也就
 * 是AbstractAnnotationConfigDispatcherServletInitializer
 *
 *当DispatcherServlet启动的时候，它会创建Spring应用上下文，
 * 并加载配置文件或配置类中所声明的bean。在程序清单5.1的
 * getServletConfigClasses()方法中，我们要
 * 求DispatcherServlet加载应用上下文时，使用定义
 * 在WebConfig配置类（使用Java配置）中的bean。
 * 但是在Spring Web应用中，通常还会有另外一个应用上下文。另外的
 * 这个应用上下文是由ContextLoaderListener创建的。
 * 我们希望DispatcherServlet加载包含Web组件的bean，如控制
 * 器、视图解析器以及处理器映射，而ContextLoaderListener要
 * 加载应用中的其他bean。这些bean通常是驱动应用后端的中间层和数
 * 据层组件。
 */

public class SpringMvcJavaConfig extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SecurityJavaConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }




}
