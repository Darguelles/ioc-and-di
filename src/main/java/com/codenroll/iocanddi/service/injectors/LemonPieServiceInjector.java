package com.codenroll.iocanddi.service.injectors;

import com.codenroll.iocanddi.Egg;
import com.codenroll.iocanddi.Floor;
import com.codenroll.iocanddi.Lemon;
import com.codenroll.iocanddi.service.LemonPieService;
import com.codenroll.iocanddi.service.PieService;

public class LemonPieServiceInjector implements PieServiceInjector {

    private Egg egg;
    private Floor floor;
    private Lemon lemon;

    @Override
    public PieService getService() {
        egg = new Egg();
        floor = new Floor();
        lemon = new Lemon();
        return new LemonPieService(lemon, floor, egg);
    }
}
