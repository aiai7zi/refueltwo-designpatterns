package com.refueltwo.client;

import com.refueltwo.abstractvisitor.Visitor;
import com.refueltwo.concreteelement.ConcreteElementBridge;
import com.refueltwo.concreteelement.ConcreteElementRoad;
import com.refueltwo.concreteelement.ConcreteElementRockery;
import com.refueltwo.concreteelement.ConcreteElementRockeryAndRoad;
import com.refueltwo.concretevisitor.ConcreteOperaingBridge;
import com.refueltwo.concretevisitor.ConcreteOperaingRoad;
import com.refueltwo.concretevisitor.ConcreteOperaingRockery;
import com.refueltwo.concretevisitor.ConcreteOperaingRockeryAndRoad;
import com.refueltwo.objectstructure.ParkStructure;

/**
 * @ClassName VistorMain
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:44
 * @Version V1.0
 **/

public class VistorMain {
    public static void main(String[] args) {
        ParkStructure  park=new ParkStructure();
        park.add(new ConcreteElementRoad());
        park.add(new ConcreteElementRockery());
        park.add(new ConcreteElementBridge());
        park.add(new ConcreteElementRockeryAndRoad());

        //访问者
        Visitor  road=new ConcreteOperaingRoad();
        park.accept(road);
        Visitor  rokery=new ConcreteOperaingRockery();
        park.accept(rokery);
        Visitor  bridge=new ConcreteOperaingBridge();
        park.accept(bridge);
        System.out.println("-----------------------------");
        Visitor  rockeryAndRoad=new ConcreteOperaingRockeryAndRoad();
        park.accept(rockeryAndRoad);

    }
}
