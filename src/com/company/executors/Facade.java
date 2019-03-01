package com.company.executors;

import com.patterns.facede.Computer;

public class Facade implements Executable {
    @Override
    public void execute() {
        System.out.println("---Facade---");

        Computer computer = new Computer();
        computer.copyDataFromDvdRom();
    }
}
