package com.refueltwo.client;

import com.refueltwo.abstraction.Abstraction;
import com.refueltwo.concreteimplementor.ConcreteImplementorDongFeng;
import com.refueltwo.concreteimplementor.ConcreteImplementorWuling;
import com.refueltwo.implementor.Implementor;
import com.refueltwo.refinedabstraction.RefinedAbstraction;

/**
 * @ClassName BridgePatternMain
 * @See
 * @Author tanji
 * @Date 2019/12/21 1:33
 * @Version V1.0
 **/

public class BridgePatternMain {
    public static void main(String[] args) {
        //制作引擎（engine）<安恩 几>
        Implementor dongfeng=new ConcreteImplementorDongFeng();
        Implementor wuling=new ConcreteImplementorWuling();

        Abstraction car=new RefinedAbstraction(dongfeng);
        car.operation();

        System.out.println("=========================");
        Abstraction carwuling=new RefinedAbstraction(wuling);
        carwuling.operation();
    }
}
