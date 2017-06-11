package com.iteye.yuanyuan7891.gof.structure.decorator.impl;
public class Test {

    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();
        
        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();
    }
}
/*
  1.2.4 装饰模式

    动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活。
  适用性

    1.在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。

    2.处理那些可以撤消的职责。

    3.当不能采用生成子类的方法进行扩充时。
			
  参与者

    1.Component
      定义一个对象接口，可以给这些对象动态地添加职责。

    2.ConcreteComponent
      定义一个对象，可以给这个对象添加一些职责。

    3.Decorator
      维持一个指向Component对象的指针，并定义一个与Component接口一致的接口。

    4.ConcreteDecorator
      向组件添加职责。
      */
