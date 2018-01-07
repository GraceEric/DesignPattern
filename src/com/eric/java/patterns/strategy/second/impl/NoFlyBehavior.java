package com.eric.java.patterns.strategy.second.impl;

import com.eric.java.patterns.strategy.second.FlyBehavior;

/**
 * NoFlyBehavior: 不会飞
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:16
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("-- 不会飞 --");
    }
}