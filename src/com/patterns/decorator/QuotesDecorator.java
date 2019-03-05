package com.patterns.decorator;

public class QuotesDecorator extends Decorator {
    public QuotesDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print(String text) {
        System.out.print("'");
        printable.print(text);
        System.out.print("'");
    }
}
