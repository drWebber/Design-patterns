package com.patterns.facede;

/*
 * Фасад - структурный шаблон проектирования, позволяющий скрыть сложность системы путем сведения всех возможных
 * внешних вызовов к одному объекту, делегирующему их соответствующим объектам системы.
 */

public class Computer {
    private Hdd hdd = new Hdd();
    private DvdRom dvdRom = new DvdRom();

    public void copyDataFromDvdRom() {
        dvdRom.insertDisk();
        hdd.copy(dvdRom);
    }
}
