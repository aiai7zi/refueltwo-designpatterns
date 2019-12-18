package com.refueltwo.concretevisitor;

import com.refueltwo.abstractvisitor.VisitorAdapter;
import com.refueltwo.concreteelement.ConcreteElementRoad;

/**
 * @ClassName ConcreteOperaingRoad
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:27
 * @Version V1.0
 **/

public class ConcreteOperaingRoad extends VisitorAdapter {

    @Override
    public void visit(ConcreteElementRoad road) {
        System.out.println(road.operationRoad());
    }
}
