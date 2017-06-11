package com.iteye.yuanyuan7891.gof.structure.decorator.impl;

import com.iteye.yuanyuan7891.gof.structure.decorator.Decorator;

public class ManDecoratorB extends Decorator {
    
    public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }
}
