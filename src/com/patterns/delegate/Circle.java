package com.patterns.delegate;

public class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("The circle has been drawn");
    }
}
