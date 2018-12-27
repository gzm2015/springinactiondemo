package com.lmk.pointcuttest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author LiuMengKe
 * @create 2018-12-20-13:50
 *
 * 测试pointcut各种参数用法
 *
 * aspect 中pointcut 组成
 * 1.表达式 2.Signature
 * Signature就是表达式的载体
 * 表达式由两部分组成 1.标志符 2.匹配模式
 *      1.标志符
 *      主要分为不用注解方式 和使用注解方式二者对应
 *      常见的有
 *      execution JointPoint横切表达式
 *      within 具体到某个包或者某个对象
 *      args  含有指定类型参数
 *      this
 *      target
 *            this target 在Aspect中this表示调用方target表示被调用方 this(Object1)&&target(Object2) 表示用Object1调用Object2的时候才会触发
 *            this 目标 target代理
 *      @within 只能用在类上之后类中所有方法都会被横切？？
 *      @target @target和@within用法差不多 @within 静态匹配 @target动态匹配
 *      @args  用法类似args 内部必须填写一个注解 使用注解标记类 只有含有指定注解的类能触发advice
 *      @annotation 用方法上匹配所有标注了指定注解的方法
 */
@Aspect
public class PointCutAspect {

    //execution里面就像接口方法声明一样
    //标志符的逻辑操作符 && ||
    //within 后只对TargetInterfaceImpl 中的testMethod 进行横切
    //注意方法参数写法 如果只是一个* 表示一个参数 ..才表示任意参数
    @Pointcut("execution(public void com.lmk.pointcuttest..testMethod(..))&&within(com.lmk.pointcuttest.PointCutTestInterFaceImpl)&&args(java.lang.String)")
    public void pointCut1(){

    }

    //
    @Pointcut("execution(public void com.lmk.pointcuttest..testMethod2(..))&&this(com.lmk.pointcuttest.PointCutTestInterface)&&target(com.lmk.pointcuttest.TargetInterFace)")
    public void pointCut2(){

    }

    //横切标记了注解的类或方法
    @Pointcut("@within(com.lmk.pointcuttest.MyWithinAnnotation)")
    public void pointCut3(){

    }

    @Pointcut("@annotation(com.lmk.pointcuttest.MyWithinAnnotation2)")
    public void pointCut4(){

    }

    @Before("pointCut1()")
    public void testBeforeAdvice(){
        System.out.println("aop pointcut1 advice init========");
    }

    @Before("pointCut2()")
    public void testBeforeAdvice2(){
        System.out.println("this target pointcut invoke========");
    }
    @Before("pointCut3()")
    public void testBeforeAdvice3(){
        System.out.println("my @within anno invoke========");
    }

    @Before("pointCut4()")
    public void testBeforeAdvice4(){
        System.out.println("my @annotation invoke========");
    }
}
