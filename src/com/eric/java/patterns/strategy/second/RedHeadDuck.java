package com.eric.java.patterns.strategy.second;

import com.eric.java.patterns.strategy.second.impl.BadFlyBehavior;
import com.eric.java.patterns.strategy.second.impl.GaGaQuackBehaviorImpl;

/**
 * RedHeadDuck: 红色头鸭子
 *
 * @author: MrServer
 * @since: 2018/1/5 下午12:52
 */
public class RedHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am red head");
    }

    public RedHeadDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GaGaQuackBehaviorImpl();
    }


}