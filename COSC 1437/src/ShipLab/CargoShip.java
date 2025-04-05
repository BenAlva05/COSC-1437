//************************************************************************
// Author: Benjamin Alva
// Date: 4 Apr 2025
// Language: Java
// Assignment: Module 4 Lab - Ship
/* Description: A class that models a Cargo ship with
 *               details. (Container count and Cargo capacity)*/
//************************************************************************
package ShipLab;

/**
 * The CargoShip class represents a cargo ship with attributes.
 */
public class CargoShip extends Ship {
    /**
     * Declare instance variables
     *
     * <ul>
     *     <li>containerCount: The number of containers on the
     *     cargo ship</li>
     *     <li>cargoCapacity: The cargo capacity of the cargo ship</li>
     * </ul>
     */
    private int containerCount;
    private double cargoCapacity;


    /**
     * Default Constructor
     * Initializes the cargo ship with default values.
     */
    public CargoShip() {
        super();
        containerCount = 0;
        cargoCapacity = 0.0;
    } // end of default constructor


    /**
     * Parameterized Constructor
     * Initializes the cargo ship with specified values.
     * If the provided values are invalid, it sets to default values.
     *
     * @param name the name of the cargo ship
     * @param type the type of the cargo ship
     * @param year the year of the cargo ship
     * @param tonnage the tonnage of the cargo ship
     * @param containerCount the number of containers on the
     *                      cargo ship
     * @param cargoCapacity the cargo capacity of the cargo ship
     */
    public CargoShip(String name, String type, int year, double tonnage,
                     int containerCount, double cargoCapacity) {
        super(name, type, year, tonnage);
        if (containerCount >= 0) {
            this.containerCount = containerCount;
        }
        else {
            this.containerCount = 0;
        }
        if (cargoCapacity >= 0.0) {
            this.cargoCapacity = cargoCapacity;
        }
        else {
            this.cargoCapacity = 0.0;
        }
    } // end of parameterized constructor


    /**
     * Copy Constructor
     * Initializes the cargo ship with the values from another cargo ship.
     *
     * @param other the cargo ship to copy values from
     */
    public CargoShip(CargoShip other) {
        super(other.getName(), other.getType(), other.getYear(),
                other.getTonnage());
        this.containerCount = other.containerCount;
        this.cargoCapacity = other.cargoCapacity;
    } // end of copy constructor

    // Getters

    /**
     * Returns the number of containers on the cargo ship.
     *
     * @return the number of containers on the cargo ship
     */
    public int getContainerCount() {
        return containerCount;
    } // end of getContainerCount


    /**
     * Returns the cargo capacity of the cargo ship.
     *
     * @return the cargo capacity of the cargo ship
     */
    public double getCargoCapacity() {
        return cargoCapacity;
    } // end of getCargoCapacity

    // Setters

    /**
     * Sets the number of containers on the cargo ship.
     *
     * @param containerCount the number of containers to set
     */
    public void setContainerCount(int containerCount) {
        if (containerCount >= 0) {
            this.containerCount = containerCount;
        }
        else {
            this.containerCount = 0;
        }
    } // end of setContainerCount


    /**
     * Sets the cargo capacity of the cargo ship.
     *
     * @param cargoCapacity the cargo capacity to set
     */
    public void setCargoCapacity(double cargoCapacity) {
        if (cargoCapacity >= 0.0) {
            this.cargoCapacity = cargoCapacity;
        }
        else {
            this.cargoCapacity = 0.0;
        }
    } // end of setCargoCapacity


    /**
     * Returns a string representation of the cargo ship.
     *
     * @return a string representation of the cargo ship
     */
    @Override
    public String printShip(){
        String shipReturn = super.printShip();
        shipReturn += "\n" + "Cargo Capacity: " +
                this.cargoCapacity + " tons\n";
        shipReturn += "Container Count: " +
                this.getContainerCount();
        return shipReturn;
    } // end of printShip
} // end of CargoShip class
