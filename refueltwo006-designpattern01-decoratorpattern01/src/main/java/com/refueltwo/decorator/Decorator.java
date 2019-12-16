package com.refueltwo.decorator;

import com.refueltwo.component.Component;

/**
 * @ClassName Decorator
 * @See
 * @Author tanji
 * @Date 2019/12/16 21:59
 * @Version V1.0
 **/

public abstract class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation(){
        component.operation();
    }
}
