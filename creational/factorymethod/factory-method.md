# Factory Method Pattern

## 1. What is it?
- A creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.
- Has four components:
    - **ConcreteCreator (client)**
    - **Creator (factory)**
    - **Product (interface or abstract class)**
    - **ConcreteProduct (concrete classes that implement the interface or extend Product abstract class)**

## 2. What are the pros?
- **Encapsulation:**
    - The Factory Method pattern encapsulates the object creation process within a dedicated method or class. This isolates the client code from the details of object creation, promoting better encapsulation and reducing dependencies.
- **Flexibility:**
    - You can implement the same interface but provide different implementations for the methods.

## 3. What are the cons?
- **Limited Control Over Class Instantiation:**
    - Subclasses are responsible for instantiating concrete classes, which can lead to limited control over the instantiation process for the client.
- **Complexity in Subclassing:**
    - As the number of product types increases, the number of concrete subclasses may also grow, potentially leading to a complex class hierarchy.
- **Duplication of Code:**
    - If there's common code for object creation among multiple concrete creators, it may result in code duplication.

## 4. When to use?
- When you want to provide a common interface for creating objects while hiding the creation logic from the client code.
- When you anticipate adding or modifying product classes in the future, as it provides a flexible way to introduce new product types without modifying existing code.
