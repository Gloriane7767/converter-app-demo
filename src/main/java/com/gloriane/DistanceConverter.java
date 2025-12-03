package com.gloriane;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DistanceConverter {

    public void displayMenu() {
        System.out.println("\n=== Distance Converter Menu ===");
        System.out.println("1. Convert Meters to Kilometers");
        System.out.println("2. Exit");
        System.out.print("Enter your choice (1-2): ");
    }

    // Implementation of currency conversion logic goes here
    public void convert() {
        System.out.println("=== Distance Converter Selected ===");
        Scanner scanner = new Scanner(System.in);

        // Controls the loop
        boolean running = true;

        // Do conversion
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            LocalDateTime timestamp = LocalDateTime.now();
            System.out.println("Transaction time: " + timestamp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

            switch (choice) {
                case 1:
                    System.out.println("Enter distance in meters: ");
                    double meters = scanner.nextDouble();
                    if (meters < 0) {
                        System.out.println("Distance cannot be negative.");
                        break;
                    }
                    double kilometers = meters / 1000.0; // Conversion factor
                    System.out.printf("%.2f meters = %.2f kilometers%n", meters, kilometers);
                    break;

                case 2:
                    running = false;
                    System.out.println("Exiting Distance Converter.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

    }

}
