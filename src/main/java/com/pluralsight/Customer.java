package com.pluralsight;

import java.time.LocalDate;

public class Customer {

    // user information
    private String fullName;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
    private Book book;


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
