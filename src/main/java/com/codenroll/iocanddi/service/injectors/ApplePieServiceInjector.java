package com.codenroll.iocanddi.service.injectors;

import com.codenroll.iocanddi.model.Apple;
import com.codenroll.iocanddi.model.Egg;
import com.codenroll.iocanddi.model.Flour;
import com.codenroll.iocanddi.service.ApplePieService;
import com.codenroll.iocanddi.service.PieService;

public class ApplePieServiceInjector implements PieServiceInjector{

    private Egg egg;
    private Flour flour;
    private Apple apple;

    @Override
    public PieService getService() {
        egg = new Egg();
        flour = new Flour();
        apple = new Apple();
        return new ApplePieService(apple, flour, egg);
    }
}
