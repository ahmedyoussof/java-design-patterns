# Strategy Pattern

## 1. What is it?
- It is a behavioral design pattern that defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. It allows a client to choose an appropriate algorithm at runtime.

## 2. What are the pros?
- **Flexibility:**
    - It enables the client to select an algorithm from a family of algorithms dynamically.
- **Encapsulation:**
    - It encapsulates each algorithm in a separate class, making it easy to extend and maintain.
- **Open/Closed Principle:**
    - It adheres to the Open/Closed Principle by allowing new algorithms to be added without modifying existing client code.
- **Code Reusability:**
    - It promotes code reuse by allowing different contexts to use the same set of algorithms.

## 3. What are the cons?
- **Complexity:**
    - The pattern may introduce additional complexity with the creation of multiple strategy classes.
- **Increased Classes:**
    - The number of classes may increase, especially if there are numerous strategies.

## 4. When to consider using it?
- Use the Strategy Pattern when you want to define a family of algorithms, encapsulate each algorithm, and make them interchangeable.
- Use it when you have a class with multiple behaviors or variants, and you want to allow clients to choose the behavior dynamically.
