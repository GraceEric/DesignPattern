package com.eric.java.patterns.strategy.first;

/**
 * Duck: 鸭子的超类
 *
 * @author: MrServer
 * @since: 2018/1/5 下午12:45
 */
public abstract class Duck {

    public Duck() {
    }

    /**
     * 鸭子的共性
     *
     *  1、嘎嘎叫声
     *  2、都会游泳
     */
    public void Quck(){
        System.out.println("~~~ ga ga ga~~~");
    }

    public void swim(){
        System.out.println("~~  swimming ~~");
    }

    /**
     * 鸭子的种类
     * 1、红头鸭子
     * 2. 绿头鸭子
     * 3、北京烤鸭  白头鸭子  (不会飞)
     */
    public abstract void display();
}