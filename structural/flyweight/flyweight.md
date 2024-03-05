# Flyweight Pattern

## 1. What is it?
- It is a structural design pattern that focuses on minimizing memory usage or computational expenses   
by sharing as much as possible with related objects. It is particularly useful when dealing with a large number of similar objects.

## 2. What are the pros?
- **Memory Efficiency:**
    - It reduces memory consumption by sharing common parts of objects among multiple instances.
- **Performance Improvement:**
    - It improves performance by reusing shared objects instead of creating new ones.
- **Simplicity:**
    - It simplifies the design and reduces the number of distinct classes.

## 3. What are the cons?
- **Complexity:**
    - It can introduce complexity when managing shared objects and their intrinsic/extrinsic states.
- **Limited Applicability:**
    - It is most effective when dealing with a large number of similar objects.

## 4. When to consider using it?
- Use the Flyweight Pattern when you need to support a large number of similar objects in your application.
- Use it when the majority of an object's state can be made extrinsic and shared between multiple instances.
