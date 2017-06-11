package com.iteye.yuanyuan7891.gof.action.vistor.impl;

import com.iteye.yuanyuan7891.gof.action.vistor.Visitable;
import com.iteye.yuanyuan7891.gof.action.vistor.Visitor;

public class StringElement implements Visitable {

    private String se;
    
    public StringElement(String se) {
        this.se = se;
    }
    
    public String getSe() {
        return this.se;
    }
    
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}