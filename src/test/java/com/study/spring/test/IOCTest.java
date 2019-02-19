package com.study.spring.test;

import com.study.spring.bean.Person;
import com.study.spring.config.MainConfig;
import com.study.spring.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;
import java.util.Map;

/**
 * @author feiyang.d
 * @date 2019/1/11
 */
public class IOCTest {

    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void testImport(){
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(s -> System.out.println(s));
    }

    @Test
    public void test03(){
        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        // 获取环境变量
        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
        Arrays.asList(beanNamesForType).forEach(s-> System.out.println(s));
        Map<String, Person> beansOfType = annotationConfigApplicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }

    @Test
    public void test01(){
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(s -> System.out.println(s));
        // 默认都是单实例
        Object person = annotationConfigApplicationContext.getBean("person");
        Object person2 = annotationConfigApplicationContext.getBean("person");
        System.out.println(person == person2);
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(s -> System.out.println(s));
    }
}
