package com.refueltwo.factory.impl;

import com.refueltwo.factory.Factory;
import com.refueltwo.operating.Operation;
import com.refueltwo.operating.impl.Sub;


/**
 * @ClassName AddFactory
 * @See
 * @Author tanji
 * @Date 2019/12/10 22:15
 * @Version V1.0
 **/

public class SubFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("减法");
        return new Sub();
    }
}
