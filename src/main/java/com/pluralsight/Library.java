package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {


    public static ArrayList<Book> creatingBooks() {
        ArrayList<Book> books = new ArrayList<>(); // creates an empty list of books - can have infinite number of spots
        // ADD INFO (OF NEW BOOKS TO THE ARRAYLIST) TO THE BOOKS
        books.add(new Book(1, "", ""));
        books.add(new Book(2, "", ""));
        books.add(new Book(3, "", ""));
        books.add(new Book(4, "", ""));
        books.add(new Book(5, "", ""));
        books.add(new Book(6, "", ""));
        books.add(new Book(7, "", ""));
        books.add(new Book(8, "", ""));
        books.add(new Book(9, "", ""));
        books.add(new Book(10, "", ""));
        books.add(new Book(11, "", ""));
        books.add(new Book(12, "", ""));
        books.add(new Book(13, "", ""));
        books.add(new Book(14, "", ""));
        books.add(new Book(15, "", ""));
        books.add(new Book(16, "", ""));
        books.add(new Book(17, "", ""));
        books.add(new Book(18, "", ""));
        books.add(new Book(19, "", ""));
        books.add(new Book(20, "", ""));
        return books;
    }

    public static ArrayList<Customer> creatingCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer("Alexis Williams", LocalDate.of(1996, 9, 27), "superpower@gmail.com", "123456456");
        customers.add(c1);
        return customers;
    }




}
