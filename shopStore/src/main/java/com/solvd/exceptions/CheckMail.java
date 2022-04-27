package com.solvd.exceptions;

import javax.swing.*;

public class CheckMail {

    String email = JOptionPane.showInputDialog("Please enter your email");

    static void checkmail(String email) throws WrongEmail {

        int atSing = 0;
        boolean dot=false;
        if (email.length()<4){

            throw new WrongEmail("Wrong email, please try again");
        }

    }
}

class WrongEmail extends RuntimeException{
    public WrongEmail (){}
    public WrongEmail (String erorMje){

        super(erorMje);
    }
}