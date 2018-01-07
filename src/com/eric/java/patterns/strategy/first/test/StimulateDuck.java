package com.eric.java.patterns.strategy.first.test;

import com.eric.java.patterns.strategy.first.Duck;
import com.eric.java.patterns.strategy.first.GreenHeadDuck;
import com.eric.java.patterns.strategy.first.RedHeadDuck;

/**
 * SecondStimulateDuck: 策略模式测试类
 *
 * @author: MrServer
 * @since: 2018/1/5 下午12:54
 */
public class StimulateDuck {

    public static void main(String args[]){

        Duck greenDuck = new GreenHeadDuck();
        Duck redDuck = new RedHeadDuck();

        greenDuck.display();
        greenDuck.Quck();
        greenDuck.swim();

        System.out.println("-----------");

        redDuck.display();
        redDuck.Quck();
        redDuck.swim();

    }

}