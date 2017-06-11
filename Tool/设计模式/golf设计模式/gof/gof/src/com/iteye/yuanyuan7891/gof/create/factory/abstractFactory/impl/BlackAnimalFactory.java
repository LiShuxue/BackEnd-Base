package com.iteye.yuanyuan7891.gof.create.factory.abstractFactory.impl;

import com.iteye.yuanyuan7891.gof.create.factory.abstractFactory.IAnimalFactory;
import com.iteye.yuanyuan7891.gof.create.factory.abstractFactory.ICat;
import com.iteye.yuanyuan7891.gof.create.factory.abstractFactory.IDog;

public class BlackAnimalFactory implements IAnimalFactory {

    public ICat createCat() {
        return new BlackCat();
    }

    public IDog createDog() {
        return new BlackDog();
    }

}
