# Command Pattern

## 1. What is it?
- It is a behavioral design pattern that turns a request into a stand-alone object, encapsulating all information about the request. This object can be passed as a parameter, stored, or manipulated, allowing for parameterization of clients with different requests and queuing of requests.

## 2. What are the pros?
- **Decoupling:**
    - It decouples the sender and receiver of a request, allowing for more flexibility in command handling.
- **Undo/Redo Operations:**
    - It supports undo/redo functionality by storing command objects.
- **Supports Queues:**
    - Commands can be queued and executed at a later time.

## 3. What are the cons?
- **Complexity:**
    - The pattern can introduce additional classes and may be overkill for simple scenarios.
- **Increased Number of Classes:**
    - There's an increased number of classes for each command, potentially leading to a large class hierarchy.

## 4. When to consider using it?
- Use the Command Pattern when you want to parameterize objects with operations, queue operations, or support undo/redo functionality.
- Use it when you need to decouple senders and receivers of requests, allowing for more extensibility.
