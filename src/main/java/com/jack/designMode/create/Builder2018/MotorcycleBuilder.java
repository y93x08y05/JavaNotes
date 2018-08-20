package com.jack.designMode.create.Builder2018;

public class MotorcycleBuilder implements Builder{
    @Override
    public Carcase createCarcase() {
        return new Carcase1();
    }
    @Override
    public Engine createEngine() {
        return new Engine1();
    }
    @Override
    public Tyre createTyre() {
        return new Tyre1();
    }
    @Override
    public Wheel createWheel() {
        return  new Wheel1();
    }
}