package com.eric.java.patterns.observer.first;

/**
 * WeatherData: 气象站提供的数据
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:51
 */
public class WeatherData {

    private float temperatrue;

    private float pressure;

    private float humidity;

    private CurrentConditions currentConditions;


    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }



    public void dateChange(){
        currentConditions.update(getTemperatrue(),getPressure(),getHumidity());
    }



    public void setData(float temperature,float pressure,float humidity){
        this.temperatrue = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dateChange();
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


}