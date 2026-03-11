# Task 1 – OOPS (Java)

## Description
This task shows basic Object-Oriented Programming (OOPS) concepts using Java. 
I have implemented a simple banking system where different types of bank accounts perform operations like deposit, withdrawal, and interest calculation.

## OOPS Concepts Used
- **Encapsulation** – Account details are stored as private variables and accessed through methods.
- **Inheritance** – Classes such as `SavingsAccount` extend the `BankAccount` class.
- **Polymorphism** – Methods like `calculateInterest()` are overridden in derived classes for savings or current.
- **Abstraction** – Common properties and methods are defined in the base class.

## Files
- `BankAccount.java` – Base class for account details
- `SavingsAccount.java` – Implements savings account with interest calculation
- `CurrentAccount.java` – Represents a current account
- `Main.java` – Runs and tests the program

## Features
- Deposit money
- Withdraw money
- Check balance
- Calculate interest
