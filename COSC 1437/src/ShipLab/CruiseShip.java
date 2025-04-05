//************************************************************************
// Author: Benjamin Alva
// Date: 4 Apr 2025
// Language: Java
// Assignment: Module 4 Lab - Ship
/* Description: A class that models a CruiseShip with
 *               details. (number of pools and passenger capacity)*/
//************************************************************************
package ShipLab;

/**
 * The CruiseShip class represents a cruise ship with attributes.
 */
public class CruiseShip extends Ship {
    /**
     * Declare instance variables
     *
     * <ul>
     *     <li>numberOfPools: The number of pools on the
     *     cruise ship</li>
     *     <li>passengerCapacity: The passenger
     *     capacity of the cruise ship</li>
     * </ul>
     */
    private int numberOfPools;
    private int passengerCapacity;


    /**
     * Default Constructor
     * Initializes the cruise ship with default values.
     */
    public CruiseShip() {
        super();
        numberOfPools = 0;
        passengerCapacity = 0;
    } // end of default constructor


    /**
     * Parameterized Constructor
     * Initializes the cruise ship with specified values.
     * If the provided values are invalid, it sets to default values.
     *
     * @param name the name of the cruise ship
     * @param type the type of the cruise ship
     * @param year the year of the cruise ship
     * @param tonnage the tonnage of the cruise ship
     * @param numberOfPools the number of pools on the
     *                     cruise ship
     * @param passengerCapacity the passenger capacity of the
     *                         cruise ship
     */
    public CruiseShip(String name, String type, int year,
                      double tonnage, int numberOfPools,
                      int passengerCapacity) {
        super(name, type, year, tonnage);
        if (numberOfPools >= 0) {
            this.numberOfPools = numberOfPools;
        }
        else {
            this.numberOfPools = 0;
        }
        if (passengerCapacity >= 0) {
            this.passengerCapacity = passengerCapacity;
        }
        else {
            this.passengerCapacity = 0;
        }
    } // end of parameterized constructor`

    /**
     * Copy Constructor
     * Initializes the cruise ship with the values from
     * another cruise ship.
     *
     * @param other the cruise ship to copy values from
     */
    public CruiseShip(CruiseShip other) {
        super(other.getName(), other.getType(), other.getYear(),
                other.getTonnage());
        this.numberOfPools = other.numberOfPools;
        this.passengerCapacity = other.passengerCapacity;
    }

    // Getters

    /**
     * Gets the number of pools on the cruise ship.
     *
     * @return the number of pools
     */
    public int getNumberOfPools() {
        return numberOfPools;
    } // end of getNumberOfPools


    /**
     * Gets the passenger capacity of the cruise ship.
     *
     * @return the passenger capacity
     */
    public int getPassengerCapacity() {
        return passengerCapacity;
    } // end of getPassengerCapacity

    // Setters

    /**
     * Sets the number of pools on the cruise ship.
     *
     * @param numberOfPools the number of pools to set
     */
    public void setNumberOfPools(int numberOfPools) {
        if (numberOfPools >= 0) {
            this.numberOfPools = numberOfPools;
        }
        else {
            this.numberOfPools = 0;
        }
    } // end of setNumberOfPools


    /**
     * Sets the passenger capacity of the cruise ship.
     *
     * @param passengerCapacity the passenger capacity to set
     */
    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity >= 0) {
            this.passengerCapacity = passengerCapacity;
        }
        else {
            this.passengerCapacity = 0;
        }
    } // end of setPassengerCapacity


    /**
     * Returns a string representation of the cruise ship.
     *
     * @return a string representation of the cruise ship
     */
    @Override
    public String printShip(){
        String shipReturn = super.printShip();
        shipReturn += "\n" + "Passenger Capacity: " +
                this.getPassengerCapacity();
        shipReturn += "\n" + "Number of Pools: " +
                this.getNumberOfPools();
        return shipReturn;
    } // end of printShip
} // end of CruiseShip
