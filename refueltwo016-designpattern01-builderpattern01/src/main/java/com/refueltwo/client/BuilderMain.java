package com.refueltwo.client;

import com.refueltwo.abstractbuilder.AbstractBuilder;
import com.refueltwo.concretebuilder.ConcreteBuilder;
import com.refueltwo.director.Director;
import com.refueltwo.product.Product;

/**
 * @ClassName BuilderMain
 * @See
 * @Author tanji
 * @Date 2019/12/24 16:55
 * @Version V1.0
 **/

public class BuilderMain {
    public static void main(String[] args) {
        //建造者
        AbstractBuilder builder=new ConcreteBuilder();
        //指挥者
        Director director=new Director(builder);
        Product construct = director.construct();
        construct.show();
    }
}
