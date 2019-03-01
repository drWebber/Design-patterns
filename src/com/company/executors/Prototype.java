package com.company.executors;

import com.patterns.prototype.Contact;
import com.patterns.prototype.ContactFactory;

public class Prototype implements Executable {
    @Override
    public void execute() {
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
