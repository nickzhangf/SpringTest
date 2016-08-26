package com.zf.start;

import com.zf.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
        Person p = (Person) context.getBean("person");
        p.run();
    }
}
