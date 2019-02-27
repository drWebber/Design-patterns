package com.patterns.abstractFactory;

public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse createMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new RuKeybord();
    }

    @Override
    public Printer createPrinter() {
        return new RuPrinter();
    }
}
