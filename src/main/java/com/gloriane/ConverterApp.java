package com.gloriane;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

public class ConverterApp {

    public static void main(String[] args) {
        System.out.println("Welcome To My Converter Application");
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Choose your converter : ");
        System.out.println(" 1- Currency Converter ");
        System.out.println(" 2- Temperature Converter ");
        System.out.println(" 3- Distance Converter ");
        System.out.println(" 4- Exit ");
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

}

