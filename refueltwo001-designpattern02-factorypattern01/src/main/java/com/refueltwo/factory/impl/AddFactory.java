package com.refueltwo.factory.impl;

import com.refueltwo.factory.Factory;
import com.refueltwo.operating.Operation;
import com.refueltwo.operating.impl.Add;

/**
 * @ClassName AddFactory
 * @See
 * @Author tanji
 * @Date 2019/12/10 22:15
 * @Version V1.0
 **/

public class  AddFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("加法");
        return new Add();
    }
}
