package com.ljs.demo;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class TimeHandler implements MethodBeforeAdvice, AfterReturningAdvice {
    /**
     * o:调用方法返回值
     * method:被调用方法
     * objects:被调用方法中的参数
     * o1;被代理对象
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("被代理对象调用完方法后的返回值：" + o);
        System.out.println("吃饭后");
    }

    /**
     * method:被代理对象调用的方法
     * objects:被代理对象调用方法时的参数
     * o:被代理对象
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("吃饭前");
    }

}
