# **📚 Library Management System**

## **📝 Overview**

A simple Library Management System built using Java that allows members to borrow and return books, while a librarian can manage books and view member details. The system keeps track of book availability and enforces borrowing limits.

## ✨ **Features**

📖 _Book Management:_ Add new books to the library.

👥 _Member Management:_ View and manage registered members.

🔄 _Borrowing System:_ Members can borrow up to two books at a time.

📦 _Return System:_ Members can return borrowed books.

🔑 _Librarian Portal:_ Allows the librarian to add books and view members.

🖥 _Console-Based Interface:_ Interactive menu-driven system.

## 📊 **Class Diagram**

**📌 Note:** The class diagram illustrates the structure of the Library Management System. The Library class contains references to Book and Member objects. The Book class manages book details and availability. The Member class tracks borrowed books, and the Librarian class provides functionalities to add books and view members.

## **🖥 Interface**


## **🎭 Actors**

1. Member
2. Librarian

## **📋 Use Cases**

📖 View Library Details

Actors: Member, Librarian
Description: Displays the list of books available in the library along with their status.

🔄 Borrow a Book

Actors: Member
Description: Allows a member to borrow a book if it's available and if they haven't exceeded their borrowing limit.

📦 Return a Book

Actors: Member
Description: Enables a member to return a previously borrowed book.

➕📖 Librarian Adds a Book

Actors: Librarian
Description: Allows a librarian to add new books to the library system.

👥 Librarian Views Members

Actors: Librarian
Description: Displays details of all registered library members and their borrowed books.

❌ Exit the System

Actors: Member, Librarian
Description: Closes the system when the user chooses to exit.

## **🚀 How to Run**

**1. Clone the repository**

git clone https://github.com/janavigopu/LibraryManagementSystem.git

**2. Navigate to the project folder**

cd LibraryManagementSystem

**3. Compile and run the Java program**

javac LibraryManagementSystem.java
java LibraryManagementSystem

## **🔮 Future Enhancements**

🗄 Implement a database for book and member records.

🖥 Add a GUI interface for a better user experience.

⚠ Implement exception handling for better error management.

📈 Extend the system to support more books and members dynamically.

## **🤝 Contributing**

Feel free to fork the repository and submit pull requests with improvements!

## **📜 License**

This project is licensed under the MIT License. 
