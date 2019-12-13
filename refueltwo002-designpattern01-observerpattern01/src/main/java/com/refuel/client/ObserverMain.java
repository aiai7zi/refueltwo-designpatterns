package com.refuel.client;

import com.refuel.observer.Observer;
import com.refuel.observer.imlp.Guanyu;
import com.refuel.observer.imlp.Lisi;
import com.refuel.observer.imlp.Wangwu;
import com.refuel.observer.imlp.Zhangsan;
import com.refuel.observerable.Observerable;
import com.refuel.observerable.impl.SchoolServer;

/**
 * @ClassName ObserverMain
 * @See
 * @Author tanji
 * @Date 2019/12/13 16:59
 * @Version V1.0
 **/

public class ObserverMain {
    public static void main(String[] args) {
        //被观察者实例
        Observerable observerable=new SchoolServer();

        //观察者实例
        Observer zhangsan=new Zhangsan();
        Observer lisi=new Lisi();
        Observer wangwu=new Wangwu();
        Observer guanyu=new Guanyu();
        //添加观察者
        observerable.registerObserver(zhangsan);
        observerable.registerObserver(lisi);
        observerable.registerObserver(wangwu);
        observerable.registerObserver(guanyu);

        //发送消息
       ((SchoolServer) observerable).sendInfomation("周六继续上课");
        System.out.println("-----------------------------------");
        observerable.remotoveObserver(wangwu);
        ((SchoolServer) observerable).sendInfomation("周六继续上课取消");






    }
}
