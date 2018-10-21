package com.lmk;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author LiuMengKe
 * @create 2018-06-30-15:05
 */
@Component
@Qualifier("dao")
public class Dao implements Weapon {

    @Override
    public void attack() {
        System.out.println("attack with dao");
    }
}
