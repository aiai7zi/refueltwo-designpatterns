package com.refueltwo.concretecolleague;

import com.refueltwo.abstractcolleague.Colleague;

/**
 * @ClassName ConcreteColleagueZhangsan
 * @See
 * @Author tanji
 * @Date 2019/12/18 0:05
 * @Version V1.0
 **/

public class ConcreteColleagueLisi extends Colleague {
    @Override
    public void receive() {
        System.out.println("李四接受请求");
    }

    @Override
    public void send() {
        System.out.println("李四发送请求");
        mediator.relay(this); //请中介者发
    }
}
