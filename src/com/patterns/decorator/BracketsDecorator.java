package com.patterns.decorator;

public class BracketsDecorator extends Decorator {
    public BracketsDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print(String text) {
        System.out.print("[");
        printable.print(text);
        System.out.print("]");
    }
}
