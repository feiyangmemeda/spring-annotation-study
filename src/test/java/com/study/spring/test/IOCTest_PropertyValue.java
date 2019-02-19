package com.study.spring.test;

import com.study.spring.bean.Person;
import com.study.spring.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author feiyang.d
 * @date 2019/1/11
 */
public class IOCTest_PropertyValue {

    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test01(){
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(s -> System.out.println(s));
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        System.out.println(person);
    }

}
