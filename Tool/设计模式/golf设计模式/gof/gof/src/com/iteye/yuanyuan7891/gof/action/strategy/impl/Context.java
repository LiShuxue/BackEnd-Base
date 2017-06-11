package com.iteye.yuanyuan7891.gof.action.strategy.impl;

import com.iteye.yuanyuan7891.gof.action.strategy.Strategy;

public class Context {

    Strategy stra;
    
    public Context(Strategy stra) {
        this.stra = stra;
    }
    
    public void doMethod() {
        stra.method();
    }
}
