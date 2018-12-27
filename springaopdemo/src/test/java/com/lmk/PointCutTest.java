package com.lmk;

import com.lmk.pointcuttest.PointCutAspect;
import com.lmk.pointcuttest.PointCutTestInterface;
import com.lmk.pointcuttest.TargetPointImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiuMengKe
 * @create 2018-12-20-14:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringAopJavaConfig.class)
public class PointCutTest {

    @Autowired
    @Qualifier("pointCutTestInterfaceInUse")
    PointCutTestInterface pointCutTestInterfaceInUse;

    @Autowired
    @Qualifier("pointCutTestInterfaceForCompare")
    PointCutTestInterface pointCutTestInterfaceForCompare;

    @Autowired
    TargetPointImpl targetPoint;

    @Test
    public void testInject() {
        Assert.assertNotNull(pointCutTestInterfaceInUse);
        Assert.assertNotNull(pointCutTestInterfaceForCompare);
    }

    /*测试一下 execute within args 基本用法*/
    @Test
    public void testPointCutExpression() {
        pointCutTestInterfaceInUse.testMethod();
        pointCutTestInterfaceInUse.testMethod("param set");
        pointCutTestInterfaceForCompare.testMethod();
    }

    /**
     * 测试this target用法
     * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#aop-pointcuts
     * this: Limits matching to join points (the execution of methods when using Spring AOP) where the bean reference (Spring AOP proxy) is an instance of the given type.
     *
     * target: Limits matching to join points (the execution of methods when using Spring AOP) where the target object (application object being proxied) is an instance of the given type.
     * 根据描述 this 用来joinPoint所在目标对象的类型
     *         target 指代 代理对象所在类型
     *         pointCutTestInterfaceInUse 同时实现接口 TargetInterFace 和PointCutTestInterface
     *         如果只用this 限制 pointCutTestInterfaceInUse pointCutTestInterfaceInUse均会触发Advice
     *         如果同时使用target标记代理对象为TargetInterFace类型则只有pointCutTestInterfaceInUse满足条件了
     */
    @Test
    public void testThisAndTarget() {
        pointCutTestInterfaceInUse.testMethod2("param1 set");
        pointCutTestInterfaceInUse.testMethod2("param2 set");
    }

    //@within注解标记类后 类中方法均被横切 直接标记方法无效
    @Test
    public void testtestWithAnno() {
        targetPoint.target();//不会触发@MyWithinAnnotation2
        targetPoint.testWithAnno();//触发@MyWithinAnnotation @MyWithinAnnotation2
    }

    @Test
    public void testOrder() {
        //只触发了@MyWithinAnnotation 内部调用testWithAnno 没有触发 @MyWithinAnnotation2
        //因为内部调用的时候没有走代理对象直接在目标对象上调用了
        targetPoint.testOrder();
        System.out.println("=================");
        targetPoint.testOrder2();//通过获取容器的引用重新获取容器中targetPoint对象后调用可以触发
        System.out.println("=================");
    }

}
