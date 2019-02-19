package com.study.spring.config;

import com.study.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author feiyang.d
 * @date 2019/1/14
 */
@Configuration
@PropertySource(value = {"classpath:/person.properties"})
public class MainConfigOfPropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }
}
