package com.knoldus.question1;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    // The pizza object being constructed
    private Pizza pizza;

    // Constructs a new PizzaBuilder Object
    public PizzaBuilder() {
        pizza = new Pizza();
        pizza.setToppings(new ArrayList<>());
    }

    public PizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }

    public PizzaBuilder setCrustType(String crustType) {
        pizza.setCrustType(crustType);
        return this;
    }

    public PizzaBuilder setSauceType(String sauceType) {
        pizza.setSauceType(sauceType);
        return this;
    }

    public PizzaBuilder setToppings(List<String> topping) {
        pizza.setToppings(topping);
        return this;
    }

    // Builds and returns the pizza object.
    public Pizza build() {
        return pizza;
    }
}
