package com.refueltwo.concteleclass;

import com.refueltwo.abstractclass.AbstractClass;

/**
 * @ClassName ConcreleClass
 * @See
 * @Author tanji
 * @Date 2019/12/25 16:43
 * @Version V1.0
 **/

public class ConcreleClass extends AbstractClass {
    @Override
    public void abstractMethodOne() {
        System.out.println("抽象子类1方法被调用");
    }

    @Override
    public void abstractMethodTwo() {
        System.out.println("抽象子类2方法被调用");
    }
}
