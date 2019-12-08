package com.refueltwo.product.impl;

import com.refueltwo.product.Operation;

/**
 * @ClassName Div
 * @See
 * @Author tanji
 * @Date 2019/12/9 2:31
 * @Version V1.0
 **/

public class Div implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        if(numberB==0){
            throw new Exception("除数不能为0");
        }
        return numberA/numberB;
    }
}
