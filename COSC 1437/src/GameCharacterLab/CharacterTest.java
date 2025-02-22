package GameCharacterLab;

//************************************************************************
// Author: Benjamin Alva
// Date: 21 Feb 2025
// Language: Java
// Assignment: Module 2 Lab - Game Character Lab
/* Description: A driver program that tests the methods and overrides of
    *               the Character class and prints the results*/
//************************************************************************

public class CharacterTest {
    public static void main(String[] args) {

        // Declare instance variables
        Character char1;
        Character char2;
        Character char3;
        Character char4;


        // Print the title of the program
        System.out.println("Video Game Character Lab\n");


        // Default Constructor output
        char1 = new Character();
        System.out.println("Default Constructor: " + char1);


        // Parameterized Constructor output
        char2 = new Character(150.0, 5, "Archer",
                "Elf");
        System.out.println("Parameterized Constructor with valid data: "
                + char2);


        // Parameterized Constructor with invalid data
        char3 = new Character(-50.0, -1, "",
                "");
        System.out.println("Parameterized Constructor with invalid data: "
                + char3);


        // Test the mutator methods with valid values.
        char1.setName("Knight");
        char1.setType("Warrior");
        char1.setLevel(10);
        char1.setHealthPoints(200.0);
        System.out.println("Updated char 1 with valid data: "
                + char1);


        // Test the mutator methods with invalid values.
        char1.setName(null);
        char1.setType(null);
        char1.setLevel(-1);
        char1.setHealthPoints(-50.0);
        System.out.println("Updated char 1 with invalid data: "
                + char1);


        // Test the equals method
        char4 = new Character(150.0, 5, "Archer",
                "Elf");
        System.out.println("\nChecking if char2 and char4 are equal: "
                + char2.equals(char4));


        // Modify char4's level and check if char2 and char4 are equal
        char4.setHealthPoints(1.0);
        System.out.println("After modifying char4, are char2 and char4"+
                "equal? " + char2.equals(char4));


        // Test the hashCode method
        System.out.println("\nHash code of char1: " + char1.hashCode());
        System.out.println("Hash code of char2: " + char2.hashCode());
        System.out.println("Hash code of char3: " + char3.hashCode());
        System.out.println("Hash code of char4: " + char4.hashCode());
    }
}
