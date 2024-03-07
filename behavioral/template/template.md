# Template Method Pattern

## 1. What is it?
- It is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses alter specific steps of the algorithm without changing its structure.

## 2. What are the pros?
- **Code Reusability:**
    - It promotes code reuse by defining common steps in the algorithm in a base class.
- **Flexibility:**
    - It allows subclasses to override or extend specific steps of the algorithm without changing the overall structure.
- **Enforces Structure:**
    - It enforces the structure of the algorithm, ensuring that certain steps are implemented by subclasses.
- **Consistency:**
    - It provides a consistent algorithm structure across multiple subclasses.

## 3. What are the cons?
- **Rigidity:**
    - Changes to the algorithm's structure may require modifications to the template method, affecting all subclasses.
- **Limited Variation:**
    - Subclasses are limited to altering specific steps defined in the template method, which may limit variations in the algorithm.

## 4. When to consider using it?
- Use the Template Method Pattern when you have a common algorithm structure that can be shared among multiple subclasses, but specific steps may vary.
- Use it when you want to define a skeleton algorithm in a base class and allow subclasses to customize certain steps without changing the overall structure.
