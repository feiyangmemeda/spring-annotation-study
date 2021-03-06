package com.study.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author feiyang.d
 * @date 2019/1/14
 */
@Component
public class Cat implements InitializingBean,DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("cat destroy....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet....");
    }
}
