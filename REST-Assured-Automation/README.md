
# REST Assured API Automation Testing

## Project Overview

This project demonstrates API Automation Testing using REST Assured, Java, TestNG, and JSON Server.

A mock E-Commerce backend was created using JSON Server, and REST Assured was used to automate API validation.

## Tools & Technologies

* Java
* REST Assured
* TestNG
* Maven
* JSON Server
* GitHub

## API Endpoints Tested

### Products

* GET /products
* GET /products/{id}
* POST /products
* PUT /products/{id}
* DELETE /products/{id}

### Users

* GET /users
* POST /users
* PUT /users/{id}
* DELETE /users/{id}

### Cart

* GET /cart
* POST /cart

### Orders

* GET /orders
* POST /orders

## Test Scenarios Covered

* Status Code Validation
* Response Body Validation
* CRUD Operations
* Positive Testing
* Data Verification

## Project Structure

REST-Assured-Automation

* db.json
* pom.xml
* README.md
* src/test/java

  * ProductAPITest.java
  * UserAPITest.java
  * CartAPITest.java
  * OrderAPITest.java

## How to Run

1. Start JSON Server

json-server --watch db.json

2. Verify API is running

http://localhost:3000/products

3. Run TestNG test classes from Eclipse

## Author

Vaishnav Vadakiniyil
