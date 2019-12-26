package com.refueltwo.concreteflyweight;

import com.refueltwo.abstractflyweight.Flyweight;
import com.refueltwo.unsharableflyweight.UnsharedConcreteFlyweight;

/**
 * @ClassName ConcreteFlyweightOne
 * @See
 * @Author tanji
 * @Date 2019/12/26 16:50
 * @Version V1.0
 **/

public class ConcreteFlyweightOne implements Flyweight {
    private String key;

    public ConcreteFlyweightOne(String key) {
        this.key = key;
        System.out.println("具体享元"+key+"被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight unflyweight) {
        System.out.print("具体享元"+key+"被调用，");
        System.out.println("非享元信息是:"+unflyweight.getInfo());
    }
}
