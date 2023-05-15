package com.knoldus.question3;

/**
 * Question:
 * Create a Shape interface with a method called draw that prints the shape name.
 * Implement three classes that implement the Shape interface: Circle, Rectangle, and Square.
 * Create a ShapeFactory class that has a method called getShape that takes a string as input
 * and returns a Shape object based on the input string. If the input string is "Circle", return a Circle object.
 * If the input string is "Rectangle", return a Rectangle object. If the input string is "Square",
 * return a Square object. If the input string is not recognized, return null.
 * Use the ShapeFactory class to create at least three different Shape objects and call their draw method to print their name.
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create Circle shape
        Shape circle = shapeFactory.getShape("Circle");
        if (circle != null) {
            circle.draw();
        }

        // Create Rectangle shape
        Shape rectangle = shapeFactory.getShape("Rectangle");
        if (rectangle != null) {
            rectangle.draw();
        }

        // Create Square shape
        Shape square = shapeFactory.getShape("Square");
        if (square != null) {
            square.draw();
        }
    }
}
