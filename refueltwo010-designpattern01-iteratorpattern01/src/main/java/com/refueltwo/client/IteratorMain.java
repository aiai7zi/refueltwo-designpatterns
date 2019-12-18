package com.refueltwo.client;

import com.refueltwo.aggregate.MyAggregate;
import com.refueltwo.aggregate.impl.ConcreteMyAggregate;
import com.refueltwo.iterator.MyIterator;

/**
 * @ClassName IteratorMain
 * @See
 * @Author tanji
 * @Date 2019/12/18 12:45
 * @Version V1.0
 **/

public class IteratorMain {
    public static void main(String[] args) {
        MyAggregate<String> list=new ConcreteMyAggregate<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        MyIterator<String> iterator = list.getIterator();
        String first = iterator.first();
        System.out.println("first:"+first);
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);



        }


    }
}
