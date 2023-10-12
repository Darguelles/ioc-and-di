package com.codenroll.iocanddi.service;

import com.codenroll.iocanddi.model.Apple;
import com.codenroll.iocanddi.model.Egg;
import com.codenroll.iocanddi.model.Flour;

public class ApplePieService implements PieService {

    private Apple apple;
    private Flour flour;
    private Egg egg;

    public ApplePieService(Apple apple, Flour flour, Egg egg) {
        this.apple = apple;
        this.flour = flour;
        this.egg = egg;
    }

    public void prepare() {
        System.out.println("Hmmmm delicous apple pie!");
    }
}
