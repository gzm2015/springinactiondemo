package com.lmk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiuMengKe
 * @create 2018-06-30-21:40
 *
 * 测试 javaconfig 混合 xml
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringJavaXmlConfig.class)
public class SpringJavaXmlTest {

    @Autowired
    Hero hero;
    @Autowired
    SuperHero superHero;


    @Test
    public void test1() {
        System.out.println(hero);
    }

    @Test
    public void test2() {
        System.out.println(superHero);
    }
}
