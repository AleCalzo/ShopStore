package com.solvd.cultural;

public class VideoGame extends Product {

    private String type;

    public VideoGame(String name, double costUnit, int cantStock,
                     boolean available, String type) {
        super(name, costUnit, cantStock, available);
        this.type = type;
    }

    @Override
    public String toString() {
        return "VIDEOGAME ARTICLE\n" + super.toString() + "Type: "
                + this.type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

