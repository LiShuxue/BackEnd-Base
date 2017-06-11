package com.iteye.yuanyuan7891.gof.structure.composite;

import java.util.List;
//Component 

public abstract class Employer {

    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public abstract void add(Employer employer);
    
    public abstract void delete(Employer employer);
    
    public List employers;//下属
    
    public void printInfo() {
        System.out.println(name);
    }
    
    public List getEmployers() {
        return this.employers;
    }
}
