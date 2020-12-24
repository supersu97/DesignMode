package com.su.design_mode.BuilderPattern.one.abstractClass;

import com.su.design_mode.BuilderPattern.one.pack.Packing;
import com.su.design_mode.BuilderPattern.one.pack.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
