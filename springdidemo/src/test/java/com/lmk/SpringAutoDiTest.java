package com.lmk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiuMengKe
 * @create 2018-06-30-15:09
 *
 * 通过runwith 构建spring 应用上下文
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringAutoDiConfig.class)
public class SpringAutoDiTest {

    /*
    *
    * SpringConfig 上含有@ComponentScan 可以扫描到对应的bean
    */

    /*
        @Autowired
        Weapon weapon;
        直接注入weapon 由于含有两个bean 所以编译会失败
    */
    @Autowired
    Weapon gun;
    @Autowired
    Weapon dao;
    @Autowired
    Hero hero;
    @Autowired
    SuperHero superHero;


    @Test
    public void test() {
        Assert.assertNotNull(gun);
        Assert.assertNotNull(dao);
    }

    /*: No qualifying bean of type 'com.lmk.Weapon' available: expected single matching bean but found 2*/
    /*注入失败 含有两个weapon*/
    @Test
    public void testDi() {
        Assert.assertNotNull(hero);
        Assert.assertEquals(Gun.class,hero.getWeapon().getClass());
    }


    /*当指定Qualifier的时候注入的是就先 按Qualifier进行注入 */
    @Test
    public void testDi2() {
        Assert.assertEquals(Dao.class,superHero.getWeapon().getClass());
    }







}
