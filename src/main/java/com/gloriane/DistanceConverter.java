package com.gloriane;

import java.util.Scanner;

public class DistanceConverter {

    public void displayMenu() {
        System.out.println("\n=== Distance Converter Menu ===");
        System.out.println("1. Convert Meters to Kilometers");
        System.out.println("2. Exit");
        System.out.print("Enter your choice (1-2): ");
    }

    public void convert() {
        System.out.println("Distance Converter Selected.");
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        // Implementation of distance conversion logic goes here
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter distance in meters: ");
                    double meters = scanner.nextDouble();
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
