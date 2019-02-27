package com.patterns.builder.v2;

import com.patterns.builder.Transmission;

import java.util.Date;

public class FordBuilder extends AbstractCarBuiler {
    @Override
    public AbstractCarBuiler buildManufacturer() {
        car.setManufacturer("Ford");
        return this;
    }

    @Override
    public AbstractCarBuiler buildTransmission() {
        car.setTransmission(Transmission.AUTOMATIC);
        return this;
    }

    @Override
    public AbstractCarBuiler buildDateOfIssue() {
        car.setDateOfIssue(new Date());
        return this;
    }
}
