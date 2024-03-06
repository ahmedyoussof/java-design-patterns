# Iterator Pattern

## 1. What is it?
- It is a behavioral design pattern that provides a way to sequentially access elements of an aggregate object without exposing its underlying representation.

## 2. What are the pros?
- **Simplified Access:**
    - It provides a uniform way to traverse different types of collections, simplifying client code.
- **Decoupling:**
    - It decouples the client code from the internal structure of the collection, allowing changes without affecting clients.
- **Multiple Iterators:**
    - It allows for the use of multiple iterators on the same collection, each with its own state.

## 3. What are the cons?
- **Limited Access:**
    - It may not be suitable for accessing elements in reverse order or for accessing elements in a non-sequential manner.
- **Complexity:**
    - The pattern can add complexity when implementing custom iterators.

## 4. When to consider using it?
- Use the Iterator Pattern when you want to provide a standard way to traverse different types of collections.
- Use it when you need multiple iterators for the same collection, or when you want to decouple client code from the internal structure of a collection.
