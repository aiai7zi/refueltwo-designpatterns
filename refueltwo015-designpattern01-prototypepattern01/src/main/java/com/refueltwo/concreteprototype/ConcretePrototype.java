package com.refueltwo.concreteprototype;

import com.refueltwo.prototype.Prototype;

/**
 * @ClassName ConcretePrototype
 * @See
 * @Author tanji
 * @Date 2019/12/21 2:10
 * @Version V1.0
 **/

public class ConcretePrototype implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
            return prototype;
        } catch (CloneNotSupportedException e) {
            System.out.println("创建原型失败");
            e.printStackTrace();
            throw new  RuntimeException("创建原型失败");
        }

    }
}
