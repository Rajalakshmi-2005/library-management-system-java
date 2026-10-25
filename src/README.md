# Library Management System (Java)

A console-based library management application built in Java using object-oriented programming.

## Features
- Add books with a unique ID, title and author
- View all books with their status (Available / Issued)
- Issue and return books
- Prevents duplicate book IDs
- Validates menu input and handles invalid entries

## Concepts used
- Object-Oriented Programming: classes, encapsulation, constructors
- ArrayList for storing books
- Linear search to find a book by ID
- Exception handling (try/catch)

## Project structure
- `Book.java`: the Book class
- `Library.java`: library logic (add, search, issue, return)
- `Main.java`: console menu

## How to run
1. Install JDK 21 or later
2. Clone this repository
3. Compile: `javac src/*.java`
4. Run: `java -cp src Main`

## Planned improvements
- Store data in a MySQL database using JDBC
- Add members and due dates

## Author
Rajalakshmi S, Electronics and Communication Engineering