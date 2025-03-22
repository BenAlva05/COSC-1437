//************************************************************************
// Author: Benjamin Alva
// Date: 21 Mar 2025
// Language: Java
// Assignment: Module 4 Lab - Car Inventory Management System
/* Description: */
//************************************************************************

package CarInventoryManagementSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.text.NumberFormat;

public class CarDriver {


    private static void addCar(ArrayList<Car> cars, Scanner scanner) {

        // Declare local vars
        scanner = new Scanner(System.in);
        String make;
        String model;
        int year = 0;
        double wholesaleCost = 0.0;
        boolean validInput;

        // Accept user input and assign to vars
        System.out.println("\nAdding a car to the lot:");

        // Make
        System.out.print("Enter the make of the Car: ");
        make = scanner.nextLine();

        // Model
        System.out.print("Enter the model of the Car: ");
        model = scanner.nextLine();

        // Year
        validInput = false;
        System.out.print("Enter the year of the Car: ");
        // Catch invalid input for year
        while (!validInput) {
            try {
                year = scanner.nextInt();
                validInput = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number."
                        + "\nEnter the year of the Car: ");
                scanner.next();
            }
        } // End while loop

        // Wholesale Cost
        validInput = false;
        System.out.print("Enter the wholesale cost of the Car: ");
        // Catch invalid input for wholesaleCost
        while (!validInput) {
            try {
                wholesaleCost = scanner.nextDouble();
                validInput = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print
                        ("Invalid input. Please enter a number " +
                                "without a dollar sign and comma."
                        + "\nEnter the wholesale cost of the Car: ");
                scanner.next();
            }
        } // End while loop
        cars.add(new Car(wholesaleCost, make, model, year));
        System.out.println("Car successfully added to the lot!");
    } // end of addCar method


    private static void sellCar(ArrayList<Car> cars, Scanner scanner) {

        // Declare local vars
        scanner = new Scanner(System.in);
        int index;
        boolean isValid = false;
        int carCount = 0;

        System.out.print("\nSelling a car from the lot:\n");

        // Loop to display inventory with index
        for (Car car : cars) {
            carCount++;
            System.out.printf("[%d] ", carCount);
            System.out.print(car);
        } // End for loop

        // Accept user input and assign to var
        System.out.print("Enter the Index of which car you would" +
                " like to remove: ");
        while (!isValid) {
            try {
                index = scanner.nextInt() - 1;
                // Remove car
                cars.remove(index);
                System.out.println("Car successfully sold!");
                isValid = true;
            }
            catch (Exception inputMismatchException) {
                System.out.print("\nInvalid input. Please enter " +
                        "a number listed."
                        + "\nEnter the index of the " +
                        "car you would like to remove: ");
                scanner.next();
            }
        } // End while loop
    } // end of sellCar method


    private static void populateInventory(ArrayList<Car> cars) {

        cars.add(new Car(18000.00,
                "Toyota", "Camry", 2020));
        cars.add(new Car(17000.00,
                "Honda", "Civic", 2019));
        cars.add(new Car(22000.00,
                "Ford", "F-150", 2018));
        cars.add(new Car(19000.00,
                "Chevrolet", "Malibu", 2021));
        cars.add(new Car(30000.00,
                "BMW", "3 Series", 2021));
        cars.add(new Car(32000.00,
                "Mercedes", "C-Class", 2019));
        cars.add(new Car(34000.00,
                "Audi", "A4", 2021));
        cars.add(new Car(35000.00,
                "Tesla", "Model 3", 2022));
        cars.add(new Car(18500.00,
                "Hyundai", "Sonata", 2020));
        cars.add(new Car(17000.00,
                "Nissan", "Altima", 2018));
    } // end of populateInventory method


    private static void displayInventory(ArrayList<Car> cars) {

        System.out.println("\nCurrent Inventory:");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%n",
                    "Car Make", "Model",
                    "Year", "Wholesale Cost", "Retail Price");
        for (Car car : cars) {
            System.out.print(car);
        }
    } // end of displayInventory method


    private static void showLotValue(ArrayList<Car> cars) {

        // Declare local vars
        NumberFormat curr = NumberFormat.getCurrencyInstance();
        Iterator<Car> iterator = cars.iterator();
        double totalRetailPrice = 0.0;
        double totalWholesaleCost = 0.0;

        // Iterate through the cars ArrayList
        while (iterator.hasNext()) {
            Car car = iterator.next();
            totalRetailPrice += car.getRetailPrice();
            totalWholesaleCost += car.getWholesaleCost();
        } // End while loop

        // Display the total retail price and wholesale cost
        System.out.println("\nTotal Wholesale value of the lot: " +
                curr.format(totalWholesaleCost));
        System.out.println("Total Retail value of the lot: " +
                curr.format(totalRetailPrice));
    } // end of showLotValue method


    public static int DisplayMenu(Scanner scanner) {

        // Declare local vars
        int userInput = 0;
        boolean isValid = false;

        // Display menu
        System.out.print("\nCar Inventory Management System\n" +
                "1) Display Inventory\n" +
                "2) Add Car\n" +
                "3) Sell Car (Remove)\n" +
                "4) Show Value of lot in Wholesale and Retail\n" +
                "5) Exit" +
                "\nEnter your choice: ");

        // Accept user input and assign to var
        // Catch invalid input
        while (!isValid) {
            try {
                userInput = scanner.nextInt();
                if (userInput >= 1 && userInput <= 5) {
                    isValid = true;
                }
                else {
                    System.out.print("Invalid input." +
                            " Please enter a number listed."
                            + "\nEnter your choice: ");
                }

            }
            catch (Exception inputMismatchException) {
                System.out.print("Invalid input." +
                        " Please enter a number listed."
                        + "\nEnter your choice: ");
                scanner.next();
            }

        } // End while loop

        return userInput;
    } // end of DisplayMenu method


    public static void main(String[] args) {

        // Declare vars
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        boolean exit = false;
        int userInput = 0;

        // Populate the inventory
        populateInventory(cars);

        while (!exit) {

            // Display the menu
            userInput = DisplayMenu(scanner);

            // Switch statement to handle user input
            switch (userInput) {
                case 1: // Display Inventory
                    displayInventory(cars);
                    break;
                case 2: // Add Car
                    addCar(cars, scanner);
                    break;
                case 3: // Sell Car (Remove)
                    sellCar(cars, scanner);
                    break;
                case 4: // Show Value of lot in Wholesale and Retail
                    showLotValue(cars);
                    break;
                case 5: // Exit
                    System.out.println("Exiting program.");
                    exit = true;
                    break;
            } // End switch statement
        } // End while loop
        scanner.close(); // Close scanner
    } // end of main method
} // end of CarDriver class
