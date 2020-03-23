package org.myspring.conditional;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

public class MyImportSelector implements ImportSelector {
    // 返回值就是要导入到容器的组件的全类名
    // AnotationMetadata当前标注@Import的那个类的所有注解信息
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();
        return new String[]{"org.myspring.bean.Blue"};
    }
}
