package com.my;
import java.util.ArrayList;

public class PizzaOrder extends Pizza {
    private final ArrayList<Pizza> pizzas;

    public PizzaOrder(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void printOrderSummary() {
     Pizza pp = new Pizza();
     pp.pizzaAmount();
        for (Pizza pizza : pizzas) {
            System.out.println("You choose Pizza ");
            System.out.println("Cuisine :"+ pizza.getCuisine());
            System.out.println("Category :"+ pizza.getCategory());
            System.out.println("Pizza :"+pizza.getVeraity());
            System.out.println("Ordered Size : " + pizza.getSize());
            System.out.println("Toppings with :" + pizza.getToppings());
            System.out.println("Your Amount is :" + valAmount);
        }
    }
}
