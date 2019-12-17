package com.refueltwo.client;

import com.refueltwo.abstractcolleague.Colleague;
import com.refueltwo.abstractmediator.Mediator;
import com.refueltwo.concretecolleague.ConcreteColleagueLisi;
import com.refueltwo.concretecolleague.ConcreteColleagueWangwu;
import com.refueltwo.concretecolleague.ConcreteColleagueZhangsan;
import com.refueltwo.concretemediator.ConcreteMediator;

/**
 * @ClassName MediatorPatternMain
 * @See
 * @Author tanji
 * @Date 2019/12/18 0:18
 * @Version V1.0
 **/

public class MediatorPatternMain {
    public static void main(String[] args) {
        //创建中介者
        Mediator mediator=new ConcreteMediator();
        //创建同事
        Colleague lisi=new ConcreteColleagueLisi();
        Colleague zhangsan=new ConcreteColleagueZhangsan();
        Colleague wangwu=new ConcreteColleagueWangwu();
        //添加
        mediator.register(lisi);
        mediator.register(zhangsan);
        mediator.register(wangwu);

        //李四发送消息
        lisi.send();
        System.out.println("0000000000000000000000000000000000000000");
        zhangsan.send();

    }
}
