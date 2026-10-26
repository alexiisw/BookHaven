package com.pluralsight;

import java.lang.reflect.Array; // used if I use regular array
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryKiosk {
    public static void main(String[] args) {
        Scanner homeScreen = new Scanner(System.in);
        boolean systemsRunning = true;

        // ADDS USER INFO TO THE ARRAYLISTS - DETERMINE IF I NEED AN ARRAY LIST FOR USERS

        ArrayList<BookInfo> books = new ArrayList<>(); // creates an empty list of books - can have infinite number of spots
        // ADD INFO (OF NEW BOOKS TO THE ARRAYLIST) TO THE BOOKS
        books.add(new BookInfo(
                1,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                2,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                3,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                4,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                5,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                6,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                7,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                8,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                9,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                10,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                11,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                12,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                13,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                14,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                15,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                16,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                17,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                18,
                "",
                "",
                false,
                ""
        ));books.add(new BookInfo(
                19,
                "",
                "",
                false,
                ""
        ));
        books.add(new BookInfo(
                20,
                "",
                "",
                false,
                ""
        ));




            // Below is if I would have done a regular array(fixed list) instead of an ArrayList - fixed number of spots
//     BookInfo[] books = new BookInfo[20]; // creates the list of books - [20] creates 20 spots
//        books[0] = new BookInfo();
//        books[0].id = 1;
//        books[0].isbn = "";
//        books[0].title = "";
//        books[0].isCheckedOut = false;
//        books[0].checkedOutBy = "";
//
//        books[1] = new BookInfo();
//        books[1].id = 2;
//        books[1].isbn = "";
//        books[1].title = "";
//        books[1].isCheckedOut = false;
//        books[1].checkedOutBy = "";
//
//        books[2] = new BookInfo();
//        books[2].id = 3;
//        books[2].isbn = "";
//        books[2].title = "";
//        books[2].isCheckedOut = false;
//        books[2].checkedOutBy = "";
//
//        books[3] = new BookInfo();
//        books[3].id = 4;
//        books[3].isbn = "";
//        books[3].title = "";
//        books[3].isCheckedOut = false;
//        books[3].checkedOutBy = "";
//
//        books[4] = new BookInfo();
//        books[4].id = 5;
//        books[4].isbn = "";
//        books[4].title = "";
//        books[4].isCheckedOut = false;
//        books[4].checkedOutBy = "";
//
//        books[5] = new BookInfo();
//        books[5].id = 6;
//        books[5].isbn = "";
//        books[5].title = "";
//        books[5].isCheckedOut = false;
//        books[5].checkedOutBy = "";
//
//        books[6] = new BookInfo();
//        books[6].id = 7;
//        books[6].isbn = "";
//        books[6].title = "";
//        books[6].isCheckedOut = false;
//        books[6].checkedOutBy = "";
//
//        books[7] = new BookInfo();
//        books[7].id = 8;
//        books[7].isbn = "";
//        books[7].title = "";
//        books[7].isCheckedOut = false;
//        books[7].checkedOutBy = "";
//
//        books[8] = new BookInfo();
//        books[8].id = 9;
//        books[8].isbn = "";
//        books[8].title = "";
//        books[8].isCheckedOut = false;
//        books[8].checkedOutBy = "";
//
//        books[9] = new BookInfo();
//        books[9].id = 10;
//        books[9].isbn = "";
//        books[9].title = "";
//        books[9].isCheckedOut = false;
//        books[9].checkedOutBy = "";
//
//        books[10] = new BookInfo();
//        books[10].id = 11;
//        books[10].isbn = "";
//        books[10].title = "";
//        books[10].isCheckedOut = false;
//        books[10].checkedOutBy = "";
//
//        books[11] = new BookInfo();
//        books[11].id = 12;
//        books[11].isbn = "";
//        books[11].title = "";
//        books[11].isCheckedOut = false;
//        books[11].checkedOutBy = "";
//
//        books[12] = new BookInfo();
//        books[12].id = 13;
//        books[12].isbn = "";
//        books[12].title = "";
//        books[12].isCheckedOut = false;
//        books[12].checkedOutBy = "";
//
//        books[13] = new BookInfo();
//        books[13].id = 14;
//        books[13].isbn = "";
//        books[13].title = "";
//        books[13].isCheckedOut = false;
//        books[13].checkedOutBy = "";
//
//        books[14] = new BookInfo();
//        books[14].id = 15;
//        books[14].isbn = "";
//        books[14].title = "";
//        books[14].isCheckedOut = false;
//        books[14].checkedOutBy = "";
//
//        books[15] = new BookInfo();
//        books[15].id = 16;
//        books[15].isbn = "";
//        books[15].title = "";
//        books[15].isCheckedOut = false;
//        books[15].checkedOutBy = "";
//
//        books[16] = new BookInfo();
//        books[16].id = 17;
//        books[16].isbn = "";
//        books[16].title = "";
//        books[16].isCheckedOut = false;
//        books[16].checkedOutBy = "";
//
//        books[17] = new BookInfo();
//        books[17].id = 18;
//        books[17].isbn = "";
//        books[17].title = "";
//        books[17].isCheckedOut = false;
//        books[17].checkedOutBy = "";
//
//        books[18] = new BookInfo();
//        books[18].id = 19;
//        books[18].isbn = "";
//        books[18].title = "";
//        books[18].isCheckedOut = false;
//        books[18].checkedOutBy = "";
//
//        books[19] = new BookInfo();
//        books[19].id = 20;
//        books[19].isbn = "";
//        books[19].title = "";
//        books[19].isCheckedOut = false;
//        books[19].checkedOutBy = "";

        while (systemsRunning) {

            System.out.print("+---------------------------+\n");
            System.out.print("+  Welcome to the Library!  +\n");
            System.out.print("+---------------------------+\n");
            System.out.print("Please select from the following menu choices:\n");
            System.out.println("(1)Show Available Books \n(2)Show Checked Out Books \n(3)Exit - closes out of the application");
            int selectedOptionNum = Integer.parseInt(homeScreen.nextLine()); // formats a string to an integer after it is inputted

            if (selectedOptionNum == 1) {
                System.out.println("The books below are available: \n");
                for (BookInfo bookInfo : books) { // will pull each books info until the list runs through
                    bookInfo.displayInfo(); //displays each book's info ; pulls display layout from separate class
                } // enhanced 'for' loop above - original/drawn out code below:
//              for (int i = 0; i < book.length; i++){ // will pull each books info until the list runs through
//                    book[i].displayInfo(); //displays each book's info ; pulls display layout from separate class
//                }
                System.out.print("Please select from the following menu choices:\n");
                System.out.println("(1)Select a Book \n(2)Exit - go back to home screen");
                int availableOption = Integer.parseInt(homeScreen.nextLine());

                if (availableOption == 1) { // need a code to allow book selection as well
// NEEDS CODE!!              this step will identify the wanted book
//                           this step will select the wanted book
                    System.out.println("Please enter your full name: ");
                    String userName = homeScreen.nextLine();
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
                for (BookInfo bookInfo : books) { // will pull each books info until the list runs through
                    bookInfo.displayInfo(); //displays each book's info ; pulls display layout from separate class
                } // enhanced 'for' loop above - original/drawn out code below:
//              for (int i = 0; i < book.length; i++){ // will pull each books info until the list runs through
//                    book[i].displayInfo(); //displays each book's info ; pulls display layout from separate class
//              }
                System.out.print("Please select from the following menu choices:\n");
                System.out.print("(C)Check-in a Book \n(X)Exit - go back to home screen");
                char checkedOutOption = Character.toUpperCase(homeScreen.nextLine().charAt(0)); // takes input, saves the first letter, and capitalizes the results
                // to simplify options below, I could just change code above to Character.toUpperCase(homeScreen.nextLine().charAt(0)
                if (checkedOutOption == 'C') {
                    System.out.println("Please enter the book ID of the book you want to return: ");
                    int bookId = homeScreen.nextInt();
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
    }
}