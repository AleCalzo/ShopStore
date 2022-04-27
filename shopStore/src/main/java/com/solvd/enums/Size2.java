package com.solvd.enums;

public enum Size2 {

    MINI ("S"), MEDIUM ("M"), BIG ("L"), SUPER ("XL");

    private Size2 (String shortCut){

        this.shortCut = shortCut;

    }

    private String shortCut;

}


