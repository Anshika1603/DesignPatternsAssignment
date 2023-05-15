package com.knoldus.question1;

import java.util.List;

/**
 * Question:
 * Create a Builder class for a Pizza object that allows the user to specify the size, crust type, sauce type, and toppings.
 * Demonstrate how to use the Builder class to create a Pizza object.
 */
public class Main {
    public static void main(String[] args) {

        // Create a PizzaBuilder instance
        PizzaBuilder builder = new PizzaBuilder();

        // Set the attributes of the pizza using the builder method
        builder.setSize("Medium");
        builder.setCrustType("Thin");
        builder.setSauceType("Tomato");
        builder.setToppings(List.of("Capsicum","Cheese","Mushrooms"));

        // Build the Pizza object
        Pizza pizza = builder.build();

        // Print the attributes of the pizza
        System.out.println("Size: " + pizza.getSize());
        System.out.println("Crust Type: " + pizza.getCrustType());
        System.out.println("Sauce Type: " + pizza.getSauceType());
        System.out.println("Toppings: " + pizza.getToppings());
    }
}
