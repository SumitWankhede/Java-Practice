package com.bank;

import java.util.ArrayList;

/**
 * Created by Sumit on 04-Jul-17.
 */
public class Customers {
    private ArrayList<Double> transaction;
    private String name;

    public Customers(double intialAmount, String name) {
        transaction = new ArrayList<Double>();
        setTransaction(intialAmount);
        this.name = name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public String getName() {
        return name;
    }

    public void setTransaction(double transaction) {
        this.transaction.add(transaction);
    }

    public void setName(String name) {
        this.name = name;
    }
}
