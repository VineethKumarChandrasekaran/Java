package com.practice;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Available Drinks: Coffee, Tea, Cola, Soda");
        System.out.println("Sizes: Small, Medium, Large");

        System.out.print("Enter your drink choice: ");
        String drink = scanner.nextLine().toLowerCase();

        System.out.print("Enter the size (Small, Medium, Large): ");
        String size = scanner.nextLine().toLowerCase();

        double price = 0.0;

        // Determine the price based on drink and size
        switch (drink) {
            case "coffee":
                switch (size) {
                    case "small": price = 2.50; break;
                    case "medium": price = 3.50; break;
                    case "large": price = 4.50; break;
                    default: System.out.println("Invalid size."); return;
                }
                break;

            case "tea":
                switch (size) {
                    case "small": price = 2.00; break;
                    case "medium": price = 3.00; break;
                    case "large": price = 4.00; break;
                    default: System.out.println("Invalid size."); return;
                }
                break;

            case "cola":
                switch (size) {
                    case "small": price = 1.50; break;
                    case "medium": price = 2.50; break;
                    case "large": price = 3.50; break;
                    default: System.out.println("Invalid size."); return;
                }
                break;

            case "soda":
                switch (size) {
                    case "small": price = 1.00; break;
                    case "medium": price = 2.00; break;
                    case "large": price = 3.00; break;
                    default: System.out.println("Invalid size."); return;
                }
                break;

            default:
                System.out.println("Invalid drink choice.");
                return;
        }

        System.out.printf("The price of your %s (%s) is: $%.2f%n", drink, size, price);
    }
}
