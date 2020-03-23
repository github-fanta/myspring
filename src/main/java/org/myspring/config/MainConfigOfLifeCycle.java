package org.myspring.config;

import org.myspring.bean.Car;
import org.myspring.bean.Cat;
import org.myspring.bean.Dog;
import org.myspring.bean.MyBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value = "org.myspring.bean")
public class MainConfigOfLifeCycle {
    /**
     * 构造:
     *     单实例：在容器启动的时候创建对象
     *     多实例：在每次获取的时候创建对象
     * 初始化：
     *     对象创建完成，并赋值好，调用初始化方法...
     * 销毁：
     *     容器关闭的时候 （多实例(prototype)容器不再管理销毁）
     * @return
     */
    // 容器值
//    @Scope("prototype")
    /**
     * 除了在@Bean指明方法外，还可实现类
     * 1)、指定初始化和销毁方法:
     *      通过@Bean指定init-method和destory-method;
     * 2)、通过让Bean实现InitializingBean(定义初始化逻辑)(实现afterPropertiesSet()方法)，DisposableBean(destroy方法)
     * 3)、使用JSR250规定的@PostConstruct
     *     @PostConstruct: 在bean创建完成并且属性赋值完成后，来执行初始化方法。
     *     @PreDestroy: 在容器销毁bean之前通知我们进行清理工作
     * 4)、BeanPostProcessor接口: bean的后置处理器；在bean的初始化前后进行一些处理工作
     *     postProcessBeforeInitialization: 在初始化之 前 进行后置处理工作 (如自定义的init-method,实现InitializingBean(定义初始化逻辑)(实现afterPropertiesSet())
     *     postProcessAfterInitialization:在初始化之 后 进行后置处理工作 (如自定义的init-method,实现InitializingBean(定义初始化逻辑)(实现afterPropertiesSet())
     */
//    @Bean(initMethod = "initMethod", destroyMethod = "destoryMethod")
    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
//    @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

}
