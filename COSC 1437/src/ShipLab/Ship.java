//************************************************************************
// Author: Benjamin Alva
// Date: 4 Apr 2025
// Language: Java
// Assignment: Module 4 Lab - Ship
/* Description: A class that models a ship with
 *               details. (name, type, year, and tonnage)*/
//************************************************************************
package ShipLab;

/**
 * The ShipLab.ShipLab class represents a ship with attributes.
 */
public class Ship {
    /**
     * Declare instance variables
     *
     * <ul>
     *     <li>name: The name of the ship</li>
     *     <li>type: The type of the ship</li>
     *     <li>year: The year of the ship</li>
     *     <li>tonnage: The tonnage of the ship</li>
     * </ul>
     */
    private String name;
    private String type;
    private int year;
    private double tonnage;

    /**
     * Default Constructor
     * Initializes the ship with default values.
     */
    public Ship() {
        name = "Unknown name";
        type = "Unknown type";
        year = 1850;
        tonnage = 0.0;
    } // end of default constructor


    /**
     * Parameterized Constructor
     * Initializes the ship with specified values.
     * If the provided values are invalid, it sets to default values.
     *
     * @param name the name of the ship
     * @param type the type of the ship
     * @param year the year of the ship
     * @param tonnage the tonnage of the ship
     */
    public Ship(String name, String type, int year, double tonnage) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        else {
            this.name = "Unknown name";
        }
        if (type != null && !type.isEmpty()) {
            this.type = type;
        }
        else {
            this.type = "Unknown type";
        }
        if (year > 1850 && year <= 2026) {
            this.year = year;
        }
        else {
            this.year = 1850;
        }
        if (tonnage > 0.0) {
            this.tonnage = tonnage;
        }
        else {
            this.tonnage = 0.0;
        }
    } // end of parameterized constructor


    /**
     * Copy Constructor
     * Initializes the ship with the values from another ship.
     *
     * @param other the ship to copy values from
     */
    public Ship(Ship other) {
        this.name = other.name;
        this.type = other.type;
        this.year = other.year;
        this.tonnage = other.tonnage;
    } // end of copy constructor

    // Getters

    /**
     * Returns the name of the ship.
     *
     * @return the name of the ship
     */
    public String getName() {
        return name;
    } // end of getName


    /**
     * Returns the type of the ship.
     *
     * @return the type of the ship
     */
    public String getType() {
        return type;
    } // end of getType


    /**
     * Returns the year of the ship.
     *
     * @return the year of the ship
     */
    public int getYear() {
        return year;
    } // end of getYear


    /**
     * Returns the tonnage of the ship.
     *
     * @return the tonnage of the ship
     */
    public double getTonnage() {
        return tonnage;
    } // end of getTonnage

    // Setters

    /**
     * Sets the name of the ship.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        else {
            this.name = "Unknown name";
        }
    } // end of setName


    /**
     * Sets the type of the ship.
     *
     * @param type the type to set
     */
    public void setType(String type) {
        if (type != null && !type.isEmpty()) {
            this.type = type;
        }
        else {
            this.type = "Unknown type";
        }
    } // end of setType


    /**
     * Sets the year of the ship.
     *
     * @param year the year to set
     */
    public void setYear(int year) {
        if (year > 1850 && year <= 2026) {
            this.year = year;
        }
        else {
            this.year = 1850;
        }
    } // end of setYear


    /**
     * Sets the tonnage of the ship.
     *
     * @param tonnage the tonnage to set
     */
    public void setTonnage(double tonnage) {
        if (tonnage > 0.0) {
            this.tonnage = tonnage;
        }
        else {
            this.tonnage = 0.0;
        }
    } // end of setTonnage


    /**
     * Returns a string representation of the ship.
     *
     * @return a string representation of the ship
     */
    public String printShip() {
            String shipReturn = "Ship Details: \n" + "Name: " +
                    this.getName();
            shipReturn += "\n" + "Type: " +
                    this.getType();
            shipReturn += "\n" + "Year Built: " +
                    this.getYear();
            shipReturn += "\n" + "Tonnage: " +
                    this.getTonnage() + " tons";
            return shipReturn;
    } // end of printShip
} // end of Ship class
