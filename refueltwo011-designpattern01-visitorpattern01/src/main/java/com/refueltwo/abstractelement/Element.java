package com.refueltwo.abstractelement;

import com.refueltwo.abstractvisitor.Visitor;

/**
 * @ClassName Element
 * @See
 * @Author tanji
 * @Date 2019/12/18 23:12
 * @Version V1.0
 **/

public interface Element {
    void accept(Visitor visitor);
}
