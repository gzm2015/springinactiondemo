package com.lmk;

import java.util.List;
import java.util.Set;

/**
 * @author LiuMengKe
 * @create 2018-07-04-16:29
 * 专用测试set 和 list 的装配
 */
public class SetAndList {

    private List<String > list ;

    private Set<String> set;


    public SetAndList() {
    }

    public SetAndList(List<String> list) {
        this.list = list;
    }

    public SetAndList(Set<String> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
}
