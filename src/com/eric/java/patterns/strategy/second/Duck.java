package com.eric.java.patterns.strategy.second;

/**
 * Duck: 鸭子游戏
 *
 * @author: MrServer
 * @since: 2018/1/5 下午1:20
 */
public abstract class Duck {

    IFlyBehavior flyBehavior;
    IQuackBehavior IQuackBehavior;

    public Duck() {
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        IQuackBehavior.quack();
    }

    /**
     * 鸭子的种类
     * 1、红头鸭子
     * 2. 绿头鸭子
     * 3、北京烤鸭  白头鸭子  (不会飞)
     */
    public abstract void display();

}