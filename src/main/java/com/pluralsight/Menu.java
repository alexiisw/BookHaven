package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void showMenu(ArrayList<Book> books) {
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
                    bookInfo.displayInfo(); //displays each book's info ; pulls display layout from separate class
                } // enhanced 'for' loop above - original/drawn out code below:
//              for (int i = 0; i < book.length; i++){ // will pull each books info until the list runs through
//                    book[i].displayInfo(); //displays each book's info ; pulls display layout from separate class
//                }
                System.out.print("Please select from the following menu choices:\n");
                System.out.println("(1)Select a Book \n(2)Exit - go back to home screen");
                int availableOption = Integer.parseInt(read.nextLine());

                if (availableOption == 1) { // need a code to allow book selection as well
// NEEDS CODE!!              this step will identify the wanted book
//                           this step will select the wanted book
                    System.out.println("Please enter your full name: ");
                    String userName = read.nextLine();
// NEEDS CODE!!      ASSIGNS THE SELECTED BOOK TO THE NAME THAT SCREEN JUST PROMPTED TO ENTER
//                    // this step adds the book to the checked out list
                } else if (availableOption == 2) {
                    System.out.print("Returning to the main menu");
                    // will automatically continue the loop vs exiting it
                } else {
                    System.out.print("That is an invalid input, please try inputting selection again");
                }
            } else if (selectedOptionNum == 2) {
                System.out.println("The books below have been checked out: \n");
                for (Book bookInfo : books) { // will pull each books info until the list runs through
                    bookInfo.displayInfo(); //displays each book's info ; pulls display layout from separate class
                } // enhanced 'for' loop above - original/drawn out code below:
//              for (int i = 0; i < book.length; i++){ // will pull each books info until the list runs through
//                    book[i].displayInfo(); //displays each book's info ; pulls display layout from separate class
//              }
                System.out.print("Please select from the following menu choices:\n");
                System.out.print("(C)Check-in a Book \n(X)Exit - go back to home screen");
                char checkedOutOption = Character.toUpperCase(read.nextLine().charAt(0)); // takes input, saves the first letter, and capitalizes the results
                // to simplify options below, I could just change code above to Character.toUpperCase(homeScreen.nextLine().charAt(0)
                if (checkedOutOption == 'C') {
                    System.out.println("Please enter the book ID of the book you want to return: ");
                    int bookId = read.nextInt();
// NEEDS CODE!!         this step identifies the selected book
//                      this step clears the checked out book so it can go on the available list
//                      NEEDS TO UNASSIGN BOOK TO THE NAME THAT SCREEN JUST PROMPTED TO ENTER
                } else if (checkedOutOption == 'X') {
                    // will automatically continue the loop vs exiting it
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



    }}

