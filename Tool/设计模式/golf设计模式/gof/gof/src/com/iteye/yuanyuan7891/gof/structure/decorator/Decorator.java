package com.iteye.yuanyuan7891.gof.structure.decorator;
//Decorator 维持一个执行Component对象的指针，并定义一个与Componect 接口一致的接口。

public abstract class Decorator implements Person {

    protected Person person;
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public void eat() {
        person.eat();
    }
}

