package com.refueltwo.abstractclass;

/**
 * @ClassName AbstractClass
 * @See
 * @Author tanji
 * @Date 2019/12/25 16:34
 * @Version V1.0
 **/

public abstract class AbstractClass {
    public abstract void abstractMethodOne();
    public abstract void abstractMethodTwo();
    //模板方法
    public void templateMethod(){
           specificMethod();
           abstractMethodOne();
           abstractMethodTwo();
    }
    //specific<s配死配色k>:特殊的  //具体方法
    public void specificMethod(){
        System.out.println("抽象类中的具体方法被调用");
    }
}
