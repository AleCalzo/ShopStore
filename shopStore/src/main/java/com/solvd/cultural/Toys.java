package com.solvd.cultural;

public class Toys extends Product {


    private String toyType;


    public Toys() {
    }

    public Toys(String name, double costUnit, int cantStock,
                boolean available, String toyType) {
        super(name, costUnit, cantStock, available);
        this.toyType = toyType;
    }

    @Override
    public String toString() {
        return "TOY ARTICLE\n" + super.toString() + "ToyType: "
                + this.toyType;
    }


    public String getToyType() {
        return toyType;
    }

    public void setToyType(String toyType) {
        this.toyType = toyType;
    }
}
