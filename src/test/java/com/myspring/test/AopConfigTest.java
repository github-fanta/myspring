package com.myspring.test;

import org.junit.Test;
import org.myspring.aop.AopConfig;
import org.myspring.aop.OriginalClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopConfigTest {

    @Test
    public void aopTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        OriginalClass originalClass = (OriginalClass)context.getBean("originalClass");
        double result = originalClass.method(10, 5);
        return;
    }
}
