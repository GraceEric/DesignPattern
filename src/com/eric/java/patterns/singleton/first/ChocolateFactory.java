package com.eric.java.patterns.singleton.first;

/**
 * ChocolateFactory: 巧克力工厂
 *
 * @author: MrServer
 * @since: 2018/1/8 上午10:05
 */
public class ChocolateFactory {

    private boolean empty;

    private boolean boiled;

    public ChocolateFactory() {
        this.empty = true;
        this.boiled = false;
    }


    public void fill() {
        if(empty) {
            //添加原料制作巧克力
            empty = false;
            boiled = false;
        }
    }


    public void drain() {
        if((!empty) && boiled) {
            //排出巧克力动作
            empty = true;
        }
    }

    public void boil() {
        if((!empty) && (!boiled)) {
            //煮沸
            boiled = true;
        }
    }


}