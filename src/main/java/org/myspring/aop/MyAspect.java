package org.myspring.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

    @Pointcut("execution(public double org.myspring.aop.OriginalClass.method(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void beforeMethod () {
        System.out.println("BeforeMethod =-=======");
    }

    @After("pointCut()")
    public void afterMethod() {
        System.out.println("BeforeMethod =-=======");
    }
}
