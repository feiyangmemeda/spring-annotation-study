package com.study.spring.config;

import com.study.spring.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * bean的生命周期
 *
 * 创建-----初始化-----销毁
 *
 * 我们可以自定义初始化和销毁方法
 * @author feiyang.d
 * @date 2019/1/14
 */
@Configuration
@ComponentScan(value = "com.study.spring.bean")
public class MainConfigOfLifeCycle {

    @Bean(initMethod = "init" ,destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

}
