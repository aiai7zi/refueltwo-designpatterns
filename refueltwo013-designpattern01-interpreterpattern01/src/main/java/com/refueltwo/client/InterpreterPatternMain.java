package com.refueltwo.client;

import com.refueltwo.context.Context;

/**
 * @ClassName InterpreterPatternMain
 * @See
 * @Author tanji
 * @Date 2019/12/19 19:49
 * @Version V1.0
 **/

public class InterpreterPatternMain {
    public static void main(String[] args) {
        Context context=new Context();
        String operation = context.operation(5);
        System.out.println(operation);
    }
}
