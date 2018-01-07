package com.eric.java.patterns.observer.first;

/**
 * InternetWeather:
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:54
 */
public class InternetWeather {

    public static void main(String[] args){

        CurrentConditions currentConditions;

        WeatherData weatherData;

        currentConditions = new CurrentConditions();
        weatherData = new WeatherData(currentConditions);

        weatherData.setData(30,150,40);


    }

}