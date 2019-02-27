package com.patterns.builder.v2;

import com.patterns.builder.Car;

abstract public class AbstractCarBuiler {
    Car car = new Car();

    public abstract AbstractCarBuiler buildManufacturer();
    public abstract AbstractCarBuiler buildTransmission();
    public abstract AbstractCarBuiler buildDateOfIssue();

    public Car build() {
        return car;
    }
}
