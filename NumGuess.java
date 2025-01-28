// Benjamin Alva
// COSC-1437
// 01/21/25

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class Main {



    public static void main(String[] args) {


        System.out.println("Benjamin Alva \n COSC 1437 \n 01/27/2025 \n");


        Scanner input = new Scanner(System.in); // Create Scanner object as input
        int RANDOM_NUM = generateRandomNumber(); // Call generateRandomNumber method and assign it to a constant
        boolean guessTrue = false;
        int numGuesses = 0;


        System.out.println("Welcome to my number guessing game! \n");


        while (!guessTrue) {  // Create a loop that only exits when guessTrue is set to true
            numGuesses += 1;
            System.out.print("Enter your guess: ");
            int guess = input.nextInt(); // Allow user input & create a variable for that input
            String checkGuessFeedback = checkGuess(guess, RANDOM_NUM);
            System.out.println(checkGuessFeedback);


            if (checkGuessFeedback.equals("Correct!")) {
                System.out.print("The number I chose is " + RANDOM_NUM + "!\n" +  "You guessed " + numGuesses + " times.\n");
                guessTrue = true;
            }
        }
    }



    public static int  generateRandomNumber() {
        Random random = new Random(); // Create Random object as random
        return random.nextInt(100) + 1; // Generate a random number from 1 to 100
    }



    public static String checkGuess(int guess, int RANDOM_NUM) {
        if (guess < 1 || guess > 100) {
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
