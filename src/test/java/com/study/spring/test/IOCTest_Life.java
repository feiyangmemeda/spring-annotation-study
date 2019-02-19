package com.study.spring.test;

import com.study.spring.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author feiyang.d
 * @date 2019/1/14
 */
public class IOCTest_Life {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("【spring容器启动完成】");
        annotationConfigApplicationContext.close();
    }
}
