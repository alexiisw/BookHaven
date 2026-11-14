package com.pluralsight;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Book> books = Library.creatingBooks();

        ArrayList<Customer> customers = Library.creatingCustomers();
        Customer cr1 = customers.get(0);

        // Starts the menu
        Menu.showMenu(books, cr1); // menu receives both objects

    }
}
