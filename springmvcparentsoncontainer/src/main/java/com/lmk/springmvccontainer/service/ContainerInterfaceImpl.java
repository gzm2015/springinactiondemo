package com.lmk.springmvccontainer.service;

import org.springframework.stereotype.Service;

/**
 * @author LiuMengKe
 * @create 2018-12-21-19:35
 */
@Service
public class ContainerInterfaceImpl implements ContainerInterface {

    private String name;
    private String fff;

    @Override
    public void testAop() {
        System.out.println(this.getClass()+"    invoke");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFff() {
        return fff;
    }

    public void setFff(String fff) {
        this.fff = fff;
    }
}
