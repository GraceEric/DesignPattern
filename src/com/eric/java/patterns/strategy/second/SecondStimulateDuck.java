package com.eric.java.patterns.strategy.second;



/**
 * SecondStimulateDuck: 策略模式测试类
 *
 * @author: MrServer
 * @since: 2018/1/5 下午12:54
 */
public class SecondStimulateDuck {

    public static void main(String args[]){

        Duck greenDuck = new GreenHeadDuck();
        Duck redDuck = new RedHeadDuck();

        greenDuck.display();
        greenDuck.quack();
        greenDuck.fly();

        System.out.println("-----------");

        redDuck.display();
        redDuck.quack();
        redDuck.fly();

    }

}