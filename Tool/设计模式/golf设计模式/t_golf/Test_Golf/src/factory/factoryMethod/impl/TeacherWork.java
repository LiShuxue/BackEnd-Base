package factory.factoryMethod.impl;

import factory.factoryMethod.Work;



public class TeacherWork implements Work {

    public void doWork() {
        System.out.println("老师审批作业!");
    }

}
