package com.su.design_mode.BuilderPattern.one.abstractClass;

import com.su.design_mode.BuilderPattern.one.pack.Packing;

/**
 * 食物条目
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
