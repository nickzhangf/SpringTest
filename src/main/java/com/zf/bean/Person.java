package com.zf.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/8/25.
 */
public class Person {
    private String name = "zf";
    @Autowired
    private Car car;

    public void run()
    {
        System.out.println(name + " drives " +  car);
    }

    public void start()
    {
        System.out.println(">>> start !");
    }

    public void end()
    {
        System.out.println("end ! <<<");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Car getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }
}
