package com.refueltwo.abstractbuilder;

import com.refueltwo.product.Product;

/**
 * @ClassName AbstractBuilber
 * @See
 * @Author tanji
 * @Date 2019/12/24 16:39
 * @Version V1.0
 **/

public abstract class AbstractBuilder {
    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult()
    {
        return product;
    }
}
