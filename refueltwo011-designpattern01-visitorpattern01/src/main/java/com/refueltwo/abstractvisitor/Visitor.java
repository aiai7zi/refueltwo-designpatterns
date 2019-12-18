package com.refueltwo.abstractvisitor;

import com.refueltwo.concreteelement.ConcreteElementBridge;
import com.refueltwo.concreteelement.ConcreteElementRoad;
import com.refueltwo.concreteelement.ConcreteElementRockery;
import com.refueltwo.concreteelement.ConcreteElementRockeryAndRoad;

/**
 * @ClassName Visitor
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:08
 * @Version V1.0
 **/

public interface Visitor {
    //扫马路
   void visit(ConcreteElementRoad road);
   void visit(ConcreteElementBridge bridge);
   void visit(ConcreteElementRockery rockery);
   void visit(ConcreteElementRockeryAndRoad rockeryAndRoad);
}
