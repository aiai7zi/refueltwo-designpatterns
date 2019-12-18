package com.refueltwo.aggregate;

import com.refueltwo.iterator.MyIterator;

/**
 * @ClassName MyAggregate
 * @See
 * @Author tanji
 * @Date 2019/12/18 12:19
 * @Version V1.0
 **/

public interface MyAggregate<T> {
    void add(T t);
    void remove(T t);
    MyIterator<T> getIterator();
}
