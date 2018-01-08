package com.eric.java.patterns.decorator.first.coffeebar.coffee;

import com.eric.java.patterns.decorator.first.coffeebar.Drink;

/**
 * Coffee: 中间层
 *
 * @author: MrServer
 * @since: 2018/1/8 上午11:40
 */
public class Coffee extends Drink {

    public float cost() {
        return super.getPrice();
    }
}