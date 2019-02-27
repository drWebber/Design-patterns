package com.patterns.abstractFactory;

public class EnPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("The printer is printing");
    }
}
