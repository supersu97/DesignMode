package com.su.design_mode.BuilderPattern.one.food;

import com.su.design_mode.BuilderPattern.one.abstractClass.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
