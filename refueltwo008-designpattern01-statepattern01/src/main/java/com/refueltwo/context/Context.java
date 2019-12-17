package com.refueltwo.context;

import com.refueltwo.concretestate.ConcreteStateOff;
import com.refueltwo.state.State;

/**
 * @ClassName Context
 * @See
 * @Author tanji
 * @Date 2019/12/17 20:47
 * @Version V1.0
 **/

public class Context {
    private State state;

    public Context() {
        this.state=new ConcreteStateOff();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        state.handle(this);
    }
}
