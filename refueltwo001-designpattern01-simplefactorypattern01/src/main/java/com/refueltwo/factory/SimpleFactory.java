package com.refueltwo.factory;

import com.refueltwo.product.Operation;
import com.refueltwo.product.impl.Add;
import com.refueltwo.product.impl.Div;
import com.refueltwo.product.impl.Mul;
import com.refueltwo.product.impl.Sub;

/**
 * @ClassName SimpleFactory
 * @See
 * @Author tanji
 * @Date 2019/12/9 2:34
 * @Version V1.0
 **/

public class SimpleFactory {
    public static Operation createOperation(String operation) {
        Operation operationobj = null;
        switch (operation) {
            case "+":
                operationobj = new Add();
                break;
            case "-":
                operationobj = new Sub();
                break;
            case "*":
                operationobj = new Mul();
                break;
            case "/":
                operationobj = new Div();
                break;
        }
        return operationobj;
    }
}
