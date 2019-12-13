package com.refuel.observer.imlp;

import com.refuel.observer.Observer;

/**
 * @ClassName Wangwu
 * @See
 * @Author tanji
 * @Date 2019/12/13 16:43
 * @Version V1.0
 **/

public class Wangwu implements Observer {
    @Override
    public void update(String message) {
        System.out.println("王五收到消息："+message);
    }
}
