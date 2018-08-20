package com.jack.designMode.action.Command2018;

public abstract class Command {
    private Athlete athlete;
    public abstract void execute();

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }
}