package com.solvd.collections;

import com.solvd.interfaces.Payment;

public class PaymentType implements Comparable<PaymentType>, Payment {

    public PaymentType(int num, String type) {
        number = num;
        types = type;
    }


    public double compareTo ; PaymentType() {

    }

    private int number;
    private String types;

    public String getTypes() {
        return types;
    }

    @Override
    public int compareTo(PaymentType o) {
        return 0;
    }
}

