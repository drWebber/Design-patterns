package com.company.executors;

public class Composite implements Executable {
    @Override
    public void execute() {
        System.out.println("---Composite---");
        com.patterns.composite.Composite composite = new com.patterns.composite.Composite();
        composite.addComposite(new com.patterns.composite.Triangle());
        composite.addComposite(new com.patterns.composite.Square());
        composite.addComposite(new com.patterns.composite.Circle());

        com.patterns.composite.Composite composite1 = new com.patterns.composite.Composite();
        composite1.addComposite(new com.patterns.composite.Square());
        composite1.addComposite(new com.patterns.composite.Circle());

        com.patterns.composite.Composite composite2 = new com.patterns.composite.Composite();
        composite2.addComposite(new com.patterns.composite.Circle());
        composite2.addComposite(new com.patterns.composite.Circle());
        composite2.addComposite(new com.patterns.composite.Triangle());

        composite.addComposite(composite1);
        composite.addComposite(composite2);
        composite.addComposite(new com.patterns.composite.Square());

        composite.draw();
    }
}
