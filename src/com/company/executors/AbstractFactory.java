package com.company.executors;

import com.patterns.abstractFactory.*;

public class AbstractFactory implements Executable {
    @Override
    public void execute() {
        System.out.println("---Abstract Factory---");

        DeviceFactory deviceFactory = new EnDeviceFactory();

        Mouse mouse = deviceFactory.createMouse();
        Keyboard keyboard = deviceFactory.createKeyboard();
        Printer printer = deviceFactory.createPrinter();

        mouse.click();
        keyboard.pressKey();
        printer.print();
    }
}
