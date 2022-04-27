package com.solvd.exceptions;

public class ProductStock extends RuntimeException {
    public ProductStock (){
        super("Sorry, there is no stock for that product");
    }

}
