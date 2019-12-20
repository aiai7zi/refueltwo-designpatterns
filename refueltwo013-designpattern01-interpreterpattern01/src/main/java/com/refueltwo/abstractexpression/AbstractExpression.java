package com.refueltwo.abstractexpression;

/**
 * @ClassName AbstractExpression
 * @See
 * @Author tanji
 * @Date 2019/12/19 19:18
 * @Version V1.0
 **/

public interface AbstractExpression<T> {
   T interpret(int info);

}
