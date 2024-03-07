# State Pattern

## 1. What is it?
- It is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

## 2. What are the pros?
- **Encapsulation:**
    - It encapsulates the behavior associated with each state into a separate class, promoting clean and modular code.
- **Simplified Context:**
    - It simplifies the context (the object with changing states) by delegating the state-specific behavior to state classes.
- **State Transitions:**
    - It makes it easy to add or change states and define transitions between them.
- **Flexibility:**
    - It allows the object to alter its behavior dynamically as its internal state changes, making it more flexible.

## 3. What are the cons?
- **Increased Classes:**
    - The pattern can lead to an increased number of classes if there are many states, potentially making the codebase larger.
- **Complexity:**
    - It might add complexity, especially if state transitions involve complex logic.

## 4. When to consider using it?
- Use the State Pattern when an object's behavior depends on its internal state and changes dynamically during runtime.
- Use it when the object's state-specific behavior is spread across multiple conditional statements, and you want to encapsulate each state in a separate class.
