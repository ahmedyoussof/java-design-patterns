# Observer Pattern

## 1. What is it?
- It is a behavioral design pattern where an object, known as the subject, maintains a list of dependents, known as observers, that are notified of any state changes, typically by calling one of their methods.

## 2. What are the pros?
- **Loose Coupling:**
    - It promotes loose coupling between the subject and its observers.
- **Extensibility:**
    - It allows for easy addition or removal of observers without modifying the subject.
- **Broadcasting Updates:**
    - The subject can broadcast updates to multiple observers simultaneously.

## 3. What are the cons?
- **Unanticipated Updates:**
    - Observers may receive updates they are not interested in, leading to potential inefficiencies.
- **Ordering Concerns:**
    - The order of notification might be important, and it can be challenging to control.

## 4. When to consider using it?
- Use the Observer Pattern when you have a one-to-many dependency between objects, and changes to one object need to be reflected in multiple other objects.
- Use it when an object should notify other objects without making assumptions about who or what those objects are.
