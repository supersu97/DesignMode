package com.su.design_mode.PrototypePattern.one.clone.impl;

import com.su.design_mode.PrototypePattern.one.clone.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
