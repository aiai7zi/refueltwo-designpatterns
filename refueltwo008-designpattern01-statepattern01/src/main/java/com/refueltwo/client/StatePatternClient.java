package com.refueltwo.client;

import com.refueltwo.context.Context;

/**
 * @ClassName StatePatternClient
 * @See
 * @Author tanji
 * @Date 2019/12/17 20:57
 * @Version V1.0
 **/

public class StatePatternClient {
    public static void main(String[] args) {
        Context context=new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();

    }
}
