package com.su.design_mode.BuilderPattern.one.bulid;

import com.su.design_mode.BuilderPattern.one.food.ChickenBurger;
import com.su.design_mode.BuilderPattern.one.food.Coke;
import com.su.design_mode.BuilderPattern.one.food.Pepsi;
import com.su.design_mode.BuilderPattern.one.food.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
