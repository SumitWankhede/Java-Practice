package com.billsburger;

/**
 * Created by Sumit on 28-Jun-17.
 */
class Hamburgers {
    private String breadRollType;
    private int price;
    private String meat;
    private String burgerType = "Classic Hamburger";
    private int extra = 0;


    public Hamburgers(String breadRollType, int price, String meat) {
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = meat;
    }

    public int getPrice(){
        return price + extra;
    }

    public void addExtra(String item){
        extra += new Item(item).getPrice();
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getBurgerType() {
        return burgerType;
    }
}

class Item{
    private String item;

    public Item(String item) {
        this.item = item;
    }

    public int getPrice() {

        switch(item){
            case "tomato":
                return 10;
            case "lattuce":
                return 15;
            case "cheese":
                return 20;
            case "carrot":
                return 25;
        }

        return 0;
    }
}

class HealthyBurger extends Hamburgers{
    private Item item1;
    private Item item2;
    private String burgerType = "Healthy Hamburger";
    private int extra = 0;

    public HealthyBurger(String breadRollType, int price, String meat, Item item1, Item item2) {
        super(breadRollType, price, meat);
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + item1.getPrice() + item2.getPrice();
    }
}

class DeluxeBurger extends Hamburgers{
    private String burgerType = "Deluxe Hamburger";

    public DeluxeBurger(String breadRollType, int price, String meat) {
        super(breadRollType, price, meat);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 25;
    }

    @Override
    public void addExtra(String item) {
        System.out.println("No Extra item allowed in deluxe burger");
    }
}