package com.company;

public class BkashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("i am paying by Bkash");
    }
}
