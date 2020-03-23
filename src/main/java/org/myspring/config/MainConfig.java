package org.myspring.config;

import org.myspring.bean.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "org.myspring", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, cla~~e~ = {BookService.cla~~}),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
},
useDefaultFilters = false)
public class MainConfig {
    // 给容器中注册一个Bean 类型为返回值，id默认用方法名
    @Scope("prototype")
    @Bean(value = "person")
    public Person person01() {
        String s = "j" + "hello" + "world" + "a";
        return new Person("lisi", 20);
    }
}
