package com.patterns.factoryMethod;

public class RomeWatchManufacturer implements WatchManufacturer {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
