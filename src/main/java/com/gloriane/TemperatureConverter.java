package com.gloriane;

import java.util.Scanner;

public class TemperatureConverter {
    public void convert() {
        System.out.println("Temperature Converter Selected.");
        Scanner scanner = new Scanner(System.in);

        // Implementation of temperature conversion logic goes here
        System.out.println("Enter Temperature: ");
        double temperature = scanner.nextDouble();
        System.out.println("Convert to: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = (temperature * 9/5) + 32;
                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", temperature, result);
                break;
            case 2:
                result = (temperature - 32) * 5/9;
                System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", temperature, result);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }
}
