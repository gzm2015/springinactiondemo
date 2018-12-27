package com.lmk.springmvccontainer.controller;

import com.lmk.springmvccontainer.service.ContainerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LiuMengKe
 * @create 2018-12-21-19:32
 */
@Controller
public class ContainerController {

    @Autowired
    ContainerInterface containerInterface;

    @GetMapping("/index.html")
    public String index(){
        containerInterface.testAop();
        System.out.println("注入service来源    "+ containerInterface.getName());
        return "index";
    }

}
