package com.eric.java.patterns.singleton.third;


/**
 * ChocolateFactory: 巧克力工厂  单例模式
 *
 * @author: MrServer
 * @since: 2018/1/8 上午10:05
 */
public class ChocolateFactory {

    private boolean empty;

    private boolean boiled;

    private static ChocolateFactory uniqeInstance = null;

    private ChocolateFactory() {
        this.empty = true;
        this.boiled = false;
    }


    public static synchronized ChocolateFactory getInstance() {
        if(uniqeInstance == null) {
            uniqeInstance = new ChocolateFactory();
        }
        return uniqeInstance;
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