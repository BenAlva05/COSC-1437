//************************************************************************
// Author: Benjamin Alva
// Date: 22 Mar 2025
// Language: Java
// Assignment: Module 4 Lab - Student Locker Lab
/* Description: A class that prints a decorative line and outputs
*               a formatted message to the user*/
//************************************************************************

package StudentLockerLab;

/**
 * The `utility` class holds static methods that prints
 * lines and a formatted message.
 */
public class Utility {


    /**
    * <p>
     *     Print Line Method.
    *     Prints a decorative line.
    * </p>
    */
    protected static void printLine() {
        System.out.println("*************************************");
    } // End of printLine method


    /**
     * <p>
     *     Print Message Method.
     *     Prints a formatted message.
     * </p>
     * @param message The message to be printed
     */
    public static void printMessage(String message) {
        System.out.printf("\t\t%s%n", message);
    } // End of printMessage method

} // End of Utility class
