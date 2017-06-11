package com.iteye.yuanyuan7891.gof.action.iterator;


//Aggregate 

public interface List {

    Iterator iterator();
    
    Object get(int index);
    
    int getSize();
    
    void add(Object obj);
}
