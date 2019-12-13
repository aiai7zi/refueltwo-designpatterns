package com.refuel.observerable;

import com.refuel.observer.Observer;

public interface Observerable {
    //添加观察者
    void registerObserver(Observer observer);
    //删除观察者
    void remotoveObserver(Observer observer);
    //通知观察者
    void notifyObserver();

}
