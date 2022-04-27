package com.solvd.cultural;

import com.solvd.interfaces.Cupon;

public class Hats extends Product implements Cupon {


    private String colors;


    public Hats() {
    }

    public Hats(String name, double costUnit, int cantStock,
                boolean available, String colors) {
        super(name, costUnit, cantStock, available);
        this.colors = colors;
    }

    public double applyCupon(double cupon1) {
        return 10;
    }

    @Override
    public String toString() {
        return "HATS ARTICLE\n" + super.toString() + "Colors: "
                + this.colors;
    }


    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

}
