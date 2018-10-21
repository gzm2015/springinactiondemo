package com.lmk;

/**
 * @author LiuMengKe
 * @create 2018-07-01-15:09
 */
public class Computer {

    private String name;

    private String price;

    public Computer() {
    }

    public Computer(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
