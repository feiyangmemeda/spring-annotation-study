package com.study.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author feiyang.d
 * @date 2019/1/14
 * 工厂bean
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    // 返回color对象
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    // true 是单例 false为多例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
