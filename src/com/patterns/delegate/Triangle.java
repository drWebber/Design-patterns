package com.patterns.delegate;

public class Triangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("The triangle has been drawn");
    }
}
