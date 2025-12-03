package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        // Deluxe pizza comes with cheese + toppings by default
        super.addExtraCheese();
        super.addExtraToppings();
    }
}

