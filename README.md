<div align="center">

# ☕ Java + MySQL Connectivity (JDBC)

### Experiment 5: Connect a Java application to a MySQL database and query live data

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.x-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-Connector%2FJ-blue?style=for-the-badge)
![XAMPP](https://img.shields.io/badge/XAMPP-phpMyAdmin-FB7A24?style=for-the-badge&logo=xampp&logoColor=white)
![VS Code](https://img.shields.io/badge/VS%20Code-Editor-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white)

*A beginner-friendly demo of how Java talks to a relational database using JDBC.*

</div>

---

## 📖 Overview

This experiment shows how a Java program connects to a **MySQL** database, runs a **SQL query**, and prints the results in the console, using the **JDBC (Java Database Connectivity)** API and the **MySQL Connector/J** driver.

The program connects to a database named `students`, reads the `employees` table, and displays every employee **older than 25**.

## ✨ What You'll Learn

- 🔌 Loading a JDBC driver with `Class.forName()`
- 🔗 Opening a connection with `DriverManager.getConnection()`
- 📝 Running SQL with `Statement` and `ResultSet`
- 🔁 Looping through rows and reading typed columns
- 🧹 Closing resources properly
- 🛡️ Handling errors with `try / catch`

## 🧰 Tech Stack

| Tool | Purpose |
|---|---|
| **Java (JDK 17+)** | Programming language |
| **MySQL / MariaDB** | Relational database (run via XAMPP) |
| **MySQL Connector/J** | JDBC driver that links Java to MySQL |
| **phpMyAdmin** | Visual database management |
| **VS Code** | Code editor |

## 📂 Project Structure

```
Experiment 5/
├── EmployeeDatabase.java            # Main program
└── mysql-connector-j-26.7.0.jar     # JDBC driver (must be in this folder)
```

## 🗄️ Database Setup

1. Start **Apache** and **MySQL** in the **XAMPP Control Panel**.
2. Open **phpMyAdmin** at `http://localhost/phpmyadmin`.
3. Go to the **SQL** tab and run:

```sql
CREATE DATABASE IF NOT EXISTS students;
USE students;

CREATE TABLE employees (
    id   INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age  INT NOT NULL
);

INSERT INTO employees (name, age) VALUES
    ('Ramesh', 28),
    ('Shyam',  23),
    ('Amit',   30),
    ('Rahul',  21);
```

**Resulting table:**

| id | name | age |
|:--:|:-----|:---:|
| 1 | Ramesh | 28 |
| 2 | Shyam | 23 |
| 3 | Amit | 30 |
| 4 | Rahul | 21 |

## 🚀 How to Run

### 1️⃣ Clone the repo
```bash
git clone https://github.com/KRISHNARAWAL-SYS/JAVA-And-Connections.git
cd JAVA-And-Connections
```

### 2️⃣ Get the JDBC driver
Download **Connector/J** (Platform Independent ZIP) from the [MySQL downloads page](https://dev.mysql.com/downloads/connector/j/), extract it, and copy the `.jar` file into the project folder.

### 3️⃣ Compile
```powershell
javac EmployeeDatabase.java
```

### 4️⃣ Run with the driver on the classpath
```powershell
java -cp ".;mysql-connector-j-26.7.0.jar" EmployeeDatabase
```

> 💡 On Linux/macOS use `:` instead of `;` in the classpath: `-cp ".:mysql-connector-j-26.7.0.jar"`

## 🖥️ Expected Output

```text
Connected Successfully

Employees with age greater than 25:
-----------------------------------
