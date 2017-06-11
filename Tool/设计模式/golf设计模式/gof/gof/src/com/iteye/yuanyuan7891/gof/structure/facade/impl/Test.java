package com.iteye.yuanyuan7891.gof.structure.facade.impl;

import com.iteye.yuanyuan7891.gof.structure.facade.Facade;
import com.iteye.yuanyuan7891.gof.structure.facade.ServiceA;
import com.iteye.yuanyuan7891.gof.structure.facade.ServiceB;

public class Test {
    
    public static void main(String[] args) {
    	ServiceA sa = new ServiceAImpl();
    	ServiceB sb = new ServiceBImpl();
        
        sa.methodA();
        sb.methodB();
        
        System.out.println("========");
        //facade
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
