package factory.abstractFactory.impl;

import factory.abstractFactory.IDog;


public class WhiteDog implements IDog {
    public void eat() {
        System.out.println("The white dog is eating!");
    }
}
