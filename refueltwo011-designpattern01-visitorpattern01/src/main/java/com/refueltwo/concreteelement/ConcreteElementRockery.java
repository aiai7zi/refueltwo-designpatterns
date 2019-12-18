package com.refueltwo.concreteelement;

import com.refueltwo.abstractelement.Element;
import com.refueltwo.abstractvisitor.Visitor;

/**
 * @ClassName ConcreteElementRoad
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:16
 * @Version V1.0
 **/

public class ConcreteElementRockery implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationRockery(){
        return "扫公园的假山";
    }
}
