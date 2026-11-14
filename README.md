# BookHaven

## Overview

BookHaven is a Java-based library management application that allows users to browse available books, 
check out books, view checked-out books, and return books through a simple console interface.

The application demonstrates core Object-Oriented Programming (OOP) concepts by modeling real-world library operations with classes,
objects, methods, and encapsulation. BookHaven manages a collection of books, tracks checkout status, 
and records the name of the customer currently borrowing a book.

This project was developed as part of the Pluralsight Java Development program to strengthen skills in Java programming, 
object-oriented design, arrays, user input handling, and application flow control.

---

## Features

### Browse Available Books
- View all books currently available in the library
- Display each book's:
  - ID
  - ISBN
  - Title

### Check Out Books
- Select a book by its unique ID
- Enter your name to check out the book
- Automatically records the borrower
- Updates the book's checkout status

### View Checked-Out Books
- View all books currently borrowed
- Display:
  - ID
  - ISBN
  - Title
  - Borrower's Name

### Return Books
- Return books by entering the book ID
- Removes borrower information
- Makes the book available for checkout again

---

## Application Flow

### Home Screen

```text
-------------------------------------
          BOOKHAVEN
-------------------------------------

1. Show Available Books
2. Show Checked Out Books
3. Exit

Select an option:
```

### Available Books Screen

```text
Available Books

ID   ISBN             Title
-----------------------------------------------
1    9780060935467    To Kill a Mockingbird
2    9780142407332    The Outsiders
3    9781451673319    Fahrenheit 451

Enter a Book ID to check out a book
Or enter X to return to the Home Screen
```

### Checked-Out Books Screen

```text
Checked-Out Books

ID   ISBN             Title                    Checked Out To
----------------------------------------------------------------
5    9780375869020    Wonder                   Alexis Williams
8    9780547928227    The Hobbit               John Smith

C - Check In a Book
X - Return to Home Screen
```

---

## Object-Oriented Design

### Book Class

The Book class stores all information related to a library book.

#### Properties

| Property | Type |
|----------|------|
| id | int |
| isbn | String |
| title | String |
| isCheckedOut | boolean |
| checkedOutTo | String |

#### Methods

```java
void checkOut(String name)
void checkIn()
```

##### checkOut(String name)

When a book is checked out:

- Sets the checkedOutTo property to the borrower's name
- Sets isCheckedOut to true

##### checkIn()

When a book is returned:

- Clears the checkedOutTo property
- Sets isCheckedOut to false

---

## Technologies Used

- Java
- Maven
- IntelliJ IDEA
- Object-Oriented Programming (OOP)
- Arrays
- Scanner Class
- Encapsulation
- Conditional Logic

---

## Project Structure

```text
src
└── main
    └── java
        └── com.pluralsight
            ├── Main.java
            ├── Menu.java
            ├── Library.java
            ├── Book.java
            └── Customer.java
```

---

## Library Collection

The application contains an inventory of 20 books across multiple genres, including:

- Fiction
- Fantasy
- Historical Fiction
- Young Adult
- Classics
- Nonfiction

Sample titles include:

- The Hobbit
- The Outsiders
- Wonder
- Educated
- The Book Thief
- Harry Potter and the Sorcerer's Stone
- The Hate U Give
- The Midnight Library
- To Kill a Mockingbird
- Percy Jackson and the Lightning Thief

---

## Skills Demonstrated

This project demonstrates:

- Object-Oriented Design
- Encapsulation
- Class Creation
- Constructors
- Getters and Setters
- Arrays of Objects
- Method Design
- Application Navigation
- User Input Processing
- State Management
- Business Logic Implementation

---

## What I Learned

While building BookHaven, I gained experience designing classes that model real-world objects and managing application state through object properties and methods. I learned how to store objects in arrays, update object data dynamically, separate application responsibilities across multiple classes, and create a user-friendly menu-driven application.

This project helped strengthen my understanding of how Object-Oriented Programming can be used to solve practical business problems.

---

## Future Improvements

Potential enhancements include:

- Search books by title
- Search by ISBN
- Search by author
- Track due dates
- Save library inventory to files
- Store checkout history
- Add librarian management tools
- Implement late fee calculations
- Connect to a database
- Develop a graphical user interface (GUI)

---

## Author

**Alexis Williams**

Aspiring Software Engineer

GitHub: https://github.com/alexiisw
