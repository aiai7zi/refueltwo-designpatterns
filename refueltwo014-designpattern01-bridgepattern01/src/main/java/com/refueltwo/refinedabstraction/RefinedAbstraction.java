package com.refueltwo.refinedabstraction;

import com.refueltwo.abstraction.Abstraction;
import com.refueltwo.implementor.Implementor;

/**
 * @ClassName RefinedAbstraction
 * @See  引擎类(engine)<安恩几></>
 * @Author tanji
 * @Date 2019/12/21 1:24
 * @Version V1.0
 **/

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    @Override
    public void operation() {
        System.out.println("五菱宏光");
        this.getImpl().oerationImpl();
    }
}
