package com.refueltwo.client;

import com.refueltwo.concreteprototype.Realizetype;

/**
 * @ClassName PrototypePatternMain
 * @See
 * @Author tanji
 * @Date 2019/12/21 2:18
 * @Version V1.0
 **/

public class PrototypePatternMain {
    public static void main(String[] args) {
        Realizetype  realizetype=new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println("是否相等："+(realizetype==clone));
    }
}
