package com.iteye.yuanyuan7891.gof.structure.composite;
//Leaf 
public class Programmer extends Employer {

    public Programmer(String name) {
        setName(name);
        employers = null;//程序员, 表示没有下属了
    }

    public void add(Employer employer) {
        
    }

    public void delete(Employer employer) {
        
    }
}

