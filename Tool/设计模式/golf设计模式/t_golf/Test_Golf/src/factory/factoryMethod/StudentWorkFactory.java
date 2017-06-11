package factory.factoryMethod;

import factory.factoryMethod.impl.StudentWork;

public class StudentWorkFactory implements IWorkFactory {

	public Work getWork() {
		return new StudentWork();
	}
}