package com.eric.java.patterns.strategy.second;


import com.eric.java.patterns.strategy.second.impl.GaGaQuackBehaviorImpl;
import com.eric.java.patterns.strategy.second.impl.GoodFlyBehavior;

/**
 * GreenHeadDuck: 绿头鸭子
 *
 * @author: MrServer
 * @since: 2018/1/5 下午12:52
 */
public class GreenHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am green");
    }

    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehaviorImpl();
    }
}