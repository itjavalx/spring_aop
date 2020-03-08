package com.ljs.demo;

public class JannyEat implements Eat {
    @Override
    public void eat(String output) {
        System.out.println("Janny eat " + output);
    }

    @Override
    public String eat_l(String output) {
        return "返回值:" + output;
    }
}
