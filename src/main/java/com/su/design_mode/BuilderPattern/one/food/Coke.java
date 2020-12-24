package com.su.design_mode.BuilderPattern.one.food;

import com.su.design_mode.BuilderPattern.one.abstractClass.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
