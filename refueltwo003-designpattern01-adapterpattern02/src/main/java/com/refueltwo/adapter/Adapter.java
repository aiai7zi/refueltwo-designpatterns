package com.refueltwo.adapter;

import com.refueltwo.adaptee.Adaptee;
import com.refueltwo.targets.Target;

/**
 * @ClassName Adapter
 * @See
 * @Author tanji
 * @Date 2019/12/13 23:00
 * @Version V1.0
 **/

public class Adapter implements Target {
    private Adaptee adaptee;
    {
        adaptee=new Adaptee();
    }

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
