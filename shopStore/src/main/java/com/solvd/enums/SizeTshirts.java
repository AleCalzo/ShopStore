package com.solvd.enums;

public enum SizeTshirts {
    SMALL ('S'),
    MEDIUM ('M'),
    LARGE ('L'),
    BIG ('G');

    private final char size;

    SizeTshirts(char size) {
        this.size = size;
    }
}
