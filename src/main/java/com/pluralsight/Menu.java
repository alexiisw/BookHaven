package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void showMenu(ArrayList<Book> books, Customer customer) {
        Scanner read = new Scanner(System.in);

        boolean systemsRunning = true;
        while (systemsRunning) {

            System.out.print("+---------------------------+\n");
            System.out.print("+  Welcome to the Library!  +\n");
            System.out.print("+---------------------------+\n");
            System.out.print("Please select from the following menu choices:\n");
            System.out.println("(1)Show Available Books \n(2)Show Checked Out Books \n(3)Exit - closes out of the application");
            System.out.print("Type your action: ");
            int selectedOptionNum = Integer.parseInt(read.nextLine()); // formats a string to an integer after it is inputted

            if (selectedOptionNum == 1) {
                System.out.println("The books below are available: \n");

                for (Book bookInfo : books) { // will pull each books info until the list runs through
                    if (!bookInfo.isCheckedOut()) {
                        bookInfo.displayInfo(); //displays each book's info ; pulls display layout from separate class
                    }
                }
                System.out.print("Please select from the following menu choices:\n");
                System.out.println("(1)Select a Book \n(2)Exit - go back to home screen");
                int availableOption = Integer.parseInt(read.nextLine());

                if (availableOption == 1) {
                    System.out.println("Please enter the ID of the book you want: "); // Ask the user for the book ID
                    int selectedBookId = Integer.parseInt(read.nextLine());

                    Book selectedBook = null;
                    for (Book bookInfo : books) {

                        if (bookInfo.getId() == selectedBookId) { // compares the given book ID with a book ID in the system and see if there's a match
                            selectedBook = bookInfo;
                            break;
                        }
                    }
                    if (selectedBook == null) { // checks whether the book was found
                        System.out.println("Sorry, that book ID does not exist.");

                    } else {
                        boolean successful = customer.rentBook(selectedBook); // Check out the book to the customer

                        if (successful) {
                            System.out.println("Book successfully checked out!");
                        } else {
                            System.out.println("Sorry, this book cannot be checked out.");
                        }
                    }
                } else if (availableOption == 2) {
                    System.out.print("Returning to the main menu");
                    // will automatically continue the loop vs exiting it
                } else {
                    System.out.print("That is an invalid input, please try inputting selection again");
                }

            } else if (selectedOptionNum == 2) {
                System.out.println("The books below have been checked out: \n");
                for (Book bookInfo : books) { // will pull each books info until the list runs through
                    if (!bookInfo.isCheckedOut()) {
                        bookInfo.displayInfo(); //displays each book's info ; pulls display layout from separate class
                    }
                }
                System.out.print("Please select from the following menu choices:\n");
                System.out.print("(C)Check-in a Book \n(X)Exit - go back to home screen");
                char checkedOutOption = Character.toUpperCase(read.nextLine().charAt(0)); // takes input, saves the first letter, and capitalizes the results
                // to simplify options below, I could just change code above to Character.toUpperCase(homeScreen.nextLine().charAt(0)

                if (checkedOutOption == 'C') {
                    System.out.println("Please enter the book ID of the book you want to return: ");
                    int bookId = Integer.parseInt(read.nextLine());

                    Book selectedBook = null;

                    for (Book bookInfo: books) {
                        if (bookInfo.getId() == bookId) { // compares the given book ID with a book ID in the system and see if there's a match
                            selectedBook = bookInfo;
                            break;
                        }
                    }
                    if (selectedBook == null) { // checks whether the book was found
                        System.out.println("Sorry, that book ID does not exist.");

                    } else {
                        boolean successful = customer.returnBook(selectedBook); // Check out the book to the customer

                        if (successful) {
                            System.out.println("Book successfully checked out!");
                        } else {
                            System.out.println("This book is not checked out to this borrower.");
                        }
                    }
                } else if (checkedOutOption == 'X') {
                    System.out.print("Returning to the main menu");// will automatically continue the loop vs exiting it
                } else {
                    System.out.print("That is an invalid input, please try inputting selection again");
                }
            } else if (selectedOptionNum == 3) {
                systemsRunning = false;
                System.out.print("Thank you for visiting the library. See you soon!");
            } else {
                System.out.print("That is an invalid input, please try inputting selection again");
            }
        }
    }
}

