package com.refueltwo.operating.impl;

import com.refueltwo.operating.Operation;

/**
 * @ClassName Add
 * @See
 * @Author tanji
 * @Date 2019/12/10 22:11
 * @Version V1.0
 **/

public class Sub implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA-numberB;
    }
}
