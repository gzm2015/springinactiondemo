package com.lmk.springmvccontainer.util;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author LiuMengKe
 * @create 2018-12-21-20:19
 */
public class AopAdvice {

    public void advice(){
        System.out.println("invoke advice.....");
    }

}
