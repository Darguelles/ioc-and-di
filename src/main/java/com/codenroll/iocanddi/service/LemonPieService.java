package com.codenroll.iocanddi.service;

import com.codenroll.iocanddi.model.Egg;
import com.codenroll.iocanddi.model.Flour;
import com.codenroll.iocanddi.model.Lemon;

public class LemonPieService implements PieService {

    private Lemon lemon;
    private Flour flour;
    private Egg egg;

    public LemonPieService(Lemon lemon, Flour flour, Egg egg) {
        this.lemon = lemon;
        this.flour = flour;
        this.egg = egg;
    }

    public void prepare() {
        System.out.println("Hmmmm delicous lemon pie!");
    }
}
