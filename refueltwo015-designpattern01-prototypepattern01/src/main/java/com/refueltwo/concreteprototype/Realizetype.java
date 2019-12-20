package com.refueltwo.concreteprototype;


/**
 * @ClassName ConcretePrototype
 * @See
 * @Author tanji
 * @Date 2019/12/21 2:10
 * @Version V1.0
 **/

public class Realizetype implements Cloneable{

    public Realizetype() {
    }

    @Override
    public Realizetype clone() {
        Realizetype prototype = null;
        try {
            prototype = (Realizetype)super.clone();
            System.out.println("创建原型成功");
            return prototype;
        } catch (CloneNotSupportedException e) {
            System.out.println("创建原型失败");
            e.printStackTrace();
            throw new  RuntimeException("创建原型失败");
        }

    }
}
