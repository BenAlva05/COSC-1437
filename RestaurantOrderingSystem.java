//************************************************************************
// Author: Benjamin Alva
// Date: 5 Feb 2025
// Language: Java
// Assignment: Restaurant Ordering System
/* Description: Ordering system that allows user to add items, place an
                order and view the total cost. */
//************************************************************************

// Import Scanner library
import java.util.Scanner;


public class RestaurantOrderingSystem {


    // Display all the food choices and option to place order
    private static String displayMenu() {
        String menu;

        menu = "\nPlease choose and item from the menu: \n" +
                "1. Puffy Tacos - $5.99\n" +
                "2. Fajita Nachos - $8.75\n" +
                "3. Chicken Tortilla Soup - $10.95\n" +
                "4. Drink - $3.50\n" +
                "5. Place Order";
        return menu;
    }


    /* When a user picks an option, return the price and add it to the
    balance */
    private static double addItemToOrder(int menuSelection,
                                         double price) {

        if (menuSelection == 1) {
            price = 5.99;
        }
        else if (menuSelection == 2) {
            price = 8.75;
        }
        else if (menuSelection == 3) {
            price = 10.95;
        }
        else if (menuSelection == 4) {
            price = 3.50;
        }
        return price;
    }

    // Return the cost of the order
    private static String printReceipt(double total) {
        return String.format("%nOrder placed! Your total is: $%.2f" +
                "%nThank you for choosing Benjamin's Restaurant!%n"
                , total);

    }


    public static void main(String[] args) {
        // Declare variables
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int menuSelection;
        double total = 0;
        double price = 0;
        double itemPrice;

        // Introduce program
        System.out.println("Welcome to Benjamin's Restaurant\n");

        while (!exit) {
            // Display menu and grab user's selection
            System.out.print(displayMenu());
            System.out.print("\nEnter your choice: ");
            menuSelection = scanner.nextInt();

            // If user chooses 5, display total and exit
            if (menuSelection == 5) {
                System.out.println(printReceipt(total));
                scanner.close();
                exit = true;
            }

            //Grab the price, add to total
            else {
                itemPrice = addItemToOrder(menuSelection, price);
                total += itemPrice;

                System.out.printf("Item added to your order. " +
                        "Current total : $%.2f%n", total);
            }
        }
    }
}