package com.su.design_mode.PrototypePattern.one.clone.impl;

import com.su.design_mode.PrototypePattern.one.clone.Shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    public Square(){
        type = "Square";
    }
}
