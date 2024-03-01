# Bridge Pattern

## 1. What is it?
- It is a structural design pattern that separates the abstraction from its implementation so that both can vary independently.

## 2. What are the pros?
- **Decoupling:**
    - It separates abstraction from implementation, allowing them to evolve independently.
- **Flexibility:**
    - It provides flexibility in selecting or changing implementations at runtime.

## 3. What are the cons?
- **Complexity:**
    - It can increase the complexity of the code due to the number of classes involved.

## 4. When to consider using it?
- Use the Bridge Pattern when you want to avoid a permanent binding between an abstraction and its implementation.
- Use it when changes in the implementation should not affect the clients.

### Java Implementation with Client Code

```java
// Abstraction
interface Shape {
    void draw();
}

// Implementor interface
interface DrawingAPI {
    void drawCircle(double x, double y, double radius);
    void drawSquare(double x, double y, double side);
}

// Refined Abstraction
class Circle implements Shape {
    // Implementation
}

// Refined Abstraction
class Square implements Shape {
    // Implementation
}

// Implementor
class DrawingAPI1 implements DrawingAPI {
    // Implementation
}

// Implementor
class DrawingAPI2 implements DrawingAPI {
    // Implementation
}

// Client code
public class BridgePatternExample {
    public static void main(String[] args) {
        // Implementor instances
        DrawingAPI drawingAPI1 = new DrawingAPI1();
        DrawingAPI drawingAPI2 = new DrawingAPI2();

        // Abstraction instances
        Shape circle = new Circle(drawingAPI1);
        Shape square = new Square(drawingAPI2);

        // Draw shapes
        circle.draw();
        square.draw();
    }
}
