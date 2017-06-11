package factory.abstractFactory.impl;

import factory.abstractFactory.IAnimalFactory;
import factory.abstractFactory.ICat;
import factory.abstractFactory.IDog;


public class WhiteAnimalFactory implements IAnimalFactory {

    public ICat createCat() {
        return new WhiteCat();
    }

    public IDog createDog() {
        return new WhiteDog();
    }

}
