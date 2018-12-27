package com.lmk.pointcuttest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author LiuMengKe
 * @create 2018-12-20-13:58
 */
@Component("pointCutTestInterfaceInUse")
public class PointCutTestInterFaceImpl implements PointCutTestInterface,TargetInterFace{

    @Autowired
    TargetPointImpl targetPoint;

    @Override
    public void testMethod() {
        System.out.println(this.getClass()+"    testMethod");
    }

    @Override
    public void testMethod(String param) {
        System.out.println(this.getClass()+"    testMethod with param");
    }

    @Override
    public void testMethod2(String param) {
        System.out.println(this.getClass()+"    testMethod2");
        targetPoint.target();
    }
}
