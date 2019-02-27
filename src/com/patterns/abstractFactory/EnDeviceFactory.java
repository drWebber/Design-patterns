package com.patterns.abstractFactory;

public class EnDeviceFactory implements DeviceFactory {
    @Override
    public Mouse createMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Printer createPrinter() {
        return new EnPrinter();
    }
}
