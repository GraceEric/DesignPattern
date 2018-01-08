package com.eric.java.patterns.strategy.second.impl;

import com.eric.java.patterns.strategy.second.IQuackBehavior;

/**
 * GaGaQuackBehaviorImpl:
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:18
 */
public class GaGaQuackBehaviorImpl implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("gaga ......");
    }
}