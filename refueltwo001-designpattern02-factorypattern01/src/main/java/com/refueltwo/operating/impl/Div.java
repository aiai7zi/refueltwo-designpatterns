package com.refueltwo.operating.impl;

import com.refueltwo.operating.Operation;

/**
 * @ClassName Add
 * @See
 * @Author tanji
 * @Date 2019/12/10 22:11
 * @Version V1.0
 **/

public class Div implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        if (numberA == 0) {
            throw new Exception("除数不能为零");
        }
        return numberA / numberB;
    }
}
