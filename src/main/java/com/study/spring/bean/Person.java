package com.study.spring.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author feiyang.d
 * @date 2019/1/11
 */
public class Person {

    @Value("dfy")
    private String name;
    @Value("20")
    private int age;
    @Value("${person.nickName}")
    private String nickName;



    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public Person setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
