package com.refueltwo.client;

import com.refueltwo.abstractclass.AbstractClass;
import com.refueltwo.concteleclass.ConcreleClass;

/**
 * @ClassName TemplateMethodMain
 * @See
 * @Author tanji
 * @Date 2019/12/25 16:45
 * @Version V1.0
 **/

public class TemplateMethodMain {
    public static void main(String[] args) {
        AbstractClass  obj=new ConcreleClass();
        obj.templateMethod();
    }
}
