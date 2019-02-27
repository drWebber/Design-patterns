package com.patterns.prototype;

public class Contact implements Copyable {
    private int age;
    private String name;

    public Contact(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Contact copy() {
        // В случае если в конструктор необходимо передать объект - необходимо так же вызывать его метод copy
        // например, copy() { return new Contact(age, account.copy()); }, т.к. все объекты ссылочные,
        // без copy, при изменении одного объекта данные изменятся и в копиях. Но это не касается String,
        // т.к. String immutable (неизменный) объект
        return new Contact(age, name);
    }

    @Override
    public String toString() {
        return "Contact{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
