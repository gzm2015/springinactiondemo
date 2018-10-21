package com.lmk;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author LiuMengKe
 * @create 2018-07-05-14:33
 */
@Component
public class TargetInterfaceImpl implements TargetInterface {

    @Override
    public void targetMethod() {
        System.out.println("imol invoke");
    }

    @Override
    public void targetMethod(String param) {
        System.out.println(param);
    }
}
