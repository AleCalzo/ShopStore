package com.solvd.cultural;

public class Mask extends Product {


    private String caracters;


    public Mask() {
    }

    public Mask(String name, double costUnit, int cantStock,
                boolean available, String caracters) {
        super(name, costUnit, cantStock, available);
        this.caracters = caracters;
    }

    @Override
    public String toString() {
        return "MASK ARTICLE\n" + super.toString() + "Caracters: "
                + this.caracters;
    }


    public String getCaracters() {
        return caracters;
    }

    public void setCaracters(String caracters) {
        this.caracters = caracters;
    }
}
