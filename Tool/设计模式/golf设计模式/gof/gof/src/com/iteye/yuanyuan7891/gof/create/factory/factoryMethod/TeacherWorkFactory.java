package com.iteye.yuanyuan7891.gof.create.factory.factoryMethod;

import com.iteye.yuanyuan7891.gof.create.factory.factoryMethod.impl.TeacherWork;



public class TeacherWorkFactory implements IWorkFactory {

    public Work getWork() {
        return new TeacherWork();
    }

}
