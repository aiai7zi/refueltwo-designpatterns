package com.refueltwo.objectstructure;

import com.refueltwo.abstractelement.Element;
import com.refueltwo.abstractvisitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ParkStructure
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:38
 * @Version V1.0
 **/

public class ParkStructure {
    private List<Element> list=new ArrayList<>();
    public void accept(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }
    public void remove(Element element){
        list.remove(element);
    }
}
