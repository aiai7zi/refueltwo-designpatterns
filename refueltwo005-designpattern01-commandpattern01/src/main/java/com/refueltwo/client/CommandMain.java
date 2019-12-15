package com.refueltwo.client;

import com.refueltwo.concretecommand.ConcreteCommand;
import com.refueltwo.concretecommand.ConcreteCommand1;
import com.refueltwo.invoker.Invoker;
import com.refueltwo.received.Receiver;

/**
 * @ClassName CommandMain
 * @See
 * @Author tanji
 * @Date 2019/12/15 13:20
 * @Version V1.0
 **/

public class CommandMain {

    public static void main(String[] args) {
        //接受人
        Receiver receiver=new Receiver();
        //命令:单击鼠标
        ConcreteCommand cmd=new ConcreteCommand();
        cmd.setReceiver(receiver);

        //命令：单击键盘
        ConcreteCommand1 cmd1=new ConcreteCommand1();
        cmd1.setReceiver(receiver);



        Invoker invoker=new Invoker();
        invoker.setCommand(cmd1);
        invoker.call();
        invoker.setCommand(cmd);
        invoker.call();
    }
}
