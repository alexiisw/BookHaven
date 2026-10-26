package com.pluralsight;

import java.time.LocalDate;

public class CustomerInfo {

    // user information
    String fullName;
    LocalDate dateOfBirth;
    String email;
    String phoneNumber;


    public CustomerInfo(String fullName,
                        LocalDate dateOfBirth,
                        String email,
                        String phoneNumber){
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        }

}
