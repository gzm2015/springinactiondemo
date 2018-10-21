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
 * 测试 xml 混合 javaconfig
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springloc3.xml")
public class SpringXmlJavaTest {

    @Autowired
    SuperHero superHero;

    @Test
    public void test2() {
        System.out.println(superHero);
    }
}
