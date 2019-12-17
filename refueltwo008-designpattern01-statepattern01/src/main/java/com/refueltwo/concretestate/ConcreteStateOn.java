package com.refueltwo.concretestate;

import com.refueltwo.context.Context;
import com.refueltwo.state.State;

/**
 * @ClassName ConcreteStateOn
 * @See 关
 * @Author tanji
 * @Date 2019/12/17 20:50
 * @Version V1.0
 **/

public class ConcreteStateOn extends State {

    @Override
    public void handle(Context context) {
        System.out.println("关");
        context.setState(new ConcreteStateOff());

    }
}
