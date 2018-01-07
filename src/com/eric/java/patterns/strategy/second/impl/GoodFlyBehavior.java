package com.eric.java.patterns.strategy.second.impl;

import com.eric.java.patterns.strategy.second.FlyBehavior;

/**
 * GoodFlyBehavior: 飞的好
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:15
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞的好。。。。。");
    }
}