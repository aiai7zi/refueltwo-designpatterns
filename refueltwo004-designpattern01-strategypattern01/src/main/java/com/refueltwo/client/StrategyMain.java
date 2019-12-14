package com.refueltwo.client;

import com.refueltwo.context.Context;
import com.refueltwo.strategy.impl.OperationAdd;
import com.refueltwo.strategy.impl.OperationSubstract;

/**
 * @ClassName StrategyMain
 * @See
 * @Author tanji
 * @Date 2019/12/14 12:22
 * @Version V1.0
 **/

public class StrategyMain {
    public static void main(String[] args) {
      /*  Context context=new Context(new OperationAdd());
        System.out.println("1+2="+context.executeStrategy(1, 2));
        //更改策略
       context= new Context(new OperationSubstract());
        System.out.println("1-2="+context.executeStrategy(1, 2));*/
        Context context = new Context();
        context.setStrategy(new OperationAdd());
        System.out.println("1+2=" + context.executeStrategy(1, 2));
        context.setStrategy(new OperationSubstract());
        System.out.println("1-2=" + context.executeStrategy(1, 2));

    }
}
