package com.lmk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author LiuMengKe
 * @create 2018-06-30-21:18
 */
@Component
public class SuperHero {

    private Weapon weapon;

    @Autowired
    /*@Qualifier("dao")*/
    @Qualifier("gun")
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
