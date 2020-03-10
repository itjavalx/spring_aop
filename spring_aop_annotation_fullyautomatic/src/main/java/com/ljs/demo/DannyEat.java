package com.ljs.demo;

import org.springframework.stereotype.Component;

@Component
public class DannyEat implements Eat {

    @Override
    public String eat(String output) {
        System.out.println(output);
        return "返回：" + output;
    }
}