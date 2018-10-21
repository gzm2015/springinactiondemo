package com.lmk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiuMengKe
 * @create 2018-07-13-16:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringNoSqlConfig.class)
public class SpringNoSqlTest {

    @Autowired
    RedisTemplate redisTemplate;


    @Test
    public void test() {
        boolean valid = redisTemplate.hasKey("name");
        System.out.println(valid);
    }



}
