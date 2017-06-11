package factory.abstractFactory.impl;

import factory.abstractFactory.ICat;



public class BlackCat implements ICat {

    public void eat() {
        System.out.println("The black cat is eating!");
    }
}
