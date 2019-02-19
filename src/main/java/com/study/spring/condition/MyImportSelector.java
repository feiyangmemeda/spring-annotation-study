package com.study.spring.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author feiyang.d
 * @date 2019/1/11
 * 设置需要返回的导入组件
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.study.spring.bean.Blue","com.study.spring.bean.Yellow"};
    }
}
