package com.jack.designMode.create.Builder2018;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Motorcycle assembleMotorcycle(){
        Carcase carcase = builder.createCarcase();
        carcase.build();
        Wheel wheel = builder.createWheel();
        wheel.build();
        Tyre tyre = builder.createTyre();
        tyre.build();
        Engine engine = builder.createEngine();
        engine.build();
        return new Motorcycle1();
    }
}