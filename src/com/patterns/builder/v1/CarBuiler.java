package com.patterns.builder.v1;

import com.patterns.builder.Car;
import com.patterns.builder.Transmission;

import java.util.Date;

public class CarBuiler {
    private String manufacturer = "Unknown";
    private Transmission transmission = Transmission.MANUAL;
    private Date dateOfIssue = new Date();

    public CarBuiler buildManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public CarBuiler buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuiler buildDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
        return this;
    }

    public Car build() {
        Car car = new Car();

        car.setManufacturer(manufacturer);
        car.setTransmission(transmission);
        car.setDateOfIssue(dateOfIssue);

        return car;
    }
}
