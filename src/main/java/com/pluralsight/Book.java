package com.pluralsight;

public class Book {

    // the book information
    private final int id;
    private final String isbn;
    private final String title;
    private final String author;

    private boolean isCheckedOut;
    private String checkedOutBy;

    public Book(int id,
                String isbn,
                String title,
                String author){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
        this.checkedOutBy = null;
    }

    public boolean checkedOut(String borrowerName) {
        if (isCheckedOut) { // checks if the book is checked out
            return false;
        }
        this.isCheckedOut = true;
        this.checkedOutBy = borrowerName;
        return true; // record customer name
    }
    public void checkedIn() { // removes borrower's name and marks book available
        this.isCheckedOut = false;
        this.checkedOutBy = null;
    }
    public int getId(){
        return id;
    }
    public boolean isCheckedOut(){
        return isCheckedOut;
    }
    public String checkedOutBy(){
        return checkedOutBy;
    }
    public String getTitle(){
        return title;
    }
        // how its displayed
    public void displayInfo() { // how the info will be displayed when called
            System.out.println("ID: " + id);
            System.out.println("ISBN: " + isbn);
            System.out.println("Book Title: " + title);
            System.out.println("Checked Out: " + isCheckedOut);
            System.out.println("Checked Out By: " + checkedOutBy);
    }
}
