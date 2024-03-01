# Adapter Pattern

## 1. What is it?
- It is a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that a client expects.

## 2. What are the pros?
- **Compatibility:**
    - It allows the integration of existing systems with new systems without changing their interfaces.
- **Reusability:**
    - It promotes the reuse of existing classes by adapting them to a common interface.
- **Flexibility:**
    - It provides a flexible way to work with different classes and interfaces.

## 3. What are the cons?
- **Complexity:**
    - The use of adapters can lead to a complex code structure.
- **Runtime Overhead:**
    - There might be a slight runtime overhead due to the additional layer of abstraction.

## 4. When to consider using it?
- Use the Adapter Pattern when you want to use an existing class with an incompatible interface in your application.
- Use it to achieve interoperability between classes with different interfaces.
