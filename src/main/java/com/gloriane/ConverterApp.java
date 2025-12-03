package com.gloriane;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

public class ConverterApp {
    public static void main(String[] args) {
        System.out.println("Welcome To My Converter Application");
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Choose your converter : ");
        System.out.println(" Options : ");
        System.out.println(" 1- Currency Converter ");
        System.out.println(" 2- Temperature Converter ");
        System.out.println(" 3- Distance Converter ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                CurrencyConverter currencyConverter = new CurrencyConverter();
                currencyConverter.convert();
                break;
            case 2:
                TemperatureConverter temperatureConverter = new TemperatureConverter();
                temperatureConverter.convert();
                break;
            case 3:
                DistanceConverter distanceConverter = new DistanceConverter();
                distanceConverter.convert();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    //Currencies Intake
    public static void displayMenu() {
        System.out.println("\n=== Currency Converter Menu ===");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");

    }
}
