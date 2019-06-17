package com.noob.cofeeshop;

public class Drink {
    private String name;
    private String description;
    private int imageResouceId;

    public static final Drink[] drinks = {
            new Drink("Latte", " A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResouceId){
        this.name = name;
        this.description = description;
        this.imageResouceId = imageResouceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResouceId(){
        return imageResouceId;
    }

    public String toString(){
        return this.name;
    }
}
