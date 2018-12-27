package com.lmk.pointcuttest;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @author LiuMengKe
 * @create 2018-12-20-15:04
 */
@MyWithinAnnotation
@Component
public class TargetPointImpl implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void target(){
        System.out.println(this.getClass()+"invoke");
    }

    @MyWithinAnnotation2
    public void testWithAnno(){
        System.out.println(this.getClass()+"testWithAnno invoke");
    }

    /**
     * 测试内部方法调用时aop是否会触发
     */
    public void testOrder(){
        System.out.println("test TargetPointImpl order ");
        testWithAnno();
    }

    public void testOrder2(){
        TargetPointImpl th = (TargetPointImpl)applicationContext.getBean("targetPointImpl");
        th.testWithAnno();
    }

}
