package com.refueltwo.abshandler;

/**
 * @ClassName Handler
 * @See
 * @Author tanji
 * @Date 2019/12/17 10:51
 * @Version V1.0
 **/

public abstract class Handler {
    private Handler next;
    public Handler setNext(Handler next){
        this.next=next;
        return next;
    }
    public Handler getNext(){
        return next;
    }
    public abstract void handlerRequest(String request);

}
