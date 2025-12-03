package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";

    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean takeawayAdded = false;
    private boolean billGenerated = false;

    int cheesePrice = 80;
    int vegToppings = 70;
    int nonVegToppings = 120;
    int takeawayPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.price = 300;
        } else {
            this.price = 400;
        }

        bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheeseAdded){
            this.price += cheesePrice;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!extraToppingsAdded){
            if(isVeg){
                this.price += vegToppings;
            } else {
                this.price += nonVegToppings;
            }
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!takeawayAdded){
            this.price += takeawayPrice;
            takeawayAdded = true;
        }
    }

    public String getBill(){
        if(!billGenerated){

            if(extraCheeseAdded){
                bill += "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if(extraToppingsAdded){
                if(isVeg){
                    bill += "Extra Toppings Added: " + vegToppings + "\n";
                } else {
                    bill += "Extra Toppings Added: " + nonVegToppings + "\n";
                }
            }
            if(takeawayAdded){
                bill += "Paperbag Added: " + takeawayPrice + "\n";
            }

            bill += "Total Price: " + this.price + "\n";

            billGenerated = true;
        }

        return this.bill;
    }
}
