package com.refueltwo.client;

import com.refueltwo.factory.Factory;
import com.refueltwo.operating.Operation;

/**
 * @ClassName FactoryMethodMain
 * @See
 * @Author tanji
 * @Date 2019/12/10 22:22
 * @Version V1.0
 **/

public class FactoryMethodMain {
    public static void main(String[] args) throws Exception {
        Factory addFactory = (Factory)Class.forName("com.refueltwo.factory.impl.AddFactory").newInstance();
        Factory subFactory = (Factory)Class.forName("com.refueltwo.factory.impl.SubFactory").newInstance();
        Factory mulFactory = (Factory)Class.forName("com.refueltwo.factory.impl.MulFactory").newInstance();
        Factory divFactory = (Factory)Class.forName("com.refueltwo.factory.impl.DivFactory").newInstance();
        Operation addoperation = addFactory.createOperation();
        Operation suboperation = subFactory.createOperation();
        Operation muloperation = mulFactory.createOperation();
        Operation divoperation = divFactory.createOperation();
        System.out.println(addoperation.getResult(1, 1));
        System.out.println(suboperation.getResult(1, 1));
        System.out.println(muloperation.getResult(1, 1));
        System.out.println(divoperation.getResult(1, 1));

    }
}
