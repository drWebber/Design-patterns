package com.patterns.decorator;

public class Printer implements Printable {
    @Override
    public void print(String text) {
        System.out.print(text);
    }
}
