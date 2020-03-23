package com.myspring.test;

import org.junit.Test;
import org.myspring.config.MainConfig;
import org.myspring.config.MainConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(MainConfig2.class);
    @Test
    public void test01() {
        printBeans();
    }

    public void printBeans() {
        String[] names = applicationContext.getBeanDefinitionNames();
//        Object person = applicationContext.getBean("person");
//        System.out.println(person == person2);
        System.out.println("容器启动完毕");
        for (String name : names) {
            System.out.println(name);
        }
        // 工厂Bean获取的是调用getObject创建的对象 id前加&获取到工厂Bean本身。
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        Object colorFactoryBean2 = applicationContext.getBean("colorFactoryBean");
        System.out.println(colorFactoryBean == colorFactoryBean2);
        System.out.println(colorFactoryBean.getClass());
    }
}
