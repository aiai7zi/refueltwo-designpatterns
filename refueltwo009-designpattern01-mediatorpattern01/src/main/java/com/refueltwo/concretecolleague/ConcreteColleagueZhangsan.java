package com.refueltwo.concretecolleague;

import com.refueltwo.abstractcolleague.Colleague;

/**
 * @ClassName ConcreteColleagueZhangsan
 * @See
 * @Author tanji
 * @Date 2019/12/18 0:05
 * @Version V1.0
 **/

public class ConcreteColleagueZhangsan extends Colleague {
    @Override
    public void receive() {
        System.out.println("张三接受请求");
    }

    @Override
    public void send() {
        System.out.println("张三发送请求");
        mediator.relay(this);
    }
}
