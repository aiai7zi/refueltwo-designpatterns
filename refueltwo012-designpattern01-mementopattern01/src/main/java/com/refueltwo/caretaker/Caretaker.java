package com.refueltwo.caretaker;

import com.refueltwo.memento.Memento;

/**
 * @ClassName Caretaker
 * @See
 * @Author tanji
 * @Date 2019/12/19 17:36
 * @Version V1.0
 **/

public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
