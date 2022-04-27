package com.solvd.exceptions;

public class InvalidOption extends RuntimeException{

        public InvalidOption(String s) {
            super("You select an invalid option, please try again.");
        }
    }

