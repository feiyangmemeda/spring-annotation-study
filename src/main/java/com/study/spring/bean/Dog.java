package com.study.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author feiyang.d
 * @date 2019/1/14
 */
@Component
public class Dog {

    public Dog() {
        System.out.println("dog constructor.....");
    }

    @PostConstruct
    public void init(){
        System.out.println("dog init.....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("dog destroy.....");
    }
}
