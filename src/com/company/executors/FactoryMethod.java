package com.company.executors;

import com.patterns.factoryMethod.DigitalWatchManufacturer;
import com.patterns.factoryMethod.Watch;
import com.patterns.factoryMethod.WatchManufacturer;

public class FactoryMethod implements Executable {
    @Override
    public void execute() {
        System.out.println("---Factory Method---");

        WatchManufacturer manufacturer = new DigitalWatchManufacturer();

        Watch watch = manufacturer.createWatch();
        watch.showTime();
    }
}
