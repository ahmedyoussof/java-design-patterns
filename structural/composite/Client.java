package structural.composite;

public class Client {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor(new Graphics());
        editor.loadShapes(
                new Circle(10, 10, "red", 10),
                new CompoundShape(
                        new Circle(110, 110, "blue", 50),
                        new Dot(160, 160, "blue")
                ),
                new Rectangle(250, 250, "red", 100, 100)
        );
        editor.drawShapes();
    }
}
