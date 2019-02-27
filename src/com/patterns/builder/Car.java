package com.patterns.builder;

import java.util.Date;

public class Car {
    private String manufacturer;
    private Transmission transmission;
    private Date dateOfIssue;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" + "manufacturer='" + manufacturer + '\'' + ", transmission=" + transmission
                + ", dateOfIssue=" + dateOfIssue + '}';
    }
}
