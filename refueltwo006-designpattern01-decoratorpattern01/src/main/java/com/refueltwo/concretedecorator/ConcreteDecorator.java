package com.refueltwo.concretedecorator;

import com.refueltwo.component.Component;
import com.refueltwo.decorator.Decorator;

/**
 * @ClassName ConcreteDecorator
 * @See
 * @Author tanji
 * @Date 2019/12/16 22:07
 * @Version V1.0
 **/

public class ConcreteDecorator extends Decorator {


    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    public void  addFunction(){
        System.out.println("添加汽车装饰");
    }
}
