package com.eric.java.patterns.strategy.second.impl;

import com.eric.java.patterns.strategy.second.IFlyBehavior;

/**
 * BadIFlyBehavior: 飞行不太好
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:14
 */
public class BadIFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("--飞的不好--");
    }
}