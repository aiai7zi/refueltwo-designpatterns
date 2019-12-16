package com.refueltwo.client;

import com.refueltwo.component.Component;
import com.refueltwo.concretecomponent.ConcreteComponent;
import com.refueltwo.concretedecorator.ConcreteDecorator;

/**
 * @ClassName DecoratorMain
 * @See
 * @Author tanji
 * @Date 2019/12/16 22:10
 * @Version V1.0
 **/

public class DecoratorMain {
    public static void main(String[] args) {
        Component com=new ConcreteComponent();
        com.operation();
        System.out.println("--------------------");
        Component decorator = new ConcreteDecorator(com);
        decorator.operation();


    }
}
