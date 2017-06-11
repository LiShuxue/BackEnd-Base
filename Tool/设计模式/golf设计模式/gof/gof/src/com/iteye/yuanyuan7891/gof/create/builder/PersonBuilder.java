package com.iteye.yuanyuan7891.gof.create.builder;

import com.iteye.yuanyuan7891.gof.create.builder.impl.Person;

public interface PersonBuilder {

    void buildHead();
    
    void buildBody();
    
    void buildFoot();

    Person buildPerson();
}
