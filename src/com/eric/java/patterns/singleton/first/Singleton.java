package com.eric.java.patterns.singleton.first;

/**
 * Singleton: 单例类
 *
 * @author: MrServer
 * @since: 2018/1/8 上午10:01
 */
public class Singleton {

    private static Singleton uniqeInstance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(uniqeInstance == null) {
            uniqeInstance = new Singleton();
        }
        return uniqeInstance;
    }


}