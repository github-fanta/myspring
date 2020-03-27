package org.myspring.config;

import org.myspring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// 使用@PropertySource 读取外部配置文件中的k/v 保存到运行的环境变量中
@PropertySource(value = {"classpath:person.properties"})
@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Person person() {
        return new Person();
    }
}
