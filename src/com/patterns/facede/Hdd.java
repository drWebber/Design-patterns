package com.patterns.facede;

public class Hdd {
    void copy(DvdRom dvd) {
        if (dvd.isDiskInserted()) {
            System.out.println("The data is copying");
        } else {
            System.out.println("The data isn't copying");
        }
    }
}
