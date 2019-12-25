package com.refueltwo.facade;

import com.refueltwo.subsystem.Subsystem1;
import com.refueltwo.subsystem.Subsystem2;

/**
 * @ClassName Facade
 * @See
 * @Author tanji
 * @Date 2019/12/25 17:00
 * @Version V1.0
 **/

public class Facade {
    private Subsystem1 subsystem1=new Subsystem1();
    private Subsystem2 subsystem2=new Subsystem2();
    public void method(){
        subsystem1.method();
        subsystem2.method();
    }
}
