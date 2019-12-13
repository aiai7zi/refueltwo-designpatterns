package com.refuel.observer.imlp;

import com.refuel.observer.Observer;

/**
 * @ClassName Guanyu
 * @See
 * @Author tanji
 * @Date 2019/12/13 16:44
 * @Version V1.0
 **/

public class Guanyu implements Observer {
    @Override
    public void update(String message) {

        System.out.println("关羽收到消息："+message);
    }
}
