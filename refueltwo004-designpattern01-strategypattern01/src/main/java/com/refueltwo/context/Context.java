package com.refueltwo.context;

import com.refueltwo.strategy.Strategy;

/**
 * @ClassName Context
 * @See
 * @Author tanji
 * @Date 2019/12/14 12:18
 * @Version V1.0
 **/

public class Context {
    private Strategy strategy;
/*    public Context(Strategy strategy){
        this.strategy=strategy;
    }*/

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
       return strategy.doOperation(num1, num2);
   }
}
