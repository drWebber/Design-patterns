package com.company.executors;

import com.patterns.decorator.BracketsDecorator;
import com.patterns.decorator.Printable;
import com.patterns.decorator.Printer;
import com.patterns.decorator.QuotesDecorator;

public class Decorator implements Executable {
    @Override
    public void execute() {
        System.out.println("---Decorator---");
        Printable printable = new BracketsDecorator(new QuotesDecorator(new Printer()));
        printable.print("hello");
    }
}
