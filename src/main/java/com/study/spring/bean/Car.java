package com.study.spring.bean;

/**
 * @author feiyang.d
 * @date 2019/1/14
 */
public class Car {
    public Car() {
        System.out.println("car创建.....");
    }

    public void init(){
        System.out.println("car init .....");
    }

    public void destroy(){
        System.out.println("car destroy ....");
    }
}
