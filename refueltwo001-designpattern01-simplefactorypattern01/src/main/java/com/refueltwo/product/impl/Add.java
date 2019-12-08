package com.refueltwo.product.impl;

import com.refueltwo.product.Operation;

/**
 * @ClassName Add
 * @See 加法
 * @Author tanji
 * @Date 2019/12/9 2:28
 * @Version V1.0
 **/

public class Add implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA+numberB;
    }
}
