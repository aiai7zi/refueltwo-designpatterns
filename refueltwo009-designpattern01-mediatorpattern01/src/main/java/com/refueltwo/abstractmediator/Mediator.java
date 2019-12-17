package com.refueltwo.abstractmediator;

import com.refueltwo.abstractcolleague.Colleague;

/**
 * @ClassName Mediator
 * @See
 * @Author tanji
 * @Date 2019/12/17 23:50
 * @Version V1.0
 **/

public abstract class Mediator {
   public   abstract  void register(Colleague colleague);
   public  abstract void relay(Colleague cl);//需要传播的信息
}
