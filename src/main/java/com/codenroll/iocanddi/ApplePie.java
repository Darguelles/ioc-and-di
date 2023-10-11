package com.codenroll.iocanddi;

public class ApplePie {

    private Apple apple;
    private Floor floor;
    private Egg egg;

    public ApplePie() {
        this.apple = new Apple();
        this.floor = new Floor();
        this.egg = new Egg();
    }

    public void prepare() {
        // Hmmmm delicous!
    }
}
