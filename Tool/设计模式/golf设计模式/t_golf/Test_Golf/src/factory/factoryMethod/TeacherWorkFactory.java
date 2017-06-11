package factory.factoryMethod;

import factory.factoryMethod.impl.TeacherWork;



public class TeacherWorkFactory implements IWorkFactory {

    public Work getWork() {
        return new TeacherWork();
    }
}
