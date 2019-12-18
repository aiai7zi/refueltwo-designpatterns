package com.refueltwo.concretevisitor;

import com.refueltwo.abstractvisitor.VisitorAdapter;
import com.refueltwo.concreteelement.ConcreteElementBridge;
import com.refueltwo.concreteelement.ConcreteElementRoad;

/**
 * @ClassName ConcreteOperaingRoad
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:27
 * @Version V1.0
 **/

public class ConcreteOperaingBridge extends VisitorAdapter {
    @Override
    public void visit(ConcreteElementBridge bridge) {
        super.visit(bridge);
        System.out.println(bridge.operationBridge());
    }
}
