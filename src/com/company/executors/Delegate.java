package com.company.executors;

import com.patterns.delegate.Circle;
import com.patterns.delegate.Painter;
import com.patterns.delegate.Square;
import com.patterns.delegate.Triangle;

public class Delegate implements Executable {
    @Override
    public void execute() {
        System.out.println("---Delegate---");

        Painter painter = new Painter();
        painter.setGraphics(new Circle());
        painter.draw();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();
    }
}
