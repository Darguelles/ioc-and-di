package com.codenroll.iocanddi.service;

import com.codenroll.iocanddi.model.Egg;
import com.codenroll.iocanddi.model.Floor;
import com.codenroll.iocanddi.model.Lemon;

public class LemonPieService implements PieService {

    private Lemon lemon;
    private Floor floor;
    private Egg egg;

    public LemonPieService(Lemon lemon, Floor floor, Egg egg) {
        this.lemon = lemon;
        this.floor = floor;
        this.egg = egg;
    }

    public void prepare() {
        System.out.println("Hmmmm delicous lemon pie!");
    }
}
