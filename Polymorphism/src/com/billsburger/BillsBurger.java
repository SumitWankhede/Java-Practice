package com.billsburger;

/**
 * Created by Sumit on 28-Jun-17.
 */
public class BillsBurger {

    public static void main(String[] args) {
        Hamburgers hamburger = new Hamburgers("Wheat",40,"Chicken");
        hamburger.addExtra("cheese");
        hamburger.addExtra("cheese");

        generateInvoice(hamburger);
    }

    public static void generateInvoice(Hamburgers hamburger) {
        System.out.println("------------Invoice------------");
        System.out.println("#1. " + hamburger.getBurgerType() + " for Price: " + hamburger.getPrice());
    }
}
