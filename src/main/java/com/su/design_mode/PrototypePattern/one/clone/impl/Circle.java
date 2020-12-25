package com.su.design_mode.PrototypePattern.one.clone.impl;

import com.su.design_mode.PrototypePattern.one.clone.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    public Circle(){
        type = "Circle";
    }
}
