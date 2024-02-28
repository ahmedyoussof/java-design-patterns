# Prototype Pattern

## 1. What is it?
- It is a creational design pattern that allows creating new objects by copying an existing object, known as the prototype.

## 2. What are the pros?
- **Cloneable Objects:**
    - Objects can be cloned, allowing for the creation of new instances without using explicit constructors.
- **Dynamic Object Creation:**
    - You can create new objects by copying an existing prototype at runtime.

## 3. What are the cons?
- **Complex Objects:**
    - Cloning complex objects with nested structures can be challenging.
- **Shallow Copy Limitation:**
    - Default cloning creates shallow copies, which might lead to unexpected behavior with shared references.

## 4. When to consider using it?
- Use the Prototype Pattern when creating new instances by copying existing objects is more efficient than using constructors.
- Use it when you want to avoid subclassing to create new objects.
