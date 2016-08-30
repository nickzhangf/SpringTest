package com.zf.bean;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by feng zhang on 2016/8/30.
 */
@Aspect
public class Audience {
    @Pointcut("execution(* com.zf.bean.Person.run(..))")
    public void performence()
    {

    }

    @Before("performence()")
    public void beginRun()
    {
        System.out.println("Begin run!");
    }

    @AfterReturning("performence()")
    public void stopRun()
    {
        System.out.println("Stop run!");
    }
}
