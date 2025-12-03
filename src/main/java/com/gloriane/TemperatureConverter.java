package com.gloriane;

import java.util.Scanner;

public class TemperatureConverter {

    // Method to display the menu
    void displayMenu() {
        System.out.println("Convert to: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Exit");
    }
    
    public void convert() {
        System.out.println("Temperature Converter Selected.");
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            
            double result;
            switch (choice) {
                case 1:
                    System.out.println("Enter Temperature: ");
                    double temperature = scanner.nextDouble();
                    result = (temperature * 9 / 5) + 32;
                    System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", temperature, result);
                    break;
                case 2:
                    System.out.println("Enter Temperature: ");
                    temperature = scanner.nextDouble();
                    result = (temperature - 32) * 5 / 9;
                    System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", temperature, result);
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting Temperature Converter.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}