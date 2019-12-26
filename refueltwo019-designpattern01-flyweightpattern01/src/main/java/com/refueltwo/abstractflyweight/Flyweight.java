package com.refueltwo.abstractflyweight;

import com.refueltwo.unsharableflyweight.UnsharedConcreteFlyweight;

/**
 * @ClassName Flyweight
 * @See
 * @Author tanji
 * @Date 2019/12/26 16:46
 * @Version V1.0
 **/

public interface Flyweight {
    void operation(UnsharedConcreteFlyweight unflyweight);
}
