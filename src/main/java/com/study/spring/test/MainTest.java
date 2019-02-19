package com.study.spring.test;

import com.study.spring.bean.Person;
import com.study.spring.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author feiyang.d
 * @date 2019/1/11
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) appContext.getBean("person");
        System.out.println(person);

        String[] classes = appContext.getBeanNamesForType(Person.class);
        List<String> strings = Arrays.asList(classes);
        strings.forEach(s -> System.out.println(s));

    }
}
