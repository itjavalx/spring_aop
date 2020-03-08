package com.ljs.demo;

public class DannyEat implements Eat {
    @Override
    public void eat(String output) {
        System.out.println("Danny eat " + output);
    }

    @Override
    public String eat_l(String output) {
        return "返回值:" + output;
    }
}
