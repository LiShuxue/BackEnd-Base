package com.iteye.yuanyuan7891.gof.action.vistor.impl;

import com.iteye.yuanyuan7891.gof.action.vistor.Visitable;
import com.iteye.yuanyuan7891.gof.action.vistor.Visitor;

public class FloatElement implements Visitable {

    private Float fe;
    
    public FloatElement(Float fe) {
        this.fe = fe;
    }
    
    public Float getFe() {
        return this.fe;
    }
    
    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}