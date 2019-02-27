package com.patterns.abstractFactory;

public class RuKeybord implements Keyboard {
    @Override
    public void pressKey() {
        System.out.println("Кнопка нажата");
    }
}
