package com.eric.java.patterns.observer.second.impl;


import com.eric.java.patterns.observer.second.Observer;
import com.eric.java.patterns.observer.second.Subject;

import java.util.ArrayList;

/**
 * WeatherData: 气象站提供的数据
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:51
 */
public class WeatherData implements Subject{

    private float temperatrue;

    private float pressure;

    private float humidity;

    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperatrue = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        dataChange();
    }


    public void dataChange(){
        notifyObServer();
    }



    public float getTemperatrue() {
        return temperatrue;
    }



    public float getPressure() {
        return pressure;
    }



    public float getHumidity() {
        return humidity;
    }


    @Override
    public void registObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObServer(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObServer() {
        for (int i = 0, len = observers.size(); i<len; i++ ) {
            observers.get(i).updatea(getTemperatrue(),getPressure(),getHumidity());
        }
    }
}