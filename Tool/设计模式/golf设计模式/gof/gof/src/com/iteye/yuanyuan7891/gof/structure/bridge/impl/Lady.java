package com.iteye.yuanyuan7891.gof.structure.bridge.impl;

import com.iteye.yuanyuan7891.gof.structure.bridge.Clothing;
import com.iteye.yuanyuan7891.gof.structure.bridge.Person;

public class Lady extends Person {

    public Lady() {
        setType("女人");
    }
    
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
