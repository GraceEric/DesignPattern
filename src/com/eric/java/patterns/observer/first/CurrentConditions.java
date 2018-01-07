package com.eric.java.patterns.observer.first;

/**
 * CurrentConditions: 公告板
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:50
 */
public class CurrentConditions {

    private float temperature;

    private float pressure;

    private float humidity;


    public void update(float temperature,float pressure,float humidity){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }


    public void display(){
        System.out.println("temperature:"+temperature);
        System.out.println("pressure:"+pressure);
        System.out.println("humidity:"+humidity);
    }


}