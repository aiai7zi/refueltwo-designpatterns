package com.refueltwo.client;

import com.refueltwo.adapter.Adapter;
import com.refueltwo.targets.Target;

/**
 * @ClassName AdapterMain
 * @See
 * @Author tanji
 * @Date 2019/12/13 23:02
 * @Version V1.0
 **/

public class AdapterMain {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
