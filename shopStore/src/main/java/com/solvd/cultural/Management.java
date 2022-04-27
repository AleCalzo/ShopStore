package com.solvd.cultural;

import org.apache.log4j.Logger;
import java.util.stream.*;

public class Management {

    private static Logger LogJava = Logger.getLogger(Management.class);

    public boolean showRegister;
    //Attributes
    private Product products[] = null;
    private double register;

    //Constructors
    public Management() {
    }

    public Management(Product[] products) {
        this.products = products;
    }

    //Methods
    public Product[] loadProducts() {

        return products;
    }

    public void showProducts(Product[] products) {

        IntStream myStream = IntStream.of(products.length);

            LogJava.info(products[products.length] + "n-------n");
        }


    public void showNameProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + " " + products[i].getName() + "n");
        }
        LogJava.info("n------------n");
    }

    public double buyProduct(Product[] products, int num, int numbersUnit) {
        if (products[num - 1].isAvailable()) {
            if (products[num - 1].getCantStock() >= numbersUnit) {
                System.out.println("the purchase has been successful!!n");
                products[num - 1].setCantStock(products[num - 1].getCantStock() - numbersUnit);
                return register += numbersUnit * products[num - 1].getCostUnit();
            } else {
                LogJava.warn("There is not enough products");
            }
            return register;
        }
         double showRegister;{
            System.out.print("El total de la caja es ");
            register = Math.round(register * 100);
            return register / 100;
        }
    }
}