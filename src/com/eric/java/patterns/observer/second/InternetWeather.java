package com.eric.java.patterns.observer.second;

import com.eric.java.patterns.observer.second.impl.CurrentConditions;
import com.eric.java.patterns.observer.second.impl.ForcastConditions;
import com.eric.java.patterns.observer.second.impl.WeatherData;

/**
 * InternetWeather:
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:54
 */
public class InternetWeather {

    public static void main(String[] args){

        CurrentConditions currentConditions;
        ForcastConditions forcastConditions;
        WeatherData weatherData;

        currentConditions = new CurrentConditions();
        forcastConditions = new ForcastConditions();

        weatherData = new WeatherData();

        weatherData.registObserver(currentConditions);
        weatherData.registObserver(forcastConditions);

        weatherData.setData(30,150,40);

        weatherData.removeObServer(currentConditions);

        weatherData.setData(3,15,4);

    }

}