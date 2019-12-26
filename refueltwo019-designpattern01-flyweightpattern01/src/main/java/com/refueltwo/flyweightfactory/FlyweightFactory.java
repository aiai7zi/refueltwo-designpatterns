package com.refueltwo.flyweightfactory;

import com.refueltwo.abstractflyweight.Flyweight;
import com.refueltwo.concreteflyweight.ConcreteFlyweightOne;

import java.util.HashMap;

/**
 * @ClassName FlyweightFactory
 * @See
 * @Author tanji
 * @Date 2019/12/26 16:53
 * @Version V1.0
 **/

public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights=new HashMap<>();
    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);
        if(flyweight!=null){
            System.out.println("具体享元" + key + "已经存在，被成功获取");
        }else {
            flyweight=new ConcreteFlyweightOne(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
