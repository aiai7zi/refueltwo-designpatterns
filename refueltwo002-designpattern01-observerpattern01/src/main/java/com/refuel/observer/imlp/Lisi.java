package com.refuel.observer.imlp;

import com.refuel.observer.Observer;

/**
 * @ClassName Lisi
 * @See
 * @Author tanji
 * @Date 2019/12/13 16:43
 * @Version V1.0
 **/

public class Lisi implements Observer {
    @Override
    public void update(String message) {
        System.out.println("李四收到消息："+message);
    }
}
