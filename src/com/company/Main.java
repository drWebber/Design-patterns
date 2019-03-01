package com.company;

import com.company.executors.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Executable> executables = new ArrayList<>();

        executables.add(new AbstractFactory());
        executables.add(new Builder());
        executables.add(new Composite());
        executables.add(new Delegate());
        executables.add(new Facade());
        executables.add(new FactoryMethod());
        executables.add(new Prototype());
        executables.add(new Adapter());

        for (Executable executable : executables) {
            executable.execute();
        }
    }
}
