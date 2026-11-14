package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    // user information
    private final String fullName;
    private final LocalDate dateOfBirth;
    private final String email;
    private final String phoneNumber;

    private final List<Book> books;
    private static final int maxCheckOut = 5;

    public Customer(String fullName,
                    LocalDate dateOfBirth,
                    String email,
                    String phoneNumber){
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;

        this.books = new ArrayList<>();
    }

    public boolean rentBook(Book book) {

        if (book == null) {
            return false;
        }
        if (books.size() >= maxCheckOut){
        System.out.println("You have reached your borrowing limit.");
        return false;
        }
        if (book.checkedOut(this.fullName)) {
            books.add(book);
            return true;
        }
        return false;
    }
    public boolean returnBook(Book book) {

        if (book == null || !books.contains(book)) {
            return false;
        }
        book.checkedIn();
        books.remove(book);
        return true;
    }
    public List<Book> getBook(){
        return new ArrayList<>(books);
    }
}
