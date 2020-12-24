package com.su.design_mode.BuilderPattern.one.food;

import com.su.design_mode.BuilderPattern.one.abstractClass.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
