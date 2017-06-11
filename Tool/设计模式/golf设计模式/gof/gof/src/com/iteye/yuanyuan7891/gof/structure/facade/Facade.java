package com.iteye.yuanyuan7891.gof.structure.facade;

import com.iteye.yuanyuan7891.gof.structure.facade.impl.ServiceAImpl;
import com.iteye.yuanyuan7891.gof.structure.facade.impl.ServiceBImpl;
import com.iteye.yuanyuan7891.gof.structure.facade.impl.ServiceCImpl;

public class Facade {

    ServiceA sa;
    
    ServiceB sb;
    
    ServiceC sc;
    
    public Facade() {
        sa = new ServiceAImpl();
        sb = new ServiceBImpl();
        sc = new ServiceCImpl(); 
    }
    
    public void methodA() {
        sa.methodA();
        sb.methodB();
    }
    
    public void methodB() {
        sb.methodB();
        sc.methodC();
    }
    
    public void methodC() {
        sc.methodC();
        sa.methodA();
    }
}
