package com.patterns.facede;

public class DvdRom {
    private boolean diskIsInserted;

    public void insertDisk() {
        diskIsInserted = true;
    }

    public void ejectDisk() {
        diskIsInserted = false;
    }

    public boolean isDiskInserted() {
        return diskIsInserted;
    }
}
