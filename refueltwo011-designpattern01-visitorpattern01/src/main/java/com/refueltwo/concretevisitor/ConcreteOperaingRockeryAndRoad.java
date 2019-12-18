package com.refueltwo.concretevisitor;

import com.refueltwo.abstractvisitor.VisitorAdapter;
import com.refueltwo.concreteelement.ConcreteElementRoad;
import com.refueltwo.concreteelement.ConcreteElementRockery;
import com.refueltwo.concreteelement.ConcreteElementRockeryAndRoad;

/**
 * @ClassName ConcreteOperaingRoad
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:27
 * @Version V1.0
 **/

public class ConcreteOperaingRockeryAndRoad extends VisitorAdapter {

    @Override
    public void visit(ConcreteElementRockeryAndRoad rockeryAndRoad) {
        super.visit(rockeryAndRoad);
        System.out.println(rockeryAndRoad.operationRockery());

    }
}
