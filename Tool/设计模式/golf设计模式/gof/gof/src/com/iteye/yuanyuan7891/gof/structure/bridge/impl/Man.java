package com.iteye.yuanyuan7891.gof.structure.bridge.impl;

import com.iteye.yuanyuan7891.gof.structure.bridge.Clothing;
import com.iteye.yuanyuan7891.gof.structure.bridge.Person;

public class Man extends Person {
    
    public Man() {
        setType("男人");
    }
    
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
