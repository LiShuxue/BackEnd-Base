package com.iteye.yuanyuan7891.gof.structure.decorator.impl;

import com.iteye.yuanyuan7891.gof.structure.decorator.Decorator;
//ConcreteDectrator 向组件添加职责

public class ManDecoratorA extends Decorator {

    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecoratorA类");
    }

    public void reEat() {
        System.out.println("再吃一顿饭");
    }
}
