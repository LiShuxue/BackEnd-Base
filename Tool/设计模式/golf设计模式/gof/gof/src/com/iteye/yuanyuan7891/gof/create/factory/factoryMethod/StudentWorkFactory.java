package com.iteye.yuanyuan7891.gof.create.factory.factoryMethod;
import com.iteye.yuanyuan7891.gof.create.factory.factoryMethod.impl.StudentWork;

public class StudentWorkFactory implements IWorkFactory {

    public Work getWork() {
        return new StudentWork();
    }

}