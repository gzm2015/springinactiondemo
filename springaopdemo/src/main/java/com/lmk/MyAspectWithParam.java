package com.lmk;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 带参数切面
 *
 * @author LiuMengKe
 * @create 2018-07-05-14:52
 *
 * 在java 配置中使用&& || xml 中使用 and or
 *
 * around 带参数的时候直接用ProceedingJoinPoint 在方法中获取不要写在参数中
 */
@Aspect
public class MyAspectWithParam {

    @Pointcut("execution(* com.lmk.TargetInterfaceImpl.*(..)) && args(param)")
    public void pointcut(String param){

    }

    @Before("pointcut(param)")
    public void beforeMethod(String param){
        System.out.println("myaspect before method1"+param);
    }

    @Before("pointcut(param)")
    public void beforeMethod2(String param){
        System.out.println("myaspect before method2"+param);
    }


    @AfterReturning("pointcut(param)")
    public void afterreturning(String param){
        System.out.println("myaspect afterreturning"+param);
    }


    @AfterThrowing("pointcut(param)")
    public void afterthrowing(String param){
        System.out.println("myaspect afterthrowing"+param);
    }

    @Around("execution(* com.lmk.TargetInterfaceImpl.*(..))")
    public void around(ProceedingJoinPoint pj){
        try {
            Object[] args = pj.getArgs();
            System.out.println("myaspect around before"+args);
            pj.proceed(args);
            System.out.println("myaspect around after"+args);
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }



}
