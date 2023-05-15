package com.knoldus.question2;

/**
 * Question:
 * Create a Logger class that logs messages to a file. Implement the Singleton design pattern with eager initialization
 * to ensure that only one instance of the Logger class is created, regardless of how many times it is requested.
 */
public class Main {
    public static void main(String[] args) {

        // Create Instance of the Logger class
        Logger logger = Logger.getInstance();

        // Use the logger for logging message
        logger.log("This is a log message.");
        logger.log("Another log message.");

        // Close the logger
        logger.close();
    }
}
