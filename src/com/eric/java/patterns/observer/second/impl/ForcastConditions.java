package com.eric.java.patterns.observer.second.impl;

import com.eric.java.patterns.observer.second.Observer;

/**
 * ForcastConditions: 公告板
 *
 * @author: MrServer
 * @since: 2018/1/5 下午2:23
 */
public class ForcastConditions implements Observer {

    private float temperature;

    private float pressure;

    private float humidity;

    @Override
    public void updatea(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }


    public void display(){
        System.out.println("f_temperature:"+temperature);
        System.out.println("f_pressure:"+pressure);
        System.out.println("f_humidity:"+humidity);
    }

}