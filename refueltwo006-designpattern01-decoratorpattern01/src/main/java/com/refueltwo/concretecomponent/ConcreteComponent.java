package com.refueltwo.concretecomponent;

import com.refueltwo.component.Component;

/**
 * @ClassName ConcreteComponent
 * @See
 * @Author tanji
 * @Date 2019/12/16 22:06
 * @Version V1.0
 **/

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("汽车发动机");
    }
}
