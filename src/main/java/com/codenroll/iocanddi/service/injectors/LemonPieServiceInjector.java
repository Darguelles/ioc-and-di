package com.codenroll.iocanddi.service.injectors;

import com.codenroll.iocanddi.model.Egg;
import com.codenroll.iocanddi.model.Flour;
import com.codenroll.iocanddi.model.Lemon;
import com.codenroll.iocanddi.service.LemonPieService;
import com.codenroll.iocanddi.service.PieService;

public class LemonPieServiceInjector implements PieServiceInjector {

    private Egg egg;
    private Flour flour;
    private Lemon lemon;

    @Override
    public PieService getService() {
        egg = new Egg();
        flour = new Flour();
        lemon = new Lemon();
        return new LemonPieService(lemon, flour, egg);
    }
}
