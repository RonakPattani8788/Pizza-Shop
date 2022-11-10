package com.my;

import java.util.ArrayList;

public class Pizza {

    public  static int valAmount;

    // cuisine
    private String cuisine;

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCuisine() {
        return cuisine;
    }

    // category 
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Veraity
    private String veraity;

    public String getVeraity() {
        return veraity;
    }

    public void setVeraity(String veraity) {
        this.veraity = veraity;
    }

    // Veraity
    // private String amount;
    // public String getAmount() {
    // return amount;
    // }

    // public void setAmount(String amount) {
    // this.amount = amount;
    // }

    // size
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // toppings
    private ArrayList<String> toppings;

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String toString() {
        return this.size + " pizza with " + this.getToppings();
    }

    public void pizzaSelectOption() {
        String pizzaOption;
        pizzaOption = getCategory();
        switch (pizzaOption) {
            case "Classic":
                System.out.println("-- Classic --");
                System.out.println("1. Tomchi");
                System.out.println("2. Caponito");
                break;
            case "Premium":
                System.out.println("-- Premium --");
                System.out.println("1. Red_Indian");
                System.out.println("2. Party_Lovers");
                break;
            case "Supreme":
                System.out.println("-- Supreme --");
                System.out.println("1. American_Heat");
                System.out.println("2. Re-Union");
                break;
            default:
                System.out.println("Please Choose Pizza");
                break;
        }
    }

 

    public void pizzaAmount() {
        int amt =0;
        if (getCategory() == "Classic") {
            if (getSize() == "Regular") {
               amt = 135;
            } else if (getSize() == "Medium") {
                amt = 152;
                // setAmount("210");
            } else if (getSize() == "Large") {
                amt = 435;
                // setAmount("360");
            }
            // } else if (getCategory() == "Premium") {
            // if (getSize() == "Regular") {
            // setAmount("165");
            // } else if (getSize() == "Medium") {
            // setAmount("240");
            // } else if (getSize() == "Large") {
            // setAmount("395");
            // }
            // } else if (getCategory() == "Supreme") {Regular
            // if (getSize() == "Regular") {
            // setAmount("190");
            // } else if (getSize() == "Medium") {
            // setAmount("290");
            // } else if (getSize() == "Large") {
            // setAmount("425");
            // } 
            valAmount=amt;
        }
        
       
    }
}