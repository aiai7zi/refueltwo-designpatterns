package com.refueltwo.context;

import com.refueltwo.abstractexpression.AbstractExpression;
import com.refueltwo.terminalexpression.TerminalExpression;

/**
 * @ClassName Context
 * @See
 * @Author tanji
 * @Date 2019/12/19 19:17
 * @Version V1.0
 **/

public class Context {
    private AbstractExpression<String> exp;

    public Context() {
        exp=new TerminalExpression<>();
    }
    public String operation(int info){
          return exp.interpret(info);
    }
}
