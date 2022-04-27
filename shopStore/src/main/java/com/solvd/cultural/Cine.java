package com.solvd.cultural;

import com.solvd.interfaces.Regards;

public class Cine extends Product implements Regards {

    private String director;


    public Cine() {
    }

    public Cine(String name, double costUnit, int cantStock,
                boolean available, String director) {
        super(name, costUnit, cantStock, available);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String hello(String greeting) {
        return "thank you for stop by!";
    }

        public String toString () {
            return "CINE PRODUCTS\n" + super.toString() + "Director: "
                    + this.director;
        }


    @Override
    public String sayHello(String greeting) {
        return null;
    }
}
