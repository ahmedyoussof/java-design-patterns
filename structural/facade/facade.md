# Facade Pattern

## 1. What is it?
- It is a structural design pattern that provides a simplified interface to a set of interfaces in a subsystem. It defines a higher-level interface that makes the subsystem easier to use.

## 2. What are the pros?
- **Simplified Interface:**
    - It provides a simplified and unified interface to a set of interfaces in a subsystem.
- **Decoupling:**
    - It helps to decouple the client code from the complex internal workings of the subsystem.
- **Easier to Use:**
    - It makes the subsystem easier to use for clients by providing a single entry point.

## 3. What are the cons?
- **Limited Customization:**
    - It may limit the ability to customize or access individual components of the subsystem.
- **Dependency on Facade:**
    - Clients become dependent on the facade, and changes to the subsystem may impact multiple clients.

## 4. When to consider using it?
- Use the Facade Pattern when you want to provide a simplified and unified interface to a set of interfaces that may be complex or have a large number of classes.
- Use it to decouple the client code from the internal details of a subsystem.
