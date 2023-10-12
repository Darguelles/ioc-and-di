package com.codenroll.iocanddi.service.injectors;

import com.codenroll.iocanddi.model.Apple;
import com.codenroll.iocanddi.model.Egg;
import com.codenroll.iocanddi.model.Floor;
import com.codenroll.iocanddi.service.ApplePieService;
import com.codenroll.iocanddi.service.PieService;

public class ApplePieServiceInjector implements PieServiceInjector{

    private Egg egg;
    private Floor floor;
    private Apple apple;

    @Override
    public PieService getService() {
        egg = new Egg();
        floor = new Floor();
        apple = new Apple();
        return new ApplePieService(apple, floor, egg);
    }
}
