package com.refuel.observer.imlp;

import com.refuel.observer.Observer;

/**
 * @ClassName Zhangsan
 * @See
 * @Author tanji
 * @Date 2019/12/13 16:42
 * @Version V1.0
 **/

public class Zhangsan implements Observer {
    @Override
    public void update(String message) {
        System.out.println("张三收到消息"+message);
    }
}
