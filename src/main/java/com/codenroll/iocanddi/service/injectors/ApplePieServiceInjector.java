package com.codenroll.iocanddi.service.injectors;

import com.codenroll.iocanddi.Apple;
import com.codenroll.iocanddi.Egg;
import com.codenroll.iocanddi.Floor;
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
