package com.lmk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author LiuMengKe
 * @create 2018-06-30-15:00
 */
@Component
public class Hero {

    Weapon weapon;

    @Autowired
    public Hero(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
