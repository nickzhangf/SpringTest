package com.zf.bean;

/**
 * Created by Administrator on 2016/8/25.
 */
public class Car {
    private String band = "Hongqi";

    public Car(String band) {
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public String toString() {
        return "Car{" +
                "band='" + band + '\'' +
                '}';
    }
}
