package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Book> books = Library.creatingBooks();

        ArrayList<Customer> customers = Library.creatingCustomers();
        Customer cr1 = customers.get(0);
        cr1.rentBook(books.get(0));
        // Calling the
        Menu.showMenu(books);

    }
}

//A. if (!bookInfo.isCheckedOut())
//B. if (bookInfo.isCheckedOut())
//if (!bookInfo.isCheckedOut()) {
//    bookInfo.displayInfo();
//. The method definition
//public double calculatePrice() {
//    return 25.50;
//}
//
//
//- double says the method returns a decimal-number value.
//- calculatePrice() is the method name and its parameter list.
//- return 25.50; sends the result back to the caller.
//B. Creating an object
//Product product = new Product();
//
//
//Here, new Product() creates a Product object.
//
//C. Calling the method and storing its result
//double price = product.calculatePrice();
//
//
//Java effectively evaluates the method call first. Since the method returns 25.50, the line behaves like this:
//double price = 25.50;
//
//
//That is the important idea: the method call supplies a value, and the variable stores that value.
//
//D. Printing the value
