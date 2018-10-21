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
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringJavaConfig.class)
public class SpringJavaTest {

    @Autowired
    Weapon weapon;

    @Autowired
    Hero hero;

    @Test
    public void testInject() {
        //注入 gun
        System.out.println(weapon.getClass());
    }

    @Test
    public void testInject2() {
        //注入 hero weapon 均被spring
        Weapon weapon = hero.getWeapon();
        Weapon weapon2 = hero.getWeapon();
        Assert.assertEquals(weapon,weapon2);
        Assert.assertEquals(weapon.getClass(),Gun.class);
    }





}
