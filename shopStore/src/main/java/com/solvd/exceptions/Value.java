package com.solvd.exceptions;

import java.util.Scanner;

public class Value extends Exception{

    public int menu() throws InvalidOption {
        int option = 1;
        //LOG.debug("Chose the option below:" + "\n" + "Opcion 1: Medical Department" + "\n" + "Option 2: Radiology " + "\n" + "Option 3:Nursery" + "\n" + "Option 4:Emergency");

        try {
            Scanner scanner = null;
            option = scanner.nextInt();


        } catch (Exception e) {
         //   LOG.debug("Sir/Miss, since you did not decide, i will sent you to the Medical department");
        }
        if (option > 4) {
            throw new InvalidOption ("\n" + "You enter a invalid option, Try again please");
        }
        return option;

    }
    }


