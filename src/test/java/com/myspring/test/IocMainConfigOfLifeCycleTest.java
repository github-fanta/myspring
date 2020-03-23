package com.myspring.test;

import org.junit.Test;
import org.myspring.config.MainConfigOfLifeCycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocMainConfigOfLifeCycleTest {
    @Test
    public void testLifeCycle() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        Object car = applicationContext.getBean("car");
//        Object car2 = applicationContext.getBean("car");
//        System.out.println(car == car2);
        applicationContext.close();
    }
}
