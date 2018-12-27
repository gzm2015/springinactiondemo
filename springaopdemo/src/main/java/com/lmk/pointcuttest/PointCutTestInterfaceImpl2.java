package com.lmk.pointcuttest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pointCutTestInterfaceForCompare")
public class PointCutTestInterfaceImpl2 implements PointCutTestInterface {

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
