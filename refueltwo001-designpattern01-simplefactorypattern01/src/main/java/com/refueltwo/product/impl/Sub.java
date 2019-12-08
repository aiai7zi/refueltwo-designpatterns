package com.refueltwo.product.impl;

import com.refueltwo.product.Operation;

/**
 * @ClassName Sub
 * @See
 * @Author tanji
 * @Date 2019/12/9 2:29
 * @Version V1.0
 **/

public class Sub implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA-numberB;
    }
}
