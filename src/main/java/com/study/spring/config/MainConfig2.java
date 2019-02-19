package com.study.spring.config;

import com.study.spring.bean.Color;
import com.study.spring.bean.Person;
import com.study.spring.filter.MyTypeFilter;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author feiyang.d
 * @date 2019/1/11
 */
@Configuration // 这是一个配置类
// 指定要扫描的包,根据规则过滤不注入的类型
@Import(Color.class)
public class MainConfig2 {

    // 给容器中注册bean,类型就是返回值的类型,id默认为方法名
    @Bean
    public Person person() {
        return new Person("帅哥", 20);
    }
}
