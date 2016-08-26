package com.zf.bean;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2016/8/25.
 */
public class PersonAction
{

    public void start()
    {
        System.out.println(">>> start!");
    }

    public void end()
    {
        System.out.println("end! <<<");
    }

    /**
     * 环绕通知方法
     * @param joinPoint
     */
    public void watchPerson(ProceedingJoinPoint joinPoint)
    {
        try {
            System.out.println(">>> >>> Watch person start!");
            joinPoint.proceed();
            System.out.println("Watch person end! <<< <<<");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
