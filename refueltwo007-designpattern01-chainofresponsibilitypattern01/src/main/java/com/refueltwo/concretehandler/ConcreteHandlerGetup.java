package com.refueltwo.concretehandler;

import com.refueltwo.abshandler.Handler;

/**
 * @ClassName ConcreteHandlerGetup
 * @See
 * @Author tanji
 * @Date 2019/12/17 11:46
 * @Version V1.0
 **/

public class ConcreteHandlerGetup extends Handler {
    @Override
    public void handlerRequest(String request) {
        if(request.equals("qetup")){
            System.out.println("我起床了");
        }else {
            if(getNext()!=null){
                getNext().handlerRequest(request);
             }else {
                System.out.println("没有事做了");
            }
        }
    }
}
