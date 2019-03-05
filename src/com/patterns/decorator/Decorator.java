package com.patterns.decorator;

abstract public class Decorator implements Printable {
    protected Printable printable;

    public Decorator(Printable printable) {
        this.printable = printable;
    }
}
