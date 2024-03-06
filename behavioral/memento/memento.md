# Memento Pattern

## 1. What is it?
- It is a behavioral design pattern that allows an object's state to be captured and restored at a later time, without exposing its internal structure.

## 2. What are the pros?
- **State Preservation:**
    - It allows an object to capture and restore its internal state, providing the ability to revert to a previous state.
- **Encapsulation:**
    - It encapsulates the object's state, preventing direct access by external entities.
- **Undo Mechanism:**
    - It enables the implementation of undo mechanisms in applications.

## 3. What are the cons?
- **Memory Usage:**
    - Storing and managing multiple states can lead to increased memory usage.
- **Complexity:**
    - The pattern can add complexity, especially in scenarios with frequent state changes.

## 4. When to consider using it?
- Use the Memento Pattern when you need to capture and restore an object's state.
- Use it to implement undo mechanisms or to provide a snapshot of an object's state at a particular moment.
