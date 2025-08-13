# 📌 Complaint Registration System

![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-%2300599C.svg?style=for-the-badge&logo=java&logoColor=white)
![File Handling](https://img.shields.io/badge/File%20Handling-%23000000.svg?style=for-the-badge&logo=java&logoColor=white)

---

## 📖 Project Overview
The **Complaint Registration System** is a Java-based console application that allows users to register, view, and store complaints using **Object-Oriented Programming (OOP)** principles and **file handling**.

This system stores complaints in a file, ensuring persistence even after the program ends. It’s ideal for learning **Java I/O streams**, OOP, and basic CRUD operations.

---

## 🎯 Features
- Add a new complaint with user details and complaint text.
- Automatically assigns a unique complaint ID.
- View all registered complaints.
- Stores complaints permanently in a file.
- Uses serialization for data storage.

---

## 🛠 Technologies Used
- **Java**
- **OOP Concepts**
- **File Handling (Serialization)**
- **Eclipse IDE** (or any Java IDE)

---

## 📂 Project Structure
ComplaintRegistrationSystem/
│── ComplaintRegistrationSystem.java # Main program file
│── complaints.dat # Serialized storage file
│── README.md # Project documentation
---

## 🚀 How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/02pasco/ComplaintRegistrationSystem.git
   
2.Open in your Java IDE (e.g., Eclipse).
3.Compile and run:

javac ComplaintRegistrationSystem.java
java ComplaintRegistrationSystem


📌 Sample Output
===== Complaint Registration System =====
1. Register Complaint
2. View All Complaints
3. Exit
Enter your choice: 1

Enter your name: John Doe
Enter your complaint: Internet not working for 3 days.
Complaint registered successfully with ID: C001

===== Complaint Registration System =====
1. Register Complaint
2. View All Complaints
3. Exit
Enter your choice: 1

Enter your name: Jane Smith
Enter your complaint: Water leakage in the apartment.
Complaint registered successfully with ID: C002

===== Complaint Registration System =====
1. Register Complaint
2. View All Complaints
3. Exit
Enter your choice: 2

List of Complaints:
---------------------------------
ID: C001
Name: John Doe
Complaint: Internet not working for 3 days.
---------------------------------
ID: C002
Name: Jane Smith
Complaint: Water leakage in the apartment.
---------------------------------

===== Complaint Registration System =====
1. Register Complaint
2. View All Complaints
3. Exit
Enter your choice: 3

Exiting the system... Thank you!

📌 License
This project is open-source and free to use for learning purposes.

