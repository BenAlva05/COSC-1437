//************************************************************************
// Author: Benjamin Alva
// Date: 21 Feb 2025
// Language: Java
// Assignment: Module 2 Lab - Game Character Lab
/* Description: A class that models a character with
 *               attributes. (name, type, level, health points) */
//************************************************************************

package GameCharacterLab;

/**
 * The Character class models a character with attributes.
 * This class includes invalid values handling
 * and overrides the equals, hashCode, and toString methods.
 */
public class Character {


    /**
     * Declare instance variables
     */
    private double healthPoints;
    private int level;
    private String name;
    private String type;


    /**
     * Default Constructor
     * Initializes the character with default values.
     */
    public Character() {
        name = "Unknown";
        type = "Unknown";
        level = 1;
        healthPoints = 100.0;
    }

    /**
     * Parameterized Constructor
     * Initializes the character with specified values.
     * If the provided values are invalid, it sets to default values.
     *
     * @param healthPoints the health points of the character
     * @param level the level of the character
     * @param name the name of the character
     * @param type the type of the character
     */
    public Character(double healthPoints, int level, String name,
                     String type) {
        if (healthPoints > 0.0) {
            this.healthPoints = healthPoints;
        }
        else {
            this.healthPoints = 100.0;
        }
        if (level > 0) {
            this.level = level;
        }
        else {
            this.level = 1;
        }
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        else {
            this.name = "Unknown";
        }
        if (type != null && !type.isEmpty()) {
            this.type = type;
        }
        else {
            this.type = "Unknown";
        }
    }


    /**
     * @return the health points of the character
     */
    public double getHealthPoints() {
        return healthPoints;
    }


    /**
     * Sets the health points of the character.
     * If the provided health points are less than 0,
     * it sets to 100.0.
     *
     * @param healthPoints the health points to set
     */
    public void setHealthPoints(double healthPoints) {
        if (healthPoints > 0.0) {
            this.healthPoints = healthPoints;
        } else {
            this.healthPoints = 100.0;
        }
    }

    /**
     * @return the level of the character
     */
    public int getLevel() {
        return level;
    }


    /**
     * Sets the level of the character.
     * If the provided level is less than 0, it sets to 1.
     *
     * @param level the level to set
     */
    public void setLevel(int level) {
        if (level > 0) {
            this.level = level;
        } else {
            this.level = 1;
        }
    }

    /**
     * @return the name of the character
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name of the character.
     * If the provided name is null or empty, it sets to "Unknown".
     *
     * @param name the name to set
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    /**
     * @return the type of the character
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type of the character.
     * If the provided type is null or empty, it sets to "Unknown".
     *
     * @param type the type to set
     */
    public void setType(String type) {
        if (type != null && !type.isEmpty()) {
            this.type = type;
        } else {
            this.type = "Unknown";
        }
    }


    /**
     * @return a formatted string representation of the character
     */
    @Override
    public String toString() {
        return "\nCharacter Details: " +
                "\nName: " + name +
                "\nType: " + type +
                "\nlevel: " + level +
                "\nHealth Points: " + healthPoints +
                "\n";
    }


    /**
     * Compares this character to the specified object.
     *
     * @param obj the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Character character = (Character) obj;
        return Double.compare(healthPoints, character.healthPoints)
                == 0 &&
                level == character.level &&
                name.equals(character.name) &&
                type.equals(character.type);
    }


    /**
     * @return a hash code value for the character
     */
    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + Integer.hashCode(level);
        result = 31 * result + Double.hashCode(healthPoints);
        return result;
    }
}
