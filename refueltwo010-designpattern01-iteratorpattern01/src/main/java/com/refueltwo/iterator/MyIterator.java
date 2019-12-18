package com.refueltwo.iterator;

public interface MyIterator<T> {
    T first();
    T next();
    boolean hasNext();
}
