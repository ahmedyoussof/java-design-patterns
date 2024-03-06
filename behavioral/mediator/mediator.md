# Mediator Pattern

## 1. What is it?
- It is a behavioral design pattern that defines an object (the mediator) that centralizes communication between a set of related objects (colleagues), thus promoting loose coupling between them.

## 2. What are the pros?
- **Decoupling:**
    - It promotes loose coupling between interacting objects by centralizing communication through the mediator.
- **Reusability:**
    - Colleagues can be reused independently of each other.
- **Centralized Control:**
    - It provides a centralized point for controlling and coordinating interactions.

## 3. What are the cons?
- **Complexity:**
    - The pattern can introduce additional complexity due to the centralization of communication.
- **Single Point of Failure:**
    - The mediator becomes a single point of failure or performance bottleneck.

## 4. When to consider using it?
- Use the Mediator Pattern when a set of objects need to communicate in a way that promotes loose coupling.
- Use it when changes to the communication behavior between objects should not require modifying them directly.
