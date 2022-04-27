package com.solvd.cultural;

import com.solvd.interfaces.Regards;

public class Comics extends Product implements Regards {


    private String caracter;

    public Comics() {
    }

    public Comics(String name, double costUnit, int cantStock,
                  boolean available, String caracter) {
        super(name, costUnit, cantStock, available);
        this.caracter = caracter;
    }

    public String sayHello(String greeting) {
        return "thank you for stop by!";
    }

    @Override
    public String toString() {
        return "COMIC ARTICLE\n" + super.toString() + "Caracter: "
                + this.caracter;

    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
}
