package com.refueltwo.concretemediator;

import com.refueltwo.abstractcolleague.Colleague;
import com.refueltwo.abstractmediator.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteMediator
 * @See
 * @Author tanji
 * @Date 2019/12/18 0:11
 * @Version V1.0
 **/

public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues=new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague colleague : colleagues) {
            //排除自己
            if(!colleague.equals(cl)){
                colleague.receive();
            }
        }
    }
}
