package com.refuel.observerable.impl;

import com.refuel.observer.Observer;
import com.refuel.observerable.Observerable;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SchoolServer
 * @See
 * @Author tanji
 * @Date 2019/12/13 16:52
 * @Version V1.0
 **/

public class SchoolServer implements Observerable {
    private List<Observer> list;
    private String message;

    {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remotoveObserver(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }

    }

    //发送消息
    public void sendInfomation(String message) {
        this.message = message;
        System.out.println("学校发送的消息是:" + message);
        notifyObserver();
    }


}
