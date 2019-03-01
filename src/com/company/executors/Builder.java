package com.company.executors;

import com.patterns.builder.Car;
import com.patterns.builder.Transmission;
import com.patterns.builder.v1.CarBuiler;
import com.patterns.builder.v2.Director;
import com.patterns.builder.v2.JiguliBuilder;

public class Builder implements Executable {
    @Override
    public void execute() {
        System.out.println("---Builder---");

        /* v1 - неполная реализация */
        Car car = new CarBuiler()
                .buildTransmission(Transmission.AUTOMATIC)
                .build();

        System.out.println(car);

        /* v2 - полная реализация */
        Director director = new Director();
        director.setCarBuiler(new JiguliBuilder());

        Car newCar = director.build();
        System.out.println(newCar);
    }
}
