package com.refueltwo.aggregate.impl;


import com.refueltwo.aggregate.MyAggregate;
import com.refueltwo.iterator.ConcreteMyIterator;
import com.refueltwo.iterator.MyIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteMyAggregate
 * @See
 * @Author tanji
 * @Date 2019/12/18 12:24
 * @Version V1.0
 **/
//具体聚合实现
public class ConcreteMyAggregate<T> implements MyAggregate<T> {
    //可以用数组，用ArrayList这里方便。
    private List<T> list=new ArrayList<>();

    @Override
    public void add(T t) {
          list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public MyIterator<T> getIterator() {
        return new ConcreteMyIterator(list);
    }
}
