package com.refueltwo.terminalexpression;

import com.refueltwo.abstractexpression.AbstractExpression;

/**
 * @ClassName TerminalExpression
 * @See
 * @Author tanji
 * @Date 2019/12/19 19:20
 * @Version V1.0
 **/

public class TerminalExpression<T> implements AbstractExpression<T>  {
    @Override
    public T interpret(int info) {
        //解析成字符串
        String string = Integer.toHexString(info);
        return (T) string;
    }
}
