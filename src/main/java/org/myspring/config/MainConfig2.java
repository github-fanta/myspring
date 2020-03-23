package org.myspring.config;

import org.myspring.bean.ColorFactoryBean;
import org.myspring.bean.MyBeanPostProcessor;
import org.myspring.bean.Person;
import org.myspring.bean.Red;
import org.myspring.conditional.LinuxCondition;
import org.myspring.conditional.MyImportBeanDefinitioinRegistrar;
import org.myspring.conditional.MyImportSelector;
import org.myspring.conditional.WindowsCondition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.*;

@Conditional(WindowsCondition.class)
@Configuration
@Import({Red.class, MyImportSelector.class, MyImportBeanDefinitioinRegistrar.class, MyBeanPostProcessor.class})
// @Import 要导入到容器中的组件; 容器中就会自动注册这个组件
// @ImportSelector 返回需要导入的组件的全类名数组 SpringBoot 中用的比较多
// @ImportBeanDefinitionRegistrar 手动注册Bean到容器中
public class MainConfig2 {
//    @Scope("prototype")
    /*
      容器启动时不创建对象，第一次使用时再创建,并初始化
     */
//    @Lazy
    @Bean("person")
    public Person person02 () {
        System.out.println("Scope默认。。。。产生Bean了");
        return new Person("张三", 25);
    }

//    @Conditional(WindowsCondition.class)
    @Bean("Bill")
    public Person person3 () {
        return new Person("Bill Gates", 40);
    }

//    @Conditional(LinuxCondition.class)
    @Bean("linus")
    public Person person4 () {
        return new Person("linus", 48);
    }

    // 使用Spring提供的FactoryBean(工厂Bean) 最终注入的还是工厂Bean修饰的原来的Color(getObject创建的对象)
    // 使用别的框架和spring进行融合的时候多用到这个FactoryBean
    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }

}
