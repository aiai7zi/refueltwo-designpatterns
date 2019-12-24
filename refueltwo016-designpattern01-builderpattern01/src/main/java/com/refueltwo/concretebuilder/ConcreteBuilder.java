package com.refueltwo.concretebuilder;

import com.refueltwo.abstractbuilder.AbstractBuilder;

/**
 * @ClassName ConcreteBuilder
 * @See
 * @Author tanji
 * @Date 2019/12/24 16:45
 * @Version V1.0
 **/

public class ConcreteBuilder extends AbstractBuilder {
    @Override
    public void buildPartA() {
      this.product.setPartA("具体建造者建造楼梯");
    }

    @Override
    public void buildPartB() {
        this.product.setPartB("具体建造者建造厨房");
    }

    @Override
    public void buildPartC() {
       this.product.setPartC("具体建造者建造过道");
    }
}
