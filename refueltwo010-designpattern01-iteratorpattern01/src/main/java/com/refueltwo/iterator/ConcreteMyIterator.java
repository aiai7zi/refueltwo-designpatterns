package com.refueltwo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteMyIterator
 * @See
 * @Author tanji
 * @Date 2019/12/18 12:32
 * @Version V1.0
 **/

public class ConcreteMyIterator<T> implements MyIterator<T> {
    private List<T> list;
    private int cursor=-1;

    public ConcreteMyIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T first() {

        return list.get(0);
    }

    @Override
    public T next() {
        T t=null;
        if(this.hasNext()){
            t=list.get(++cursor);
        }
        return t;
    }

    @Override
    public boolean hasNext() {
        if(cursor<list.size()-1){
            return true;
        }else {
            return false;
        }

    }
}
