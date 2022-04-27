package com.solvd.test;

import com.solvd.cultural.Cine;
import com.solvd.cultural.Management;
import com.solvd.cultural.Product;
import com.solvd.cultural.VideoGame;
import com.solvd.cultural.reads.Reads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.io.*;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Test {
    private static final Logger LOG = LogManager.getLogger("");
    public static void main(String[] args) {

        LOG.info("Welcome to the Big Store of Music, Videogames, Movies, Books and much more!\n--------\n"
                + "This program simulate a shop to buy products\n"
                + "The articles can only be sold if they are availables in the store\n"
                + "The Custumer can:\n"
                + "\t Buy products availabless.\n"
                + "\t Add more products to the cart.\n"
                + "\t Check for the final bill.");

        boolean continues = true;
        int lectureProduct, lectureQuantity;


        Product disc1 = new Music("Portishead", 18.53, 6, true, "Trip Hop");
        Product disc2 = new Music("Radiohead", 21.2, 20, true, "Rock");
        Product cine1 = new Cine("Hierro 3", 30.2, 5, true, "Kim Ki Duk");
        Product game1 = new VideoGame("Mario Bross", 35.11, 0, false,
                "Platforms");

        Product catalogue[] = new Product[Product.dimentionArray];

        Management management = new Management();

        catalogue[0] = disc1;
        catalogue[1] = disc2;
        catalogue[2] = cine1;
        catalogue[3] = game1;

        Collection<String> values= new ArrayList<>();

        values.add("game2");

        do {
            LOG.debug("\n\n Enter an Option:\n"
                    + "1. Show products\n" + "2. Sell products\n"
                    + "3. Show box\n"
                    + "EXIT --> Press any other number\n");
            switch (Reads.datoInt()) {
                case 1:
                    management.showProducts(catalogue);
                    break;
                case 2:
                    LOG.debug("¿What product would you like to buy?");
                    management.showNameProducts(catalogue);
                    lectureProduct = Reads.datoInt();
                    LOG.debug("¿How many would you like to buy?");
                    lectureQuantity = Reads.datoInt();

                    management.buyProduct(catalogue, lectureProduct,
                            lectureQuantity);
                    break;
                case 3:
                    LOG.debug(management.showRegister + " $");
                    break;
                default:

                    continues = false;
            }

        } while (continues);

        LOG.debug("---- See you soon!!. ----");

    }

    public static class Music extends Product {


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
}


