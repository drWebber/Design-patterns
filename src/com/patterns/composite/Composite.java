package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
    private List<Shape> composites = new ArrayList<>();

    public void addComposite(Shape composite) {
        composites.add(composite);
    }

    public void removeComposite(Shape composite) {
        composites.remove(composite);
    }

    @Override
    public void draw() {
        for (Shape composite : composites) {
            composite.draw();
        }
    }
}
