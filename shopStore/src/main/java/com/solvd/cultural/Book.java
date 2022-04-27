package com.solvd.cultural;

import com.solvd.interfaces.Author;
import com.solvd.interfaces.Regards;

public class Book extends Product implements Author, Regards {


    private String author;


    public Book() {
    }

    public Book(String name, double costUnit, int cantStock,
                boolean available, String author) {
        super(name, costUnit, cantStock, available);
        this.author = author;
    }

    public String nameAutohors(String nameA) {
        return "This Author name is:" + nameA;
    }

    public String sayHello(String greeting) {
        return "thank you for stop by!";
    }

    @Override
    public String toString() {
        return "BOOK ARTICLE\n" + super.toString() + "Author: "
                + this.author;
    }


}
