package com.lmk;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author LiuMengKe
 * @create 2018-07-05-14:06
 * 切面
 * 切面是通知和切点的集合
 * 通知包括什么时间做什么
 * 切点是在哪里做
 * 注意是execution 而不是 execute
 */
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.lmk.TargetInterfaceImpl.*(..))")
    public void pointcut(){

    }

    @Before("execution(* com.lmk.TargetInterfaceImpl.*(..))")
    public void beforeMethod(){
        System.out.println("myaspect before method1");
    }

    @Before("pointcut()")
    public void beforeMethod2(){
        System.out.println("myaspect before method2");
    }


    @AfterReturning("pointcut()")
    public void afterreturning(){
        System.out.println("myaspect afterreturning");
    }


    @AfterThrowing("pointcut()")
    public void afterthrowing(){
        System.out.println("myaspect afterthrowing");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint pj){
        try {
            System.out.println("myaspect around before");
            pj.proceed();
            System.out.println("myaspect around after");
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }


}
