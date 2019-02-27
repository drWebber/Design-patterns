package com.patterns.builder.v2;

import com.patterns.builder.Car;

public class Director {
    private AbstractCarBuiler carBuiler;

    public void setCarBuiler(AbstractCarBuiler carBuiler) {
        this.carBuiler = carBuiler;
    }

    public Car build() {
        return carBuiler
                .buildManufacturer()
                .buildTransmission()
                .buildDateOfIssue()
                .build();
    }
}
