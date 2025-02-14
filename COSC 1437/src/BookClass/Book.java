//************************************************************************
// Author: Benjamin Alva
// Date: 14 Feb 2025
// Language: Java
// Assignment: Book Class
/* Description: A class that models a book with
*               attributes. (title, author, pages, etc.) */
//************************************************************************

package BookClass;

public class Book {
    // Declare instance variables
    private String title;
    private String author;
    private int pages;
    private boolean isBorrowed;


    // Initialize the book object with default values
    public Book() {
        author = "";
        title = "";
        pages = 0;
        isBorrowed = false;
    }


    // Accepts variables as params to initialize isBorrowed to false
    public Book(String title, String author, int Pages) {
        this.title = title;
        this.author = author;
        this.pages = Pages;
        isBorrowed = false;
    }


    // getters
    public String getAuthor() {
        return author;
    }


    public String getTitle() {
        return title;
    }


    public int getPages() {
        return pages;
    }


    public boolean getIsBorrowed() {
        return isBorrowed;
    }


    // setters
    public void setAuthor(String author) {
        this.author = author;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public void setPages(int pages) {
        this.pages = pages;
    }


    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }


    // Print the book details
    public void printBook() {
        System.out.printf("Book Details:%n" +
                "Title: %s%n" +
                "Author: %s%n" +
                "Pages: %d%n", title, author, pages);
    }


    // Allow user to borrow the book
    public void borrowBook() {
        isBorrowed = true;
        System.out.println("Book has been borrowed.");
    }


    // Allow user to return the book
    public void returnBook() {
        isBorrowed = false;
        System.out.println("Book has been returned.");
    }
}
