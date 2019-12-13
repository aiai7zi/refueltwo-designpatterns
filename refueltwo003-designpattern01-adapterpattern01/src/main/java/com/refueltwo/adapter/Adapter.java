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

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
