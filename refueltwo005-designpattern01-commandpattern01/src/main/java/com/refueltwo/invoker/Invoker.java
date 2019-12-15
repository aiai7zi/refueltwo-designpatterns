package com.refueltwo.invoker;

import com.refueltwo.abstractcommand.Command;

/**
 * @ClassName Invoker
 * @See
 * @Author tanji
 * @Date 2019/12/15 13:16
 * @Version V1.0
 **/

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        this.command.execute();
    }
}
