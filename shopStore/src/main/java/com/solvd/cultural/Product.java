package com.solvd.cultural;

public abstract class Product {

    protected String author;
    private String name;
    private double costUnit;
    private int cantStock;
    private boolean available = false;
    public static int dimentionArray;

    public Product() {
    }

    public Product(String name, double costUnit, int cantStock,
                   boolean available) {
        this.name = name;
        this.costUnit = costUnit;
        this.cantStock = cantStock;
        this.available = available;

        dimentionArray++;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" + "Unit Cost: "
                + this.getCostUnit() + " €\n" + "In Stock: "
                + this.getCantStock() + "\n";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public double getCostUnit() {
        return this.costUnit;
    }

    public void setCostUnit(double costUnit) {
        this.costUnit = costUnit;
    }

    public int getCantStock() {
        return this.cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public boolean isAvailable() {
        if (getCantStock() > 0)
            this.available = true;
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
