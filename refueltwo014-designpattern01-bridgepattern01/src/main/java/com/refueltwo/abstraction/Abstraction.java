package com.refueltwo.abstraction;

import com.refueltwo.implementor.Implementor;

/**
 * @ClassName Abstraction
 * @See
 * @Author tanji
 * @Date 2019/12/21 1:21
 * @Version V1.0
 **/

public abstract class Abstraction {
    private Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    public Implementor getImpl() {
        return impl;
    }

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    public abstract void operation();
}
