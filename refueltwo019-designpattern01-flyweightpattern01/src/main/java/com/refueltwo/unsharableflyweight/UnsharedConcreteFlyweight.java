package com.refueltwo.unsharableflyweight;

/**
 * @ClassName UnsharedConcreteFlyweight
 * @See
 * @Author tanji
 * @Date 2019/12/26 16:48
 * @Version V1.0
 **/

public class UnsharedConcreteFlyweight {


    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
