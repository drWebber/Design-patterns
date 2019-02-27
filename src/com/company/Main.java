package com.company;

import com.patterns.abstractFactory.*;
import com.patterns.builder.Car;
import com.patterns.builder.Transmission;
import com.patterns.builder.v1.CarBuiler;
import com.patterns.builder.v2.AbstractCarBuiler;
import com.patterns.builder.v2.Director;
import com.patterns.builder.v2.FordBuilder;
import com.patterns.builder.v2.JiguliBuilder;
import com.patterns.delegate.Circle;
import com.patterns.delegate.Painter;
import com.patterns.delegate.Square;
import com.patterns.delegate.Triangle;
import com.patterns.facede.Computer;
import com.patterns.factoryMethod.DigitalWatchManufacturer;
import com.patterns.factoryMethod.Watch;
import com.patterns.factoryMethod.WatchManufacturer;
import com.patterns.prototype.Contact;
import com.patterns.prototype.ContactFactory;

public class Main {

    public static void main(String[] args) {
        /* Делегат (Delegate) */
        System.out.println("---Delegate---");

        Painter painter = new Painter();
        painter.setGraphics(new Circle());
        painter.draw();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();


        /* Фасад (Facade) */
        System.out.println("---Facade---");

        Computer computer = new Computer();
        computer.copyDataFromDvdRom();


        /* Фабричный метод (Factory Method) */
        System.out.println("---Factory Method---");

        WatchManufacturer manufacturer = new DigitalWatchManufacturer();

        Watch watch = manufacturer.createWatch();
        watch.showTime();


        /* Абстрактная фабрика (Abstract Factory) */
        System.out.println("---Abstract Factory---");

        DeviceFactory deviceFactory = new EnDeviceFactory();

        Mouse mouse = deviceFactory.createMouse();
        Keyboard keyboard = deviceFactory.createKeyboard();
        Printer printer = deviceFactory.createPrinter();

        mouse.click();
        keyboard.pressKey();
        printer.print();

        /* Строитель (Builder) */
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

        /* Прототип (Prototype) */
        // В Java есть интерфейс Clonable
        System.out.println("---Prototype---");

        // Реализация без фабрики ContactFactory
        Contact contact1 = new Contact(29, "Vasya");
        System.out.println(contact1);


        Contact contact2 = contact1.copy();
        System.out.println(contact2);

        ContactFactory contactFactory = new ContactFactory(contact1);

        contact1.setName("Senya");
        System.out.println(contactFactory.getCopy());
        System.out.println(contactFactory.getCopy());

        contactFactory.setPrototype(contact2);
        System.out.println(contactFactory.getCopy());
    }
}
