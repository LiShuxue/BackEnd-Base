package factory.abstractFactory.impl;

import factory.abstractFactory.IAnimalFactory;
import factory.abstractFactory.ICat;
import factory.abstractFactory.IDog;


public class BlackAnimalFactory implements IAnimalFactory {

    public ICat createCat() {
        return new BlackCat();
    }

    public IDog createDog() {
        return new BlackDog();
    }

}
