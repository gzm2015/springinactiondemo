package com.lmk;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author LiuMengKe
 * @create 2018-06-30-15:08
 */
@Component
@Primary
@Qualifier("gun")
public class Gun implements Weapon {

    @Override
    public void attack() {
        System.out.println("attack with gun");
    }
}
