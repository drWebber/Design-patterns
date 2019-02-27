package com.patterns.abstractFactory;

public interface DeviceFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
    Printer createPrinter();
}
