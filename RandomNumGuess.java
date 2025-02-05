//************************************************************************
// Author: Benjamin Alva
// Date: 29 Jan 2025
// Language: Java
// Assignment: NumGuess
/* Description: A number guessing game that generates a random number from
1 to 100. It loops and takes a user's guess. If the user's guess is not correct it
returns higher or lower, if correct, it ends the game and returns the # of guesses*/
//************************************************************************


import java.util.Scanner;
import java.util.Random;


public class RandomNumGuess {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // Create Scanner object as input
        final int RANDOM_NUM = generateRandomNumber(); // Call generateRandomNumber method and assign it to a constant
        boolean guessTrue = false; // Create guessTrue boolean, if switched to true exits out of loop
        int numGuesses = 0; // Create variable to keep track of number of guesses


        System.out.println("Welcome to my number guessing game! \nEnter a guess between 1 and 100.\n");


        // Create a loop that only exits when guessTrue is set to true
        while (!guessTrue) {
            numGuesses++; // Add 1 before each guess
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt(); // Allow user input & create a variable for that input
            String checkGuessResult = checkGuess(guess, RANDOM_NUM); // Get the checkGuess method's return and assign it a variable
            System.out.println(checkGuessResult);

            // if checkGuess returned correct then exit loop
            if (checkGuessResult.equals("Correct!")) {
                System.out.printf("%nThe number I chose is %d!%nYou guessed %d times.%n",
                        RANDOM_NUM, numGuesses);
                guessTrue = true;
                scanner.close(); // Close the scanner object
            }
        }
    }


    // Create a random object and generate a number from 1 to 100
    public static int  generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }


    // Check if user's guess is higher, lower, or correct and return the corresponding
    public static String checkGuess(int guess, int RANDOM_NUM) {
        if (guess < 1 || guess > 100) { // If guess is under or over 100, return that the user's guess is out of range
            return "Your guess is out of my range of 1 to 100, please try again \n";
        } else if (guess > RANDOM_NUM) {
            return "Too high! \n";
        } else if (guess < RANDOM_NUM) {
            return "Too low! \n";
        } else {
            return "Correct!";
        }
    }
}
