//************************************************************************
// Author: Benjamin Alva
// Date: 14 Feb 2025
// Language: Java
// Assignment: Book Class
// Description: Driver program that prints the output of the Book class
//************************************************************************

package BookClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare variables
        String author;
        String title;
        int pages;
        String userReturn;
        boolean isValid = true;
        Scanner scanner = new Scanner(System.in);


        // Prompt for book details
        System.out.print("Enter the title of the book: ");
        title = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        author = scanner.nextLine();

        try { // If user inputs string instead of integer,
            // catch the exception
            System.out.print(
                    "Enter the number of pages in the book: ");
            pages = scanner.nextInt();
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("\nError: " + e +
                    "\nPlease enter a number!");
            return;
        }


        // Create a new book object
        Book book = new Book(author, title, pages);


        // Display the book details
        book.printBook();


        // Ask user if they want to borrow the Book
        System.out.print("\nWould you like to borrow the book?" +
                " (yes/no): ");
        userReturn = scanner.next();

        // If they answer yes, call the borrowBook method
        if (userReturn.equalsIgnoreCase("yes")) {
            book.borrowBook();
        } // if they answer no, print the book is still available
        else if (userReturn.equalsIgnoreCase("no")) {
            System.out.println("The book is still available.");
        }


        // If the user borrowed the book, ask if they want to return it
        if (userReturn.equalsIgnoreCase("yes")) {
            System.out.print("Would you like to return the book?" +
                    " (yes/no): ");
            userReturn = scanner.next();

            // If they answer yes, call the returnBook method
            if (userReturn.equalsIgnoreCase("yes")) {
                book.returnBook();
            } // if they answer no, print the book is still borrowed
            else if (userReturn.equalsIgnoreCase("no")) {
                System.out.println("The book is still borrowed.");
            }

        }
    }
}
