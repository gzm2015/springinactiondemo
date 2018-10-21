package com.lmk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiuMengKe
 * @create 2018-06-30-15:28
 *
 * 测试混合di
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringJavaConfigAll.class)
public class SpringJavaAllTest {

    @Autowired
    SuperHero superHero;


    @Test
    public void testInject() {
        System.out.println(superHero);
    }




}
