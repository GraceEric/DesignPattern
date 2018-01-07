package com.eric.java.patterns.observer.second;

/**
 * Subject:
 *
 * @author: MrServer
 * @since: 2018/1/5 下午2:20
 */
public interface Subject {

    void registObserver(Observer o);

    void removeObServer(Observer o);

    void notifyObServer();


}
