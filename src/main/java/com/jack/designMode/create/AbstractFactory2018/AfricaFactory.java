package com.jack.designMode.create.AbstractFactory2018;

public class AfricaFactory implements AbstractFactory {
    @Override
    public Tiger createTiger() {
        return new TigerAfrica();
    }
    @Override
    public Dolphin createDolphin() {
        return new DophinAfrica();
    }
    @Override
    public Parrot createParrot() {
        return new ParrotAfrica();
    }
}