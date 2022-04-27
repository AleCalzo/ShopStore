package com.solvd.cultural;

public class Music extends Product {

    private String gender;

    public Music() {
    }
    public Music(String name, double costUnit, int cantStock,
                 boolean available, String gender) {
        super(name, costUnit, cantStock, available);
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MUSIC ARTICLE\n" + super.toString() + "Gender: "
                + this.gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
