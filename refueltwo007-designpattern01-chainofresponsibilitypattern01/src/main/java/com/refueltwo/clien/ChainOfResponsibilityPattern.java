package com.refueltwo.clien;

import com.refueltwo.abshandler.Handler;
import com.refueltwo.concretehandler.ConcreteHandlerEat;
import com.refueltwo.concretehandler.ConcreteHandlerGetup;

/**
 * @ClassName ChainOfResponsibilityPattern
 * @See
 * @Author tanji
 * @Date 2019/12/17 11:53
 * @Version V1.0
 **/

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        Handler getup=new ConcreteHandlerGetup();
        Handler eat=new ConcreteHandlerEat();
        getup.setNext(eat);
        //提交请求
        getup.handlerRequest("eat");
    }
}
