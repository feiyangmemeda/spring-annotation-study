package com.study.spring.config;

import com.study.spring.bean.Color;
import com.study.spring.bean.ColorFactoryBean;
import com.study.spring.bean.Person;
import com.study.spring.condition.LinuxCondition;
import com.study.spring.condition.MyImportBeanDefinitionRegistrar;
import com.study.spring.condition.MyImportSelector;
import com.study.spring.condition.WindowsCondition;
import com.study.spring.filter.MyTypeFilter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author feiyang.d
 * @date 2019/1/11
 */
@Configuration // 这是一个配置类
@ComponentScan(value = "com.study",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
        includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class}),
        useDefaultFilters = false) // 指定要扫描的包,根据规则过滤不注入的类型
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig {

    /**
     * Specifies the name of the scope to use for the annotated component/bean.
     * <p>Defaults to an empty string ({@code ""}) which implies
     * {@link ConfigurableBeanFactory#SCOPE_SINGLETON SCOPE_SINGLETON}.
     *
     * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE 多实例
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON 单例
     * @since 4.2
     */
    //@Scope("prototype")
    // 给容器中注册bean,类型就是返回值的类型,id默认为方法名
    @Bean
    public Person person() {
        System.out.println("【person】被spring装载......");
        return new Person("帅哥", 20);
    }

    /**
     * @conditional 按照一定的条件注册bean, 这个注解也可以加载config类的注解上便于全局配置
     * <p>
     * 如果系统是windows 就王尼玛，
     * 如果是linux就杰克马
     */
    @Conditional({WindowsCondition.class})
    @Bean("nima.wang")
    public Person person01() {
        return new Person("王尼玛", 30);
    }

    @Conditional({LinuxCondition.class})
    @Bean("jack.ma")
    public Person person02() {
        return new Person("jack.ma", 50);
    }


    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
