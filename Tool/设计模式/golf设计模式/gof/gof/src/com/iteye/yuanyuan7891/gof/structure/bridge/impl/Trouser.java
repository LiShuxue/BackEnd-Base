package com.iteye.yuanyuan7891.gof.structure.bridge.impl;

import com.iteye.yuanyuan7891.gof.structure.bridge.Clothing;
import com.iteye.yuanyuan7891.gof.structure.bridge.Person;

public class Trouser extends Clothing {

    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿裤子");
    }
}
