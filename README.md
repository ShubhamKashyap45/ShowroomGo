# ShowroomGo Management System

This project is a Java-based console application designed for managing a car showroom. It allows users to add and retrieve showrooms, employees, and cars through an interactive menu interface, leveraging object-oriented programming principles for a structured and efficient design.

## Features
- **Add New Showrooms**: Enter details about new showrooms.
- **Add Employees**: Add employee information including ID, name, age, and department.
- **Add Cars**: Input car details such as name, color, fuel type, price, type, and transmission type.
- **Retrieve Showrooms**: View a list of all added showrooms.
- **Retrieve Employees**: Get details of all employees.
- **Retrieve Cars**: Access a list of all cars in stock.

## Technologies Used
- **Java**: The primary programming language for the application.
- **Object-Oriented Programming (OOP)**: Utilizes OOP concepts to enhance code organization and reusability, including:
  - **Encapsulation**: Each class (e.g., Cars, Employees, Showroom) encapsulates its properties and behaviors, promoting data hiding.
  - **Inheritance**: Classes can extend other classes to reuse and extend functionality.
  - **Polymorphism**: Method overriding allows subclasses to provide specific implementations of methods defined in a superclass.
  - **Method Overloading**: Multiple methods with the same name but different parameters enhance flexibility in method usage.

## Package Structure
- **Interface**: `showroom.service` – Contains the `ShowroomSrevice` interface defining the core functionalities.
- **Implementation**: `showroom.service` – Implements the `ShowroomSrevice` interface in the `ShowroomServiceImpl` class, managing data and operations.
- **Beans**: Contains `Cars`, `Employees`, and `Showroom` classes that represent the data structures used in the application.

## How to Run
1. Clone the repository to your local machine.
2. Compile and run the `TestShowroom` class from the `com.showroomgo.test` package.
3. Follow the on-screen instructions to manage showroom data.

## Example Usage
- Upon starting the application, users are welcomed and presented with a menu of options to manage showrooms, employees, and cars.
- After selecting an option, users can input relevant details, and the application will confirm successful additions or display the requested information.

## Future Enhancements
Consider implementing additional features such as:
- Persistence layer to save data to a file or database.
- Enhanced input validation and error handling.
- User authentication for secure access.
