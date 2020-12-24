package com.su.design_mode.BuilderPattern.one.abstractClass;

import com.su.design_mode.BuilderPattern.one.pack.Packing;
import com.su.design_mode.BuilderPattern.one.pack.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
