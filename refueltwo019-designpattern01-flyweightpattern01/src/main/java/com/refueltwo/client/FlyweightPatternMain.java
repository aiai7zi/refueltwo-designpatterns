package com.refueltwo.client;

import com.refueltwo.abstractflyweight.Flyweight;
import com.refueltwo.flyweightfactory.FlyweightFactory;
import com.refueltwo.unsharableflyweight.UnsharedConcreteFlyweight;

/**
 * @ClassName FlyweightPatternMain
 * @See
 * @Author tanji
 * @Date 2019/12/26 17:03
 * @Version V1.0
 **/

public class FlyweightPatternMain {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight a = factory.getFlyweight("a");
        Flyweight b = factory.getFlyweight("b");
        Flyweight c = factory.getFlyweight("c");
        Flyweight d = factory.getFlyweight("d");
        Flyweight a1 = factory.getFlyweight("a");
        a.operation(new UnsharedConcreteFlyweight("第一次调用a"));
        b.operation(new UnsharedConcreteFlyweight("第一次调用b"));
        c.operation(new UnsharedConcreteFlyweight("第一次调用c"));
        d.operation(new UnsharedConcreteFlyweight("第一次调用d"));

        a.operation(new UnsharedConcreteFlyweight("第二次调用a"));
        System.out.println("a是否是同一个对象："+(a==a1));
    }
}
