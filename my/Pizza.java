package com.my;
import java.util.ArrayList;

public class Pizza {
	
    //cuisine
	private String cuisine;
	public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

	// category
    private String category;
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    //Veraity
    private String veraity;
    public String getVeraity() {
        return veraity;
    }

    public void setVeraity(String veraity) {
        this.veraity = veraity;
    }

    //size
    private String size;
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    //toppings
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
	    pizzaOption=getCategory();
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
        
    //prize
    private String pizza_prize;

    public String setPizzaPrize(String pizza_prize) {
    	if (getCategory().equalsIgnoreCase("Classic")) {
    			System.out.println("classic");
		      if (getSize().equalsIgnoreCase("Large")) {
		    	  pizza_prize = "360";
		      } else if (getSize().equalsIgnoreCase("Medium")) {
		    	  pizza_prize = "210";
		    	  System.out.println("Pizza prize"+pizza_prize);
		      } else if (getSize().equalsIgnoreCase("Regular")) {
		    	  pizza_prize = "135";
		      }
		    } else if (getCategory().equalsIgnoreCase("Premium")) {
		      if (getSize().equalsIgnoreCase("Large")) {
		    	  pizza_prize = "395";
		      } else if (getSize().equalsIgnoreCase("Medium")) {
		    	  pizza_prize = "240";
		      } else if (getSize().equalsIgnoreCase("Regular")) {
		    	  pizza_prize = "165";
		      }
		    } else if (getCategory().equalsIgnoreCase("Supreme")){
		      if (getSize().equalsIgnoreCase("Large")) {
		    	  pizza_prize = "190";
		      } else if (getSize().equalsIgnoreCase("Medium")) {
		    	  pizza_prize = "290";
		      } else if (getSize().equalsIgnoreCase("Regular")) {
		    	  pizza_prize = "190";
		      }
		    }
    	return this.pizza_prize=pizza_prize;
    }
    public String getPizzaPrize() {
    	return this.pizza_prize;
    }
    
}