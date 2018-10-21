package com.lmk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiuMengKe
 * @create 2018-06-30-16:18
 * 测试xml的推广
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springloc2.xml")
public class SpringXmlDiTest2 {

    @Autowired
    Weapon weapon;

    @Test
    public void test() {
        Assert.assertEquals(Dao.class,weapon.getClass());
    }

}
