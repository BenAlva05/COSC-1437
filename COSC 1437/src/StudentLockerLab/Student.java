//************************************************************************
// Author: Benjamin Alva
// Date: 22 Mar 2025
// Language: Java
// Assignment: Module 4 Lab - Student Locker Lab
/* Description: A class that models a Student with a first name,
*               last name, and banner ID*/
//************************************************************************

package StudentLockerLab;

/**
 * The `Student` class represents a student with a first name,
 * last name, and banner ID.
 */
public class Student {

    /** Declare Instance variables
     * <ul>
     *     <li>firstName: The first name of the student</li>
     *     <li>lastName: The last name of the student</li>
     *     <li>bannerID: The banner ID of the student</li>
     * </ul>
     */
    private String firstName;
    private String lastName;
    private String bannerID;

    /**
     * <p>
     *     Default Constructor.
     * </p>
     * <p>
     *     Initializes the Student with default values.
     * </p>
     * <ul>
     *     <li>firstName: Unknown</li>
     *     <li>lastName: Unknown</li>
     *     <li>bannerID: Unknown</li>
     * </ul>
     */
    public Student() {
        firstName = "Unknown";
        lastName = "Unknown";
        bannerID = "Unknown";
    } // End of default constructor


    /**
     * <p>
     *     Parameterized Constructor.
     * </p>
     * <p>
     *     Initializes the Student with the specified values.
     * </p>
     * @param firstName The first name of the student
     * @param lastName The last name of the student
     * @param bannerID The banner ID of the student
     */
    public Student(String firstName, String lastName, String bannerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bannerID = bannerID;
    } // End of parameterized constructor


    // Setters

    /**
     * Sets the first name of the student
     * @param firstName The first name of the student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } // End of setFirstName


    /**
     * Sets the last name of the student
     * @param lastName The last name of the student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    } // End of setLastName


    /**
     * Sets the banner ID of the student
     * @param bannerID The banner ID of the student
     */
    public void setBannerID(String bannerID) {
        this.bannerID = bannerID;
    } // End of setBannerID


    // Getters


    /**
     * Gets the first name of the student
     * @return The first name of the student
     */
    public String getFirstName() {
        return firstName;
    } // End of getFirstName


    /**
     * Gets the last name of the student
     * @return The last name of the student
     */
    public String getLastName() {
        return lastName;
    } // End of getLastName



    /**
     * Gets the banner ID of the student
     * @return The banner ID of the student
     */
    public String getBannerID() {
        return bannerID;
    } // End of getBannerID


    /**
     * Overrides the toString method
     *
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return "Student:\n"
                + "\tName: " + firstName +
                " " + lastName + "\n\t" +
                "Banner ID: " + bannerID + "\n";
    } // End of toString
} // End of class
