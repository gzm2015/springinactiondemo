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
@ContextConfiguration("classpath:springloc5.xml")
public class SpringXmlDiTest3 {


    @Autowired
    SetAndList setAndList;

    @Autowired
    SetAndList setAndList2;

    @Autowired
    SetAndList setAndList3;

    @Autowired
    SetAndList setAndList4;

    @Test
    public void test() {
        Assert.assertEquals(setAndList.getList().size(),3);
        Assert.assertEquals(setAndList2.getSet().size(),4);

        Assert.assertEquals(setAndList3.getList().size(),3);
        Assert.assertEquals(setAndList4.getSet().size(),4);
    }

}
