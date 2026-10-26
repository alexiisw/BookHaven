package com.pluralsight;

import java.util.Scanner;

public class BookInfo {

    // the book information
    int id;
    String isbn;
    String title;
    boolean isCheckedOut = false;
    String checkedOutBy;
    // checkedOut(); // stores borrower's name and marks book checked out
    // checkedIn(); // removes borrower's name and marks book available

    public BookInfo(int id,
                    String isbn,
                    String title,
                    boolean isCheckedOut,
                    String checkedOutBy){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutBy = checkedOutBy;
    }


    // how its displayed
    void displayInfo() { // how the info will be displayed when called
        System.out.println("ID: " + id);
        System.out.println("ISBN: " + isbn);
        System.out.println("Book Title: " + title);
        System.out.println("Checked Out: " + isCheckedOut);
        System.out.println("Checked Out By: " + checkedOutBy);
    }


}