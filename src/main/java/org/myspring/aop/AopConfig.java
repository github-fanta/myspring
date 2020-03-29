package org.myspring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AopConfig {

    @Bean
    public OriginalClass originalClass() {
        return new OriginalClass();
    }

    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }
}
