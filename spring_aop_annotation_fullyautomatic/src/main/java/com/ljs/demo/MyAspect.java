package com.ljs.demo;

import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Around(value = "execution(* com.ljs.demo.*.*(..))")
    public Object around(ProceedingJoinPoint p) throws Throwable {

        System.out.println("执行方法前");

        for (Object arg : p.getArgs()) {
            System.out.println("参数：" + arg);
        }

        Object proceed = p.proceed(); //推进执行方法

        System.out.println("方法返回数据-> "+proceed.toString());

        System.out.println("执行方法后");

        return proceed;
    }

}
