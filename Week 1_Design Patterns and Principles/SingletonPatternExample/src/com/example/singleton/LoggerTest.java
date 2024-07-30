package com.example.singleton;

public class LoggerTest {

    public static void main(String[] args) {
        // Get the only instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("logger1 and logger2 refer to different instances.");
        }

        // Log messages using the singleton instance
        logger1.log("This is a log message.");
        logger2.log("This is another log message.");
    }
}
