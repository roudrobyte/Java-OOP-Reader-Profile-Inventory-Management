# Java-OOP-Reader-Profile-Inventory-Management

## 📌 Project Overview
This project is an Object-Oriented Programming (OOP) exercise in Java that demonstrates dynamic array management, state tracking, and class interactions. The core of the project is the `Reader` class, designed to represent a user profile that can store and manage a personal inventory of books. 

The system enforces capacity limits on the reader's inventory, handles boundary-checking for over-capacity scenarios, and allows for dynamic resizing of the inventory limit.

## ⚙️ Features
* **Profile Initialization:** Sets up a reader's profile with a name and a strict maximum book capacity using the `createReader` method.
* **Inventory Management:** Adds new books to a reader's profile via the `addBook` method.
* **Boundary Validation:** Automatically prevents adding books beyond the reader's current capacity, outputting a warning message (`"No more space for new book"`).
* **Dynamic Resizing:** Updates a reader's maximum capacity on the fly using the `updateCapacity` method without losing previously stored data.
* **Formatted Status Reporting:** The `readerInfo` method prints a clean, formatted summary of the reader's state, including their name, capacity limit, and an indexed list of currently held books. It also handles empty states gracefully (`"No books added yet"`).

## 📂 File Structure
* `Reader.java`: Contains the core logic, state variables (name, capacity, book array), and methods required to manage the reader's profile.
* `Reader_tester.java`: The provided driver code containing the `main` method to instantiate `Reader` objects, execute operations, and verify the expected console output.

## 🚀 How to Run

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/roudrobyte/Java-OOP-Reader-Profile-Inventory-Management
   ```
2. Open your terminal or command prompt and navigate to the project directory.
3. Compile the Java files:
   ```bash
   javac Reader_tester.java Reader.java
   ```
4. Run the compiled tester class:
   ```bash
   java Reader_tester
   ```

## 📋 Expected Console Output
When the driver code is executed, the program processes the operations and outputs the following state changes:

```text
1 ==========
Name: Albert
Capacity: 2
Books:
No books added yet
2 ==========
Name: Issac
Capacity: 5
Books:
Book 1: Java
Book 2: Python
Book 3: C++
3 ==========
No more space for new book
4 ==========
Albert's capacity updated to 5
5 ==========
Name: Albert
Capacity: 5
Books:
Book 1: C#
Book 2: Rust
Book 3: Python
```

## 👨‍💻 Author
Developed by **ROUDRO**
