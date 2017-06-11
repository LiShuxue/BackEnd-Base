package com.iteye.yuanyuan7891.gof.create.builder.impl;

import com.iteye.yuanyuan7891.gof.create.builder.PersonBuilder;

public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
