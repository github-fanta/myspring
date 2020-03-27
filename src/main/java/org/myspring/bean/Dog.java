package org.myspring.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
// Aware 感知，就是要摸到的意思。如何摸到IoC容器? 实现ApplicationContextAware接口就行了
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Dog() {
        System.out.println("Dog... constructor...");
    }

    // 对象创建并赋值之后调用
    @PostConstruct
    public void init() {
        System.out.println("Dog....@PostConstruct....");
    }

    // 容器移除对象之前
    @PreDestroy
    public void destory() {
        System.out.println("Dog....@PreDestroy....");
    }


    // 这里框架会调用这个方法，把容器伸手传进来，我们用自己的变量接着，这样就“摸到”容器了
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
