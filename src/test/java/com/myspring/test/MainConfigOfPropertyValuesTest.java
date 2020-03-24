package com.myspring.test;

import org.junit.Test;
import org.myspring.bean.Person;
import org.myspring.config.MainConfigOfPropertyValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MainConfigOfPropertyValuesTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
//        Object person = context.getBean("person");
        printBeans(context);
//        Person person = (Person)context.getBean("person");
//        System.out.println(person);
//        // 或者从环境变量中取
        ConfigurableEnvironment env = context.getEnvironment();
        String personEnv = env.getProperty("person.nickName");
        System.out.println(personEnv);
        context.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
