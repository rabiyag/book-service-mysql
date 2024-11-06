# Book Service MySQL

This project demonstrates a simple book management service using Spring Boot and MySQL. It includes basic CRUD operations to manage books in a MySQL database.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Usage](#usage)

## Features
- CRUD Operations: Create, Read, Update, and Delete book records.
- Spring Boot Setup: Uses Spring Boot for easy application configuration and management.
- MySQL Integration: Stores and retrieves book data from a MySQL database.
- REST API: Provides a RESTful API for interacting with the book data.

## Technologies Used
- **Spring Boot** (Backend framework)
- **MySQL** (Database)
- **Maven** (Dependency management)

## Prerequisites
- **JDK 8** or higher
- **Maven** for dependency management
- **MySQL** for database

## Setup
1. **Clone the repository**:
   ```bash
   git clone https://github.com/rabiyag/book-service-mysql.git
   cd book-service-mysql
   ```

2. **Update application.properties with database connection details:**:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database
    spring.datasource.username=your_db_username
    spring.datasource.password=your_db_password
    ```
   
3. **Build the project with Maven**:
   ```bash
   mvn clean install
   ```

## Running the Application
1. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

2. **Access the application**:
   - The application will be available at http://localhost:8080:
  

## API Endpoints

**Get All Books**: GET /api/books

**Get Book by ID**: GET /api/books/{id}

**Create Book**: POST /api/books

**Update Book**: PUT /api/books/{id}

**Delete Book**: DELETE /api/books/{id}


