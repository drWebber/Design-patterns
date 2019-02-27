package com.patterns.delegate;

public class Square implements Graphics {
    @Override
    public void draw() {
        System.out.println("The square has been drawn");
    }
}
