package com.refueltwo.factory.impl;

import com.refueltwo.factory.Factory;
import com.refueltwo.operating.Operation;
import com.refueltwo.operating.impl.Mul;
import com.refueltwo.operating.impl.Sub;


/**
 * @ClassName AddFactory
 * @See
 * @Author tanji
 * @Date 2019/12/10 22:15
 * @Version V1.0
 **/

public class MulFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("乘法");
        return new Mul();
    }
}
