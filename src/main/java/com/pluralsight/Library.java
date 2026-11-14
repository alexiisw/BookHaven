package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public static ArrayList<Book> creatingBooks() {
        ArrayList<Book> books = new ArrayList<>(); // creates an empty list of books - can have infinite number of spots
        // ADD INFO (OF NEW BOOKS TO THE ARRAYLIST) TO THE BOOKS
        books.add(new Book(1, "9781449474256", "Milk and Honey", ""));
        books.add(new Book(2, "9780142407332", "The Outsiders", "Harper Lee"));
        books.add(new Book(3, "9780061120084", "To Kill a Mockingbird", "S.E. Hinton"));
        books.add(new Book(4, "9780679734772", "The House on Mango Street", "Sandra Cisneros"));
        books.add(new Book(5, "9780062498533", "Angie Thomas", "Angie Thomas"));
        books.add(new Book(6, "9780399252518", "Brown Girl Dreaming", "Jacqueline Woodson"));
        books.add(new Book(7, "9780375869020", "Wonder", "R.J. Palacio"));
        books.add(new Book(8, "9780141439518", "Pride and Prejudice", "Jane Austen"));
        books.add(new Book(9, "9780590353427", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
        books.add(new Book(10, "9780735219090", "Where the Crawdads Sing", "Delia Owens"));
        books.add(new Book(11, "9780060736262", "A Tree Grows in Brooklyn", "Betty Smith"));
        books.add(new Book(12, "9780547928227", "The Hobbit", "J.R.R. Tolkien"));
        books.add(new Book(13, "9780399588171", "Born a Crime", "Trevor Noah"));
        books.add(new Book(14, "9780525536291", "The Vanishing Half", "Brit Bennett"));
        books.add(new Book(15, "9780786838653", "Percy Jackson and the Lightning Thief", "Rick Riordan"));
        books.add(new Book(16, "9780525559474", "The Midnight Library", "Matt Haig"));
        books.add(new Book(17, "9780063204157", "Remarkably Bright Creatures", "Shelby Van Pelt"));
        books.add(new Book(18, "9780525657743", "Crying in H Mart", "Michelle Zauner"));
        books.add(new Book(19, "9781101971062", "Homegoing", "Yaa Gyasi"));
        books.add(new Book(20, "9781501161933", "The Seven Husbands of Evelyn Hugo", "Taylor Jenkins Reid"));
        return books;
    }
    public static ArrayList<Customer> creatingCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer("Alexis Williams", LocalDate.of(1996, 9, 27), "superpower@gmail.com", "123456456");
        customers.add(c1);
        return customers;
    }
}
