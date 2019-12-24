package com.refueltwo.director;

import com.refueltwo.abstractbuilder.AbstractBuilder;
import com.refueltwo.product.Product;

/**
 * @ClassName Director
 * @See
 * @Author tanji
 * @Date 2019/12/24 16:49
 * @Version V1.0
 **/

public class Director {
    private AbstractBuilder builber;

    public Director(AbstractBuilder builber) {
        this.builber = builber;
    }

    public Product construct(){
        builber.buildPartA();
        builber.buildPartB();
        builber.buildPartC();
        return  builber.getResult();
    }
}
