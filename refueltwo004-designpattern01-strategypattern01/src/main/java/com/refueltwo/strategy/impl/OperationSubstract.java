package com.refueltwo.strategy.impl;

import com.refueltwo.strategy.Strategy;

/**
 * @ClassName OperationAdd
 * @See
 * @Author tanji
 * @Date 2019/12/14 12:12
 * @Version V1.0
 **/

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
