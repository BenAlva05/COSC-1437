//************************************************************************
// Author: Benjamin Alva
// Date: 5 Feb 2025
// Language: Java
// Assignment: Restaurant Ordering System
/* Description: Ordering system that allows user to add items, place an
                order and view the total cost. */
//************************************************************************

// Import libraries
import java.text.NumberFormat;
import java.util.Scanner;


public class RestaurantOrderingSystem {


    // Display all the food choices and option to place order
    private static String displayMenu() {
        // Declare variable
        String menu;

        menu = """
                
                Please choose an item from the menu:\s
                1. Puffy Tacos - $5.99
                2. Fajita Nachos - $8.75
                3. Chicken Tortilla Soup - $10.95
                4. Drink - $3.50
                5. Place Order""";

        return menu;
    }


    // return the price to the matching user selection
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
    private static String printReceipt(String total) {
        String receipt;

        receipt = "\nOrder placed! Your total is: " + total +
                "\nThank you for choosing Benjamin's Restaurant\n";

        return receipt;

    }


    public static void main(String[] args) {
        // Declare local variables
        NumberFormat currFormat = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int menuSelection;
        double total = 0;
        double price = 0;

        // Introduce program
        System.out.println("Welcome to Benjamin's Restaurant");

        // Loop until exit is true
        while (!exit) {
            // Display menu and grab user's selection
            System.out.print(displayMenu());
            System.out.print("\nEnter your choice: ");
            menuSelection = scanner.nextInt();

            // Get the price, add to total
            if (menuSelection != 5) {
                price = addItemToOrder(menuSelection, price);
                total += price;

                // Tell user their current total
                System.out.println("Item added to your order. " +
                        "Current total : " + currFormat.format(total));
            }

            else { // If user chooses 5, display total and exit
                System.out.println(printReceipt
                        (currFormat.format(total)));
                scanner.close();
                exit = true;

            }
        }
    }
}
