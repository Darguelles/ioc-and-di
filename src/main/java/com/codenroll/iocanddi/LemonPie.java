package com.codenroll.iocanddi;

public class LemonPie {

    private Lemon lemon;
    private Floor floor;
    private Egg egg;

    public LemonPie() {
        this.lemon = new Lemon();
        this.floor = new Floor();
        this.egg = new Egg();
    }

    public void prepare() {
        System.out.println("Hmmmm delicous lemon pie!");
    }
}
