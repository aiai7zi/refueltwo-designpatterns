package com.refueltwo;

import com.refueltwo.caretaker.Caretaker;
import com.refueltwo.originator.Originator;

/**
 * @ClassName MementoPatternMain
 * @See
 * @Author tanji
 * @Date 2019/12/19 17:37
 * @Version V1.0
 **/

public class MementoPatternMain {
    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.setId("1");
        originator.setName("z");
        originator.setAge("12");
        System.out.println("==============初始值=================");
        System.out.println(originator.toString());

        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(originator.createMemento());

        System.out.println("================修改了=====================");
        originator.setId("3");
        originator.setName("张三");
        originator.setAge("21");
        System.out.println(originator.toString());

        System.out.println("==================恢复了======================");
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.toString());


    }
}
