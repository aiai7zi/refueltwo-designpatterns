package com.refueltwo.concretecommand;

import com.refueltwo.abstractcommand.Command;
import com.refueltwo.received.Receiver;

/**
 * @ClassName ConcreteCommand
 * @See
 * @Author tanji
 * @Date 2019/12/15 13:09
 * @Version V1.0
 **/

public class ConcreteCommand extends Command {
   private Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
               receiver.action();
    }
}
