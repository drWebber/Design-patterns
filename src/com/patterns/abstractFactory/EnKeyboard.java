package com.patterns.abstractFactory;

public class EnKeyboard implements Keyboard {
    @Override
    public void pressKey() {
        System.out.println("Keyboard key is pressed");
    }
}
