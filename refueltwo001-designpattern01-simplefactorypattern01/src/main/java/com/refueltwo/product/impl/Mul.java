package com.refueltwo.product.impl;

import com.refueltwo.product.Operation;

/**
 * @ClassName Mul
 * @See
 * @Author tanji
 * @Date 2019/12/9 2:30
 * @Version V1.0
 **/

public class Mul implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA*numberB;
    }
}
