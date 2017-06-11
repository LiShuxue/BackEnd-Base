package com.iteye.yuanyuan7891.gof.structure.adapter;
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();
        
        target.adapterMethod();
    }
}
