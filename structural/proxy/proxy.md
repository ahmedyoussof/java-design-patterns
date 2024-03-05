# Proxy Pattern

## 1. What is it?
- The Proxy Pattern is a structural design pattern that introduces a substitute or placeholder object to control access to another object,   
allowing for additional functionality before or after the real object's method execution.

## 2. What are the pros?
- **Controlled Access:**
    - It allows for controlling access to the real object by adding an additional layer.
- **Lazy Loading:**
    - It supports lazy loading, where the real object is only created or loaded when needed.
- **Security:**
    - It can add security measures by controlling access to sensitive operations.

## 3. What are the cons?
- **Complexity:**
    - The pattern can introduce additional complexity due to the presence of the proxy.
- **Performance Overhead:**
    - There might be a performance overhead, especially in cases where the real object is remote or resource-intensive.

## 4. When to consider using it?
- Use the Proxy Pattern when you want to control access to an object, add functionality before or after the real object's method execution.
- Use it for lazy loading of resource-intensive objects or to control access to sensitive operations.
