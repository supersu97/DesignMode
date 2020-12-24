package com.su.design_mode.BuilderPattern.one.food;

import com.su.design_mode.BuilderPattern.one.abstractClass.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 15.5f;
    }
}
