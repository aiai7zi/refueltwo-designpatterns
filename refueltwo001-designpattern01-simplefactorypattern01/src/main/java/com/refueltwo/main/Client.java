package com.refueltwo.main;

import com.refueltwo.factory.SimpleFactory;
import com.refueltwo.product.Operation;

/**
 * @ClassName Client
 * @See
 * @Author tanji
 * @Date 2019/12/9 2:41
 * @Version V1.0
 **/

public class Client {
    public static void main(String[] args) throws Exception {
        Operation add = SimpleFactory.createOperation("+");
        Operation sub = SimpleFactory.createOperation("-");
        Operation mul = SimpleFactory.createOperation("*");
        Operation div = SimpleFactory.createOperation("/");
        System.out.println(add.getResult(1, 2));
        System.out.println(sub.getResult(1, 2));
        System.out.println(mul.getResult(1, 2));
        System.out.println(div.getResult(1, 2));
    }
}
