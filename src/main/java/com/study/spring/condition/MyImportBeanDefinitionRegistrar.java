package com.study.spring.condition;

import com.study.spring.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author feiyang.d
 * @date 2019/1/14
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @param importingClassMetadata 当前类的信息(例如注解)
     * @param registry 注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean f1 = registry.containsBeanDefinition("com.study.spring.bean.Yellow");
        boolean f2 = registry.containsBeanDefinition("com.study.spring.bean.Blue");
        if(f1 && f2){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
            rootBeanDefinition.setBeanClass(RainBow.class);
            registry.registerBeanDefinition("rainBow",rootBeanDefinition);
        }
    }
}
