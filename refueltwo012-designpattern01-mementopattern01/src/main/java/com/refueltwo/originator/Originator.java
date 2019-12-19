package com.refueltwo.originator;

import com.refueltwo.memento.Memento;

/**
 * @ClassName Originator
 * @See
 * @Author tanji
 * @Date 2019/12/19 17:30
 * @Version V1.0
 **/

public class Originator {
    private String id;
    private String name;
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public Memento createMemento(){
        return new Memento(id, name, age);
    }
    //Memento:恢复
    public void restoreMemento(Memento memento){
        this.id=memento.getId();
        this.name=memento.getName();
        this.age=memento.getAge();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
