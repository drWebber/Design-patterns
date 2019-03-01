package com.patterns.adapter;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public Boolean fits(final RoundPeg peg) {
        return radius >= peg.getRadius();
    }
}
