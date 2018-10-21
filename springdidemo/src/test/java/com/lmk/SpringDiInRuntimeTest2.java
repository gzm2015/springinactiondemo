package com.lmk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiuMengKe
 * @create 2018-07-01-15:19
 * 运行时注入 通过env 获取properties
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringRuntimeDi.class)
public class SpringDiInRuntimeTest2 {

    @Autowired
    Computer computer;

    @Test
    public void test() {
        Assert.assertEquals("acer",computer.getName());
        Assert.assertEquals("100",computer.getPrice());
    }


}
