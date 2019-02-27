package com.patterns.builder.v2;

import com.patterns.builder.Transmission;

import java.util.Date;

public class JiguliBuilder extends AbstractCarBuiler {
    @Override
    public AbstractCarBuiler buildManufacturer() {
        car.setManufacturer("Jiguli");
        return this;
    }

    @Override
    public AbstractCarBuiler buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
        return this;
    }

    @Override
    public AbstractCarBuiler buildDateOfIssue() {
        car.setDateOfIssue(new Date());
        return this;
    }
}
