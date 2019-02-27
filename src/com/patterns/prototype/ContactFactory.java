package com.patterns.prototype;

public class ContactFactory {
    private Contact contact;

    public ContactFactory(Contact contact) {
        this.contact = contact;
    }

    public void setPrototype(Contact contact) {
        this.contact = contact;
    }

    public Contact getCopy() {
        return contact.copy();
    }
}
