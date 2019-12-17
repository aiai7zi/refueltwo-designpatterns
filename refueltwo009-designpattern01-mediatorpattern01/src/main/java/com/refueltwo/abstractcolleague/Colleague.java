package com.refueltwo.abstractcolleague;

import com.refueltwo.abstractmediator.Mediator;

/**
 * @ClassName Colleague
 * @See
 * @Author tanji
 * @Date 2019/12/17 23:54
 * @Version V1.0
 **/

public abstract class Colleague {
    public Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();
    public abstract void send();
}
