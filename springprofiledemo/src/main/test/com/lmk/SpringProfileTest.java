package com.lmk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiuMengKe
 * @create 2018-06-30-23:11
 * @ActiveProfiles("test") 定义为测试环境
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
@ActiveProfiles("test")
public class SpringProfileTest {

    @Autowired
    ToolService toolService;

    @Test
    public void test1() {
        System.out.println(toolService.getClass());
    }

}
