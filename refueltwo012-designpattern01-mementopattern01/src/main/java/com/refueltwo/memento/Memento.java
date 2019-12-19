package com.refueltwo.memento;

/**
 * @ClassName Memento
 * @See
 * @Author tanji
 * @Date 2019/12/19 17:31
 * @Version V1.0
 **/

public class Memento {
    private String id;
    private String name;
    private String age;

    public Memento(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
