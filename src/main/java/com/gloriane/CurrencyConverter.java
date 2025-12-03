package com.gloriane;

import java.util.Scanner;

public class CurrencyConverter {

    // Method to display the menu
    void displayMenu() {
        System.out.println("\n=== Currency Converter Menu ===");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

    public void convert() {
        System.out.println("Currency Converter Selected.");
        Scanner scanner = new Scanner(System.in);
        
       // Controls the loop
        boolean running = true;

        // Do conversion
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            double amount, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter amount in SEK: ");
                    amount = scanner.nextDouble();
                    result = amount * 0.11; // Example conversion rate
                    System.out.printf("%.2f SEK = %.2f USD%n", amount, result);
                    break;
                case 2:
                    System.out.print("Enter amount in USD: ");
                    amount = scanner.nextDouble();
                    result = amount * 9.09; // Example conversion rate
                    System.out.printf("%.2f USD = %.2f SEK%n", amount, result);
                    break;
                case 3:
                    System.out.print("Enter amount in SEK: ");
                    amount = scanner.nextDouble();
                    result = amount * 0.095; // Example conversion rate
                    System.out.printf("%.2f SEK = %.2f Euro%n", amount, result);
                    break;
                case 4:
                    System.out.print("Enter amount in Euro: ");
                    amount = scanner.nextDouble();
                    result = amount * 10.53; // Example conversion rate
                    System.out.printf("%.2f Euro = %.2f SEK%n", amount, result);
                    break;
                case 5:
                    running = false; // Exit the loop
                    System.out.println("Exiting Currency Converter.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}