# ✈️ Airline Management System

A full-featured **Java Swing + MySQL** GUI application built with **Apache NetBeans**, enabling efficient airline operations like flight scheduling, passenger management, ticket booking, and cancellation—all within a desktop interface.

---

## 📚 Table of Contents

- [About the Project](#about-the-project)  
- [Features](#features)  
- [Tech Stack](#tech-stack)  
- [Installation](#installation)  
- [Database Setup](#database-setup)  
- [Running the Application](#running-the-application)  
- [Usage Guide](#usage-guide)  
- [Screenshots](#screenshots) 
- [Project Structure](#project-structure)  
---

## 📝 About the Project

This Airline Management System is a desktop application developed using Java Swing and MySQL. It allows administrators to:
- Log in securely  
- Manage flights (add/edit/delete)  
- Register passengers  
- Book and cancel tickets  
- Process payments  
- Generate boarding passes  
- View journey and passenger information  

---

## 🚀 Features

- 🔐 Admin login screen (username/password)  
- ✈️ Flight CRUD operations  
- 👤 Customer registration  
- 🎟️ Ticket booking and cancellation  
- 💳 Payment processing with receipt  
- 🪪 Boarding pass generation  
- 📋 View journeys and passenger lists  

---

## ⚙️ Tech Stack

- **Java Swing** for GUI  
- **Apache NetBeans** IDE  
- **MySQL** as the backend database  
- **JDBC** for database connectivity  
- External Libraries:  
  - `mysql-connector-java.jar`  
  - `rs2xml.jar` (for JTable–ResultSet integration)  

---

## 💾 Installation

Follow these steps to set up and run the project on your local machine:

### 1. Clone the Repository


`git clone https://github.com/Omkar7840/Airline_Management_System.git
cd Airline_Management_System`

## 🛢️ Database Setup

1. Ensure your **MySQL server** is running.

2. Open your MySQL client (**Command Line** or **MySQL Workbench**).

3. Execute the `mysql_commands.txt` script to create the `airline` database and its necessary tables:


`SOURCE path/to/mysql_commands.txt;`


## ▶️ Running the Application

1. Open **NetBeans**.
2. Right-click on `Login.java` → **Run File**.
3. Use the following credentials to log in:


4. On successful login, you'll be redirected to the **dashboard** (`Home.java`).

---

## 🧪 Usage Guide

| Screen / File         | Functionality                                 |
|-----------------------|-----------------------------------------------|
| `Login.java`          | Admin login interface                         |
| `Home.java`           | Main dashboard with navigation buttons        |
| `AddCustomer.java`    | Register and manage passenger information     |
| `FlightInfo.java`     | Add, edit, delete flight schedules            |
| `BookFlight.java`     | Book tickets based on flight availability     |
| `JourneyDetails.java` | View booked journeys for passengers           |
| `Payment.java`        | Process payments and generate receipts        |
| `Cancel.java`         | Cancel previously booked tickets              |
| `BoardingPass.java`   | Generate and print printable boarding passes  |


---
## 🖼 Screenshots

![Screenshot 2025-05-18 142509](https://github.com/user-attachments/assets/b21709a0-3d25-4992-9be2-9ff36fb601c0)
![Screenshot 2025-05-18 142449](https://github.com/user-attachments/assets/533284cc-9902-4c06-b36c-080059c6c4a0)
![Screenshot 2025-05-18 142439](https://github.com/user-attachments/assets/291141eb-1065-4515-8052-79fe05e621db)
![Screenshot 2025-05-18 141853](https://github.com/user-attachments/assets/6c4cfbfa-ac32-42ec-a5b7-cbad7c39487f)
![Screenshot 2025-06-24 013232](https://github.com/user-attachments/assets/1f2e4edd-42dc-434b-b826-4b96a3a5790c)
![Screenshot 2025-06-24 013056](https://github.com/user-attachments/assets/84210b16-1787-418e-b05a-b5649432dca8)





---

## 🗂 Project Structure

```text
Airline_Management_System/
│
├── src/
│   └── airline/
│       ├── Conn.java             # Database connection handler  
│       ├── Login.java            # Login screen  
│       ├── Home.java             # Dashboard  
│       ├── AddCustomer.java      # Passenger registration  
│       ├── FlightInfo.java       # Flight CRUD  
│       ├── BookFlight.java       # Ticket booking  
│       ├── JourneyDetails.java   # Display booked trips  
│       ├── Payment.java          # Payment screen  
│       ├── Cancel.java           # Ticket cancellation  
│       └── BoardingPass.java     # Boarding pass generation  

├── lib/                          # External JAR dependencies  
│   ├── mysql-connector-java.jar  
│   └── rs2xml.jar  

├── mysql_commands.txt           # SQL scripts for database setup  
├── nbproject/                   # NetBeans project files  
├── build.xml                    # Ant build file  
├── manifest.mf                  # Project manifest  
└── README.md                    # This documentation file

---

