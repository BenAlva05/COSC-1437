//************************************************************************
// Author: Benjamin Alva
// Date: 21 Mar 2025
// Language: Java
// Assignment: Module 4 Lab - Car Inventory Management System
/* Description: */
//************************************************************************

package CarInventoryManagementSystem;


import java.text.NumberFormat;

/**
 * The `Car` class represents a game character with a Wholesale cost,
 * make, model, and year.
 */
public class Car {


    /**
     * Declare Instance variables
     * <ul>
     *     <li>MARK_UP: The mark up of the car</li>
     *     <li>wholesaleCost: The cost of the car
     *     without a mark up</li>
     *     <li>make: The make of the car
     *     (Honda, Toyota, Ford)</li>
     *     <li>model: The model of the car
     *     (Civic, Tacoma, Mustang)</li>
     *     <li>year: The year of the car
     *     (2020, 2021, 2022)</li>
     * </ul>
     */
    private final double MARK_UP = 0.25;
    private double wholesaleCost;
    private String make;
    private String model;
    private int year;
    private double retailPrice;
    private NumberFormat curr = NumberFormat.getCurrencyInstance();


    /**
     * <p>
     *     Default Constructor.
     * </p>
     * <p>
     *     Initializes the Car with default values.
     * </p>
     * <ul>
     *     <li>wholesaleCost: 0.0</li>
     *     <li>make: Unknown</li>
     *     <li>model: Unknown</li>
     *     <li>year: 0</li>
     * </ul>
     */
    public Car() {
        wholesaleCost = 0.0;
        make = "Unknown";
        model = "Unknown";
        year = 0;
    } // end of default constructor


    /**
     * <p>
     *     Parameterized Constructor.
     * </p>
     * <p>
     *    Initializes the game character with specified values.
     *    If the provided values are invalid,
     *    it sets to default values.
     * </p>
     */
    public Car(double wholesaleCost, String make,
               String model, int year) {
        if (wholesaleCost > 0.0) {
            this.wholesaleCost = wholesaleCost;
        }
        else {
            this.wholesaleCost = 0.0;
        }
        if (make != null && !make.isEmpty()) {
            this.make = make;
        }
        else {
            this.make = "Unknown";
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
        if (year > 1900 && year < 2026) {
            this.year = year;
        }
        else {
            this.year = 0;
        }
    } // end of parameterized constructor


    /**
     * Copy Constructor.
     * Initializes the car with values from another car.
     *
     * @param other the game character constructor to copy values from
     */
    public Car(Car other) {
        this.wholesaleCost = other.wholesaleCost;
        this.make = other.make;
        this.model = other.model;
        this.year = other.year;
    } // end of copy constructor


    // Setters


    /**
     * Modifies the wholesaleCost of the car.
     *
     * @param wholesaleCost the wholesaleCost to set
     */
    public void setWholesaleCost(double wholesaleCost) {
        if (wholesaleCost > 0.0) {
            this.wholesaleCost = wholesaleCost;
        }
        else {
            this.wholesaleCost = 0.0;
        }
    } // end of setWholesaleCost


    /**
     * Modifies the make of the car.
     *
     * @param make the make to set
     */
    public void setMake(String make) {
        if (make != null && !make.isEmpty()) {
            this.make = make;
        }
        else {
            this.make = "Unknown";
        }
    } // end of setMake


    /**
     * Modifies the model of the car.
     *
     * @param model the model to set
     */
    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    } // end of setModel


    /**
     * Modifies the year of the car.
     *
     * @param year the year to set
     */
    public void setYear(int year) {
        if (year > 1900 && year < 2026) {
            this.year = year;
        }
        else {
            this.year = 0;
        }
    } // end of setYear


    // Getters


    /**
     * Accesses the retailPrice of the car.
     *
     * @return the retailPrice of the car
     */
    public double getRetailPrice() {
        return wholesaleCost + wholesaleCost * MARK_UP;
    } // end of getRetailPrice


    /**
     * Accesses the wholesaleCost of the car.
     *
     * @return the wholesaleCost of the car
     */
    public double getWholesaleCost() {
        return wholesaleCost;
    } // end of getWholesaleCost


    /**
     * Accesses the make of the car.
     *
     * @return the make of the car
     */
    public String getMake() {
        return make;
    } // end of getMake


    /**
     * Accesses the model of the car.
     *
     * @return the model of the car
     */
    public String getModel() {
        return model;
    } // end of getModel


    /**
     * Accesses the year of the car.
     *
     * @return the year of the car
     */
    public int getYear() {
        return year;
    } // end of getYear


    /**
     * Overrides the to string method
     *
     * @return a string representation of the car
     */
    @Override
    public String toString() {
        return String.format("%-30s%-30s%-30d%-30s%-30s%n",
                make, model, year,
                curr.format(wholesaleCost),
                curr.format(getRetailPrice()));
    } // end of toString


    /**
     * <p>Overrides the equals method.</p>
     * <p>Compares two cars for equality.</p>
     *
     * @param obj the object to compare
     * @return true or false
     */
    @Override
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (this == obj)
            return true;

        // Check if obj is an instance of Car or not
        if (obj == null || getClass() != obj.getClass())
            return false;

        // typecast obj to Car so that we can compare data members
        return obj.toString().equals(this.toString());
    } // end of equals



} // end of Car class
