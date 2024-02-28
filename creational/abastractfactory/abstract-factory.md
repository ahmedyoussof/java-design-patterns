# Abstract Factory Pattern

## 1. What is it?
- It provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- It works around a super-factory which creates other factories. This factory is also called the factory of factories.

## 2. What are the pros?
- **Loose Coupling:**
    - You avoid tight coupling between concrete products and the client.
- **Single Responsibility Principle:**
    - You can extract the product creation code into one place, making the code easier to support.
- **Open/Closed Principle:**
    - You can introduce new variants of products without breaking existing client code.

## 3. What are the cons?
- **Supporting new kinds of products is difficult:**
    - Extending abstract factories to produce new kinds of products isn't easy.

## 4. When to consider using it?
- Use the Abstract Factory when your code needs to work with various families of related products, but you don't want it to depend on the concrete classes of those products.
