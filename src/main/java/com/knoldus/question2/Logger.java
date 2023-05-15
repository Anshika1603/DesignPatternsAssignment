package com.knoldus.question2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    // Eagerly initialize the singleton instance
    private static final Logger INSTANCE = new Logger();

    private PrintWriter writer;

    // Private constructor to prevent external instantiation
    private Logger() {
        try {
            // Open the file for appending if it exists, or create a new file if it doesn't exist
            writer = new PrintWriter(new FileWriter("log.txt", true));
        } catch (IOException exception) {
            // Log the error if the file could not be opened
            exception.printStackTrace();
        }
    }

    // Returns the singleton instance
    public static Logger getInstance() {
        return INSTANCE;
    }

    // Writes a message to the log file
    public void log(String message) {
        // Append the message to the end of the file and flush the writer to ensure the message is written immediately
        writer.println(message);
        writer.flush();
    }

    // Closes the file writer when logging is complete
    public void close() {
        writer.close();
    }
}
