package com.study.spring.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author feiyang.d
 * @date 2019/1/11
 */
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 能获取到ioc当前的bean工厂
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // 能获取到类加载器
        ClassLoader classLoader = context.getClassLoader();
        // 能获取到当前运行环境
        Environment environment = context.getEnvironment();
        // 能获取到bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        String property = environment.getProperty("os.name");
        if(property.contains("linux")){
            return true;
        }
        return false;
    }
}
