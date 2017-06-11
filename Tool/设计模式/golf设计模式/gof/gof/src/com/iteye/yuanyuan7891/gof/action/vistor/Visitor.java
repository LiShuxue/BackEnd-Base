package com.iteye.yuanyuan7891.gof.action.vistor;

import java.util.Collection;

import com.iteye.yuanyuan7891.gof.action.vistor.impl.FloatElement;
import com.iteye.yuanyuan7891.gof.action.vistor.impl.StringElement;

public interface Visitor {

    public void visitString(StringElement stringE);
    
    public void visitFloat(FloatElement floatE);
    
    public void visitCollection(Collection collection); 
}