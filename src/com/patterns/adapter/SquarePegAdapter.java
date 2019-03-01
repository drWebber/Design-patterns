package com.patterns.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow(peg.getWidth(), 2) + Math.pow(peg.getWidth(), 2)) / 2;
    }
}
