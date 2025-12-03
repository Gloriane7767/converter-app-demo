package com.gloriane;

import java.util.Scanner;

public class CurrencyConverter {
    public void convert() {
        System.out.println("Currency Converter Selected.");
        Scanner scanner = new Scanner(System.in);

       // Controls the loop
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
