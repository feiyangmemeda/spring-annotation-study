package com.study.spring.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author feiyang.d
 * @date 2019/1/11
 */
public class WindowsCondition implements Condition {

    /**
     *
     * @param context 判断条件能使用的上下文环境
     * @param metadata 注释信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        if(property.contains("Windows")){
            return true;
        }
        return false;
    }
}
