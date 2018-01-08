package com.eric.java.patterns.singleton.third;


/**
 * ChocolateFactory: 巧克力工厂  单例模式
 *
 * @author: MrServer
 * @since: 2018/1/8 上午10:05
 */
public class ChocolateFactoryCheck {

    private boolean empty;

    private boolean boiled;

    private volatile static ChocolateFactoryCheck uniqeInstance = null;

    private ChocolateFactoryCheck() {
        this.empty = true;
        this.boiled = false;
    }


    public static synchronized ChocolateFactoryCheck getInstance() {
        if(uniqeInstance == null) {
            synchronized (ChocolateFactoryCheck.class){
                if(uniqeInstance == null) {
                    uniqeInstance = new ChocolateFactoryCheck();
                }
            }
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