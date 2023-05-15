package com.knoldus.question1;

import java.util.Arrays;
import java.util.List;

public class Pizza {
    private String size; // Represents the size of the pizza
    private String crustType; // Represents the type of crust (e.g., thin, thick)
    private String sauceType; // Represents the type of sauce (e.g., tomato, BBQ)
    private List<String> toppings; // Represents the list of toppings on the pizza


    public Pizza() {
    }

    //Parameterized constructor for Pizza class.
    public Pizza(String size, String crustType, String sauceType, List<String> toppings) {
        this.size = size;
        this.crustType = crustType;
        this.sauceType = sauceType;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", sauceType='" + sauceType + '\'' +
                ", toppings=" + List.of(toppings) +
                '}';
    }
}
