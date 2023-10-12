package com.codenroll.iocanddi.service;

import com.codenroll.iocanddi.Apple;
import com.codenroll.iocanddi.Egg;
import com.codenroll.iocanddi.Floor;

public class ApplePieService implements PieService {

    private Apple apple;
    private Floor floor;
    private Egg egg;

    public ApplePieService(Apple apple, Floor floor, Egg egg) {
        this.apple = apple;
        this.floor = floor;
        this.egg = egg;
    }

    public void prepare() {
        System.out.println("Hmmmm delicous apple pie!");
    }
}
