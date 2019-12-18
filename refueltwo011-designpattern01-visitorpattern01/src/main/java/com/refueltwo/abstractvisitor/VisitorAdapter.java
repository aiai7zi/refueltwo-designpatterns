package com.refueltwo.abstractvisitor;

import com.refueltwo.concreteelement.ConcreteElementBridge;
import com.refueltwo.concreteelement.ConcreteElementRoad;
import com.refueltwo.concreteelement.ConcreteElementRockery;
import com.refueltwo.concreteelement.ConcreteElementRockeryAndRoad;

/**
 * @ClassName VisitorAdapter
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:29
 * @Version V1.0
 **/

public abstract class VisitorAdapter implements Visitor{
    @Override
    public void visit(ConcreteElementRoad road) {

    }

    @Override
    public void visit(ConcreteElementBridge bridge) {

    }

    @Override
    public void visit(ConcreteElementRockery rockery) {

    }

    @Override
    public void visit(ConcreteElementRockeryAndRoad rockeryAndRoad) {

    }
}
