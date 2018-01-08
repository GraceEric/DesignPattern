package com.eric.java.patterns.strategy.second.impl;

import com.eric.java.patterns.strategy.second.IFlyBehavior;

/**
 * NoIFlyBehavior: 不会飞
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:16
 */
public class NoIFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("-- 不会飞 --");
    }
}