package com.refueltwo.concretevisitor;

import com.refueltwo.abstractvisitor.VisitorAdapter;
import com.refueltwo.concreteelement.ConcreteElementRoad;
import com.refueltwo.concreteelement.ConcreteElementRockery;

/**
 * @ClassName ConcreteOperaingRoad
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:27
 * @Version V1.0
 **/

public class ConcreteOperaingRockery extends VisitorAdapter {

    @Override
    public void visit(ConcreteElementRockery rockery) {
        super.visit(rockery);
        System.out.println(rockery.operationRockery());
    }
}
