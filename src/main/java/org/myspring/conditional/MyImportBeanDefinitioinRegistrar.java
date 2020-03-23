package org.myspring.conditional;

import org.myspring.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitioinRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * AnnotationMetadata 当前类的注解信息
     * BeanDefinitionRegistry.registerBeanDefinitions 进行手动注册
     * @param annotationMetadata
     * @param beanDefinitionRegistry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean hasRed = beanDefinitionRegistry.containsBeanDefinition("org.myspring.bean.Red");
        boolean hasBlue = beanDefinitionRegistry.containsBeanDefinition("org.myspring.bean.Blue");
        if (hasRed && hasBlue) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            beanDefinitionRegistry.registerBeanDefinition("rainBow", beanDefinition);
        }
    }
}
