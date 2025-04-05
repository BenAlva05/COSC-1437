//************************************************************************
// Author: Benjamin Alva
// Date: 4 Apr 2025
// Language: Java
// Assignment: Module 4 Lab - Ship
/* Description: A Driver program that takes inputs for
                a cruise ship and a cargo ship
                and displays the results*/
//************************************************************************
package ShipLab;

import java.util.Scanner;

public class ShipDriver {
    public static void main(String[] args) {
        // Declare local vars
        String name;
        String type;
        int year = 0;
        double tonnage = 0.0;
        int numberOfPools = 0;
        int passengerCapacity = 0;
        int containerCount = 0;
        double cargoCapacity = 0.0;
        Scanner input = new Scanner(System.in);
        boolean isValid = false;

        // Print the title of the program
        System.out.println("=== Ship Demo ===\n");

        // Get input for the Cargo ship
        System.out.println("Enter details for a Cargo Ship:");

        // get name
        System.out.print("Enter name: ");
        name = input.nextLine();

        // get type
        System.out.print("Enter type (e.g., Cargo): ");
        type = input.nextLine();

        // get year
        System.out.print("Enter year built: ");
        // Catch invalid input for year
        while (!isValid) {
            try {
                year = input.nextInt();
                isValid = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number."
                        + "\nEnter year built: ");
                input.next();
            }
        } // End while loop

        // get tonnage
        System.out.print("Enter tonnage: ");
        // Catch invalid input for tonnage
        isValid = false;
        while (!isValid) {
            try {
                tonnage = input.nextDouble();
                isValid = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number."
                        + "\nEnter tonnage: ");
                input.next();
            }
        } // End while loop

        // get cargo capacity
        System.out.print("Enter cargo capacity (in tons): ");
        // Catch invalid input for cargoCapacity
        isValid = false;
        while (!isValid) {
            try {
                cargoCapacity = input.nextDouble();
                isValid = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number."
                        + "\nEnter cargo capacity: ");
                input.next();
            }
        } // End while loop

        // get container count
        System.out.print("Enter container count: ");
        // Catch invalid input for containerCount
        isValid = false;
        while (!isValid) {
            try {
                containerCount = input.nextInt();
                isValid = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number."
                        + "\nEnter container count: ");
                input.next();
            }
        } // End while loop

        // Create a CargoShip object
        CargoShip cargoShip = new CargoShip(name, type, year, tonnage,
                containerCount, cargoCapacity);

        // Display the Cargo ship details
        System.out.println("\nCreated Cargo Ship:");
        System.out.println(cargoShip.printShip());

        // Get input for the Cruise ship
        System.out.println("\nEnter details for a Cruise Ship:");

        // get name
        input.nextLine(); // Consume the newline character
        System.out.print("Enter name: ");
        name = input.nextLine();

        // get type
        System.out.print("Enter type (e.g., Cruise): ");
        type = input.nextLine();

        // get year
        System.out.print("Enter year built: ");
        // Catch invalid input for year
        isValid = false;
        while (!isValid) {
            try {
                year = input.nextInt();
                isValid = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number."
                        + "\nEnter year built: ");
                input.next();
            }
        } // End while loop

        // get tonnage
        System.out.print("Enter tonnage: ");
        // Catch invalid input for tonnage
        isValid = false;
        while (!isValid) {
            try {
                tonnage = input.nextDouble();
                isValid = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number."
                        + "\nEnter tonnage: ");
                input.next();
            }
        } // End while loop

        // get passenger capacity
        System.out.print("Enter passenger capacity: ");
        // Catch invalid input for passengerCapacity
        isValid = false;
        while (!isValid) {
            try {
                passengerCapacity = input.nextInt();
                isValid = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number."
                        + "\nEnter passenger capacity: ");
                input.next();
            }
        } // End while loop

        // get number of pools
        System.out.print("Enter number of pools: ");
        // Catch invalid input for numberOfPools
        isValid = false;
        while (!isValid) {
            try {
                numberOfPools = input.nextInt();
                isValid = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number."
                        + "\nEnter number of pools: ");
                input.next();
            }
        } // End while loop

        // Close the scanner
        input.close();

        // Create a CruiseShip object
        CruiseShip cruiseShip = new CruiseShip(name, type, year, tonnage,
                numberOfPools, passengerCapacity);

        // Display the Cruise ship details
        System.out.println("\nCreated Cruise Ship:");
        System.out.println(cruiseShip.printShip());

        // Print the end of the program
        System.out.println("\n=== End of Ship Demo ===");

    } // end of main method
} // end of ShipDriver class
