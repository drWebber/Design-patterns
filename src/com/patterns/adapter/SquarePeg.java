package com.patterns.adapter;

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double square() {
        return Math.pow(width, 2);
    }
}
