package com.pluralsight;

import java.time.LocalDate;

public class Customer {

    // user information
    String fullName;
    LocalDate dateOfBirth;
    String email;
    String phoneNumber;
    Book book;


    public Customer(String fullName,
                    LocalDate dateOfBirth,
                    String email,
                    String phoneNumber){
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;

        }


        public void rentBook(Book book) {
            this.book = book;
        }
}
