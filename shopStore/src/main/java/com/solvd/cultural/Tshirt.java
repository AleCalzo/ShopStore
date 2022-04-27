package com.solvd.cultural;

import com.solvd.interfaces.Size;

public class Tshirt extends Product implements Size {


    private String shirt;


    public Tshirt() {
    }

    public Tshirt(String name, double costUnit, int cantStock,
                  boolean available, String shirt) {
        super(name, costUnit, cantStock, available);
        this.shirt = shirt;
    }

    public char tellSize (char size_type){
        return 's';


    }
    @Override
    public String toString() {
        return "TSHIRT ARTICLE\n" + super.toString() + "shirt: "
                + this.shirt;
    }


    public String getShirt() {
        return shirt;
    }

    public void setShirt(String shirt) {
        this.shirt = shirt;
    }
}

