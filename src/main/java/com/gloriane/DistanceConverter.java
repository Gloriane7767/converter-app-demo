package com.gloriane;

import java.util.Scanner;

public class DistanceConverter {
    public void convert() {
        System.out.println("Distance Converter Selected.");
        Scanner scanner = new Scanner(System.in);

        // Implementation of distance conversion logic goes here
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371; // Conversion factor
        System.out.printf("%.2f kilometers = %.2f miles%n", kilometers, miles);
    }

}
