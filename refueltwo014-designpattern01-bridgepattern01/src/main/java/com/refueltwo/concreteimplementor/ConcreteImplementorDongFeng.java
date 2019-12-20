package com.refueltwo.concreteimplementor;

import com.refueltwo.implementor.Implementor;

/**
 * @ClassName ConcreteImplementorWuling
 * @See
 * @Author tanji
 * @Date 2019/12/21 1:17
 * @Version V1.0
 **/

public class ConcreteImplementorDongFeng implements Implementor {
    @Override
    public void oerationImpl() {
        System.out.println("安装东方柴油机");
    }
}
